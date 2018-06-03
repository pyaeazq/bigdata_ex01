# -*- coding: utf-8 -*-
"""
Created on Sat Jun  2 11:29:31 2018

@author: lenovo
"""

#一次申请一个变量
a = 3

#一次申明多个
xuan,guibin,xixi =80,90,88
xj = '小娇'
guibin = 5.1011111111111111111111
yanzhi = 100000000000000000000

#自动补全代码 按tab
print(xj+yanzhi)

# 将其他类型转换成字符串类型
b = str(yanzhi)
print(xj+str(yanzhi))
print(xj+'\t'+str(yanzhi))

#字符串中出现{}大括号，表示占位符
print('今天星期{}温度是{}天气是{}'.format('六','20℃','阴天'))

# 注释 
"""
"""
usemoney = 12,24,36,48,60 
usemoney[0]
usemoney2 = [12,24,36,48,60]
print(usemoney2[0])

xq1 = '星期一'
xq2 = '星期二'
xq3 = '星期三'
xq4 = '星期四'
xq5 = '星期五'
xq6 = '星期六'
xq7 = '星期七'
days = [xq1,xq2,xq3,xq4,xq5,xq6,xq7]
print(days[0])
print(days[1])
print(days[2])
print(days[3])
print(days[4])
print('今天是'+days[5])#今天是星期六
print(days[6])