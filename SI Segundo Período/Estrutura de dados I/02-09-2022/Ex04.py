numbers = int()
list = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numbers = int(input("Digite os números a serem adicionados a list: "))
        list.append(numbers)


numbers = int(input("Digite o número a ser adicionado ao inicio da list: "))
list.insert(0,numbers)

        
print("\nDados inseridos na list: {}".format(list))
