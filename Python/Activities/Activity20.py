import pandas
from pandas import ExcelWriter

df =pandas.read_excel("activity19.xlsx","sheet1")
print(df)
print(df.shape)
print(df['Email'])
print(df.sort_values('FirstName'))
