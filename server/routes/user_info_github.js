var express = require('express');
var router = express.Router();

const maria = require('./maria');

// create user_info_github
router.post('/', function(req, res) {
    maria.query(`insert into user_info_github values('${req.body.user_id}', '${req.body.user_github}')`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// select all user_info_github
router.get('/', function(req, res) {
    maria.query('select * from user_info_github', function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// select by id user_info_github
router.get('/', function(req, res) {
    maria.query(`select * from user_info_github where user_id = '${req.params.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// update by id user_info_github
router.put('/', function(req, res) {
    maria.query(`update user_info_github set user_id = '${req.body.user_id}', user_github = '${req.body.user_github}' where user_id = '${req.body.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// delete by id user_info_github
router.delete('/', function(req, res) {
    maria.query(`delete from user_info_github where user_id = '${req.body.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

module.exports = router;
