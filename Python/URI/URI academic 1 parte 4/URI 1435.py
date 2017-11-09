def main():

    tamanho = int(input())

    while tamanho != 0:
        matriz = [1]*tamanho
        for i in range(tamanho):
            matriz[i] = [1]*tamanho

        aux1 = 1
        aux2 = tamanho-1

        while aux1 != aux2 and aux1 < aux2:
            for i in range(aux1,aux2):
                for j in range(aux1,aux2):
                    matriz[i][j] += 1
            aux1 += 1
            aux2 -= 1

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