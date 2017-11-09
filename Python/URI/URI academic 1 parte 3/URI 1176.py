def main():

    fib = [0,1]
    testes = int(input())
    x = 0
    y = 1

    while testes > 0:

        valor = int(input())
        contador = valor
        while contador >= 2:
            z = x + y
            x = y
            y = z
            fib.append(z)
            contador -= 1

        print('Fib(%d) = %d' % (valor, fib[valor]))
        testes -= 1


if __name__ == '__main__':
    main()