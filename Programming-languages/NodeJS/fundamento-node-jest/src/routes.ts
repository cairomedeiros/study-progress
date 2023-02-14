import { Router } from "express";
import { UsersController } from "./controllers/usersControllers";

const routes = Router();
const usersController = new UsersController();

const database = []

routes.get('/users', usersController.listarUsuario);
routes.post('/users', usersController.criarUsuario);

export { routes };