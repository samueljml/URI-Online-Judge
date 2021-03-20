x = int(input())

print('Y' if len([True for x in input().split() if x == '0']) > x//2 else 'N')