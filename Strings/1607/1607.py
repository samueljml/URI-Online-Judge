qtd = int(input())

while qtd > 0:
       
    txt = input().split()
    tam = len(txt[0])
    cont = 0
    
    for i in range(tam):
        aux = txt[0][i]
        while(aux != txt[1][i]):
            if aux == 'z':
                aux = 'a'
            else:
                aux = chr(ord(aux)+1)
            cont+=1
    print(cont)
    
    qtd -= 1
