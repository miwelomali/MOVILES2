const router = require('express').Router()
const JobsController = require('../controllers/Jobs')
router.get('/getalljobs', JobsController.getAllJobs)
router.post('/getonejob', JobsController.getOneJob)
router.post('/getjobsbypage', JobsController.getJobsByPage)
router.post('/createjob', JobsController.createJob)
router.post('/updatejob', JobsController.updateJob)
router.post('/deletejob', JobsController.deleteJob)
//TODO hacer una ruta para utilizar patch, put y delete
//Actualizar el update job y el delete job, investigar como
module.exports = router