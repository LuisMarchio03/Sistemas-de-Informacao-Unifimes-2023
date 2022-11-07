// routas express - crud usuarios / class

import { Router } from "express";
import { UserController } from "./controllers/user.controller";

const router = Router(); // cria uma instancia de um objeto do tipo Router

const userController = new UserController(); // instanciando a classe

router.post("/users", userController.criar);
router.get("/users", userController.pegaTodos);
router.get("/user/:id", userController.pegaUm); // Parametro de rota
router.put("/users", userController.atualizar);
router.delete("/users", userController.deletar);

export default router;
