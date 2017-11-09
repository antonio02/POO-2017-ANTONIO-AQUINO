def main():
    valores = input()

    x = valores.split()
    x.sort()

    a = float(x[2])
    b = float(x[1])
    c = float(x[0])
    c2 = float(x[0])

    if a < c:
        c = a
        a = c2

    bec = b*b + c*c
    a2 = a*a

    if a >= b + c:
        print('NAO FORMA TRIANGULO')
    else:
        if a2 == bec:
            print('TRIANGULO RETANGULO')
        if a2 > bec:
            print('TRIANGULO OBTUSANGULO')
        if a2 < bec:
            print('TRIANGULO ACUTANGULO')
        if a == b == c:
            print('TRIANGULO EQUILATERO')
        if a == b != c:
            print('TRIANGULO ISOSCELES')
        if a != b == c:
            print('TRIANGULO ISOSCELES')
        if a == c != b:
            print('TRIANGULO ISOSCELES')

if __name__ == '__main__':
    main()