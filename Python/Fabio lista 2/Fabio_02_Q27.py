def main():
    data1 = input('Digite a data de nascimento: ')
    data2 = input('Digite a data atual: ')

    dia1 = int(data1.split('/')[0])
    mes1 = int(data1.split('/')[1])
    ano1 = int(data1.split('/')[2])
    dia2 = int(data2.split('/')[0])
    mes2 = int(data2.split('/')[1])
    ano2 = int(data2.split('/')[2])

    diat1 = ano1 * 365 + mes1 * 30 + dia1
    diat2 = ano2 * 365 + mes2 * 30 + dia2
    diat = diat2 - diat1
    anof = diat // 365

    print('Essa pessoa tem %d anos de idade' % anof)


if __name__ == '__main__':
    main()