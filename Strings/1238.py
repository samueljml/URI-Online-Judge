qtd = int(input())

while qtd > 0:
    fra1, fra2 = input().split()
    idf = 1
    if len(fra1) == len(fra2):
        idf = 0

    if len(fra1) <= len(fra2):
        menor = fra1
        maior = fra2
    else:
        menor = fra2
        maior = fra1

    for i in range(0, len(menor)):
        print('{}{}'.format(fra1[i], fra2[i]), end='')

    if idf:
        print(maior[len(menor):len(maior)])
    else:
        print()
    qtd -= 1
