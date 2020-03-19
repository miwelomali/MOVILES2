module.exports = {
    logInUser,
    //logOutUser,
    //getCurrentUser,
    //createUserm,
    signUpUser
}


let User = require('../models/User')
const jwt = require('jsonwebtoken')
const bcrypt = require('bcrypt.js')
const sha256 = require('sha256')

function logInUser(req,res){
    const email = req.body.email
    const pass = req.body.password
    let passwordIsValid = false
    User.findOne({email: email}).then((user)=> {
        if(!user) return res.status(404).send('no user found')

        //let passwordIsValid = bcrypt.compareSync(
            //sha256(req.pass),
            //user.profile.password
       // )
       if(req.pass == user.profile.password) passwordIsValid = true
        if(!passwordIsValid) return res.status(401).send({auth: false, message: 'Password is not valid'})
        let token = jwt.sign({email: user.profile.email}, process.env.JWT_SECRET, {expiresIn: 864000}) //expires in 24 hours
        res.status(200).send({auth: true, token: token, name: user.username, email:user.email})
    })
}

function signUpUser(req,res){
    const user = new User({
        email: req.body.email,
        username: req.body.username,
        password: bcrypt.hashSync(req.body.password, 10)
        ,
        phone: req.body.phone,
        roles: req.body.roles
    })


    user.save((err) => {
        let token = jwt.sign({id:user.id}, process.env.
            JWT_SECRET, {
                expiresIn: 864000 //Expires in 24 hours
            });

            if (err) return res.status(500).send({message:
            `Error al crear el usuario: ${err}`})

            return res.status(201).send({ token: token, message: 'User created!'})
            
    })
}


