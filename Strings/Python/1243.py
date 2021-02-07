while True:
    try:
        total = 0
        qtd = 0
        instru = input().split()
        for i in range(len(instru)):
            if instru[i].isalpha():
                total += len(instru[i])
                qtd += 1
            else:
                t = 0
                for j in range(len(instru[i])):
                    	if not instru[i][j].isalpha():
                        	t+= 1
                if t == 1 and len(instru[i]) != 1:
                    if instru[i][len(instru[i])-1] == '.':
                        total += len(instru[i])-1
                        qtd += 1 
        if qtd != 0:
            if total//qtd <= 3:
                print('250')
            elif 4 <= total//qtd <= 5:
                print('500')
            elif total//qtd >= 6:
                print('1000')
        else:
            print('250')
                                       	          
    except EOFError:
        break
