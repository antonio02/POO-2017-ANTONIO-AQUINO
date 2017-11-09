def main():
    num = float(input())

    if 25 >= num >= 0:
        print('Intervalo [0,25]')
    if 50 >= num > 25:
        print('Intervalo (25,50]')
    if 75 >= num > 50:
        print('Intervalo (50,75]')
    if 100 >= num > 75:
        print('Intervalo (75,100]')
    if num > 100 or num < 0:
        print('Fora de intervalo')


if __name__ == '__main__':
    main()