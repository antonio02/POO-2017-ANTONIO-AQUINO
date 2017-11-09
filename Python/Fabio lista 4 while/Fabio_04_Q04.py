def main():

    numero = int(input('Digite um numero: '))

    x = numero

    while x > 1:
        z = x / 2
        x = z / 2

    print(z)


if __name__ == '__main__':
    main()