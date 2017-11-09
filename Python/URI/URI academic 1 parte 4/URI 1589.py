def main():
    testes = int(input())
    for i in range(testes):
        entrada = input()
        r1,r2 = [int(entrada.split()[i])for i in range(2)]
        print(r1+r2)


if __name__ == '__main__':
    main()