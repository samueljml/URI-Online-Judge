casosDeTeste = int(input())

while casosDeTeste > 0:
    x, y = map(int, input().split())
    
    print(int(x*y/2), "cm2")
    
    casosDeTeste -= 1