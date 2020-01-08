qtd = int(input())

while qtd > 0:

    frase = input()
    one = 'one'
    two = 'two'
    a = 0
    b = 0

    if len(frase) == 5:
        print('3')
    else:
        for i in range(0, 3):
            if frase[i] == one[i]:
                a += 1
            elif frase[i] == two[i]:
                b += 1
        if a > b:
            print('1')
        else:
            print('2')

    qtd -= 1
