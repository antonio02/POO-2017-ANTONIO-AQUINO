def main():

    a100 = [None]*100
    posicao = []

    for i in range(100):
        valor = float(input())
        a100[i] = valor
        if valor <= 10:
            posicao.append(i)

    for i in posicao:
        print('A[%d] = %.1f' % (i, a100[i]))


if __name__ == '__main__':
    main()