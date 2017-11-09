def main():

    n100 = []

    x = float(input())
    contador = 0

    while contador < 100:
        n100.append(x)
        x = x/2
        contador += 1

    for i in range(100):
        print('N[%d] = %.4f' % (i, n100[i]))


if __name__ == '__main__':
    main()