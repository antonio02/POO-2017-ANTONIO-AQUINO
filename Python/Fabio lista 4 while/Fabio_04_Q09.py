def main():
    prova = int(input('Digite o numero da prova: '))
    quanti = int(input('Digite a quantidade de nadadores: '))

    pontosa = 0
    pontosb = 0

    while prova != 0 or quanti != 0:
        while quanti != 0:
            quanti -= 1
            nome = input('Digite o nome do nadador: ')
            classif = int(input('Digite a classificação do nadador: '))
            tempo = input('Digite o tempo do nadador: ')
            clube = input('Digite o clube do nadador: ')

            ponto = pontos(classif)

            if clube == 'a' or clube == 'A':
                pontosa += ponto
            else:
                pontosb += ponto

        prova = int(input('Digite o numero da prova: '))
        quanti = int(input('Digite a quantidade de nadadores: '))

    if pontosa > pontosb:
        print('A equipe A foi a vencendora')
    elif pontosb > pontosa:
        print('A equipe B foi a vencendora')
    else:
        print('Empate')

def pontos(aa):
    if aa == 1:
        return 9
    if aa == 2:
        return 6
    if aa == 3:
        return 4
    if aa == 4:
        return 3
    else:
        return 0


if __name__ == '__main__':
    main()