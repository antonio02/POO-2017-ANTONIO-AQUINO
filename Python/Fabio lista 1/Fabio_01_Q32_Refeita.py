def main():
    print('Subtrair um numero com o seu inverso')
    print('------------------------------------')

    numero = input('Digite um numero de 3 digitos: ')
    novonumero = ''

    for index in range(len(numero)-1,-1,-1):
        novonumero += numero[index]

    print('O resultado é igual a: %d' % (int(numero)-int(novonumero)))


if __name__ == '__main__':
    main()