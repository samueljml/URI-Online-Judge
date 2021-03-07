caso = 1
while(1):
    try:
        seq = input()
        linha = input()
        print('Caso #{}:'.format(caso))
        if seq in linha:
            print('Qtd.Subsequencias:', linha.count(seq))
            print('Pos:', linha.rfind(seq)+1)
        else:
            print('Nao existe subsequencia')
        print()
        caso += 1
    except EOFError:
        break