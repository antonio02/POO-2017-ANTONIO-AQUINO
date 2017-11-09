def main():

    i = 1
    j = 7

    while i <= 9:
        print('I=%d J=%d' % (i,j))
        j -= 1
        if j < 5:
            j = 7
            i += 2


if __name__ == '__main__':
    main()