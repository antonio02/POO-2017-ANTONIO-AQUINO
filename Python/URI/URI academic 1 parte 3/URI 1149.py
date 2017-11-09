def main():

    valores = input()
    a = int(valores.split()[0])
    z = valores.split()[1:]
    soma = a

    for i in z:
        if int(i) > 0:
            n = int(i)
            break

    for i in range(a+1,a+n):
        soma += int(i)

    print(soma)


if __name__ == '__main__':
    main()