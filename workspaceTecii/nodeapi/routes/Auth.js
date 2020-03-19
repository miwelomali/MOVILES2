const router = require('express').Router()
const AuthController = require('../controllers/Auth')
router.post('login', AuthController.logInUser)
router.post('signup', AuthController.signUpUser)
module.exports = router