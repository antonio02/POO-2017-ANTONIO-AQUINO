#Apresentação

print('Conversor de idade para dias')
print('----------------------------')

#Valores

anos = int(input('Digite a quantidade de anos: '))
meses =  int(input('Digite a quantidade de meses: '))
dias = int(input('Digite a quantidade de dias: '))

#Calculo

tdias = (anos*365) + (meses*30) + dias

#Saida

print('A quantidade total de dias é de:', tdias, 'dias')