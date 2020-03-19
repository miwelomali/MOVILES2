const mongoose = require('mongoose')
const app = require('./app')
const PORT = process.env.PORT || 3000

const uat = 'mongodb+srv://pollopower:r6BxdRCCNAr1Eh2s@testdatabase-ggp2k.mongodb.net/test?retryWrites=true&w=majority'
const local = 'mongodb://localhost:27017/jobs-db'

mongoose.connect(local, (err, res)=>{
    if(err) return console.log(`Error connecting to database ${err}`)


    console.log('Connection to the database established')

    app.listen(PORT, ()=>{
        console.log(`API Rest running at http:localhost:${PORT}`)
    })
})