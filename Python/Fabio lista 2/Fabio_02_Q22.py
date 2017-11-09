def main():
    print('Digite o horario no formato HH:MM')

    inicio = input('Digite o horario de inicio: ')
    fim = input('Digite o horario de termino: ')

    hora1 = int(inicio.split(':')[0])
    minuto1 = int(inicio.split(':')[1])
    hora2 = int(fim.split(':')[0])
    minuto2 = int(fim.split(':')[1])

    if hora1 >= 24 or hora2 >= 24 or minuto1 >= 60 or minuto2 >= 60:
        print('Horario invalido')
    else:
        minutos1 = hora1 * 60 + minuto1
        minutos2 = hora2 * 60 + minuto2

        total = abs(minutos1 - minutos2)

        thoras = total // 60
        tminutos = total % 60

        print('O jogo teve uma duração de: %d horas e %d minutos' % (thoras, tminutos))


if __name__ == '__main__':
    main()