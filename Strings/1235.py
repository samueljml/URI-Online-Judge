qtd = int(input())

while qtd > 0:
    frase = input()
    tam = len(frase)
    tam //= 2

    novaFrase = ''
    novaFrase += frase[tam-1::-1]
    novaFrase += frase[:tam-1:-1]

    print(novaFrase)

    qtd -= 1