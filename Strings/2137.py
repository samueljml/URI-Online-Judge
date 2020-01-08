while True:
    try:
        qtd = int(input())
        v = list()
        
        while qtd > 0:
            v.append(input())
            qtd-= 1
        v.sort()
        for i in v:
            print(i)
    except EOFError:
        break
