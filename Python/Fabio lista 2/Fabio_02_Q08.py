def main():
    anos = int(input('Ano atual: '))
    meses = int(input('Mes atual: '))
    dias = int(input('Dia do mes atual: '))

    anos2 = int(input('Ano de nascimento: '))
    meses2 = int(input('Mes de nascimento: '))
    dias2 = int(input('Dia de nascimento: '))

    diat1 = abs(meses*30 + dias)
    diat2 = abs((anos2 - anos)*365 + meses2*30 + dias2)
    diat = abs(diat1 + diat2)

    anost = diat // 365
    mesest = (diat % 365) // 30
    diast = (diat % 365) % 30

    print('Esta pessoa tem a idade de %d anos' % anost)



if __name__ == '__main__':
    main()