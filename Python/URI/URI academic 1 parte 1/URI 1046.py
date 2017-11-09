def main():
    valores = input()

    horai = int(valores.split()[0])
    horaf = int(valores.split()[1])

    if horai > horaf:
        horat = 24 - (horai - horaf)
        print('O JOGO DUROU %d HORA(S)' % horat)
    elif horai < horaf:
        horat = horaf - horai
        print('O JOGO DUROU %d HORA(S)' % horat)
    else:
        print('O JOGO DUROU 24 HORA(S)')


if __name__ == '__main__':
    main()