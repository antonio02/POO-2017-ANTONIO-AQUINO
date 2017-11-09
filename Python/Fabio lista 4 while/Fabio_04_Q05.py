def main():

    x = int(input('Digite um numero: '))
    n = int(input('Digite um numero: '))

    while n > 2:
        x = x / n
        n -= 1
        print('Valor de x =', x, 'Valor de n = %d' % n)


if __name__ == '__main__':
    main()