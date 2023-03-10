const fs = require('fs');

async function lerDiretorio(caminho) {
    let arquivos = await fs.readdirSync(caminho);
    arquivos.forEach( item => {
        if(item.includes('.txt')){
            let index = arquivos.indexOf(item);
            console.log(index)
            arquivos.splice(index, 1)
        }
        
    })
    console.log(arquivos)
}

module.exports = {
    lerDiretorio
}