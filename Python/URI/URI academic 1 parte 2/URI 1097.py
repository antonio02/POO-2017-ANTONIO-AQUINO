def main():

    i = 1
    j = 7
    y = 7

    while i <= 9:
        print('I=%d J=%d' % (i, j))
        j -= 1
        if j + 2 < y:
            y += 2
            j += 5
            i += 2


if __name__ == '__main__':
    main()