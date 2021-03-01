while True:
    try:
        line = input().strip()
        line = sorted(line.replace(' ', ''))
        iniciou_sequencia = False
        terminou_sequencia = False
        ini = 0
        i = 0
        idf = 1
        tam = len(line)
        qtd = 0

        for i in range(1, tam):
            if ord(line[i]) - 1 == ord(line[i - 1]) or ord(line[i]) == ord(line[i - 1]):
                iniciou_sequencia = True
                if idf:                   
                    ini = i - 1
                    idf = 0
            else:                
                terminou_sequencia = True                                          
                if qtd:
                    print(', ', end='')
                if iniciou_sequencia:
                    inicou_sequendia = False                
                    print(line[ini], ':', line[i-1], sep='', end='')                    
                else:
                    print(line[i-1], ':', line[i-1], sep='', end='')                   
                qtd += 1
                ini = i
                idf = 1
        if qtd:
            print(', ', end='')
        if line:                 
            print(line[ini], ':', line[i], sep='', end='')                    
        print()
            
    except EOFError:
        break
