def main():

    divisoes = int(input())

    while divisoes > 0:

        valores = input()
        x = int(valores.split()[0])
        y = int(valores.split()[1])

        if y == 0:
            print('divisao impossivel')
        else:
            divisao = x/y
            print('%.1f' % divisao)

        divisoes -= 1


if __name__ == '__main__':
    main()