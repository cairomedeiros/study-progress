const http = require('http');

const port = 5000

const server = http.createServer((req, res) => {
    res.statusCode = 200
    res.setHeader('Contenty-Type', 'text/html')
    res.end('<h1>Olá, este é meu primeiro server com html!</h1>')
})

server.listen(port, () => {
    console.log('servidor rodando na porta: ' + port)
})