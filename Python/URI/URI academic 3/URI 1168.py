def main():

    numeros = '62554563766'

    testes = int(input())

    while testes > 0:

        numero = input()
        leds = 0
        for i in numero:
            y = int(numeros[int(i)])
            leds += y

        print(leds, 'leds')
        testes -= 1


if __name__ == '__main__':
    main()