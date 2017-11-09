def main():
    numero = int(input('Digite o numero: '))

    x = 1

    while x < numero:
        z = numero % x
        if z == 0:
            print(x)
        x += 1


if __name__ == '__main__':
    main()