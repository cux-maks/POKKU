var createError = require("http-errors");
var express = require("express");
var path = require("path");
var cookieParser = require("cookie-parser");
var logger = require("morgan");

var indexRouter = require("./routes/index");
var usersRouter = require("./routes/users");
var userInfoRouter = require("./routes/user_info");
var userInfoGithubRouter = require("./routes/user_info_github");
var userInfoBlogRouter = require("./routes/user_info_blog");

var app = express();

const PORT = process.env.PORT || 5000;

const maria = require('./routes/maria');
maria.connect();

// view engine setup
app.set("views", path.join(__dirname, "views"));
app.set("view engine", "jade");

app.use(logger("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, "./client/build")));

app.use("/", indexRouter);
app.use("/users", usersRouter);
app.use("/user_info", userInfoRouter);
app.use("/user_info_github", userInfoGithubRouter);
app.use("/user_info_blog", userInfoBlogRouter);

app.get("*", (req, res) => {
  res.sendFile(path.join(__dirname, "./client/build/index.html"));
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});

// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use(function (err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get("env") === "development" ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render("error");
});

module.exports = app;
