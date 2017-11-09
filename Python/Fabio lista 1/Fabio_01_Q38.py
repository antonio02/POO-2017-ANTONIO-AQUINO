#Apresentação

print('Somar frações')
print('-------------')

#Valores

numer1 = int(input('Digite o numerador da primeira fração: '))
deno1 = int(input('Digite o denominador da primeira fração: '))
numer2 = int(input('Digite o numerador da segunda fração: '))
deno2 = int(input('Digite o denominador da segunda fração: '))

a = deno1
b = deno2
resto = None

#Calculos

while resto is not 0:
    resto = a % b
    a = b
    b = resto
denominador = (deno1 * deno2) // a
numerador1 = (denominador // deno1) * numer1
numerador2 = (denominador // deno2) * numer2
totalnum = numerador1 + numerador2

#Saida

print('A soma dessas frações é igual a:', totalnum,'/', denominador)
