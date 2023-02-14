const fs = require('fs');
const http = require('http');

const port = 5000

const server = http.createServer((req, res) => {
    fs.readFile('msg.html', function(err, data) {
        res.writeHead(200, {'Content-Type': 'text/html'})
        res.write(data)
        return res.end()
    })
})

server.listen(port, () => {
    console.log('servidor rodando na porta: ' + port)
})