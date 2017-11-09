def main():

    vezes = int(input())
    x = 1
    y = 2
    z = 3

    for i in range(vezes):
        print(x, y, z, 'PUM')
        x += 4
        y += 4
        z += 4


if __name__ == '__main__':
    main()