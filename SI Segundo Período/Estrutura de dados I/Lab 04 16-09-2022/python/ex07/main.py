def is_palindrome(word):
    return word == word[::-1]

def main():
    word = input("Digite uma palavra: ")
    print(is_palindrome(word) and "É palíndromo" or "Não é palíndromo")
  
main()