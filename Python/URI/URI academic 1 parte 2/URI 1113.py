def main():

    valores = input()
    x = int(valores.split()[0])
    y = int(valores.split()[1])

    while x != y:
        if x > y:
            print('Decrescente')
        else:
            print('Crescente')
        valores = input()
        x = int(valores.split()[0])
        y = int(valores.split()[1])


if __name__ == '__main__':
    main()