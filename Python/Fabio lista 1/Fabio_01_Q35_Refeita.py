def main():
    print('Somar os algarismos de um numero de 4 digitos')
    print('---------------------------------------------')

    numero = input('Digite um numero de 4 digitos: ')
    soma = 0

    for algarismo in numero:
        soma += int(algarismo)

    print('A soma dos algarismos deste numero é igual a: ', soma)


if __name__ == '__main__':
    main()