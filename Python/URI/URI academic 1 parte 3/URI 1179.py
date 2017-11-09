def main():

    pares = []
    impares = []

    testes = 15

    while testes > 0:

        valor = int(input())

        if valor % 2 == 0:
            pares.append(valor)
        else:
            impares.append(valor)

        if testes == 1:
            for i in range(len(impares)):
                print('impar[%d] = %d' % (i, impares[i]))

            for i in range(len(pares)):
                print('par[%d] = %d' % (i, pares[i]))

            break


        if len(pares) == 5:
            for i in range(5):
                print('par[%d] = %d' % (i, pares[i]))
            pares = []

        if len(impares) == 5:
            for i in range(5):
                print('impar[%d] = %d' % (i, impares[i]))
            impares = []

        testes -= 1


if __name__ == '__main__':
    main()