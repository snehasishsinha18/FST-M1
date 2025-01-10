import pandas

data={"username":["admin","charles","deku"],"passwords":["password","charl13","Allmight"]}
df = pandas.DataFrame(data)
print(df)
df.to_csv("activity17.csv",index=False)