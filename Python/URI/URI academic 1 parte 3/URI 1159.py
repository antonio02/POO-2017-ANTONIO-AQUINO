def main():

    numero = int(input())


    while numero != 0:
        vezes = 5
        contador = 0
        incremento = 0
        par = 0
        soma = 0

        while contador < vezes:
            par = numero + incremento
            incremento += 1
            if par % 2 == 0:
                soma += par
                contador += 1

        print(soma)
        numero = int(input())


if __name__ == '__main__':
    main()