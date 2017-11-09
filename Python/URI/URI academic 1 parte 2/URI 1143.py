def main():

    vezes = int(input())
    x = 1

    for i in range(vezes):
        print(x, x**2, x**3)
        x += 1


if __name__ == '__main__':
    main()