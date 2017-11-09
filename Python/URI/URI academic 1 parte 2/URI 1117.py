def main():

    nota = float(input())
    notas = 0
    soma = 0

    while notas < 5:
        if nota < 0 or nota > 10:
            print('nota invalida')
            nota = float(input())
        else:
            notas += 1
            soma += nota
            if notas == 2:
                media = soma / 2
                print('media = %.2f' % media)
                break
            nota = float(input())


if __name__ == '__main__':
    main()