def main():
    val1 = float(input())
    val2 = float(input())
    val3 = float(input())
    val4 = float(input())
    val5 = float(input())
    val6 = float(input())

    posi1 = 0
    posi2 = 0
    posi3 = 0
    posi4 = 0
    posi5 = 0
    posi6 = 0

    if abs(val1) * val1 < 0:
        x1 = 0
    else:
        x1 = 1
        posi1 = val1
    if abs(val2) * val2 < 0:
        x2 = 0
    else:
        x2 = 1
        posi2 = val2
    if abs(val3) * val3 < 0:
        x3 = 0
    else:
        x3 = 1
        posi3 = val3
    if abs(val4) * val4 < 0:
        x4 = 0
    else:
        x4 = 1
        posi4 = val4
    if abs(val5) * val5 < 0:
        x5 = 0
    else:
        x5 = 1
        posi5 = val5
    if abs(val6) * val6 < 0:
        x6 = 0
    else:
        x6 = 1
        posi6 = val6
    xt = x1 + x2 + x3 + x4 + x5 + x6
    soma1 = posi1 + posi2 + posi3 + posi4 + posi5 + posi6
    soma2 = x1 + x2 + x3 + x4 + x5 + x6
    media = soma1 / soma2
    print('%d valores positivos' % xt)
    print('%.1f' % media)


if __name__ == '__main__':
    main()