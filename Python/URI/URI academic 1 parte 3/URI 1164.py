def main():

    testes = int(input())

    while testes > 0:

        numero = int(input())
        soma = 0

        for i in range(1, numero):
            if numero % i == 0:
                soma += i

        if soma == numero:
            print('%d eh perfeito' % numero)
        else:
            print('%d nao eh perfeito' % numero)

        testes -= 1


if __name__ == '__main__':
    main()