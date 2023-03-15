const path = require('path');
const fn = require('./functions');

const caminho = path.join(__dirname, 'legendas')

fn.lerDiretorio(caminho)
    .then(arquivos => fn.elementosTerminadosCom(arquivos, '.srt'))
    .then(arquivosLidos => fn.lerArquivos(arquivosLidos))
    .then(conteudos => conteudos.join(''))
    .then(todoConteudo => todoConteudo.split('\n'))
    .then(todoConteudo => fn.retirarLinhasVazias(todoConteudo))
    .then(tempos => fn.retirarLinhasTempo(tempos, '-->'))
    .then(numeros => fn.removerValorNumerico(numeros))
    .then(console.log)
