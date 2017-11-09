def main():

    n10 = [None]*10
    valor = int(input())
    n10[0] = valor

    for i in range(1,10):
        n10[i] = valor + valor
        valor += valor

    for i in range(10):
        print('N[%d] = %d' % (i, n10[i]))


if __name__ == '__main__':
    main()