const express = require('express');
const ObjectId = require('mongodb').ObjectId; // we need this for our second route which uses ID

const createRouter = function (collection) {

  const router = express.Router();

  //lets code the home route to begin with which is /games/
//requesting response objects below
  router.get('/', (req, res) =>{ //taking two params again, request and response. as for route, on server.js, on line 13, app.use('/api/games', gamesRouter),  we have set the base route as /api/games in app.use(), here the / actually means /api/games/, so all the routes that we will define below will have the base url before them by default
// res.send('Hello RoS'); // response is being sent to the back end, in this case, our browser which makes it pesentable by putting it into the body element. we are on the server side
//  collection.find();//passing it our collection from the server.js , this will dump us an object, not very useful.DB Cursor, browsing through db, cursos is doing the work by going back and forth, hopping back and forth, cursor is like a hotel server or waiter that runs back and forth, in this case, 
collection.find().toArray() //so we tell it to put it into an array
.then((docs) => res.json(docs)) //docs is just a variable name for the data we are getting back from the line above, result of the previous toArray, .then always takes the result from line above it.
.catch((err) =>{ //if an error occurs, you can do (err.status) if you know the status
res.status(500); //assuming you will get a 500 error
res.json(
  {
    status:500,
    error:err

  });

})

});
//you can write the above as router.get('/, (req, res) => {
  // collection
  // .find()
  // .toArray()
  // etc etc....

//lets create a new route for id, our client needs to talk to our end points, we can serch by name instead of id, we can search by description. if you dont need a function, like delete, dont put it in

router.get('/:id', (req,res) => { //same as above, router methods dont change much, remem /:id has /api/games in front of it
const id =req.params.id; //id has to match the route in line above
collection
.findOne({//its a mongodb object
_id:ObjectId(id)
})
.then((doc) => res.json(doc))
.catch((err) =>{ //if an error occurs, you can do (err.status) if you know the status
  res.status(500); //assuming you will get a 500 error
  res.json(
    {
      status:500,
      error:err
    });
  })
  //now we can go to our route /api/games/ and paste the object id of one of our objects and it should return that object
})
//lets do a create route that handles post request,creates an insert for us, pass a games object in the body (use insomnia), send back docs to screen, you can use insert1
//do a create, give it a single object, response.json to kick back response to screen
router.post('/', (req, res) => { //because this is a post request
  const newData = req.body;
  collection
  .insertOne(newData) //return sdata to us which we call result below
  // .then((result) => collection.find().toArray) //this will return everything, the entire database, we dont want this, we are gonna get 1000s of objects
.then((result) => res.json(result.ops[0]))//point of returning something we have already passed to it is that it returns it with an ID, check in insomnia //we tell it we only want the first result [0], we know we are only gonna get one result back, .ops returns result of operand, 
  // ops is part of the cursor function, also, in insomnia you got to create a post request with url http://localhost:5001/api/games/ and return an object of your choice like..
  // {
  //   "name": "Chess",
  //   "playingTime": 60,
  //   "players": {
  //     "min": 2,
  //     "max": 2
  //   }
  // }
  .catch((err) =>{ //if an error occurs, you can do (err.status) if you know the status
    res.status(500); //assuming you will get a 500 error
    res.json(
      {
        status:500,
        error:err
      });
    })
  });


//lets create delete function and we have to tell it the ID this time
router.delete('/:id', (req, res) =>{

  const id = req.params.id;
  collection.deleteOne({_id:ObjectId(id)})//pass in our database object which is __id
  .then(result => { res.json(result)})
  .catch((err) =>{ //if an error occurs, you can do (err.status) if you know the status
    res.status(500); //assuming you will get a 500 error
    res.json(
      {
        status:500,
        error:err
      });
    })
  });
  //check in insomnia by creating a delete method, passing it url http://localhost:5001/api/games/61af3903d36caa8923e98cd3


//lets create an update router which is a put request

router.put("/:id", (req, res) =>{

  const id = req.params.id;
  const updatedData = req.body;
  collection.updateOne({_id:ObjectId(id)}, {$set:updatedData}) //updateOne is a key function  ,you have to pass it two objects, updateData 

.then((result) => {
  res.json(result)
  })
.catch((err) =>{ //if an error occurs, you can do (err.status) if you know the status
  res.status(500); //assuming you will get a 500 error
  res.json(
    {
      status:500,
      error:err
    });
})
});


  return router;
};

module.exports = createRouter;
