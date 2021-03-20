tamanhoLista = int(input())
lista = list(map(int, input().split()))
numeroAusente = 1;
lista.sort()

for numero in lista:
    if(numero != numeroAusente):
        break
    numeroAusente += 1
    	
print(numeroAusente);