const path = require('path');
const fn = require('./functions');

const caminho = path.join(__dirname, 'legendas')


const simbolos = [ '\r', '"', '-', '♪', '<i>', '</i>', '.', '?', ',', '_', '[', ']']
const mesclarConteudos = conteudos => conteudos.join('')
const separarPorLinhas = todoConteudo => todoConteudo.split('\n')
const separarPorPalavras = todoConteudo => todoConteudo.split(' ')

function agruparPalavras(palavras){
    return palavras.reduce((agrupamento, palavra) => {
        const p = palavra.toLowerCase()
        if(agrupamento[p]){
            agrupamento[p] += 1
        }else{
            agrupamento[p] = 1
        }
        return agrupamento
    }, {})
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
    .then(console.log)
