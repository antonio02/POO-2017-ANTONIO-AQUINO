def main():

    horario = input('Digite um horario no formato HH:MM:SS: ')

    hora, minuto, segundo = horario.split(':')

    print('%s hora(s), %s minuto(s) e %s segundo(s)' % (hora, minuto, segundo))


if __name__ == '__main__':
    main()