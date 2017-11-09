#Apresentação

print('Somar os algarismos de um numero de 4 digitos')
print('---------------------------------------------')

#Valores

numero = int(input('Digite um numero de 4 digitos: '))
soma = 0

#Calculo

while numero > 0:
    resto = numero % 10
    numero = (numero - resto) // 10
    soma = soma + resto

#Saida

print('A soma dos algarismos deste numero é igual a: ', soma)