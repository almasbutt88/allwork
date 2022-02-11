const express = require('express');
const app = express();
const MongoClient = require('mongodb').MongoClient; //instantiate moogodb client 
const cors = require('cors');
//now we need to delegate our router
const createRouter = require('./helpers/create_router') //create_router file under helpers dir
app.use(express.json()); 
app.use(cors()); //we do this so two servers can run side by side, we also have to do an npm i cors on the server in terminal before this line

MongoClient.connect('mongodb://127.0.0.1:27017',  //you could also do localhost you can go to mongodb compass and it will tell you what port its running on, in this case 27017
{useUnifiedTopology:true}) //your connection can discover any databases not just the base one
.then((client) =>{ //gives us a client object in response which allows us to browse
 const db = client.db('games_hub');
 const gamesCollection = db.collection('games') // games same as our table in Mongo under games_hub 
 const gamesRouter = createRouter(gamesCollection)//telling router to point to gamesCollection, giving the gamesRouter access to gamesCollection which start point we are working with
 app.use('/api/games', gamesRouter); //route is api/games, and this whole block is connection to the database
}) //for our appliaction, end point, what do we want it to point to, yday we had app/teas app/biscuits which took two routers, here we have one route pointing to a DB
.catch(console.error); //catch any errors if anything goes wrong.






app.listen(5001, function () {
  console.log(`Listening on port ${ this.address().port }`);
});
