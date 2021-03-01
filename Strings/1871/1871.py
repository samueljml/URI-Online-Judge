while True:
       
    n1, n2 = map(int, input().split())
    if n2 == n1 == 0:
        break
    total = n1+n2
    txt = str(total).replace('0','')

    print(txt)
