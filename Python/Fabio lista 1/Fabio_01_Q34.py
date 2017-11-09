#Apresentação

print('Media de 3 numeros')
print('------------------')

#Valores

num1 = float(input('Digite o primeiro numero: '))
num2 = float(input('Digite o segundo numero: '))
num3 = float(input('Digite o terceiro numero: '))

#Calculo

media = (num1 + num2 + num3) / 3

#Saida

print('A media desses 3 numeros é igual a:', "%.2f" % media)