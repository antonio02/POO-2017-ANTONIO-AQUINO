def main():

    texto = input('Digite um texto: ')

    if len(texto) > 20:

        print('O texto tem mais de 20 caracteres')

    else:

        diagonal(texto)

def diagonal(texto):

    x = 0

    for i in texto:

        print(' ' * x + i)
        x += 2


if __name__ == '__main__':
    main()