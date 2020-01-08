idf = False

while True:
    
    qtd = int(input())
    maior = 0
    if qtd == 0:
        break
    if idf:
        print()
    texto = []

    for i in range(qtd):
        line = input().split()
        linha = ''
        tam = len(line)
        for j in range(tam):     
            if j+1 == tam:
                linha += line[j]
            else:
                linha += line[j]
                linha += ' '
        tam2 = len(linha)
        if tam2 > maior:
            maior = tam2
        texto.append(linha)
    for i in range(qtd):
        print(texto[i].rjust(maior))
    idf = True
