def main():
    quanti = int(input())

    while quanti > 0:
        num = int(input())
        if num == 0:
            print('NULL')
        elif num % 2 == 0 and abs(num) * num > 0:
            print('EVEN POSITIVE')
        elif num % 2 == 0 and abs(num) * num < 0:
            print('EVEN NEGATIVE')
        elif num % 2 != 0 and abs(num) * num > 0:
            print('ODD POSITIVE')
        elif num % 2 != 0 and abs(num) * num < 0:
            print('ODD NEGATIVE')
        quanti = quanti - 1


if __name__ == '__main__':
    main()