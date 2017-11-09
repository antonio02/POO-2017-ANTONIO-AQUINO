def main():
    z = int(input())
    x = z
    a = z//2
    while x >= z and x < z + 10:
        x = (2 * a) + 1
        a = a + 1
        print(x)


if __name__ == '__main__':
    main()