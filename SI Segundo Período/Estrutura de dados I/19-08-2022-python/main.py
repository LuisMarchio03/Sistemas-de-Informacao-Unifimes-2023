
numeros = int()
lista = []    

def add_fim(lista):
    numeros = int(input("Digite o número a ser add ao fim da lista: "))
    lista += [numeros]

def re_inicio(lista):
    lista.pop(0)

def re_fim(lista):
    lista.pop[lista - 1]

def verificar_vazio(lista):
    if len(lista) > 0:
        print("Lista não está vazia")
    else:
        print("A lista está vazia")

menu = int(input("Digite a opção: "))
while True:
    match menu:  
        case 1:
            add_inicio(lista)
        case 2:
            add_fim(lista)
        case 3:
            re_inicio(lista)
        case 4:
            re_fim(lista)
        case 5:
            verificar_vazio(lista)