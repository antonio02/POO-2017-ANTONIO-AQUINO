def main():
    vdia = input()
    dia = int(vdia.split()[1])
    horario = input()

    hora = int(horario.split()[0])
    minuto = int(horario.split()[2])
    segundo = int(horario.split()[4])

    vdia = input()
    dia2 = int(vdia.split()[1])
    horario2 = input()

    hora2 = int(horario2.split()[0])
    minuto2 = int(horario2.split()[2])
    segundo2 = int(horario2.split()[4])

    total1 = dia*86400 + hora*3600 + minuto*60 + segundo
    total2 = dia2*86400 + hora2*3600 + minuto2*60 + segundo2
    segundos = total2 - total1

    diat = segundos // 86400
    horat = (segundos % 86400) // 3600
    minutot = ((segundos % 86400) % 3600) // 60
    segundot = ((segundos % 86400) % 3600) % 60

    print('%d dia(s)' % diat)
    print('%d hora(s)' % horat)
    print('%d minuto(s)' % minutot)
    print('%d segundo(s)' % segundot)


if __name__ == '__main__':
    main()