
import express from "express";
import routes from "./routes/user.routes";

const app = express();

app.use(express.json());

app.use(routes); // Usar as rotas

app.listen(3333, () => console.log("Server is running!"));
