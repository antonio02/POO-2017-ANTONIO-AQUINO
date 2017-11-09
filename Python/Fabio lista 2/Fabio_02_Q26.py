from math import sqrt
def main():
    a = float(input('Digite o valor do lado A do triangulo: '))
    b = float(input('Digite o valor do lado B do triangulo: '))
    c = float(input('Digite o valor do lado C do triangulo: '))

    hipo = sqrt((a**2) + (b**2))

    print('A hipotenusa vale: %.2f' % hipo)


if __name__ == '__main__':
    main()