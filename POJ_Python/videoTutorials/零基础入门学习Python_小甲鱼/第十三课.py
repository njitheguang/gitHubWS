Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> tuple1 = (1,2,3,4,5,6,7,8)
>>> tuple1
(1, 2, 3, 4, 5, 6, 7, 8)
>>> tuple[1]
Traceback (most recent call last):
  File "<pyshell#2>", line 1, in <module>
    tuple[1]
TypeError: 'type' object is not subscriptable
>>> tuple1[1]
2
>>> tuple1[5:]
(6, 7, 8)
>>> tuple1[:5]
(1, 2, 3, 4, 5)
>>> tuple2 = tuple1[:]
>>> tuple2
(1, 2, 3, 4, 5, 6, 7, 8)
>>> tuple1[1] = 3
Traceback (most recent call last):
  File "<pyshell#8>", line 1, in <module>
    tuple1[1] = 3
TypeError: 'tuple' object does not support item assignment
>>> temp = (1)
>>> type(temp)
<class 'int'>
>>> type(tuple1)
<class 'tuple'>
>>> temp2 = 2, 3 ,4
>>> type(temp2)
<class 'tuple'>
>>> temp = []
>>> type(temp)
<class 'list'>
>>> temp = ()
>>> type(temp)
<class 'tuple'>
>>> temp = (1,)
>>> type(temp)
<class 'tuple'>
>>> temp=1,
>>> type(temp)
<class 'tuple'>
>>> 8 * (8)
64
>>> 8 * (8,)
(8, 8, 8, 8, 8, 8, 8, 8)
>>> temp = ("小甲鱼","黑夜","迷途","小布丁")
>>> temp = temp[:2] + ("易静",) + temp[2:]
>>> temp
('小甲鱼', '黑夜', '易静', '迷途', '小布丁')
>>> del temp
>>> temp
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    temp
NameError: name 'temp' is not defined
>>> 
