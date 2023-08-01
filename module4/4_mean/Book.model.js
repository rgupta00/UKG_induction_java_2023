var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var BookSchema = new Schema({
  title: String,
  author: String,
  category: String
});
//Book--> books
//Book123-->book123s
 module.exports = mongoose.model('Book', BookSchema);
//module.exports = BookSchema