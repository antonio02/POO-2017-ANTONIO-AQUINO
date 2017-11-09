def main():
    num1 = int(input('Digite o primeiro numero: '))
    num2 = int(input('Digite o segundo numero: '))

    x = 2

    while x % num1 != 0 or x % num2 != 0:
        x += 1

    print(x)


if __name__ == '__main__':
    main()