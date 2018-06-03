# -*- coding: utf-8 -*-
"""
Created on Sun Jun  3 08:32:41 2018

@author: lenovo
"""



import urllib.request as r
print('当前城市的天气情况如下')
address = 'http://api.openweathermap.org/data/2.5/weather?q=chengdu&mode=json&units=metric&lang=zh_cn&APPID=6a67ed641c0fda8b69715c43518b6996'
info = r.urlopen(address).read().decode('utf-8','ignore')
#print(info)

import json
data = json.loads(info)
print('当前城市是chengdu')
print('今天的天气是：'+data['weather'][0]['description'])
print('今天的温度是：'+str(data['main']['temp']))