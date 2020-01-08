while(1):

    try:
        texto = input()

        for i in range(0,len(texto)):
            asc = ord(texto[i])
            if asc >= 65 and asc <= 90:
                asc += 13
                if asc > 90:
                    asc = 65 + (asc-91)
            elif asc >= 97 and asc <= 122:
                asc += 13
                if asc > 122:
                    asc = 97 + (asc-123)
                    
            print(chr(asc), end='')
        print()
        
    except EOFError:
        break
