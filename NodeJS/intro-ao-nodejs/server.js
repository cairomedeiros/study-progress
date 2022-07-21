const http = require('http');
const host = 'http://localhost';
const port = 3000;

http.createServer((req, res) => {
    res.end('<h1>working</h1>')
} ).listen(port, () => console.log(`server is running on ${host}:${port}`))