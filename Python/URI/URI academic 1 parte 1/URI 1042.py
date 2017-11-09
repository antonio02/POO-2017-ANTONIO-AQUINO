def main():
    valores = input()

    val1 = int(valores.split()[0])
    val2 = int(valores.split()[1])
    val3 = int(valores.split()[2])

    if val1 > val2 > val3:
        print(val3)
        print(val2)
        print(val1)
        print()
        print(val1)
        print(val2)
        print(val3)
    elif val1 > val3 > val2:
        print(val2)
        print(val3)
        print(val1)
        print()
        print(val1)
        print(val2)
        print(val3)
    elif val2 > val1 > val3:
        print(val3)
        print(val1)
        print(val2)
        print()
        print(val1)
        print(val2)
        print(val3)
    elif val2 > val3 > val1:
        print(val1)
        print(val3)
        print(val2)
        print()
        print(val1)
        print(val2)
        print(val3)
    elif val3 > val1 > val2:
        print(val2)
        print(val1)
        print(val3)
        print()
        print(val1)
        print(val2)
        print(val3)
    elif val3 > val2 > val1:
        print(val1)
        print(val2)
        print(val3)
        print()
        print(val1)
        print(val2)
        print(val3)


if __name__ == '__main__':
    main()