def main():
    distan = float(input())
    gasto = float(input())

    consumo = distan / gasto

    print('%.3f' % consumo, 'km/l')


if __name__ == '__main__':
    main()