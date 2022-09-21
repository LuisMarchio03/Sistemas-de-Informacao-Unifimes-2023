# algoritmo para saber se P1 e P2 são igauais

def main():
    p1 = list(map(int, input("Digite os números separados por espaço: ").split()))
    p2 = list(map(int, input("Digite os números separados por espaço: ").split()))
    print(f"P1 e P2 são iguais? {p1 == p2 and 'Sim' or 'Não'}")
  
main()