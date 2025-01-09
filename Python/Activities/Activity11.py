ex_dic={"apple":10, "banana":20, "orange":30}
i=input("what are you looking for").lower()
if i in ex_dic:
    print("Yes available")
else:
    print("Not available")