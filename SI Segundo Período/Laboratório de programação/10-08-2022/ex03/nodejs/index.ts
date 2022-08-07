const read = require("prompt");
read.start();

class Ex03 {
  async printInfos(): Promise<void> {
    console.log("========================\n");
    console.log("100 - Cachorro Quente\n");
    console.log("101 - Bauru simples\n");
    console.log("102 - Bauru integral c/Ovo\n");
    console.log("103 - Hamburger\n");
    console.log("104 - X-Burger\n");
    console.log("105 - Refrigerante\n");
    console.log("106 - Sucos\n");
    console.log("107 - Salgados\n");
    console.log("108 - Sorvetes\n");
    console.log("109 - Vitaminas\n");
    console.log("========================\n");
  }

  async execute(): Promise<void> {
    console.log("\n");
    this.printInfos();

    console.log("\n");
    const { code } = await read.get([
      {
        name: "code",
        description: "Digite o código do produto",
      },
    ]);

    console.log("\n");

    const { qntd } = await read.get([
      {
        name: "qntd",
        description: "Digite a quantidade do produto",
      },
    ]);
    console.log("\n");

    let order_list = { code, qntd };

    console.log(code);

    console.log("\n========================");

    switch (order_list.code) {
      case "100":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(5.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            290 * order_list.qntd
          }`
        );
        break;
      case "101":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(4.5 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            350 * order_list.qntd
          }`
        );
        break;
      case "102":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(6.5 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            303 * order_list.qntd
          }`
        );
        break;
      case "103":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(8.5 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            295 * order_list.qntd
          }`
        );
        break;
      case "104":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(10.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            359 * order_list.qntd
          }`
        );
        break;
      case "105":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(4.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            200 * order_list.qntd
          }`
        );
        break;
      case "106":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(8.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            108 * order_list.qntd
          }`
        );
        break;
      case "107":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(5.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            273 * order_list.qntd
          }`
        );
        break;
      case "108":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(4.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            207 * order_list.qntd
          }`
        );
        break;
      case "109":
        console.log(
          `Valor total a ser pago: ${new Intl.NumberFormat("pt-BR", {
            style: "currency",
            currency: "BRL",
          }).format(12.0 * order_list.qntd)}\nCalorias (cal) total do lanche: ${
            400 * order_list.qntd
          }`
        );
        break;
      default:
        console.log("Código invalido");
    }

    console.log("========================\n");
  }
}

new Ex03().execute();

// No Windows => tsc greet.ts | node greet.js
// No Linux => tsc helloWorld.ts && node helloWorld.js
