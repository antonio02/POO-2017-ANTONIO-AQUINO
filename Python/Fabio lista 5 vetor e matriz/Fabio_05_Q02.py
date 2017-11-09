def main():

    tamanho = int(input('Digite o tamanho da lista: '))

    lista_a = []

    for i in range(tamanho):
        lista_a.append(input())

    for elemento in lista_a:
        for iguais in range(lista_a.index(elemento)+1,len(lista_a)):
            if elemento == lista_a[iguais]:
                print('Tem elementos iguais')
                return

    print('Não tem elementos iguais')


if __name__ == '__main__':
    main()