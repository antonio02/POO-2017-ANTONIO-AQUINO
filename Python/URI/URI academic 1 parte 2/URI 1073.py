def main():
    val = int(input())

    valx = 1
    x = 0

    while x < val - 1:
        x = 2 * valx
        valx = valx + 1
        multi = x ** 2
        print('%d^2 = %d' % (x, multi))


if __name__ == '__main__':
    main()