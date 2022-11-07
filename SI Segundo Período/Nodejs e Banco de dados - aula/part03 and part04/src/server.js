import "dotenv/config";

import express from "express";
import "express-async-errors";

import cors from "cors";

import routes from "./routes/user.routes";

const app = express();

app.use(express.json());
app.use(cors());

app.use(express.urlencoded({ extended: true }));
app.use("/public", express.static(__dirname + "/public"));

/// usar as rotas

app.use(routes);

app.use((err, request, response, next) => {
  if (err instanceof Error) {
    return response.status(400).json({
      error: err.message,
    });
  }

  return response.status(500).json({
    status: "Error",
    message: "Internal Server Error",
  });
});

app.listen(3333, () => console.log("Server is running!"));
