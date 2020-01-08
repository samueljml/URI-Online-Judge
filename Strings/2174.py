qtd = int(input())
pegos = list()

while qtd > 0:
    qtd -= 1
    txt = input()
    if txt not in pegos:
        pegos.append(txt)       
     
print('Falta(m)', 151-len(pegos),'pomekon(s).')
