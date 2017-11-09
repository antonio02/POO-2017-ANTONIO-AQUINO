from math import sqrt
def main():
    valores = input()

    a = float(valores.split()[0])
    b = float(valores.split()[1])
    c = float(valores.split()[2])

    delta = b**2 - 4 * a * c

    if delta < 0 or a == 0 :
        print('Impossivel calcular')
    else:
        raiz1 = (-b + sqrt(delta)) / (2 * a)
        raiz2 = (-b - sqrt(delta)) / (2 * a)

        print('R1 = %.5f' % raiz1)
        print('R2 = %.5f' % raiz2)

if __name__ == '__main__':
    main()