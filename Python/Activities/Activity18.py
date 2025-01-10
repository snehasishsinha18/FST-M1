import pandas

df = pandas.read_csv("activity17.csv")
print(df)
print(df["username"])
print(df["username"][1],df["passwords"][1])
print(df.sort_values('username'))
print(df.sort_values('passwords',ascending=False))