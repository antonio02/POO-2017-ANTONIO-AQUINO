def main():

    frase = input('Digite uma frase: ')
    inverso = inverter(frase)
    consoantes = consoante(inverso)
    print(consoantes)

def vogal(letra):

    vogais = 'AEIOUaeiou '
    return letra in vogais

def inverter(frase):

    inverso = ''
    for i in range(len(frase) -1, -1, -1):
        inverso += frase[i]
    return inverso

def consoante(frase):

    nova_frase = ''
    for letra in frase:
        if vogal(letra):
            nova_frase += letra
        else:
            nova_frase += '#'
    return nova_frase


if __name__ == '__main__':
    main()