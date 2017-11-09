def main():

    n1000 = []
    valor = int(input())
    contador = 0

    while contador < 1000:
        for i in range(valor):
            n1000.append(i)
        contador += valor

    for i in range(1000):
        print('N[%d] = %d' % (i, n1000[i]))


if __name__ == '__main__':
    main()