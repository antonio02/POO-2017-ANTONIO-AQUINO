def main():

    tamanho = int(input())

    while tamanho != 0:
        matriz = [1] * tamanho
        for i in range(tamanho):
            matriz[i] = [1] * tamanho

        aux2 = 0
        for i in range(tamanho):
            aux = 0
            for j in range(aux2,tamanho):
                matriz[i][j] += aux
                matriz[j][i] += aux
                aux += 1
            aux2 += 1


        for i in range(tamanho):
            for j in range(tamanho):
                if j == tamanho - 1:
                    print("%3d" % matriz[i][j])
                else:
                    print("%3d" % matriz[i][j], end=' ')
        print()

        tamanho = int(input())


if __name__ == '__main__':
    main()