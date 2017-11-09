def main():

    x = int(input())
    z = int(input())
    inicio = x
    if x < 0:
        contador = 0
    else:
        contador = 1

    while z <= x:
        z = int(input())

    while x < z:
        x += inicio + contador
        contador += 1

    print(contador)


if __name__ == '__main__':
    main()