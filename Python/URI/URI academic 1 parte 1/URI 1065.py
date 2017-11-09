def main():
    val1 = float(input())
    val2 = float(input())
    val3 = float(input())
    val4 = float(input())
    val5 = float(input())

    if val1 % 2 == 0:
        par1 = 1
        impar1 = 0
    else:
        impar1 = 1
        par1 = 0
    if val2 % 2 == 0:
        par2 = 1
        impar2 = 0
    else:
        impar2 = 1
        par2 = 0
    if val3 % 2 == 0:
        par3 = 1
        impar3 = 0
    else:
        impar3 = 1
        par3 = 0
    if val4 % 2 == 0:
        par4 = 1
        impar4 = 0
    else:
        impar4 = 1
        par4 = 0
    if val5 % 2 == 0:
        par5 = 1
        impar5 = 0
    else:
        impar5 = 1
        par5 = 0

    if abs(val1) * val1 < 0:
        posi1 = 0
        nega1 = 1
    else:
        posi1 = 1
        nega1 = 0
    if abs(val2) * val2 < 0:
        posi2 = 0
        nega2 = 1
    else:
        posi2 = 1
        nega2 = 0
    if abs(val3) * val3 < 0:
        posi3 = 0
        nega3 = 1
    else:
        posi3 = 1
        nega3 = 0
    if abs(val4) * val4 < 0:
        posi4 = 0
        nega4 = 1
    else:
        posi4 = 1
        nega4 = 0
    if abs(val5) * val5 < 0:
        posi5 = 0
        nega5 = 1
    else:
        posi5 = 1
        nega5 = 0

    z1 = 0
    z2 = 0
    z3 = 0
    z4 = 0
    z5 = 0
    if val1 == 0:
        z1 = 1
    if val2 == 0:
        z2 = 1
    if val3 == 0:
        z3 = 1
    if val4 == 0:
        z4 = 1
    if val5 == 0:
        z5 = 1

    pares = par1 + par2 + par3 + par4 + par5
    impares = impar1 + impar2 + impar3 + impar4 + impar5
    zeros = z1 + z2 + z3 + z4 + z5
    positivos = posi1 + posi2 + posi3 + posi4 + posi5 - zeros
    negativos = nega1 + nega2 + nega3 + nega4 + nega5

    print('%d valor(es) par(es)' % pares)
    print('%d valor(es) impar(es)' % impares)
    print('%d valor(es) positivo(s)' % positivos)
    print('%d valor(es) negativo(s)' % negativos)


if __name__ == '__main__':
    main()