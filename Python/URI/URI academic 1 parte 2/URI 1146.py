def main():

    x = int(input())

    while x != 0:
        for i in range(1, x+1):
            if i == x:
                print(i)
                break
            print(i, end=' ')

        x = int(input())


if __name__ == '__main__':
    main()