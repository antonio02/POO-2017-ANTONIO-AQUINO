def main():
    cords1 = input('Digite as cordenadas X1 e Y1: ')
    cords2 = input('Digite as cordenadas X2 e Y2: ')

    x1 = int(cords1.split()[0])
    y1 = int(cords1.split()[1])
    x2 = int(cords2.split()[0])
    y2 = int(cords2.split()[1])

    lado1 = abs(x1 - x2)
    lado2 = abs(y1 - y2)
    area = lado1 * lado2

    print('A area desse retangulo é igual a: %d' % area)


if __name__ == '__main__':
    main()