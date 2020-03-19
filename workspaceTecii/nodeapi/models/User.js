const mongoose = require('mongoose')

const Schema = mongoose.Schema

const AddressSchema = Schema ({
    street: {type: String},
    city: {type: String},
    state: {type: String},
    zipCode: {type: String}
})

const DocumentsSchema = Schema({
    INE: {type: String},
    certificate: { type: String}, //Agregar solo el ultimo cursando
    residenceProof: { type: String }

})


const ProfileSchema = Schema ({
    name: {type: String, optional:false},
    lastname: {type: String,optional:false},
    email: {type: String, optional:false},
    password: {type: String, optional:false}, //TODO use SH256 to encrypt
    phone: {type: String, optional:false},
    birthDate: {type: String, optional:false},
    address: {type: AddressSchema},
    gender: {type: String, optional:true},
    maritalStatus: { type: String, optional:false },  //TODO agregar arreglo de estados
    profileImg: {type: String, optional:true},
    degree: {type: String, optional:true},
    roles: {type: [String], allowedValues: ['admin', 'developer', 'manager']},
    requiredDocuments: {type: DocumentsSchema}

})

const UserSchema = Schema ({
    username: {type: String},
    profile: {type: ProfileSchema},
    terms: {type: Boolean, optional: false}
})


module.exports = mongoose.model('UserModel', UserSchema)
