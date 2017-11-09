def main():
    while True:
        try:
            tamanho = int(input())
            matriz = []
            cont1 = 0
            cont2 = tamanho -1
            for i in range(tamanho):
                lista = []
                for i in range(tamanho):
                    if i == cont2:
                        lista.append(2)
                    elif i == cont1:
                        lista.append(1)
                    else:
                        lista.append(3)
                cont1 += 1
                cont2 -= 1
                matriz.append(lista)

            for linha in matriz:
                for elemento in range(len(linha)):
                    if elemento == tamanho-1:
                        print(linha[elemento])
                    else:
                        print(linha[elemento], end='')
        except:
            break


if __name__ == '__main__':
    main()