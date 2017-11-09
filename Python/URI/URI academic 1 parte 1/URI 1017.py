def main():
    horas = int(input())
    velocidade = float(input())

    distancia = velocidade * horas
    gasto = distancia / 12

    print('%.3f' % gasto)


if __name__ == '__main__':
    main()