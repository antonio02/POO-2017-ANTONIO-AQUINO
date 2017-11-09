def main():
    print('Opções de calculo: 1 Adição, 2 Subtração, 3 Multiplicação e 4 Divisão')
    num1 = int(input('Digite o primeiro numero: '))
    num2 = int(input('Digite o segundo numero: '))
    cal = int(input('Digite a qual operação sera executada: '))

    if cal == 1:
        print('A soma entre os dois numeros é: %d' % (num1 + num2))
    elif cal == 2:
        print('A subtração entre os dois numeros é: %d' % (num1 - num2))
    elif cal == 3:
        print('A multiplicação entre os dois numeros é: %d' % (num1 * num2))
    elif cal == 4:
        if num2 != 0:
            print('A divisão entre os dois numeros é: %.1f' % (num1 / num2))
        else:
            print('Não é possivel dividir por 0')
    else:
        print('Opção invalida')


if __name__ == '__main__':
    main()