def main():

    verbo = input('Digite um verbo terminado com -er: ')
    radical = ''

    for letra in range(len(verbo)-2):
        radical += verbo[letra]

    print(radical + 'o')




if __name__ == '__main__':
    main()