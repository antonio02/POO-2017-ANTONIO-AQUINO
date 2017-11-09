def main():

    texto = input('Digite o texto desejado: ')
    x = int(input('Digite a posição: '))
    y = int(input('Digite a quantidade de caracteres: '))

    z = substr(texto, x, y)

    print(z)

def substr(texto, x, y):

    novo_texto = ''
    x = x - 1

    if len(texto) <= y + x:

        return 'O texto é muito pequeno'

    else:
        for i in range(len(texto)):
            if i > x:
                if y != 0:
                    novo_texto += texto[i]
                    y -= 1

        return novo_texto



if __name__ == '__main__':
    main()