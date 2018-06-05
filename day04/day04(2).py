# -*- coding: utf-8 -*-
"""
Created on Tue Jun  5 17:07:06 2018

@author: lenovo
"""

kemus = [1,2]#文理科
#全国城市
citys = [11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65]
#全国高校编号
ids = []
pam = 'id={}&type={}&city={}&state=1'

s = '北京大学	北京	http://www.gaokaopai.com/daxue-jianjie-477.html'
s[:-5].split('-')[2]
#readlines() 一次性将文件所有行读出来，是list
ls = open('./all_school.txt','r',encoding = 'utf-8').readlines()
len(ls)
for i in range(0,len(ls)):
    w = ls[i].split('-')[2]
    m = w.split('.')[0]
    print(ids.append(m))
"""
for kemu in kemus:
    for city in citys:
        for i in ids:#乐山师范学院        
            pam = 'id={}&type={}&city={}&state=1'
            pam.format(i,kemu,city)
"""
f = open('./urls.txt','a')
for i in ids:#全中国高效文科招生
    for city in citys:#城市
        pam ='id={}&type={}&city={}&state=1'
        #print(pam.format(i,1,city)
        f.write(pam.format(i,1,city)+'\n')
for i in ids: #全中国高校文科招生
    for city in citys:#城市
        pam ='id={}&type={}&city={}&state=1'
        #print(pam.format(i,2,city)
        f.write(pam.format(i,2,city)+'\n')
f.close()
"""
文科-四川-乐山师范学院
理科-四川-乐山师范学院
"""