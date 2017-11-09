def main():
    num1 = int(input('Numero 1: '))
    num2 = int(input('Numero 2: '))
    num3 = int(input('Numero 3: '))
    num4 = int(input('Numero 4: '))
    num5 = int(input('Numero 5: '))

    media =(num1 + num2 + num3 + num4 + num5) / 5

    print('A media entre esses numero é igual a: %.1f' % media)

    if num1 > media:
        print('%d é maior que a media' % num1)
    if num2 > media:
        print('%d é maior que a media' % num2)
    if num3 > media:
        print('%d é maior que a media' % num3)
    if num4 > media:
        print('%d é maior que a media' % num4)
    if num5 > media:
        print('%d é maior que a media' % num5)


if __name__ == '__main__':
    main()