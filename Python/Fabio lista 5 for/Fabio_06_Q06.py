def main():

    frase = input('Digite uma frase: ')
    nova_frase = ''

    for letra in frase:
        if eh_algarismo(letra) == True:
            letra = algarismo(letra)
            nova_frase += letra
        else:
            nova_frase += letra

    print(nova_frase)

def eh_algarismo(x):

    numeros = '1234567890'
    return x in numeros

def algarismo(x):
    if x == '0':
        return ' Zero '
    elif x == '1':
        return ' Um '
    elif x == '2':
        return ' Dois '
    elif x == '3':
        return ' Tres '
    elif x == '4':
        return ' Quatro '
    elif x == '5':
        return ' Cinco '
    elif x == '6':
        return ' Seis '
    elif x == '7':
        return ' Sete '
    elif x == '8':
        return ' Oito '
    elif x == '9':
        return ' Nove '


if __name__ == '__main__':
    main()