def main():

    num = int(input('Digite o numero: '))

    if num > 0:
        print('Numero positivo')
    elif num < 0:
        print('Numero negativo')
    else:
        print('Numero neutro (zero)')


if __name__ == '__main__':
    main()