# -*- coding: utf-8 -*-
"""
Created on Sun Jun  3 10:23:44 2018

@author: lenovo
"""

import urllib.request as r
city = input("欢迎使用，本系统可以查询未来五天的天气情况，请输入你需要查询的城市：")
address = 'http://api.openweathermap.org/data/2.5/forecast?q={}&mode=json&lang=zh_cn&&APPID=6a67ed641c0fda8b69715c43518b6996&units=metric'
info = r.urlopen(address.format(city)).read().decode('utf-8','ignore')
#print(info)

import json
data = json.loads(info)
print('你查询的城市是'+city)

print('今天的时间是：'+data['list'][0]['dt_txt'])
print('今天的天气是：'+data['list'][0]['weather'][0]['description'])
print('今天的温度是：'+str(data['list'][0]['main']['temp']))
print('')
print('明天的时间是：'+data['list'][8]['dt_txt'])
print('明天的天气是：'+data['list'][8]['weather'][0]['description'])
print('明天的温度是：'+str(data['list'][8]['main']['temp']))
print('')
print('后天的时间是：'+data['list'][16]['dt_txt'])
print('后天的天气是：'+data['list'][16]['weather'][0]['description'])
print('后天的温度是：'+str(data['list'][16]['main']['temp']))
print('')
print('第四天的时间是：'+data['list'][24]['dt_txt'])
print('第四天的天气是：'+data['list'][24]['weather'][0]['description'])
print('第四天的温度是：'+str(data['list'][24]['main']['temp']))
print('')
print('第五天的时间是：'+data['list'][32]['dt_txt'])
print('第五天的天气是：'+data['list'][32]['weather'][0]['description'])
print('第五天的温度是：'+str(data['list'][32]['main']['temp']))