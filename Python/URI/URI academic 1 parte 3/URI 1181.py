def main():

    valor = int(input())
    operacao = input().upper()
    linha = []
    matriz = []

    for i in range(12):

        linha = []

        for i in range(12):
            linha.append(float(input()))

        matriz.append(linha)

    if operacao == 'S':
        soma = 0
        for i in matriz[valor]:
            soma += i

        print('%.1f' % soma)

    else:
        soma = 0
        for i in matriz[valor]:
            soma += i
        media = soma/12

        print('%.1f' % media)


if __name__ == '__main__':
    main()