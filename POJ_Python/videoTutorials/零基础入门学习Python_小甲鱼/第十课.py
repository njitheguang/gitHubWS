Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> member = ['小甲鱼','小布丁','黑夜','迷途','易静']
>>> member
['小甲鱼', '小布丁', '黑夜', '迷途', '易静']
>>> number = [1, 2, 3, 4, 5]
>>> number
[1, 2, 3, 4, 5]
>>> mix = [1, '小甲鱼', 3.14, [1, 2, 3, 4]]
>>> mix
[1, '小甲鱼', 3.14, [1, 2, 3, 4]]
>>> empty = []
>>> empty
[]
>>> member.append("福禄娃娃")
>>> member
['小甲鱼', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃']
>>> len(member)
6
>>> member.append('竹林小溪', "Cray迷恋")
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    member.append('竹林小溪', "Cray迷恋")
TypeError: append() takes exactly one argument (2 given)
>>> member.extend("竹林小溪", "Cray迷恋")
Traceback (most recent call last):
  File "<pyshell#12>", line 1, in <module>
    member.extend("竹林小溪", "Cray迷恋")
TypeError: extend() takes exactly one argument (2 given)
>>> member.extend(["竹林小溪", "Cray迷恋"])
>>> member
['小甲鱼', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> len(member)
8
>>> member.insert(1,"牡丹")
>>> member
['小甲鱼', '牡丹', '小布丁', '黑夜', '迷途', '易静', '福禄娃娃', '竹林小溪', 'Cray迷恋']
>>> 
