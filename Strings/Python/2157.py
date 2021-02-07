qtdTestes = int(input())

while qtdTestes > 0:
    
    ini, fim = map(int, input().split())
    txt = ''
    for i in range(ini, fim+1):
        txt += str(i)
    txt += txt[::-1]
    print(txt)
    qtdTestes-=1
