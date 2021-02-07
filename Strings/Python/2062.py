qtd_palavras = int(input())

txt = input().split()

i=0
novotxt = list()
for word in txt:
    if len(word) == 3:
        if 'UR' in word:
            novotxt.append('URI')
        elif 'OB' in word:
            novotxt.append('OBI')
        else:
            novotxt.append(word)
    else:
        novotxt.append(word)
        
for i in range(len(novotxt)-1):
    print(novotxt[i], '', end='')
print(novotxt[len(novotxt)-1])
