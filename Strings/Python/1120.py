while(1):

    numero, valor = map(str, input().split())

    if numero == '0' and valor == '0':
        break

    if valor.replace(numero, '') == '':
        valFinal = 0
    else:
        valFinal = int(valor.replace(numero, ''))

    print(valFinal)
