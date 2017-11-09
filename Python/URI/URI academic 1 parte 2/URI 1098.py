def main():

    i = 0

    while i <= 2:

        j = 1
        if i == 0:
            j += i
            for z in range(3):
                print('I=%d J=%d' % (i, j))
                j += 1
        elif i == 1:
            j += i
            for z in range(3):
                print('I=%d J=%d' % (i, j))
                j += 1
        elif i == 2:
            j += i
            for z in range(3):
                print('I=%d J=%d' % (i, j))
                j += 1
        else:
            j += i
            for z in range(3):
                print('I=%.1f J=%.1f' % (i, j))
                j += 1
        i += 0.2
        i = float('%.1f' % i)


if __name__ == '__main__':
    main()