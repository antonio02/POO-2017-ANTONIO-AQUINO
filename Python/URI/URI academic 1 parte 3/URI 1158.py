def main():

    testes = int(input())

    while testes > 0:
        soma = 0
        contador = 0
        incremento = 0
        impar = 0
        valores = input()
        x = int(valores.split()[0])
        y = int(valores.split()[1])

        while contador < y:
            impar = x + incremento
            incremento += 1
            if impar % 2 != 0:
                soma += impar
                contador += 1

        print(soma)
        testes -= 1


if __name__ == '__main__':
    main()