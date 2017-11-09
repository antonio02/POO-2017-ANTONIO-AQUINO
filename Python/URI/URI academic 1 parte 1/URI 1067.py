def main():
    z = int(input())
    x = 0
    a = 0
    while x < z - 1:
        x = (2 * a) + 1
        a = a + 1
        print(x)


if __name__ == '__main__':
    main()