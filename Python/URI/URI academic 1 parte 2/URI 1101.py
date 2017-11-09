def main():

    valores = input()
    m = int(valores.split()[0])
    n = int(valores.split()[1])

    while m > 0 and n > 0:
        soma = 0
        if m > n:
            for i in range(n, m+1):
                print(i, end=' ')
                soma += i
        else:
            for i in range(m, n+1):
                print(i, end=' ')
                soma += i

        print('Sum=%d' % soma)
        valores = input()
        m = int(valores.split()[0])
        n = int(valores.split()[1])


if __name__ == '__main__':
    main()