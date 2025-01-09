def fibo(num):
    if num<=1:
        return num
    else:
        return(fibo(num-1)+fibo(num-2))
	
nterms = int(input("Enter a number: "))
 
if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
        print(fibo(i))