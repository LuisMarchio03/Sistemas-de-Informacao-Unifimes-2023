import { PrismaClient } from "@prisma/client";

const prisma = new PrismaClient();

class UserController {
  async criar(req, res) {
    const { nome, idade } = req.body;
    const user = await prisma.user.create({
      data: {
        nome,
        idade,
      },
    });
    return res.json(user);
  }

  async pegaTodos(req, res) {
    const users = await prisma.user.findMany();
    return res.json(users);
  }

  async pegaUm(req, res) {
    const id = req.params.id;
    const user = await prisma.user.findUnique({
      where: {
        id: Number(id),
      },
    });
    return res.json(user);
  }

  async atualizar(req, res) {
    const { id, nome, idade } = req.body;
    const user = await prisma.user.update({
      where: {
        id: Number(id),
      },
      data: {
        nome,
        idade,
      },
    });
    return res.json(user);
  }

  async deletar(req, res) {
    const id = req.body.id;
    const user = await prisma.user.delete({
      where: {
        id: Number(id),
      },
    });
    return res.json(user);
  }
}

export default UserController;
