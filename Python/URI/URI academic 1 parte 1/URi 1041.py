def main():
    cord = input()

    x = float(cord.split()[0])
    y = float(cord.split()[1])

    if x > 0 and y > 0:
        print('Q1')
    if x < 0 and y > 0:
        print('Q2')
    if x < 0 and y < 0:
        print('Q3')
    if x > 0 and y < 0:
        print('Q4')
    if x != 0 and y == 0:
        print('Eixo X')
    if x == 0 and y != 0:
        print('Eixo Y')
    if x == 0 and y == 0:
        print('Origem')


if __name__ == '__main__':
    main()