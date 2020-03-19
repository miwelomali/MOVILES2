const express = require('express')
const auth = require('./routes/Auth')
const jobs = require('./routes/jobs')
const bodyParser = require('body-parser')
const app = express()

app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())

app.get('/', (res, req)=>{
    res.send("Hola mundo from the API")

})
app.use('/auth', auth)
app.use('/jobs', jobs)

module.exports = app