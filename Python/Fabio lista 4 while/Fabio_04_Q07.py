def main():

    numero = int(input('Digite um numero: '))

    x = None

    while x != numero:
        x = int(input())

    print('Os numero são iguais')


if __name__ == '__main__':
    main()