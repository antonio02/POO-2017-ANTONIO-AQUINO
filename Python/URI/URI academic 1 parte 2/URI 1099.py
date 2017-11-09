def main():

    testes = int(input())

    while testes > 0:

        entrada = input()
        x = int(entrada.split()[0])
        y = int(entrada.split()[1])
        soma = 0

        if x < y:
            for i in range(x+1, y):
                if i % 2 != 0:
                    soma += i
        else:
            for i in range(y+1,x):
                if i % 2 != 0:
                    soma += i

        testes -= 1
        print(soma)


if __name__ == '__main__':
    main()