def main():
    tamanho = int(input())

    while tamanho != 0:
        matriz = [1] * tamanho
        for i in range(tamanho):
            matriz[i] = [1] * tamanho

        for i in range(1,tamanho):
            matriz[i][0] = matriz[i-1][0]*2

        for i in matriz:
            for j in range(1, tamanho):
                i[j] = i[j-1]*2


        for i in range(tamanho):
            for j in range(tamanho):
                if j == tamanho - 1:
                    print(("%d" % matriz[i][j]).rjust(len(str(matriz[tamanho-1][tamanho-1]))))
                else:
                    print(("%d" % matriz[i][j]).rjust(len(str(matriz[tamanho-1][tamanho-1]))), end=' ')
        print()

        tamanho = int(input())


if __name__ == '__main__':
    main()