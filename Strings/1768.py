while True:
    try:
        tam = int(input())

        for i in range(1, tam + 1, 2):
            print((i * '*').center(tam).rstrip())
        print('*'.center(tam).rstrip())
        print((3 * '*').center(tam).rstrip())
        print()
    except EOFError:
        break
