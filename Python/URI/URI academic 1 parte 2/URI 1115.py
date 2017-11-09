def main():

    valores = input()
    x = int(valores.split()[0])
    y = int(valores.split()[1])

    while x != 0 and y != 0:
        if x > 0 and y > 0:
            print('primeiro')
        elif x < 0 and y > 0:
            print('segundo')
        elif x < 0 and y < 0:
            print('terceiro')
        else:
            print('quarto')

        valores = input()
        x = int(valores.split()[0])
        y = int(valores.split()[1])



if __name__ == '__main__':
    main()