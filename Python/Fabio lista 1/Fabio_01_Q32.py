#Apresentação

print('Subtrair um numero com o seu inverso')
print('------------------------------------')

#Valores

num = input('Digite um numero de 3 digitos: ')

#Calculos

numi = int(num[::-1])
numn = int(num)

soma = numn - numi

#Saida

print('A subtração desse numero por seu inverso é igual a:',soma)