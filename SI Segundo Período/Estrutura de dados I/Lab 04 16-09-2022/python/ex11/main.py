# algoritmo para inverter a posição dos eleemntos em uma lista

def main():
    numbers = list(map(int, input("Digite os números separados por espaço: ").split()))
    print(f"Lista original: {numbers}")
    print(f"Lista invertida: {numbers[::-1]}")

main()