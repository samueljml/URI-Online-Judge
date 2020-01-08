while True:
    try:
        txt = input()
        txt = txt.replace('o', '0')
        txt = txt.replace('O', '0')
        txt = txt.replace('l', '1')
        novotxt = ''
        for i in txt:
            if i.isdigit():
                novotxt += i
            else:
                if not i == ',' and not i == ' ':
                    novotxt = ''
                    break
        if novotxt:
            num = int(novotxt)
            if 0 <= num <= 2147483647:
                print(num)
                continue

        print('error')

    except EOFError:
        break
