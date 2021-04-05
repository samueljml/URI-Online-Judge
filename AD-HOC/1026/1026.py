while True:
    try:
        n1, n2 = map(int, input().split())
        v1 = str(bin(n1))
        v2 = str(bin(n2))
        if len(v2) > len(v1):
            v3 = v1
            v1 = v2
            v2 = v3
        v3 = ''
        t1 = len(v1)
        t2 = len(v2) - 1

        for i in range(t1-1, -1, -1):
            if t2 >= 1:
                if v2[t2] == 'b':
                    if v1[i] == 'b':
                        v3 += 'b0'
                        break
                    else:
                        v3 += v1[i]
                else:
                    if v1[i] == v2[t2]:
                        v3 += '0'
                    else:
                        v3 += '1'
                t2 -= 1
            else:
                v3 += v1[i]

        v3 = v3[::-1]
        decimal = int(v3, 2)
        print(decimal)
    except EOFError:
        break