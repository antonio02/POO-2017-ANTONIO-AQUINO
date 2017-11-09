def main():
    valores = input()

    a = float(valores.split()[0])
    b = float(valores.split()[1])
    c = float(valores.split()[2])

    if abs(b-c) < a < b + c:
        perimetro = a + b + c
        print('Perimetro = %.1f' % perimetro)
    else:
        area = ((a + b) * c) / 2
        print('Area = %.1f' % area)


if __name__ == '__main__':
    main()