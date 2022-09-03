
numbers = int()
list = []    

def add_fim(list):
    numbers = int(input("Digite o número a ser add ao fim da list: "))
    list += [numbers]

def re_inicio(list):
    list.pop(0)

def re_fim(list):
    list.pop[list - 1]

def verificar_vazio(list):
    if len(list) > 0:
        print("list não está vazia")
    else:
        print("A list está vazia")

menu = int(input("Digite a opção: "))
while True:
    match menu:  
        case 1:
            add_inicio(list)
        case 2:
            add_fim(list)
        case 3:
            re_inicio(list)
        case 4:
            re_fim(list)
        case 5:
            verificar_vazio(list)