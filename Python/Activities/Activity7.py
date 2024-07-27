#list sum calculator

num_list = list(input("Enter the list of number that you want to add: ").split(", "))
sum = 0

for num in num_list:
    sum = sum + int(num)
print (sum)