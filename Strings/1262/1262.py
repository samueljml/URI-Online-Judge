from math import ceil

while True:
    try:
        texto = input()
        ciclo = int(input())
        total =0 
        cont =0
        
        for i in range(len(texto)):
            if texto[i] == 'W':
                if 0 < cont <= ciclo:
                    total += 1
                    cont = 0
                elif cont > ciclo:
                    total += ceil(cont/ciclo)
                    cont = 0
                total += 1
            else:
                cont += 1
        if 0 < cont <= ciclo:
                total += 1
        elif cont > ciclo:
            total += ceil(cont/ciclo)
        print(total)
                
                                                        
    except EOFError:
        break
