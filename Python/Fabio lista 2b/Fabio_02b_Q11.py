def main():
    numero = int(input('Digite o numero: '))

    unidade = numero % 10
    dezena  = int((numero % 100) * 10**-1)
    centena = int((numero % 1000) * 10**-2)
    if numero == 0:
        print('O numero não contem unidades, dezenas ou centenas')
    elif centena == 0:
        if dezena == 0:
            if unidade == 1:
                print('O numero contem 1 unidade')
            else:
                print('O numero contem %d unidades' % unidade)
        elif dezena == 1:
            if unidade == 0:
                print('O numero contem 1 dezena')
            elif unidade == 1:
                print('O numero contem 1 dezena e 1 unidade')
            else:
                print('O numero contem 1 dezena e %d unidades' % unidade)
        else:
            if unidade == 0:
                print('O numero contem %d dezenas' % dezena)
            elif unidade == 1:
                print('O numero contem %d dezenas e 1 unidade' % dezena)
            else:
                print('O numero contem %d dezenas e %d unidades' % (dezena, unidade))

    elif centena == 1:
        if dezena == 0:
            if unidade == 0:
                print('O numero contem 1 centena')
            elif unidade == 1:
                print('O numero contem 1 centena e 1 unidade')
            else:
                print('O numero contem 1 centena e %d unidades' % unidade)
        elif dezena == 1:
            if unidade == 0:
                print('O numero contem 1 centena e 1 dezena')
            elif unidade == 1:
                print('O numero contem 1 centena, 1 dezena e 1 unidade')
            else:
                print('O numero contem 1 centena, 1 dezena e %d unidades' % unidade)
        else:
            if unidade == 0:
                print('O numero contem 1 centena e %d dezenas' % dezena)
            elif unidade == 1:
                print('O numero contem 1 centena, %d dezenas e 1 unidade' % dezena)
            else:
                print('O numero contem 1 centena, %d dezenas e %d unidades' % (dezena, unidade))

    else:
        if dezena == 0:
            if unidade == 0:
                print('O numero contem %d centenas' % centena)
            elif unidade == 1:
                print('O numero contem %d centenas e 1 unidade' % centena)
            else:
                print('O numero contem %d centenas e %d unidades' % (centena, unidade))
        elif dezena == 1:
            if unidade == 0:
                print('O numero contem %d centenas e 1 dezena' % centena)
            elif unidade == 1:
                print('O numero contem %d centenas, 1 dezena e 1 unidade' % centena)
            else:
                print('O numero contem %d centenas, 1 dezena e %d unidades' % (centena, unidade))
        else:
            if unidade == 0:
                print('O numero contem %d centenas e %d dezenas' % (centena, dezena))
            elif unidade == 1:
                print('O numero contem %d centenas, %d dezenas e 1 unidade' % (centena, dezena))
            else:
                print('O numero contem %d centenas, %d dezenas e %d unidades' % (centena, dezena, unidade))


if __name__ == '__main__':
    main()