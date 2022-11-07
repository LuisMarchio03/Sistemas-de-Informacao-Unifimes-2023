import { Router } from "express";

const router = Router();

const array = [
  {
    id: 1,
    nome: "João",
    idade: 20,
  },
  {
    id: 2,
    nome: "Maria",
    idade: 30,
  },
];

router.get("/users", (req, res) => {
  return res.json(array); // retorna um array de usuarios
});

// metodo GET de usuario por id

router.get("/user/:id", (req, res) => {
  const id = req.params.id;
  const user = array.find((user) => user.id == id); // FIND - retorna o primeiro elemento que satisfaz a condição
  return res.json(user);
});

// metodo POST de usuarios

router.post("/users", (req, res) => {
  const user = req.body;
  array.push(user); // PUSH - adiciona um novo elemento no array
  return res.json(user);
});

// metodo PUT de usuarios
router.put("/users", (req, res) => {
  const user = req.body;
  const id = user.id;
  const index = array.findIndex((user) => user.id == id); // FIND INDEX - retorna o indice do array
  array[index] = user;
  return res.json(user);
});

// metodo DELETE de usuarios

router.delete("/users", (req, res) => {
  const id = req.body.id;
  const index = array.findIndex((user) => user.id == id); // FIND INDEX - retorna o indice do array
  array.splice(index, 1); // SPLICE - remove um elemento do array
  return res.json(array);
});
