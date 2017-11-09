def main():

    operacao = input().upper()
    matriz = []

    for i in range(12):

        linha = []

        for i in range(12):
            linha.append(float(input()))

        matriz.append(linha)

    lado1 = 1
    lado2 = 11
    soma = 0
    contador = 0
    for linha in range(0,5):
        for elemento in range(lado1,lado2):
            soma += matriz[elemento][linha]
            contador += 1
        lado1 += 1
        lado2 -= 1
    media = soma / contador

    if operacao == 'S':
        print('%.1f' % soma)

    else:
        print('%.1f' % media)


if __name__ == '__main__':
    main()