def add_inicio(list):      
    numbers = int(input("Digite o número a ser add ao início da list: "))
    if list == False:
        aux = list - 1
        list += [0]
        while aux >= 0:
            list[aux + 1] = list[aux]
            aux = aux - 1
        list[0] = numbers
    else:
        list += [numbers]   