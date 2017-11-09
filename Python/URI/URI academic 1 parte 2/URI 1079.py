def main():
    casos = int(input())

    x = 0

    while x < casos:
        valt = input()

        val1 = float(valt.split()[0])
        val2 = float(valt.split()[1])
        val3 = float(valt.split()[2])
        x = x + 1
        media = ((val1 * 2) + (val2 * 3) + (val3 * 5)) / (2 + 3 + 5)
        print('%.1f' % media)


if __name__ == '__main__':
    main()