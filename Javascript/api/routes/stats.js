const express = require('express');
const fs = require('fs');
const path = require('path');

const router = express.Router();

module.exports = router;

// GET method implementation
const getStats = async (req, res, next) => {
    try {
        const data = fs.readFileSync(path.join(__dirname, 'stats.json')); // reads through the file
        const stats = JSON.parse(data); // json parses the data of the json file
        const playerStats = stats.find(stats => stats.id === Number(req.params.id));
        if (!playerStats) { // if not found an error is throw back at the user
            const err = new Error('Player stats not found');
            err.status = 404;
            throw err;
        }
        res.json(playerStats);
    }   catch(e) {
        next(e);
    }
};

router
    .route('/api/v1/stats/:id')
    .get(getStats);



// POST method implementation

const createStats = async (req, res, next) => {
    // accpets id, wins, losses and scored points from the request body
    try { /*Things to keep in mind when parsing JSON from a file is that it has to be valid JSON When     
        calling the JSON.parse function, you must wrap the code in a try / catch block so it won’t throw an error */
        const data = fs.readFileSync(statsFilePath);
        const stats = JSON.parse(data);
        const newStats = {
            id : req.body.id,
            wins: req.body.wins,
            losses: req.body.losses,
            points: req.body.points_scored,
        };
        stats.push(newStats);
        /* when saving the data back into the file, we need to call JSON.stringify, this will parse the 
        sJSON and return it as a valid string. */
        /* It will read in the data from the JSON file and append the new player stats, and will return with a status code of 201. */
        fs.writeFileSync(statsFilePath, JSON.stringify(stats));
        res.status(201).json(newStats);
    }   catch (e){
        next(e);
    }
};

router
    .route('/api/v1/stats')
    .post(createStats);

// PUT method implementation


/* This method will accept the players id in the url, and a request body with id, wins, losses, and points scored. 
Much like the POST request it will read in the stats data, find the correct player and update their stats. */
const updateStats = (req, res, next) => {
    try {
        const data = fs.readFileSync(statsFilePath);
        const stats = JSON.parse(data)
        const playerStats = stats.find(player => player.id === Number(req.params.id));
        //If the record cannot be found, the method returns the error message and appropriate status 404 Player stats not found
        if (!playerStats) {
            const err = new Error('Player stats not found');
            err.status = 404;
            throw err;
        }
        const newStatsData = {
            id: req.body.id,
            wins: req.body.wins,
            losses: req.body.losses,
            points: req.body.points_scored,
        };
        const newStats = stats.map(player => {
            if (player.id === Number(req.params.id)) {
                return newStatsData;
            } else {
                return player;
            }
        });
        fs.writeFileSync(statsFilePath, JSON.stringify(newStats));
        // If the update is successful it will return a 200 status code.
        res.status(200).json(newStatsData);
    } catch (e) {
        next(e);
    }
};

router
    .route('/stats/v1/stats/:id')
    .get(getStats)
    .put(updateStats);

// DELETE method implementation

// This will iterate through the stats data and remove the player
const deleteStats = async (req, res, next) => {
    try {
        const data = fs.readFileSync(statsFilePath);
        const stats = JSON.parse(data)
        const playerStats = stats.find(player => player.id === Number(req.params.id));
        // If the record cannot be found, the method returns the error message and status code 404 Player stats not found.
        if (!playerStats) {
            const err = new Error('Player stats not found');
            err.status = 404;
            throw err;
        }
        const newStats = stats.map(player => {
            if (player.id === Number(req.params.id)) {
                return newStatsData;
            } else {
                return player;
            }
        })
        .filter(player => player !== null);
        fs.writeFileSync(statsFilePath, JSON.stringify(newStats));
        res.status(200).end();
    }   catch (e) {
        next(e);
    }
};

router
  .route('/api/v1/stats/:id')
  .get(getStats)
  .put(updateStats)
  .delete(deleteStats);


