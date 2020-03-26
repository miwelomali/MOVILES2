//Constantes de Firebase:
const db = require("../models/db")
//Generador de JSON de la API ombd, referencia de lib/ombd
const {generateMovieDetails} = require("../lib/ombd")

function getItem(req, res, next) {
    //Referencia de firebase en db.js
    db.listItem(req.params.id)
        .then(data => {
            if (data) {
                return res.json(data) // devuelve la informacion en formato json 
            }
            res.status(404).json({ msg: "No Existe una pelicula con ese ID" })
        })
        .catch(next)
    //res.json({ msg: `detalles de una pelicula ${req.params.id}` })
}

function getAll(req, res, next) {
    //Referencia de firebase en db.js
    db.listAllItems()
        .then(data => res.json(data))
        .catch(next)
    //res.json({ msg: 'Lista de todas las peliculas' })
}



function create(req, res, next) {
    req.body = req.body || {}
    const { title } = req.body
    if (!title) {
        res.status(400).json({ msg: "Faltan datos" })
    }
    //res.json({ msg: `Crear una pelicula desde ${title}` })

    //Antes de crear una pelicula con el titulo, se generara la informacion por medio de la API de ombd y se insertaran en firebase con create
    generateMovieDetails(title)
    .then(db.create)
    .then(data => res.status(201).json(data))
    .catch(next)
}

function update(req, res, next) {
    const { id, data } = req.body


    if (!id || !data) {
        res.status(400).json({ msg: "Faltan datos!" })
    }
    //Referencia de firebase en db.js
    db.update(id, data)
        .then(data => res.json({ msg: "datos actualizados con éxito" }))
        .catch(next)

    //res.json({ msg: `Actualizar una pelicula ${id} con ${data}` })
}

function remove(req, res, next) {
    const { id } = req.body
    if (!id) {
        res.status(400).json({ msg: "Falta ID" })
    }

    //Referencia de firebase en db.js
    db.remove(id)
        .then(data => res.status(201).json({ msg: "Pelicula eliminada" }))
        .catch(next)
    //res.json({ msg: `Borrar una pelicula ${id}` })
}

module.exports = {
    getItem,
    getAll,
    create,
    update,
    remove
}
