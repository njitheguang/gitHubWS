Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> member = ['小甲鱼', '牡丹', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> member[0]
'小甲鱼'
>>> member[1]
'牡丹'
>>> member[1] = temp
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    member[1] = temp
NameError: name 'temp' is not defined
>>> temp = member[0]
>>> member[0] = member[1]
>>> member = temp
>>> member
'小甲鱼'
>>> member = ['小甲鱼', '牡丹', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> temp = member[0]
>>> member[0] = member[1]
>>> member[1] = temp
>>> member
['牡丹', '小甲鱼', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> member.remove('易静')
>>> member
['牡丹', '小甲鱼', '小布丁', '黑夜', '迷途', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> member.remove('小鱼儿')
Traceback (most recent call last):
  File "<pyshell#15>", line 1, in <module>
    member.remove('小鱼儿')
ValueError: list.remove(x): x not in list
>>> del member[1]
>>> member
['牡丹', '小布丁', '黑夜', '迷途', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> member.pop()
'Cray迷恋'
>>> member
['牡丹', '小布丁', '黑夜', '迷途', '福禄娃娃', '竹林小溪']
>>> name = member.pop()
>>> name
'竹林小溪'
>>> member.pop[1]
Traceback (most recent call last):
  File "<pyshell#22>", line 1, in <module>
    member.pop[1]
TypeError: 'builtin_function_or_method' object is not subscriptable
>>> member.pop(1)
'小布丁'
>>> member
['牡丹', '黑夜', '迷途', '福禄娃娃']
>>> member[1:3]
['黑夜', '迷途']
>>> member
['牡丹', '黑夜', '迷途', '福禄娃娃']
>>> member[:3]
['牡丹', '黑夜', '迷途']
>>> member[1:]
['黑夜', '迷途', '福禄娃娃']
>>> member[]
SyntaxError: invalid syntax
>>> member[:]
['牡丹', '黑夜', '迷途', '福禄娃娃']
>>> member2 = member[:]
>>> member2
['牡丹', '黑夜', '迷途', '福禄娃娃']
>>> 
