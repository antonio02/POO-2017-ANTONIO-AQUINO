def main():
    a = int(input('Lado 1: '))
    b = int(input('Lado 2: '))
    c = int(input('Lado 3: '))

    bec = b*b + c*c
    a2 = a*a

    if a == 0 or b == 0 or c == 0:
        print('Impossivel formar um triangulo com um lado de tamanho 0')
    elif a > b + c or b > a + c or c > a + b:
        print('NAO FORMA TRIANGULO')
    else:
        if a2 < bec:
            print('TRIANGULO ESCALENO')
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