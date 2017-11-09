def main():

    numero = float(input('Digite um numero: '))

    y = 0

    if numero < 1:

        print('Digite um numero inteiro')

    else:

        while numero != 0:

            y += 1
            numero = int(numero / 10)

        print('O numero contem %d digitos' % y)


if __name__ == '__main__':
    main()