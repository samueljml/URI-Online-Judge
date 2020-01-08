def combinacoes(txt, tam):
    total = 1
    for i in range(tam):
        if txt[i].lower() in 'aeios':
            total*=3
        else :
            total*=2
    return total
    

qtd = int(input())

while qtd>0:

    txt = input()
    print(combinacoes(txt, len(txt))) 

    qtd-=1
