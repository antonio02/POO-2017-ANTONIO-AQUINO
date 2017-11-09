def main():

    vezes = int(input())
    repeticao = 0
    num = 1

    for i in range(vezes):
        if num == 1:
            print(num, num, num)
            print(num, num+1, num+1)
        else:
            num2 = num * num
            num3 = num2 * num
            print(num, num2, num3)
            print(num, num2+1, num3+1)

        num += 1

if __name__ == '__main__':
    main()