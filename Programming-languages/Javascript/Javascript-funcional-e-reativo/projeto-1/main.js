const path = require('path');
const fn = require('./functions');

const caminho = path.join(__dirname, 'legendas')

fn.lerDiretorio(caminho)
    .then(arquivos => fn.elementosTerminadosCom(arquivos, '.srt'))
    .then(arquivosLidos => fn.lerArquivos(arquivosLidos))
    .then(console.log)
