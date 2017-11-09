def main():

    vezes = int(input())
    letras = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

    while vezes > 0:

        frase = input()
        frase3casas = ''
        frase_invertida = ''
        frase1casa = ''
        contador = 0

        for i in frase:
            if i not in letras:
                frase3casas += i
            else:
                frase3casas += chr(ord(i) + 3)

        for i in range(len(frase3casas) - 1, -1, -1):
            frase_invertida += frase3casas[i]

        while contador < len(frase_invertida):
            if contador < len(frase_invertida) // 2:
                frase1casa += frase_invertida[contador]
            else:
                frase1casa += chr(ord(frase_invertida[contador])-1)
            contador += 1

        print(frase1casa)
        vezes -= 1


if __name__ == '__main__':
    main()