def main():
    num1 = int(input('Numero 1: '))
    num2 = int(input('Numero 2: '))
    num3 = int(input('Numero 3: '))

    if num1 == num2 == num3:
        print('Todos são iguais.')
    elif num1 == num2 or num1 == num3 or num2 == num3:
        print('Dois numeros são iguais')
    else:
        print('Todos são diferentes')


if __name__ == '__main__':
    main()