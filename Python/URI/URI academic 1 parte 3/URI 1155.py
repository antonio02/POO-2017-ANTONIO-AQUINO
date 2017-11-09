def main():

    s = 1
    contador = 2

    while contador <= 100:
        s += 1/contador
        contador += 1

    print('%.2f' % s)


if __name__ == '__main__':
    main()