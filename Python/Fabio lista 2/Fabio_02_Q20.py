def main():
    angulo = float(input('Digite o angulo: '))

    if angulo <= 90:
        print('Q1')
    elif angulo <= 180:
        print('Q2')
    elif angulo <= 270:
        print('Q3')
    else:
        print('Q4')


if __name__ == '__main__':
    main()