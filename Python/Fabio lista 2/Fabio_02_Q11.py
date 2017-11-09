def main():
    print('Escolha uma opção entre 1,2 e 3 e digite 3 numeros quaisquer:')
    opcao = int(input('Opção: '))
    num1 = int(input('Numero 1: '))
    num2 = int(input('Numero 2: '))
    num3 = int(input('Numero 3: '))

    if opcao == 1:
        print('O valor da opção 1 é: %d' % num1)
    elif opcao == 2:
        print('O valor da opção 2 é: %d' % num2)
    elif opcao == 3:
        print('O valor da opção 3 é: %d' % num3)
    else:
        print('Opção invalida')


if __name__ == '__main__':
    main()