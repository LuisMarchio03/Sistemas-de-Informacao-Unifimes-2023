const read = require("prompt");
read.start();

interface InfosProps {
  name: string;
  balance: number;
  credit: number;
}

class Ex02 {
  async printInfos({ name, balance, credit }: InfosProps): Promise<void> {
    console.log("\n");
    console.log("Informações: \n");
    console.log("======================================\n");
    console.log("Nome: %s\n", name);
    console.log("Saldo médio: %d\n", balance);
    console.log("Valor do crédito: %d%s\n", credit, "%");
    console.log("======================================\n");
    console.log("\n");
  }

  async execute(): Promise<void> {
    console.log("\n");
    const { name } = await read.get([
      {
        name: "name",
        description: "Informe o seu nome",
      },
    ]);

    console.log("\n");

    const { balance } = await read.get([
      {
        name: "balance",
        description: "Informe o saldo médio",
      },
    ]);
    console.log("\n");

    if (balance > 0 && balance <= 2000) {
      this.printInfos({ name, balance, credit: 0 });
    } else if (balance > 2000 && balance <= 6000) {
      this.printInfos({ name, balance, credit: 20 });
    } else if (balance > 6000 && balance <= 12000) {
      this.printInfos({ name, balance, credit: 30 });
    } else if (balance > 12000) {
      this.printInfos({ name, balance, credit: 40 });
    }
  }
}

new Ex02().execute();

// No Windows => tsc greet.ts | node greet.js
// No Linux => tsc helloWorld.ts && node helloWorld.js
