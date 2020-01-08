while 1:
    try:
        frase = input()
        next = 0
        novaFrase = ''
        for i in range(0, len(frase)):
            val = ord(frase[i])
            if next:
                if 65 <= val <= 90:
                    val += 32
                if 97 <= val <= 122:
                    next = 0
            else:
                if 97 <= val <= 122:
                    val -= 32
                if 65 <= val <= 90:
                    next = 1
            novaFrase += chr(val)
        print(novaFrase)
    except EOFError:
        break