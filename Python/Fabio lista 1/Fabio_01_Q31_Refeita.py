def main():
    print('Conversor de binario para decimal')
    print('---------------------------------')

    numero = input('Digite o numero binario desejado: ')
    soma = 0

    for index in range(len(numero)-1,-1,-1):
        soma += int(numero[index]) * (2**(len(numero) - index -1))

    print('Esse numero em binario é igual a:', soma)


if __name__ == '__main__':
    main()