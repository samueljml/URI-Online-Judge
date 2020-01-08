while True:
    try:
        txt = input()
        tam = len(txt)
        for i in range(len(txt)):
            print(' ' * i, end='')
            for j in range(tam-1):
                print(txt[j] + ' ', end='')
            print(txt[tam-1])
            tam-=1
        print()
            
    except EOFError:
        break
