#Q31
num = int(input("Enter a 3-digit number: "))
if 100 >= num >= 999:
    print("Error! You need to input a 3-digit number.")
else:
    digit1 = int(num/100)
    digit3 = int(num % 10)
    digit2 = int((num/10) % 10)
    newnum = 100*digit3 + 10*digit2 +digit1
    if newnum == num:
        print(f"{num} is a palindrome.")
    else:
        print(f"{num} is not a palindrome.")
