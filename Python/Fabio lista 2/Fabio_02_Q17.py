def main():
    num1 = int(input('Digite o numero 1: '))
    num2 = int(input('Digite o numero 2: '))

    if num1 % num2 == 1:
        print('A soma dos dois numeros mais o resto é: %d' % (num1 + num2 + 1))
    elif num1 % num2 == 2:
        if num1 % 2 == 0:
            print('%d é par' % num1)
        else:
            print('%d é impar' % num1)
        if num2 % 2 == 0:
            print('%d é par' % num2)
        else:
            print('%d é impar' % num2)
    elif num1 % num2 == 3:
        print('A soma dos dois multiplicado pelo primeiro é: %d' % ((num1 + num2) * num1))
    elif num1 % num2 == 4:
        if num2 != 0:
            print('A soma dos dois dividido pelo segundo é: %.1f' % ((num1 + num2) / num2))
        else:
            print('Não é possivel fazer a divisão por 0')
    else:
        print('O quadrado do numero 1 e 2: %d, %d' % (num1**2, num2**2))


if __name__ == '__main__':
    main()