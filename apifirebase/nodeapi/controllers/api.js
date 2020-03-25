
function getItem (req, res, next) {
  res.json({ msg: `detalles de una pelicula ${req.params.id}` })
}

function getAll (req, res, next) {
  res.json({ msg: 'Lista de todas las peliculas' })
}

function create (req, res, next) {
  const { title } = req.body
  res.json({ msg: `Crear una pelicula desde ${title}` })
}

function update (req, res, next) {
  const { id, data } = req.body
  res.json({ msg: `Actualizar una pelicula ${id}` })
}

function remove (req, res, next) {
  const { id } = req.body
  res.json({ msg: `Borrar una pelicula ${id}` })
}

module.exports = {
  getItem,
  getAll,
  create,
  update,
  remove
}
