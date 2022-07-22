import { Router } from "express";
import { usersController } from "./controllers/usersControllers.js";

const routes = Router();

const database = []

routes.get('/users', usersController.listarUsuario);
routes.post('/users', usersController.criarUsuario);

export { routes };