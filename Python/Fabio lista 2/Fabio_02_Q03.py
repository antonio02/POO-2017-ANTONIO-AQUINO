#Apresentação

print('Maior numero entre tres numero')
print('------------------------------')

#Valores

num1 = int(input('Digite o valor do primeiro numero: '))
num2 = int(input('Digite o valor do segundo numero: '))
num3 = int(input('Digite o valor do terceiro numero: '))

#Saida
if num1 > num2 and num1 > num3:
    print('O maior numero é:', num1)
if num2 > num1 and num2 > num3:
    print('O maior numero é:', num2)
if num3 > num1 and num3 > num2:
    print('O maior numero é:', num3)
if num1 == num2 == num3:
    print('Os numeros são todos iguais')