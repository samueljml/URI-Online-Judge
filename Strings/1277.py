qtd = int(input())

while qtd > 0:
    
    qtd2 = int(input())  
    cabuladores =[]
    nomes = input().split()
    histo = input().split()
    
    for i in range(0, qtd2):        
        presenca = 0
        faltas = 0
        faltdms = ''
        for j in range(len(histo[i])):
            if histo[i][j] == 'P':
                presenca += 1
            elif histo[i][j] == 'A':
                faltas += 1
        if presenca == 0:
            faltdms += nomes[i]
        else:
            if faltas/ (faltas+presenca) > 0.25:
                faltdms += nomes[i]
        if faltdms != '':
            cabuladores.append(faltdms)
    tam = len(cabuladores)
    if tam == 0:
        print()
    for i in range(tam):
        if i+1 == tam:
            print(cabuladores[i])
        else:
            print(cabuladores[i], end=' ')
    qtd-= 1
