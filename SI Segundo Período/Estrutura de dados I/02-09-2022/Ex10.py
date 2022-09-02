numeros = int()
lista = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numeros = int(input("Digite os números a serem adicionados a lista: "))

        lista.append(numeros)       
        
print("\nDados inseridos na lista: {}".format(lista))

numeros =int(input("Digite o valor a ser encontrado: "))
if numeros not in lista:
    print("O número não foi encotrado!")

else:
    pos = lista.index(numeros)
    print("O elemento {} foi encontrado no Vetor: {}".format(numeros,pos))
