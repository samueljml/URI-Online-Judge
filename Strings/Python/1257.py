qtd = int(input())

while qtd > 0:
    qtdL = int(input())
    elemento = 0
    soma = 0
    while elemento < qtdL:

        texto = input()

        for i in range(0, len(texto)):
            soma += ord(texto[i]) - 65 + elemento + i

        elemento += 1
    print(soma)
    qtd -= 1
