const jwt = require('jsonwebtoken')

function verifyToken(req, res, next){
    let token = req.headers['x-access-token']
    const JWT_SECRET = 'bcryptisonline'

    if(!token)
        return res.status(403).send({auth: false, message: "No Token Provided"})

     jwt.verify(token, JWT_SECRET, function(err, decoded){
        if(err)
            return res.status(500).send({auth:false, message: 'Failed to authenticate token'})

            req.userid = decoded.userid
            next()
        })
}

module.exports = verifyToken