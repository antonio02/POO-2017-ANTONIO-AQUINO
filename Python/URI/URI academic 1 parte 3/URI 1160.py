def main():

    testes = int(input())

    while testes > 0:

        valores = input()
        pa = int(valores.split()[0])
        pb = int(valores.split()[1])
        taxa_a = float(valores.split()[2])
        taxa_b = float(valores.split()[3])
        anos = 0

        while pa <= pb:
            pa += int((taxa_a * pa) / 100)
            pb += int((taxa_b * pb) / 100)
            anos += 1
            if anos > 100:
                break

        if anos <= 100:
            print('%d anos.' % anos)
        else:
            print('Mais de 1 seculo.')
        testes -= 1


if __name__ == '__main__':
    main()