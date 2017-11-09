def main():
    tamanho = int(input('Digite o tamanho do vetor: '))
    vetorA = criar_vetor(tamanho)
    vetorB = criar_vetor(tamanho)
    preencher_vetor(vetorA)
    preencher_vetor(vetorB)
    vetorC = juntar_2_vetores(vetorA,vetorB)
    print('Vetor A >', vetorA)
    print('Vetor B >', vetorB)
    print('Vetor C(A+B) >', vetorC)


def criar_vetor(tamanho):
    vetor = [0]*tamanho

    return vetor


def preencher_vetor(vetor):
    for index in range(len(vetor)):
        vetor[index] = input('Digite o elemento a ser colocado na posição %d: ' % index)


def juntar_2_vetores(vetor1, vetor2):
    vetor_juncao = [0]*(len(vetor1)+len(vetor2))
    #2 for para vetores com tamanhos diferentes
    for index in range(len(vetor1)):
        vetor_juncao[index] = vetor1[index]

    posicao = 0
    for index in range(len(vetor1),len(vetor_juncao)):
        vetor_juncao[index] = vetor2[posicao]
        posicao += 1

    return vetor_juncao


if __name__ == '__main__':
    main()