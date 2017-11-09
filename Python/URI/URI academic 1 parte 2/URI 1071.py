def main():
    num1 = int(input())
    num2 = int(input())

    lista = []

    if num1 < num2 and num1 % 2 != 0:
        for i in range(num1, num2, 2):
            lista[1:1] = [i]
        del lista[0]
        print(sum(lista))
    elif num1 < num2 and num1 % 2 == 0:
        for i in range(num1 - 1, num2, 2):
            lista[1:1] = [i]
        del lista[0]
        print(sum(lista))
    elif num1 > num2 and num2 % 2 != 0:
        for i in range(num2, num1, 2):
            lista[1:1] = [i]
        del lista[0]
        print(sum(lista))
    elif num1 > num2 and num2 % 2 == 0:
        for i in range(num2 - 1, num1, 2):
            lista[1:1] = [i]
        del lista[0]
        print(sum(lista))
    else:
        print('0')


if __name__ == '__main__':
    main()