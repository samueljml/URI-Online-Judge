while 1:
    try:
        fra1 = input()
        fra2 = input()

        if len(fra1) <= len(fra2):
            menor = fra1
            maior = fra2
        else:
            menor = fra2
            maior = fra1

        idf = 0

        for i in range(len(menor), 0, -1):
            cont = 0
            j = i
            if idf:
                break
            for j in range(j, len(menor) + 1, 1):
                if menor[cont:j] in maior:
                    print(i)
                    idf = 1
                    break
                cont += 1
        if idf == 0:
            print('0')
    except EOFError:
        break