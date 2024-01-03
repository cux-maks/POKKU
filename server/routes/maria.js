const maria = require('mysql')

const conn = maria.createConnection({
    host:'localhost',
    port:3305,
    user:'root',
    password:'1234',
    database:'pokku'
});

module.exports = conn;