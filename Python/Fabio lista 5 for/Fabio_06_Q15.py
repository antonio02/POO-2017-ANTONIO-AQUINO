def main():

    texto = input('Digite um texto de ate 20 caracteres: ')
    x = 20 - len(texto)

    if len(texto) > 20:
        print('O texto tem mais de 20 caracteres')
    else:
        vertical(x,texto)

def vertical(x, texto):
    for i in range(x):
        print()
    for i in texto:
        print(i)


if __name__ == '__main__':
    main()