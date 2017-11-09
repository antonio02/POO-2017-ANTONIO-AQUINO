def main():
    valores = input()

    horai = int(valores.split()[0])
    mini = int(valores.split()[1])
    horaf  = int(valores.split()[2])
    minf  = int(valores.split()[3])

    if   horai == horaf and mini >  minf:
        horat = 23
        mint  = 60 - (mini - minf)
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai == horaf and mini == minf:
        horat = 24
        mint  = 0
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai == horaf and mini <  minf:
        horat = 0
        mint  = minf - mini
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai > horaf and mini  >  minf:
        horat = 23 - (horai - horaf)
        mint  = 60 - (mini - minf)
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai > horaf and mini  == minf:
        horat = 24 - (horai - horaf)
        mint  = 0
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai > horaf and mini  <  minf:
        horat = 24 - (horai - horaf)
        mint  = minf - mini
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai < horaf and mini  >  minf:
        horat = horaf - horai - 1
        mint  = 60 - (mini - minf)
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai < horaf and mini  == minf:
        horat = horaf - horai
        mint  = 0
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))
    elif horai < horaf and mini  <  minf:
        horat = horaf - horai
        mint = minf - mini
        print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' % (horat, mint))


if __name__ == '__main__':
    main()