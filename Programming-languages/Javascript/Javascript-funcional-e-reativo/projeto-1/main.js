const path = require('path');
const fn = require('./functions');

const caminho = path.join(__dirname, 'legendas')


const simbolos = [ '\r', '"', '-', '♪', '<i>', '</i>', '.', '?', ',', '_', '[', ']']
const mesclarConteudos = conteudos => conteudos.join('')
const separarPorLinhas = todoConteudo => todoConteudo.split('\n')
const separarPorPalavras = todoConteudo => todoConteudo.split(' ')

function agruparPalavras(palavras){
    return Object.values(palavras.reduce((acc, palavra) => {
        const el = palavra.toLowerCase()
        const qtde = acc[el] ? acc[el].qtde + 1 : 1
        acc[el] = { elemento: el, qtde}
        return acc
    }, {}))
}

function ordernarPorAtribNumerico(attr, ordem = 'asc'){
    return function(array){
        const desc = (o1, o2) => o2[attr] - o1[attr]
        const asc = (o1, o2) => o1[attr] - o2[attr]
        return array.sort(ordem === 'asc' ? asc : desc)
    }
}

fn.lerDiretorio(caminho)
    .then(arquivos => fn.elementosTerminadosCom(arquivos, '.srt'))
    .then(arquivosLidos => fn.lerArquivos(arquivosLidos))
    .then(mesclarConteudos)
    .then(separarPorLinhas)
    .then(todoConteudo => fn.retirarLinhasVazias(todoConteudo))
    .then(tempos => fn.retirarLinhasTempo(tempos, '-->'))
    .then(numeros => fn.removerValorNumerico(numeros))
    .then(t => fn.removerCaracteres(t, simbolos))
    .then(mesclarConteudos)
    .then(separarPorPalavras)
    .then(todoConteudo => fn.retirarLinhasVazias(todoConteudo))
    .then(numeros => fn.removerValorNumerico(numeros))
    .then(agruparPalavras)
    .then(ordernarPorAtribNumerico('qtde', 'desc'))
    .then(console.log)
