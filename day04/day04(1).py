# -*- coding: utf-8 -*-
"""
Created on Tue Jun  5 16:22:27 2018

@author: lenovo
"""

url = "http://www.gaokaopai.com/university-ajaxGetMajor.html"

import urllib.request as r
params = "id=675&type=2&city=51&state=1".encode()
#header,body,url被包装在Request中
headers = {'X-Requested-With':'XMLHttpRequest',
           'Connection':'keep-alive',
           'User-Agent':'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.104 Safari/537.36 Core/1.53.2372.400 QQBrowser/9.5.10771.400'
        }
req = r.Request(url,params,headers)#ctrl+i
data = r.urlopen(req).read().decode('utf-8','ignore')
print(data)
open('./gaokaopai.txt','a',encoding = 'utf-8').write(data)

import json
data1 = json.loads(data)