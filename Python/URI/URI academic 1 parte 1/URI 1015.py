from math import sqrt
def main():
    cord1 = input()
    cord2 = input()

    x1 = float(cord1.split()[0])
    y1 = float(cord1.split()[1])
    x2 = float(cord2.split()[0])
    y2 = float(cord2.split()[1])

    distancia = sqrt((x2 - x1)**2 + (y2 - y1)**2)

    print('%.4f' % distancia)


if __name__ == '__main__':
    main()