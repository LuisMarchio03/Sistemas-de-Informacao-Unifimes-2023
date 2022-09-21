def cadastrar_aluno(alunos, nome):
    print("Cadastra aluno")
    alunos.append({"nome": nome, "nota": None, "nota2": None})

def cadastrar_notas(alunos):
    print("Cadastrar notas")
    print(alunos)
    for aluno in alunos:
        nota = int(input("Digite a primeria nota do aluno {}: ".format(aluno["nome"])))
        nota2 = int(input("Digite a nota segunda do aluno {}: ".format(aluno["nome"])))
        aluno["nota"] = nota
        aluno["nota2"] = nota2

def calcular_media_de_cada_aluno(alunos, nome):
    media = 0
    for aluno in alunos:
        if aluno["nome"] == nome:
            calc = aluno["nota"] + aluno["nota2"]
            media = calc / 2
            print("A média do aluno {} é {}".format(aluno["nome"], media))
            

def lista_os_nomes_dos_alunos_sem_notas(alunos):
    for aluno in alunos:
        if aluno["nota"] == None and alunos["nota2"] == None:
            print(aluno["nome"])

def excluir_aluno(alunos, nome):
    for aluno in alunos:
        if aluno["nome"] == nome:
            alunos.remove(aluno)

def excluir_nota(alunos, nome):
    for aluno in alunos:
        if aluno["nome"] == nome:
            aluno["nota"] = None
            aluno["nota2"] = None

def print_infos_de_cada_aluno(alunos, nome):
    for aluno in alunos:
        if aluno["nome"] == nome:
            print("Nome: {}".format(aluno["nome"]))
            print("Nota 1: {}".format(aluno["nota"]))
            print("Nota 2: {}".format(aluno["nota2"]))

def main():
    alunos = []

    while True:
        menu = int(input("Selecione uma das opções abaixo: "))
        

        if menu == 1:
            nome = input("Digite o nome do aluno: ")
            cadastrar_aluno(alunos, nome)
        elif menu == 2:
            cadastrar_notas(alunos)
        elif menu == 3:
            nome = input("Digite o nome do aluno: ")
            calcular_media_de_cada_aluno(alunos, nome)
        elif menu == 4:
            lista_os_nomes_dos_alunos_sem_notas(alunos)
        elif menu == 5:
            nome = input("Digite o nome do aluno: ")
            excluir_aluno(alunos, nome)
        elif menu == 6:
            nome = input("Digite o nome do aluno: ")
            excluir_nota(alunos, nome)
        elif menu == 7:
            nome = input("Digite o nome do aluno: ")
            print_infos_de_cada_aluno(alunos, nome)
        else:
            print("Saindo...")
            break;

main()