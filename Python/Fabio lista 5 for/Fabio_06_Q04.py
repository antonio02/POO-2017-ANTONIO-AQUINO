def main():

    frase = input('Digite uma frase: ')
    nova_frase = ''

    for letra in frase:
        nova_frase += letra + letra

    print(nova_frase)


if __name__ == '__main__':
    main()