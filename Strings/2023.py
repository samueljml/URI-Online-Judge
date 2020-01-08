txtR = []
txtC = []
txt = []
i = 0
while(True):
    try:        
        txtR.append(input())       
        txt.append(txtR[i].lower())
        txtC.append(txt[i])
        i += 1
    except EOFError:
        break

txt.sort()
i= txtC.index(txt[len(txt)-1].casefold())
    
print(txtR[i])
