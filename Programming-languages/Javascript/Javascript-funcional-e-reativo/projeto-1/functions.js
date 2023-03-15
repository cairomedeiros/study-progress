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

function lerArquivo(caminho){
    return new Promise((resolve, reject) => {
        try{
            const conteudo = fs.readFileSync(caminho, {encoding: 'utf-8'})
            resolve(conteudo.toString())
        } catch(e){
            reject(e)
        }
        
    })
}

function lerArquivos(caminhos){
    return Promise.all(caminhos.map(caminho => lerArquivo(caminho)))
}

function retirarLinhasVazias(todoConteudo){
    return todoConteudo.filter(el => el.trim())
}

function retirarLinhasTempo(tempos, padraoTextual){
    return tempos.filter(el => !el.includes(padraoTextual))
}

function removerValorNumerico(numero){
    return numero.filter(el => !parseInt(el))
}

function removerCaracteres(simbolos){
    return function(array){
        return array.map(el => {
            let novoTexto = el
            simbolos.forEach(simbolo => {
                novoTexto = novoTexto.split(simbolo).join('')
            })
            return novoTexto
        })
    }
}
module.exports = {
    lerDiretorio,
    lerArquivo,
    lerArquivos,
    elementosTerminadosCom,
    retirarLinhasVazias,
    retirarLinhasTempo,
    removerValorNumerico,
    removerCaracteres
}