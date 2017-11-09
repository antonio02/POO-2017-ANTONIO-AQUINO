#Apresetação

print('Verificar se 2 digitos de um numero são iguais ou diferentes')
print('------------------------------------------------------------')

#Valores

numero = int(input('Digite um numero de 2 digitos: '))

#Calculos

dig1 = numero % 10
dig2 = int((numero % 100) * 10**-1)

#Saida

if dig1 == dig2:
    print('No numero', numero, 'o algarismo da dezena é igual ao algarismo da unidade')
if dig1 != dig2:
    print('No numero', numero, 'o algarismo da dezena não é igual ao algarismo da unidade')