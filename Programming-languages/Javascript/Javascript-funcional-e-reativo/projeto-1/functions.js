const fs = require('fs');
const path = require('path');

function lerDiretorio(caminho) {
    return new Promise((resolve, reject) => {
        try{
            let arquivos = fs.readdirSync(caminho);
            arquivos = arquivos.map(arquivo => path.join(caminho, arquivo))
            resolve(arquivos)
        }catch(e){
            reject(e)
        }
    })
}

function elementosTerminadosCom(array, padrao){
    return array.filter(el => el.endsWith(padrao))
}

function lerConteudoArquivos(arquivosLidos){
    let all = '';
    arquivosLidos.map(item => {
        fs.readFile(item, 'utf8', (err, data) => {
            if(!undefined){
                console.log(all)
                all = all + data
            }
        })
    })

    return all;
}

module.exports = {
    lerDiretorio,
    elementosTerminadosCom,
    lerConteudoArquivos
}