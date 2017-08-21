Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> def recursion():
	return recursion()

>>> recursion()
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    recursion()
  File "<pyshell#2>", line 2, in recursion
    return recursion()
  File "<pyshell#2>", line 2, in recursion
    return recursion()
  File "<pyshell#2>", line 2, in recursion
    return recursion()
  [Previous line repeated 990 more times]
RecursionError: maximum recursion depth exceeded
>>> import sys
>>> sys.setrecursionlimit(1000000)
>>> 
 RESTART: E:/GitRepertory/gitHubWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第二十二课_01.py 
请输入一个正整数：5
5 的阶乘是：120
>>> 
 RESTART: E:/GitRepertory/gitHubWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第二十二课_01.py 
请输入一个正整数：10
10 的阶乘是：3628800
>>> 
 RESTART: E:/GitRepertory/gitHubWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第二十二课_02.py 
请输入一个正整数：5
5 的阶乘是：120
>>> 
 RESTART: E:/GitRepertory/gitHubWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第二十二课_02.py 
请输入一个正整数：10
10 的阶乘是：3628800
>>> 
