def main():
    num1 = int(input('Digite o numero: '))
    num2 = int(input('Digite o numero: '))

    maior = (num1 + num2 + abs(num1 - num2)) / 2

    while num1 % maior != 0 or num2 % maior != 0:
        maior -= 1

    print('%d' % maior)


if __name__ == '__main__':
    main()