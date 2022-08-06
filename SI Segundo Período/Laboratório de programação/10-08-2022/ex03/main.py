class Order():
  def Execute(self):
    print("========================\n")
    print("100 - Cachorro Quente\n")
    print("101 - Bauru simples\n")
    print("102 - Bauru integral c/Ovo\n")
    print("103 - Hamburger\n")
    print("104 - X-Burger\n")
    print("105 - Refrigerante\n")
    print("106 - Sucos\n")
    print("107 - Salgados\n")
    print("108 - Sorvetes\n")
    print("109 - Vitaminas\n")
    print("========================\n")

    code = input("Digite o código do produto: ")
    qntd = int(input("Digite a quantidade do produto: "))
    order_list = {'code': code, 'qntd': qntd}

    print("\n========================")
   
    if order_list['code'] == "100":
        print(f"Valor total a ser pago: {5.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {290 * order_list['qntd']}")
    elif order_list['code'] == "101":
        print(f"Valor total a ser pago: {4.50 * order_list['qntd']}\nCalorias (cal) total do lanche: {350 * order_list['qntd']}")
    elif order_list['code'] == "102":
        print(f"Valor total a ser pago: {6.50 * order_list['qntd']}\nCalorias (cal) total do lanche: {303 * order_list['qntd']}")
    elif order_list['code'] == "103":
        print(f"Valor total a ser pago: {8.50 * order_list['qntd']}\nCalorias (cal) total do lanche: {295 * order_list['qntd']}")
    elif order_list['code'] == "104":
        print(f"Valor total a ser pago: {10.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {359 * order_list['qntd']}")
    elif order_list['code'] == "105":
        print(f"Valor total a ser pago: {4.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {200 * order_list['qntd']}")
    elif order_list['code'] == "106":
        print(f"Valor total a ser pago: {8.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {108 * order_list['qntd']}")
    elif order_list['code'] == "107":
        print(f"Valor total a ser pago: {5.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {273 * order_list['qntd']}")
    elif order_list['code'] == "108":
        print(f"Valor total a ser pago: {4.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {207 * order_list['qntd']}")
    else:
       print(f"Valor total a ser pago: {12.00 * order_list['qntd']}\nCalorias (cal) total do lanche: {400 * order_list['qntd']}")

    print("========================\n")

Order().Execute()