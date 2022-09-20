phrase = input("Digite a frase que deseja inverter: ") 
phrase_inverted = ' '.join(word[::-1] for word in phrase.split())
print(phrase_inverted)