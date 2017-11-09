def main():
    tel      = input('Telefonou para a vítima ?: ')
    local    = input('Esteve no local do crime ?: ')
    perto    = input('Mora perto da vítima ?: ')
    divida   = input('Devia para a vítima ?: ')
    trabalho = input('Já trabalhou com a vítima ?: ')

    if tel == 'sim' or tel == 'SIM' or tel == 'Sim':
        susp1 = 1
    else:
        susp1 = 0
    if local == 'sim' or local == 'SIM' or local == 'Sim':
        susp2 = 1
    else:
        susp2 = 0
    if perto == 'sim' or perto == 'SIM' or perto == 'Sim':
        susp3 = 1
    else:
        susp3 = 0
    if divida == 'sim' or divida == 'SIM' or divida == 'Sim':
        susp4 = 1
    else:
        susp4 = 0
    if trabalho == 'sim' or trabalho == 'SIM' or trabalho == 'Sim':
        susp5 = 1
    else:
        susp5 = 0

    suspeito = susp1 + susp2 + susp3 + susp4 + susp5

    if suspeito < 2:
        print('Nenhum envolvimento com o crime')
    elif suspeito == 2:
        print('Suspeito')
    elif suspeito == 3 or suspeito == 4:
        print('Cúmplice')
    else:
        print('Assassino')

if __name__ == '__main__':
    main()