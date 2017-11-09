def main():

    frase = input('Digite uma frase: ')
    x = int(input('Digite a partir de qual posição você deseja alterar: '))
    nova_frase = ''

    for i in range(x):
        nova_frase += frase[i]

    nova_frase += input(nova_frase)

    print(nova_frase)


if __name__ == '__main__':
    main()