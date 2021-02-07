qtd = int(input())

while qtd > 0:
    frase = input().strip()
    fraseLimpra = ''
    for i in range(0, len(frase)):
        if frase[i].isalpha():
            fraseLimpra += frase[i].lower()
    maior = 0
    most_frequent = ''

    for i in range(97, 123):
        if fraseLimpra.count(chr(i)) >= maior:
            maior = fraseLimpra.count(chr(i))
    if maior == 0:
        maior = 1

    for i in range(97, 123):
        if fraseLimpra.count(chr(i)) == maior:
            most_frequent += chr(i)
    print(most_frequent)
    qtd -= 1
