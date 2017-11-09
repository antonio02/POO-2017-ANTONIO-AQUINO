def main():
    num = int(input())

    x = 0

    while x < 10:
        x = x + 1
        y = num * x
        print('%d x %d = %d' % (x, num, y))


if __name__ == '__main__':
    main()