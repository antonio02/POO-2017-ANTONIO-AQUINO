def main():

    gols = input()
    gol_inter = int(gols.split()[0])
    gol_gremio = int(gols.split()[1])
    vitorias_inter = 0
    vitorias_gremio = 0
    empates = 0
    grenais = 1
    novo_grenal = 1

    while novo_grenal == 1:

        if gol_inter > gol_gremio:
            vitorias_inter += 1
        elif gol_gremio > gol_inter:
            vitorias_gremio += 1
        else:
            empates += 1

        print('Novo grenal (1-sim 2-nao)')
        novo_grenal = int(input())

        if novo_grenal == 2:
            break
        else:
            grenais += 1
            gols = input()
            gol_inter = int(gols.split()[0])
            gol_gremio = int(gols.split()[1])

    print('%d grenais' % grenais)
    print('Inter:%d' % vitorias_inter)
    print('Gremio:%d' % vitorias_gremio)
    print('Empates:%d' % empates)

    if vitorias_inter > vitorias_gremio:
        print('Inter venceu mais')
    elif vitorias_gremio > vitorias_inter:
        print('Gremio venceu mais')
    else:
        print('Nao houve vencedor')


if __name__ == '__main__':
    main()