def main():

    operacao = input().upper()
    matriz = []

    for i in range(12):

        linha = []

        for i in range(12):
            linha.append(float(input()))

        matriz.append(linha)

    soma = 0
    tamanho = 0
    contador = 0
    for linha in range(1,12):
        for i in range(tamanho):
            soma += matriz[linha][i]
            contador += 1
        tamanho += 1

    media = soma/contador

    if operacao == 'S':
        print('%.1f' % soma)

    else:
        print('%.1f' % media)


if __name__ == '__main__':
    main()