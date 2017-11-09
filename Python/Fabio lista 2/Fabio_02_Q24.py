from math import sqrt
def main():
    print('Calcular equação do segundo grau')
    a = int(input('Digite o valor de A: '))
    b = int(input('Digite o valor de B: '))
    c = int(input('Digite o valor de C: '))

    delta = b**2 - 4 * a * c

    if delta < 0:
        print('Delta negativo, equação sem raizes')
    else:
        if a == 0:
            print('A é igual a zero não existe divisão')
        else:
            raiz1 = (-b + sqrt(delta)) / (2 * a)
            raiz2 = (-b - sqrt(delta)) / (2 * a)
            print('A raiz 1 é: %.3f' % raiz1)
            print('A raiz 2 é: %.3f' % raiz2)


if __name__ == '__main__':
    main()