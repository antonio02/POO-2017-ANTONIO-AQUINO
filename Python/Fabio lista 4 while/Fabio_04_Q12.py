def main():

    pontos1 = 0
    pontos2 = 0

    while pontos1 < 21 and pontos2 < 21 or abs(pontos1 - pontos2) < 2:
        jogador = int(input('Digite quem fez o ponto (Jogador 1 ou 2): '))
        if jogador == 1:
            pontos1 += 1
        elif jogador == 2:
            pontos2 += 1
        else:
            print('Numero invalido')

    if pontos1 > pontos2:
        print('O jogador 1 venceu')
        print('Pontos do jogador 1: %d' % pontos1)
        print('Pontos do jogador 2: %d' % pontos2)
    else:
        print('O jogador 2 venceu')
        print('Pontos do jogador 1: %d' % pontos1)
        print('Pontos do jogador 2: %d' % pontos2)


if __name__ == '__main__':
    main()