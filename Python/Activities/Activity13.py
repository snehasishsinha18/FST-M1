def sum(num):
    sum = 0
    for i in num:
        sum+=i
    return sum
numList = [10, 40, 60, 90]
res=sum(numList)
print(int(res))