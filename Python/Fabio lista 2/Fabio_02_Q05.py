def main():
    num1 = int(input('Numero 1: '))
    num2 = int(input('Numero 2: '))
    num3 = int(input('Numero 3: '))

    if num1 == num2 == num3:
        print('Ordem crescente: %d, %d, %d' % (num1, num2, num3))
    elif num1 == num2 > num3:
        print('Ordem crescente: %d, %d, %d' % (num3, num1, num2))
    elif num1 == num2 < num3:
        print('Ordem crescente: %d, %d, %d' % (num1, num2, num3))
    elif num1 > num2 == num3:
        print('Ordem crescente: %d, %d, %d' % (num3, num2, num1))
    elif num1 < num2 == num3:
        print('Ordem crescente: %d, %d, %d' % (num1, num2, num3))
    elif num1 == num3 > num2:
        print('Ordem crescente: %d, %d, %d' % (num2, num3, num1))
    elif num1 == num3 < num2:
        print('Ordem crescente: %d, %d, %d' % (num1, num3, num2))
    elif num1 > num2 > num3:
        print('Ordem crescente: %d, %d, %d' % (num3, num2, num1))
    elif num1 > num3 > num2:
        print('Ordem crescente: %d, %d, %d' % (num2, num3, num1))
    elif num2 > num1 > num3:
        print('Ordem crescente: %d, %d, %d' % (num3, num1, num2))
    elif num2 > num3 > num1:
        print('Ordem crescente: %d, %d, %d' % (num1, num3, num2))
    elif num3 > num1 > num2:
        print('Ordem crescente: %d, %d, %d' % (num2, num1, num3))
    elif num3 > num2 > num1:
        print('Ordem crescente: %d, %d, %d' % (num1, num2, num3))


if __name__ == '__main__':
    main()