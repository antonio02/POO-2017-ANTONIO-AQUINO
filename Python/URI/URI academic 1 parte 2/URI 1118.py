def main():

    nota = float(input())
    notas = 0
    novo_calculo = 1
    soma = 0

    while novo_calculo == 1:

        if nota < 0 or nota > 10:

            print('nota invalida')
            nota = float(input())

        else:

            notas += 1
            soma += nota

            if notas == 2:

                media = soma / 2
                print('media = %.2f' % media)
                print('novo calculo (1-sim 2-nao)')
                novo_calculo = int(input())

                while novo_calculo > 2:
                    print('novo calculo (1-sim 2-nao)')
                    novo_calculo = int(input())

                if novo_calculo == 2:
                    break

                notas = 0
                soma = 0

            nota = float(input())



if __name__ == '__main__':
    main()