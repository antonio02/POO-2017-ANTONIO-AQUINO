def main():

    numero = int(input())

    for i in range(1, numero+1):
        if numero % i == 0:
            print(i)


if __name__ == '__main__':
    main()