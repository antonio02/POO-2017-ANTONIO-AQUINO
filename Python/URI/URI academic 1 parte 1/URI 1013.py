def main():
    valores = input()

    val1 = int(valores.split()[0])
    val2 = int(valores.split()[1])
    val3 = int(valores.split()[2])

    maior  = (val1 + val2 + abs(val1 - val2)) / 2
    maiorf = (maior + val3 + abs(maior - val3)) / 2

    print('%d eh o maior' % maiorf)


if __name__ == '__main__':
    main()