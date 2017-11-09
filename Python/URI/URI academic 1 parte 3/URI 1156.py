def main():

    s = 1
    num = 3
    divisor = 2

    while num <= 39:
        s += num / divisor
        num += 2
        div2 = divisor
        divisor += div2


    print('%.2f' % s)


if __name__ == '__main__':
    main()