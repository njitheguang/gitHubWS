Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> list1 = [123]
>>> list2 = [234]
>>> list1 > list2
False
>>> list1 = [123,456]
>>> list2 = [234,123]
>>> list1 > list2
False
>>> list3 = [123,456]
>>> (list1 < list2) and (list1 == list3)
True
>>> list4 = list1 + list2
>>> list4
[123, 456, 234, 123]
>>> list1 + '小甲鱼'
Traceback (most recent call last):
  File "<pyshell#10>", line 1, in <module>
    list1 + '小甲鱼'
TypeError: can only concatenate list (not "str") to list
>>> list3 * 3
[123, 456, 123, 456, 123, 456]
>>> list3 *=3
>>> list3
[123, 456, 123, 456, 123, 456]
>>> list3 *= 5
>>> list3
[123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456]
>>> 123 in list3
True
>>> '小甲鱼' not in list3
True
>>> 123 not in list3
False
>>> list5 = [123,['小甲鱼','牡丹'],456]
>>> ‘小甲鱼' in list5
SyntaxError: invalid character in identifier
>>> '小甲鱼' in list5
False
>>> '小甲鱼' in list5[1]
True
>>> list5[1][1]
'牡丹'
>>> dir(list)
['__add__', '__class__', '__contains__', '__delattr__', '__delitem__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__gt__', '__hash__', '__iadd__', '__imul__', '__init__', '__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__mul__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__reversed__', '__rmul__', '__setattr__', '__setitem__', '__sizeof__', '__str__', '__subclasshook__', 'append', 'clear', 'copy', 'count', 'extend', 'index', 'insert', 'pop', 'remove', 'reverse', 'sort']
>>> list3.count(123)
15
>>> list3.index(123)
0
>>> list3.index(123,3,7)
4
>>> list3.reverse()
>>> list3
[456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123, 456, 123]
>>> list6 = [4,7,5,1,9,23,32,8]
>>> list6.sort()
>>> list6
[1, 4, 5, 7, 8, 9, 23, 32]
>>> list6.reverse()
>>> list6
[32, 23, 9, 8, 7, 5, 4, 1]
>>> list6.reverse()
>>> list6
[1, 4, 5, 7, 8, 9, 23, 32]
>>> list6.sort[reverse=True]
SyntaxError: invalid syntax
>>> list6.sort(reverse=True)
>>> list6
[32, 23, 9, 8, 7, 5, 4, 1]
>>> list7 = list6[:]
>>> list7
[32, 23, 9, 8, 7, 5, 4, 1]
>>> list8 = list6
>>> list8
[32, 23, 9, 8, 7, 5, 4, 1]
>>> list6.sort()
>>> list6
[1, 4, 5, 7, 8, 9, 23, 32]
>>> list8
[1, 4, 5, 7, 8, 9, 23, 32]
>>> list7
[32, 23, 9, 8, 7, 5, 4, 1]
>>> 
