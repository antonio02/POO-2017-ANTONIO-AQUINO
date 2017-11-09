def main():

    testes = int(input())

    while testes > 0:

        numero = int(input())
        divisores = 2
        resto = 0

        if numero == 1:
            print('1 nao eh primo')

        elif numero == 2:
            resto = 1

        else:
            while divisores < numero:

                resto = numero % divisores
                if resto == 0:
                    print('%d nao eh primo' % numero)
                    break
                divisores += 1

        if resto != 0:
            print('%d eh primo' % numero)

        testes -= 1


if __name__ == '__main__':
    main()