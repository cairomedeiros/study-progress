import express from 'express';
import exphbs from 'express-handlebars';
import mysql from 'mysql';

const app = express();

app.engine('handlebars', exphbs.engine())
app.set('view engine', 'handlebars')

app.use(express.static('public'));

app.get('/', (req, res) => {
    res.render('home')
})

const conn = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'nodemysql',
})

conn.connect(function(err) {
    if(err){
        console.log(err)
    }

    console.log('Conectou ao mysql')

    app.listen(3000)
})