while True:
    try:
        frase = input().split()
        idf = 0
        total = 0
        
        for i in range(1,len(frase)):
            if frase[i][0].lower() == frase[i-1][0].lower():
                idf = 1
            else:
                if idf:
                    idf = 0
                    total += 1
        if idf:
            total += 1
        print(total)
                                                        
    except EOFError:
        break
