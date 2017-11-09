def main():

    valores = input()
    x = int(valores.split()[0])
    y = int(valores.split()[1])
    z = y + 1

    while y > 0:
        linhas = 0
        for i in range(x-1):
            print(z - y + linhas, end=' ')
            linhas += 1
            if linhas == x-1:
                print(z - y + linhas)
        y -= x


if __name__ == '__main__':
    main()