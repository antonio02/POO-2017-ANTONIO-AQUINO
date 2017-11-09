def main():

    notas = float(input())
    soma = 0
    contador = 0

    while notas >= 0:
        soma += notas
        contador += 1
        notas = float(input())

    media = soma / contador

    print('%.2f' % media)


if __name__ == '__main__':
    main()