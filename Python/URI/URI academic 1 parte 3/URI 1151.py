def main():

    n = int(input())
    inicio = 0
    fim = 1
    soma = 1

    while n > 0:
        print(inicio, end=' ')
        n -= 1
        if n > 1:
            print(soma, end=' ')
            n -= 1
            inicio += fim
            soma = inicio + fim
            fim = soma
        else:
            print(soma)
            break


if __name__ == '__main__':
    main()