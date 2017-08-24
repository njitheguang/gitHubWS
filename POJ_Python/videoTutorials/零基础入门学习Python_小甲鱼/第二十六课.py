Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> dict1 = {}
>>> dict1.fromkeys((1,2,3))
{1: None, 2: None, 3: None}
>>> dict1.fromkeys((1,2,3),'Number')
{1: 'Number', 2: 'Number', 3: 'Number'}
>>> dict1.fromkeys((1,2,3),('one','two','three'))
{1: ('one', 'two', 'three'), 2: ('one', 'two', 'three'), 3: ('one', 'two', 'three')}
>>> dict1.fromkeys((1,3),'数字')
{1: '数字', 3: '数字'}
>>> dict1 = dict1.fromkeys(range(32),'赞')
>>> dict1
{0: '赞', 1: '赞', 2: '赞', 3: '赞', 4: '赞', 5: '赞', 6: '赞', 7: '赞', 8: '赞', 9: '赞', 10: '赞', 11: '赞', 12: '赞', 13: '赞', 14: '赞', 15: '赞', 16: '赞', 17: '赞', 18: '赞', 19: '赞', 20: '赞', 21: '赞', 22: '赞', 23: '赞', 24: '赞', 25: '赞', 26: '赞', 27: '赞', 28: '赞', 29: '赞', 30: '赞', 31: '赞'}
>>> for eachkey in dict1.keys():
	print(eachkey)

	
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
>>> for eachValue in dict1.values():
	print(eachValue)

	
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
赞
>>> for eachItem in dict1.items():
	print(eachItme)

	
Traceback (most recent call last):
  File "<pyshell#15>", line 2, in <module>
    print(eachItme)
NameError: name 'eachItme' is not defined
>>> for eachItem in dict1.items():
	print(eachItem)

	
(0, '赞')
(1, '赞')
(2, '赞')
(3, '赞')
(4, '赞')
(5, '赞')
(6, '赞')
(7, '赞')
(8, '赞')
(9, '赞')
(10, '赞')
(11, '赞')
(12, '赞')
(13, '赞')
(14, '赞')
(15, '赞')
(16, '赞')
(17, '赞')
(18, '赞')
(19, '赞')
(20, '赞')
(21, '赞')
(22, '赞')
(23, '赞')
(24, '赞')
(25, '赞')
(26, '赞')
(27, '赞')
(28, '赞')
(29, '赞')
(30, '赞')
(31, '赞')
>>> print(dict1[31])
赞
>>> print(dict1[32])
Traceback (most recent call last):
  File "<pyshell#20>", line 1, in <module>
    print(dict1[32])
KeyError: 32
>>> dict.get(32)
Traceback (most recent call last):
  File "<pyshell#21>", line 1, in <module>
    dict.get(32)
TypeError: descriptor 'get' requires a 'dict' object but received a 'int'
>>> dict1.get(32)
>>> print(dict1.get(32))
None
>>> dict1.get(32,'抹油')
'抹油'
>>> dict1.get(31.'抹油')
SyntaxError: invalid syntax
>>> dict1.get(31,'抹油')
'赞'
>>> 31 in dict1
True
>>> 32 in dict1
False
>>> dict1
{0: '赞', 1: '赞', 2: '赞', 3: '赞', 4: '赞', 5: '赞', 6: '赞', 7: '赞', 8: '赞', 9: '赞', 10: '赞', 11: '赞', 12: '赞', 13: '赞', 14: '赞', 15: '赞', 16: '赞', 17: '赞', 18: '赞', 19: '赞', 20: '赞', 21: '赞', 22: '赞', 23: '赞', 24: '赞', 25: '赞', 26: '赞', 27: '赞', 28: '赞', 29: '赞', 30: '赞', 31: '赞'}
>>> dict1.clear()
>>> dict1
{}
>>> dict1 = {}
>>> dict1
{}
>>> a = {'姓名':'小甲鱼'}
>>> b = a
>>> b
{'姓名': '小甲鱼'}
>>> a = {}
>>> a
{}
>>> b
{'姓名': '小甲鱼'}
>>> a = b
>>> a
{'姓名': '小甲鱼'}
>>> b
{'姓名': '小甲鱼'}
>>> a.clear()
>>> a
{}
>>> b
{}
>>> dir(dict)
['__class__', '__contains__', '__delattr__', '__delitem__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__gt__', '__hash__', '__init__', '__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__setitem__', '__sizeof__', '__str__', '__subclasshook__', 'clear', 'copy', 'fromkeys', 'get', 'items', 'keys', 'pop', 'popitem', 'setdefault', 'update', 'values']
>>> a = {1:'one',2:'two',3:'three'}
>>> b = a.copy()
>>> c =a
>>> c
{1: 'one', 2: 'two', 3: 'three'}
>>> a
{1: 'one', 2: 'two', 3: 'three'}
>>> b
{1: 'one', 2: 'two', 3: 'three'}
>>> id(a)
45902584
>>> id(b)
45927088
>>> id(c)
45902584
>>> c[4]='four'
>>> c
{1: 'one', 2: 'two', 3: 'three', 4: 'four'}
>>> a
{1: 'one', 2: 'two', 3: 'three', 4: 'four'}
>>> b
{1: 'one', 2: 'two', 3: 'three'}
>>> a.pop(2)
'two'
>>> a
{1: 'one', 3: 'three', 4: 'four'}
>>> a.popitem()
(4, 'four')
>>> a.setdefault('小白')
>>> a
{1: 'one', 3: 'three', '小白': None}
>>> a.setdefault(5,'five')
'five'
>>> a
{1: 'one', 3: 'three', '小白': None, 5: 'five'}
>>> b = {'小白':'狗'}
>>> a.update(b)
>>> a
{1: 'one', 3: 'three', '小白': '狗', 5: 'five'}
>>> 
