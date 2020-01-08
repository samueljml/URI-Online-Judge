idf = 0

while 1:
    qtd = int(input())
    if qtd == 0:
        break
    
    texto = list()
    i = 0
    maior = 0

    while i < qtd:
        texto.append(input())
        if len(texto[i]) > maior:
            maior = len(texto[i])

        i += 1

    if idf:
        print()
    idf = 1

    for i in range(0, qtd):
        print(texto[i].rjust(maior))
