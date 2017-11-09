def main():
    num = int(input())

    x = 0

    while x < 10000:
        x = x + 1
        resto = x % num
        if resto == 2:
            print(x)


if __name__ == '__main__':
    main()