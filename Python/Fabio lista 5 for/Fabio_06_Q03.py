def main():

    frase = input('Digite uma frase: ')
    nova_frase = ''

    for letra in frase:
        if letra == ' ':
            nada = 1
        else:
            nova_frase += letra

    print(nova_frase)


if __name__ == '__main__':
    main()