metadeTamanhoBaralho = int(input())/2
contador, posicaoZero = 1, 1

while True:
    contador += 1
    
    if(posicaoZero < metadeTamanhoBaralho):
        pos = posicaoZero
        posicaoZero = pos*2+1
    else:
        pos = posicaoZero - metadeTamanhoBaralho
        if(pos == 0):
            break
        posicaoZero = pos * 2
        
print(contador)