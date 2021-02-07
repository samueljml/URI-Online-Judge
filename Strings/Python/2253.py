def verificarTamanho(tamanhoTxt):
    if 6 <= tamanhoTxt <= 32:
        return 1
    return 0


def varificarCondicoes(senha):
    maiuscula = False
    minuscula = False
    numero = False

    for i in senha:
        aux = ord(i)
        if aux <= 90 and aux >= 65:
            maiuscula = True
        elif aux <= 122 and aux >= 97:
            minuscula = True
        elif aux >= 48 and aux <= 57:
            numero = True
        else:
            return 0
    if maiuscula:
        if minuscula:
            if numero:
                return 1
    return 0


while True:
    try:
        senha = input()
        tam = len(senha)

        if verificarTamanho(tam):
            if varificarCondicoes(senha):
                print('Senha valida.')
            else:
                print('Senha invalida.')
        else:
            print('Senha invalida.')

    except EOFError:
        break
