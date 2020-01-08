qtd = int(input())

while qtd > 0:
    codif = ''

    texto = input()
    for i in range(0, len(texto)):
        if texto[i].isalpha():
            codif += chr(ord(texto[i]) + 3)
        else:
            codif += texto[i]
    codif = codif[::-1]
    tam = len(codif)
    texto = ''

    for i in range(0, len(codif[tam:])):
        texto += chr(ord(codif[tam + i]) - 1)

    print(codif[:tam] + texto)
    qtd -= 1
