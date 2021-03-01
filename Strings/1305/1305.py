from math import ceil

while True:
    try:
        num = float(input())
        cut = float(input())
        txt = str(num)        
        
        dec = float(txt[txt.find('.'):])       
        
        if dec >= cut:
            print(ceil(num))
        else:
            print(int(num))        
        
    except EOFError:
        break
