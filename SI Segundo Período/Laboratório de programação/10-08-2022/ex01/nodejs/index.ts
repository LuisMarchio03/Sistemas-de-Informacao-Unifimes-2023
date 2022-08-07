const read = require("prompt");
read.start();

class Ex01 {
  getLength(number: number) {
    return number?.toString()?.length;
  }

  async execute(): Promise<void> {
    console.log("\n");
    const { number } = await read.get([
      {
        name: "number",
        description: "Digite um número de 4 dígitos",
      },
    ]);
    console.log("\n");

    if (this.getLength(number) < 4) {
      console.log("O Número deve ter exatamente 4 dígitos!");
      return;
    }

    const splits = number.toString().split("", 4);

    if (
      Number(splits[0] + splits[1]) + Number(splits[2] + splits[3]) ===
      Math.sqrt(number)
    )
      console.log(
        `A raiz quadrada de ${number} é igual a soma das dezenas de ${number}`
      );
    else
      console.log(
        `A raiz quadrada de ${number} NÃO é igual a soma das dezenas de ${number}`
      );

    console.log("\n");
  }
}

new Ex01().execute();

// No Windows => tsc greet.ts | node greet.js
// No Linux => tsc helloWorld.ts && node helloWorld.js
