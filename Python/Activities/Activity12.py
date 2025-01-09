def my_func(num):
    if num:
        return num+my_func(num-1)
    else:
        return 0
res = my_func(10)
print(res)

