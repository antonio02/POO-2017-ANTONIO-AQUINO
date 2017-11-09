from math import sqrt
def main():
    num = int(input('Digite uma numero de 4 digitos: '))

    a = num // 100
    b = num % 100
    c = a + b
    d = sqrt(num)

    if c == d:
        print('O numero é quadrado perfeito')
    else:
        print('Não é quadrado perfeito')


if __name__ == '__main__':
    main()