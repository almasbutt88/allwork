const express = require('express');
const app = express();
const cors = require('cors');
const createRouter= require('./helpers/create_router');

const teas = [
  { name: "Early Grey", brand: "Twinings" },
  { name: "Irish Breakfast", brand: "Barry's Tea" },
  { name: "Lemon and Ginger", brand: "Lipton" },
  { name: "Rooibos", brand: "Tick Tock" },
  { name: "Green", brand: "Clipper" }
];


  const biscuits = [
    {name: "Digestives", brand: "McVities"},
    {name: "Custard Creams", brand: "McVities"},
    {name: "Bourbons", brand: "Morrisons"},
    {name: "Oreos", brand: "Nestle"},
    {name: "Chocolate", brand: "Morrisons"},
    {name: "Tuc", brand: "Lu"},
    {name: "", brand: ""},
  ]
app.use(cors()); //react servers running on different servers, 
app.use(express.json()); //access the form body by doing req.body, geenrates the body object and attached to the request

const teasRouter = createRouter(teas); // we are going to call the createRouter function and pass in teas
app.use('/api/teas', teasRouter) // this will create new routes for us,attach this prefix (api/teas) to all the routes sent back by creteRouter
// /api/teas - Index (GET)
app.get('/api/teas', (req, res) =>{ //these will always be the same request and response, app.get is the browser making the request. Browser always makes a request, in this case, to get info
res.json(teas); //we pass in the teas array as defined above
})
// /api/teas/:id - Show (GET) shows up one specific tea or route
app.get('/api/teas/:id', (req,res) =>{ //what do we wnt to send back? we second back a second tea
res.json( teas[req.params.id]) //to gain access to this id, we pass in request object, and params.id

})
// /api/teas - Create (POST) adding a tea to our array using the http method post
app.post('/api/teas', (req, res) => {
  //we are going to collect the new tea on the back end here using the request object
  //we had to do cors because we had to do middleware cors, a function that runs between two servers
  // app.use(express.json()); //turn any data being sent into a js object, different to front end json function
//  console.log(req.body) //req.body would hold the data sent by the form inside itself by adding body to the req obj
teas.push( req.body ) // push it on and send back all the teas
res.json(teas);
})
// /api/teas/:id - Destroy (DELETE)
app.delete('/api/teas/:id', (req, res)=>{
teas.splice(req.params.id, 1); // params.id is where the id is stored if you look in th e browser, using splice because we dont have a database and splice takes 2 arguments remember?
res.json(teas);
})

// /api/teas/:id - Update (PUT)
app.put('/api/teas/:id', (req, res) =>{
  teas[req.params.id] = req.body;
  res.json(teas);
})


const TeasRouter = createRouter(teas);
app.use('/api/teas', teasRouter);

const biscuitsRouter = createRouter(biscuits);
app.use('/api/biscuits', biscuitsRouter);

app.listen(5001, function () { //booted up the server by saying listen to port 5001
  console.log(`App running on port ${ this.address().port }`);
});
//so now that we have done teas we need to write routes for all the functions we want to perform with biscuits
//we dont want to repeat ourselves with biscuits so lets create a function
//so lets make dir helpers and then router.js