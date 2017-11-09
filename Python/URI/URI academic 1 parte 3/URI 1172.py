def main():

    x10 = [None]*10

    for i in range(10):
        valor = int(input())

        if valor <= 0:
            x10[i] = 1
            print('X[%d] = 1' % i)
        else:
            x10[i] = valor
            print('X[%d] = %d' % (i, valor))

if __name__ == '__main__':
    main()