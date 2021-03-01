qtd = int(input())

while qtd > 0:
    
    texto = input()
    alfabeto = ''
    total = 0
    
    for i in range(0, len(texto)):
        if texto[i].isalpha():
            if texto[i] not in alfabeto:
                alfabeto += texto [i]
                total += 1
            
    if total < 13:
        print('frase mal elaborada')
    elif total == 26:
        print('frase completa')
    else:
        print('frase quase completa')
    qtd -= 1
