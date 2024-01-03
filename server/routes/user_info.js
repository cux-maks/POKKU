var express = require('express');
var router = express.Router();

const maria = require('./maria');

// create user_info
router.post('/', function(req, res) {
    maria.query(`insert into user_info values ('${req.body.user_name}', '${req.body.user_birth}', '${req.body.user_tel}', '${req.body.user_email}', '${req.body.user_id}', '${req.body.user_password}', '${req.body.user_nickname}', '${req.body.user_education}')`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// select all user_info
router.get('/', function(req, res) {
    maria.query('select * from `user_info`', function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// select by id user_info
router.get('/:user_id', function(req, res) {
    maria.query(`select * from user_info where user_id = '${req.params.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// update by id user_info
router.put('/', function(req, res) {
    maria.query(`update user_info set user_name = '${req.body.user_name}', user_birth = '${req.body.user_birth}', user_tel = '${req.body.user_tel}', user_email = '${req.body.user_email}', user_id = '${req.body.user_id}', user_password = '${req.body.user_password}', user_nickname = '${req.body.user_nickname}', user_education = '${req.body.user_education}' where user_id = '${req.body.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

// delete by id user_info
router.delete('/', function(req, res) {
    maria.query(`delete from user_info where user_id = '${req.body.user_id}'`, function(err, rows, fields) {
        if(!err){
            res.send(rows);
        }else{
            console.log("err: " + err);
            res.send(err);
        }
    });
});

module.exports = router;
