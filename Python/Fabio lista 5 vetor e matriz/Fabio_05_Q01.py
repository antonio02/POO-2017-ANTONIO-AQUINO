def main():

    tamanho = int(input('Digite o tamanho da lista: '))

    vetor_a = []

    for i in range(tamanho):
        vetor_a.append(input('Posição %d: ' % i))

    vetor_b = []

    for i in range(tamanho-1,-1,-1):
        vetor_b.append(vetor_a[i])

    print(vetor_b)




if __name__ == '__main__':
    main()