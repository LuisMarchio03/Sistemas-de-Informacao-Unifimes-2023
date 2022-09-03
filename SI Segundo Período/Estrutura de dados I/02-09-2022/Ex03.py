numbers = int()
list = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numbers = int(input("Digite os números a serem adicionados a list: "))

        list.append(numbers)       

print("\nDados inseridos na list: {}".format(list))
print("O número total de nós é: {}".format(n_l))