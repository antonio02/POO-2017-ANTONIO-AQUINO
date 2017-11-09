from math import sqrt
def main():
    while True:
        entrada = input()
        if len(entrada) > 1:
            lado1,lado2,percentual = [int(entrada.split()[i])for i in range(3)]
            tamanho = lado1*lado2
            saida = int(sqrt(tamanho/(percentual/100)))
            print(saida)

        else:
            break


if __name__ == '__main__':
    main()