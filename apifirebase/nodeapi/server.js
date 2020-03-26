const express = require('express')
const bodyParser = require('body-parser')
const api = require('./controllers/api')
const app = express()
const {port} = require("./config")
// Middleware
app.use(bodyParser.json())

// Permite utilizar la carpeta public para la ruta inicial "/" (FRONTEND)
app.use(express.static('public'))

// RUTAS

// - GET /movies/:id -> Detalles de una pelicula
app.get('/api/movies/:id', api.getItem)

// GET /movies -> Lista de las peliculas
// POST /movies -> Crear una pelicula
// PUT /Movies -> Actualizar una pelicula
// DELETE /movies -> Borrar una pelicula

app.route('/api/movies')
    .get(api.getAll)
    .post(api.create)
    .put(api.update)
    .delete(api.remove)

// Puerto
app.listen(port, () => {
    console.log('Ya estamos online')
})
