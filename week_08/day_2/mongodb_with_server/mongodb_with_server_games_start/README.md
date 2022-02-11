# Games Hub

Games Hub is a full stack JavaScript application with an Express server and MongoDB database.

## Getting Started

These instructions will get the project up and running on your local machine for development purposes.

### Installing

Install dependencies in both the client and the server folders:

```
cd client
npm install // because git doesnt store these node_modules as they are in the gitignore so everytime a project is downloaded, user needs to do their own npm install as node modules are too huge

cd server
npm install
```

Seed the database.  Within the server folder:

```
npm run seeds
```

Run express (leave running in a terminal window).  Within the server folder:

```
npm run server:dev
```

Run React development environment (leave running in a terminal window).  Within client folder:

```
npm start
```

### Using

The application is running on port 3000 so visit http://localhost:3000/.
