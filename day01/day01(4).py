# -*- coding: utf-8 -*-
"""
Created on Sat Jun  2 16:50:02 2018
#引用其它工具包
import 包名/类名
@author: lenovo
"""

import urllib.request as r
city = input("请输入城市拼音：")
address = 'http://api.openweathermap.org/data/2.5/weather?q={}&mode=json&units=metric&lang=zh_cn&APPID=6a67ed641c0fda8b69715c43518b6996'
info = r.urlopen(address.format(city)).read().decode('utf-8','ignore')
#print(info)

#json(dict)格式工具包
import json
data = json.loads(info)
print('今天天气是：'+data['weather'][0]['description'])
print('今天湿度是：'+str(data['main']['humidity']))
print('今天最低高温度是：'+str(data['main']['temp']))