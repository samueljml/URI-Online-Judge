while True:
    qtd = int(input())
    if qtd==0: break
    idf = False
    
    v = []
    while qtd:
        v.append(input()) 
         
        qtd-=1
        
    tam = len(v)
    for i in range(tam):
        if idf:
            break
        for j in range(tam):
            if v[i].find(v[j]) == 0:
                if i != j:
                    idf = True
                    break
    if idf:
        print('Conjunto Ruim')
    else:
        print('Conjunto Bom')
