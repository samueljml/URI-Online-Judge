def verificar(p1, p2, txt1, txt2):
    if p1 == p2:
        print('empate')
    elif p2 == txt1 or p2 == txt2:
        print('rajesh')
    else:
        print('sheldon')


qtd = int(input())
while qtd > 0:
    p1, p2 = input().split()
    
    if p1 == 'tesoura':
        verificar(p1, p2, 'papel', 'lagarto')
    elif p1 == 'papel':
        verificar(p1, p2, 'Spock', 'pedra')
    elif p1 == 'pedra':
        verificar(p1, p2, 'lagarto', 'tesoura')
    elif p1 == 'lagarto':
        verificar(p1, p2, 'spock', 'papel')
    else:
        verificar(p1, p2, 'tesoura', 'pedra')

    qtd -= 1
