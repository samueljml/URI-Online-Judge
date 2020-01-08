while True:

    linhas, colunas = map(int,input().split())

    if linhas == 0 == colunas:
        break
        
    matriz = list()
    for i in range(linhas):
        matriz.append(input())
        
    altura, largura = map(int, input().split())    
    altura //= linhas
    largura //= colunas 
    
    matrizN = list()
    l = 0
    idf = 0
    while l != linhas:
        txtTemp = ''        
        for i in range(colunas):
            txtTemp += matriz[l][i]*largura
        print(txtTemp)    
        idf+=1
        if idf == altura:
            l+=1
            idf= 0
    print()
