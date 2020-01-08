while True:
    try:
        qtd, maxl, cl = map(int, input().split())
        conto = input()
        conto = conto.split()
        idf = 1
        pos = 0
        pag = 0
        frase = ''
        while idf:
            pag += 1
            l = 0
            while l < maxl:
                if idf == 0:
                    break
                while pos < qtd:
                    if len (frase) <= cl:
                        frase += conto[pos]
                    if len(frase) <= cl:
                        pos += 1
                        if pos != qtd:
                            frase += ' '
                        if pos == qtd:
                            idf = 0
                    else:
                        frase = ''
                        l += 1
                        break
        print(pag)
    except EOFError:
        break