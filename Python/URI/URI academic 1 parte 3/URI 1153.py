def main():

    numero = int(input())
    x = numero
    contador = 1
    fatorial = 1

    for i in range(numero):
        print(fatorial, x, contador)
        fatorial += fatorial * (x - contador)
        contador += 1

    print(fatorial)


if __name__ == '__main__':
    main()