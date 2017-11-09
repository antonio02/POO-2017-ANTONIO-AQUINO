#Apresentação

print('Conversor de binario para decimal')
print('---------------------------------')

#Valor do numero binario

x = int(input('Digite o numero binario com no maximo 4 digitos: '))

#Calculos e condições

if x >= 1:
    dig1 = x % 10
    x = x - dig1
    rdig1 = x % 100
else:
    dig1 = 0
if x >= 10:
    dig2 = int(rdig1 * 10**-1)
    rdig2 = x % 1000
else:
    dig2 = 0
if x >= 100:
    dig3 = int(rdig2 * 10**-2)
    rdig3 = x % 10000
else:
    dig3 = 0
if x >= 1000:
    dig4 = int(rdig3 * 10**-3)
else:
    dig4 = 0

decimal = (dig1*2**0)+(dig2*2**1)+(dig3*2**2)+(dig4*2**3)

#Saida

print('O valor desse numero em decimal é igual a:',decimal)
