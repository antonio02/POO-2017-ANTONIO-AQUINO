def main():

    numero = int(input('Digite um numero: '))

    x = 0
    soma = 0

    while soma != numero:
        z = x
        x = int(input())
        soma = x + z

    print('A soma dos dois ultimos numeros é igual a %d' % numero)

if __name__ == '__main__':
    main()