def add_inicio(lista):      
    numeros = int(input("Digite o número a ser add ao início da lista: "))
    if lista == False:
        aux = lista - 1
        lista += [0]
        while aux >= 0:
            lista[aux + 1] = lista[aux]
            aux = aux - 1
        lista[0] = numeros
    else:
        lista += [numeros]   