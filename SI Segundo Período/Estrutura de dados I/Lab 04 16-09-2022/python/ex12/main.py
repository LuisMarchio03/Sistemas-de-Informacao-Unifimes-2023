# desenvolva uma função para testar se P1 tem mais elementos que P2

def main():
    p1 = list(map(int, input("Digite os números separados por espaço: ").split()))
    p2 = list(map(int, input("Digite os números separados por espaço: ").split()))
    print(f"P1 tem mais elementos que P2? {len(p1) > len(p2) and 'Sim' or 'Não'}")

main()