def main():

    n20 = []

    for i in range(20):

        valor = int(input())
        n20.append(valor)

    n20.reverse()

    for i in range(20):
        print('N[%d] = %d' % (i, n20[i]))


if __name__ == '__main__':
    main()