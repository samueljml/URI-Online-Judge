qtd = int(input())

while qtd > 0:    
    dieta = input()
    cafe = input()
    almoco = input()
    idf = 1
    
    for i in range(len(cafe)):
        if cafe[i] in dieta:
            if dieta.count(cafe[i]) == 1:
                dieta = dieta.replace(cafe[i], '')
            else:
                idf= 0
        else:
            idf= 0
                
    for i in range(len(almoco)):        
        if almoco[i] in dieta:
            if dieta.count(almoco[i]) == 1:
                dieta = dieta.replace(almoco[i], '')
            else:
                idf= 0
        else:
            idf= 0
    if idf:
        dieta = sorted(dieta)
        for i in range(len(dieta)):
            print(dieta[i], end='')
        print()
    else:
        print('CHEATER')
    
    qtd-=1
