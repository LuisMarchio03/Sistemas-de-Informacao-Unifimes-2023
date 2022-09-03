numbers = int()
list = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numbers = int(input("Digite os números a serem adicionados a list: "))

        list.append(numbers)       
        
print("\nDados inseridos na list: {}".format(list))

numbers =int(input("Digite o valor a ser encontrado: "))
if numbers not in list:
    print("O número não foi encotrado!")

else:
    pos = list.index(numbers)
    print("O elemento {} foi encontrado no Vetor: {}".format(numbers,pos))
