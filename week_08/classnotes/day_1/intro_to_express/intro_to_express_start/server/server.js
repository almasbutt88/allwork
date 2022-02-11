const express = require('express');
const app = express() // this inits your server
const cors = require('cors');

app.use(cors());

//to run your server, you gotta do this:

app.listen(5001, function(){
    console.log('App Running on port 5000'); //once you have done this, run 
})


//remember GET POST PUT DELETE, each take two arguements, a call back and an endpoint
// all methods are endpoints or urls
//('/') this is our root, home
app.get('/', function(req, res){ //callback has 2 parameters, http request (which is incoming) and http response (outgoing)
// res.send("Hello RoS") //now that we have installed nodemon.....
res.json({ //this is a json object instead of a string which you see in line 15 res.send("Hello RoS")
    message: "Hello RoS v2"
})
});
//at this point we have a fully functioning web server

//nodemon is a hot change application


