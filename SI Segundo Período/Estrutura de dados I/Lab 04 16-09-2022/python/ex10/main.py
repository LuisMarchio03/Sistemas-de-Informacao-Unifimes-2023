# algoritmo para dectectar o maior, menor e a média de uma lista de números inteiros.

def main():
    numbers = list(map(int, input("Digite os números separados por espaço: ").split()))
    print(f"Maior: {max(numbers)}")
    print(f"Menor: {min(numbers)}")
    print(f"Média: {sum(numbers) / len(numbers)}")

main()