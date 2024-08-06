# User inputted number for FizzBuzz

userNum = int(input("Enter number: "))

if userNum % 3 == 0 and userNum % 5 == 0:
    print(userNum, "FizzBuzz")
elif userNum % 5 == 0:
    print(userNum, "Buzz")
elif userNum % 3 == 0:
    print(userNum, "Fizz")
else:
    print(userNum, "Neither Fizz nor Buzz")

# Iterate with a for loop

for num in range(1, 101):
    if num % 3 == 0 and num % 5 == 0:
        print(num, "FizzBuzz")
    elif num % 5 == 0:
        print(num, "Buzz")
    elif num % 3 == 0:
        print(num, "Fizz")
    else:
        print(num, "Neither Fizz nor Buzz")
