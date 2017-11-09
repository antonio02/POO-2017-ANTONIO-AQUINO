def main():

    quanti_container = int(input('Digite a quantidade de containers: '))

    peso_carga = 0

    while quanti_container != 0 :
        peso = float(input('Digite o pesso do container %d: ' % quanti_container))
        quanti_container -= 1
        peso_carga += peso

    quanti_bilhetes = 1
    quanti_passageiros = 0
    quanti_bagagem = 0

    while quanti_bilhetes != 0:
        quanti_bilhetes = int(input('Digite o numero do bilhete do passageiro: '))
        if quanti_bilhetes > 0:
            quanti_passageiros += 1
        bagagem = int(input('Digite a quantidade de bagagem do passageiro: '))
        quanti_bagagem += bagagem

    peso_bagagem = quanti_bagagem * 10
    peso_passageiros = quanti_passageiros * 70

    peso_total = peso_bagagem + peso_carga + peso_passageiros
    peso_restante = 500000 - peso_total
    quanti_combustivel = peso_restante / 1.5
    if quanti_combustivel < 0:
        quanti_combustivel = 0

    print('----------------------------------------------')
    print('Quantidade de passageiros            : %d' % quanti_passageiros)
    print('Peso dos passageiros                 : %d Kg' % peso_passageiros)
    print('Quantidade de bagagens               : %d' % quanti_bagagem)
    print('Peso das bagagens                    : %d Kg' % peso_bagagem)
    print('Peso da carga                        : %.2f Kg' % peso_carga)
    print('Quantidade possivel de combustivel   : %.2f L' % quanti_combustivel)

    if quanti_combustivel < 100001:
        print('DECOLAGEM NÃO LIBERADA (COMBUSTIVEL INSUFICIENTE)')
    else:
        print('DECOLAGEM LIBERADA')



if __name__ == '__main__':
    main()