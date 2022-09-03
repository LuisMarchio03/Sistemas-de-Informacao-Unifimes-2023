numbers = int()
list = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numbers = int(input("Digite os números a serem adicionados a list: "))
        list.append(numbers)

print("\nDados inseridos na list: {}".format(list))

l_m = int(input("Digite em qual vetor quer adicionar: "))
numbers = int(input("Digite o número a ser adicionado ao meio da list: "))
list.insert(l_m, numbers)
        
print("\nDados inseridos na list: {}".format(list))