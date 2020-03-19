const mongoose = require('mongoose')

const Schema = mongoose.Schema
const WorkerSchema = mongoose.Schema
const EmployerSchema = mongoose.Schema
const PointSchema = mongoose.Schema
const PointSchema = Schema({
    lat: NUmber,
    lng: Number,
})

const WorkerSchema = Schema({
    worker: Schema.type.UserSchema,
    rate: Number
})

const EmployerSchema = Schema({
    worker: Schema.type.UserSchema,
    rate: Number
})
const JobsSchema = Schema({
    name: { type: String },
    publishDate9: { type: String },
    startedDate: { type: String },
    finishedDate: {type: String},
    dueDate: { type: String },
    isActive:{ type: Boolean },
    workers: { type: [WorkerSchema] } ,
    description: { type: String },
    employer: { type: [EmployerSchema] },
    amountPayment: { type: NUmber },
    description_img: { type: String },
    category: { type: String },
    point: { type: PointSchema },
    maxWorkers: { type: Number },
    done: { type: Boolean }    
})

module.exports = mongoose.model('JobsModel', JobsSchema)