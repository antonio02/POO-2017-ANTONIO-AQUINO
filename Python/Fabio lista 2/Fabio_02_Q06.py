def main():
    a = int(input('Angulo 1: '))
    b = int(input('Angulo 2: '))
    c = int(input('Angulo 3: '))

    if a == 0 or b == 0 or c == 0:
        print('Impossivel formar um triangulo com angulo 0')
    elif a + b + c == 180:
        if a < 90 and b < 90 and c < 90:
            print('Triângulo acutângulo')
        elif a == 90 or b == 90 or c == 90:
            print('Triângulo retângulo')
        elif a > 90 or b > 90 or c > 90:
            print('Triângulo obtusângulo')
    else:
        print('Não forma um triangulo')
if __name__ == '__main__':
    main()