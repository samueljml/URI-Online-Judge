qtd = int(input())

while qtd > 0:
    frase = input()
    fraseDescodificada = ''
    idf = 1

    for i in range(0, len(frase)):
        if idf:
            if frase[i].isalpha():
                fraseDescodificada += frase[i]
                idf = 0
        else:
            if not frase[i].isalpha():
                idf = 1

    print(fraseDescodificada)
    qtd -= 1
