listA=[1,2,3,4,5,6,7,8]
listb=[3,4,5,6,7,8,9]
newlist=[]
for i in listA:
        if i%2!=0:
            newlist.append(i)
for j in listb:
        if j%2==0:
            newlist.append(j)
print(newlist)