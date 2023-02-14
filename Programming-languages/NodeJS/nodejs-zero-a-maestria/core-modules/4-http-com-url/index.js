const http = require('http');
const url = require('url')

const port = 5000

const server = http.createServer((req, res) => {
    const urlInfo = require('url').parse(req.url, true)
    const name = urlInfo.query.name

    res.statusCode = 200
    res.setHeader('Contenty-Type', 'text/html')

    if(!name){
        res.end('<h1>Preencha p seu nome:</h1><form method="GET"><input type="text" name="name" /> <input type="submit" value="enviar"/> <form />')
    }else{
        res.end(`<h1>seja bem-vindo ${name}`)
    }
})

server.listen(port, () => {
    console.log('servidor rodando na porta: ' + port)
})