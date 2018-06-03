# -*- coding: utf-8 -*-
"""
Created on Sat Jun  2 15:14:50 2018
"地址"："江西省九江市XXX"
"手机号码"："17311681197"
"寄信人"："none"
@author: lenovo
"""
msg = {"地址":"江西省九江市XXX",
      "手机号码":"17311681197",
      "寄信人":"none" }

print(msg["地址"])
print(msg["手机号码"])
print(msg["寄信人"])

#写一个字典类型，表示一个人的基本信息
#姓名，身高，性别，年龄

mes = {"name":"zq",
       "height":"170cm",
       "sex":"men",
       "age":"1",
       "telephone number":"17311681197"
       }
print(mes["name"])
print(mes["height"])
print(mes["sex"])
print(mes["age"])
print(mes["telephone number"])

"""
dict(key:value,key,value......)
"""
xzq = {"name":"Xuezhiqian(joker)",
       "songs":["actor","flowers and child"],
       "nickname":"xiaoxue",
       "girlfriends":[1,2,3,4]}
songs = xzq['songs']
print(songs)
print('sum songs'+str(len(songs)))#计算歌曲的总数
print(max(xzq['girlfriends']))#计算girlfriend的最大值。

weather = {"weeks":['mon','tue','wes','tus','fri','sat','sun'],
                "weather conditions":['cloudy','sunny','clear to overcast','cloudy','cludy to heavy rain','rain','rain'],
                "temperture":['28/18℃','30/19℃','31/22℃','30/22℃','27/18℃','27/20℃','24/20℃'] }
wc = weather['weather conditions']
print(wc)
print('sum weather'+str(len(wc)))
print(max(weather['temperture']))