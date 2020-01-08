while True:
    try:
        linha = input()
        linhaNova = ''
        idf = 0
        idf2 = 0
        for i in range(0, len(linha)):
            if linha[i] == '*':
                if idf:
                    linhaNova += '</b>'
                    idf = 0
                else:
                    linhaNova += '<b>'
                    idf = 1
            elif linha[i] == '_':
                if idf2:
                    linhaNova += '</i>'
                    idf2 = 0
                else:
                    linhaNova += '<i>'
                    idf2 = 1
            else:
                linhaNova += linha[i]

        print(linhaNova)

    except EOFError:
        break
