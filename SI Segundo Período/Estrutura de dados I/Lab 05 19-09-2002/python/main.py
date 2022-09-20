
def cadastrar_aluno(alunos, nome):
    alunos.append({"nome": nome, "nota": None})

def cadastrar_notas(alunos):
    for aluno in alunos:
        nota = input("Digite a nota do aluno {}: ".format(aluno["nome"]))
        aluno["nota"] = nota

def calcular_media_notas(alunos):
    soma = 0
    for aluno in alunos:
        soma += aluno["nota"]
    return soma / len(alunos)

def lista_os_nomes_dos_alunos_sem_notas(alunos):
    for aluno in alunos:
        if aluno["nota"] == None:
            print(aluno["nome"])

def excluir_aluno(alunos, nome):
    for aluno in alunos:
        if aluno["nome"] == nome:
            alunos.remove(aluno)

def excluir_nota(alunos, nome):
    for aluno in alunos:
        if aluno["nome"] == nome:
            aluno["nota"] = None

def main():
    while True:
        menu = int(input("Selecione uma das opções abaixo: "))
        alunos = []

        if menu == 1:
            nome = input("Digite o nome do aluno: ")
            cadastrar_aluno(alunos, nome)
        elif menu == 2:
            cadastrar_notas(alunos)
        elif menu == 3:
            print(calcular_media_notas(alunos))
        elif menu == 4:
            lista_os_nomes_dos_alunos_sem_notas(alunos)
        elif menu == 5:
            nome = input("Digite o nome do aluno: ")
            excluir_aluno(alunos, nome)
        elif menu == 6:
            nome = input("Digite o nome do aluno: ")
            excluir_nota(alunos, nome)
        else:
            print("Saindo...")
            break;


main()