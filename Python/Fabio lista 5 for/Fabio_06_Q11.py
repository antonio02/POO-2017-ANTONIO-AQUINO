def main():

    texto = input('Digite um texto: ')
    texto = texto + ' '
    numero_palavras = 0

    for i in texto:
        if i == ' ':
            numero_palavras += 1

    print('O numero total de palavras é de: %d palavra(s)' % numero_palavras)


if __name__ == '__main__':
    main()