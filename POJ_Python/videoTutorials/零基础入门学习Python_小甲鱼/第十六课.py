Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> help(list)
Help on class list in module builtins:

class list(object)
 |  list() -> new empty list
 |  list(iterable) -> new list initialized from iterable's items
 |  
 |  Methods defined here:
 |  
 |  __add__(self, value, /)
 |      Return self+value.
 |  
 |  __contains__(self, key, /)
 |      Return key in self.
 |  
 |  __delitem__(self, key, /)
 |      Delete self[key].
 |  
 |  __eq__(self, value, /)
 |      Return self==value.
 |  
 |  __ge__(self, value, /)
 |      Return self>=value.
 |  
 |  __getattribute__(self, name, /)
 |      Return getattr(self, name).
 |  
 |  __getitem__(...)
 |      x.__getitem__(y) <==> x[y]
 |  
 |  __gt__(self, value, /)
 |      Return self>value.
 |  
 |  __iadd__(self, value, /)
 |      Implement self+=value.
 |  
 |  __imul__(self, value, /)
 |      Implement self*=value.
 |  
 |  __init__(self, /, *args, **kwargs)
 |      Initialize self.  See help(type(self)) for accurate signature.
 |  
 |  __iter__(self, /)
 |      Implement iter(self).
 |  
 |  __le__(self, value, /)
 |      Return self<=value.
 |  
 |  __len__(self, /)
 |      Return len(self).
 |  
 |  __lt__(self, value, /)
 |      Return self<value.
 |  
 |  __mul__(self, value, /)
 |      Return self*value.n
 |  
 |  __ne__(self, value, /)
 |      Return self!=value.
 |  
 |  __new__(*args, **kwargs) from builtins.type
 |      Create and return a new object.  See help(type) for accurate signature.
 |  
 |  __repr__(self, /)
 |      Return repr(self).
 |  
 |  __reversed__(...)
 |      L.__reversed__() -- return a reverse iterator over the list
 |  
 |  __rmul__(self, value, /)
 |      Return self*value.
 |  
 |  __setitem__(self, key, value, /)
 |      Set self[key] to value.
 |  
 |  __sizeof__(...)
 |      L.__sizeof__() -- size of L in memory, in bytes
 |  
 |  append(...)
 |      L.append(object) -> None -- append object to end
 |  
 |  clear(...)
 |      L.clear() -> None -- remove all items from L
 |  
 |  copy(...)
 |      L.copy() -> list -- a shallow copy of L
 |  
 |  count(...)
 |      L.count(value) -> integer -- return number of occurrences of value
 |  
 |  extend(...)
 |      L.extend(iterable) -> None -- extend list by appending elements from the iterable
 |  
 |  index(...)
 |      L.index(value, [start, [stop]]) -> integer -- return first index of value.
 |      Raises ValueError if the value is not present.
 |  
 |  insert(...)
 |      L.insert(index, object) -- insert object before index
 |  
 |  pop(...)
 |      L.pop([index]) -> item -- remove and return item at index (default last).
 |      Raises IndexError if list is empty or index is out of range.
 |  
 |  remove(...)
 |      L.remove(value) -> None -- remove first occurrence of value.
 |      Raises ValueError if the value is not present.
 |  
 |  reverse(...)
 |      L.reverse() -- reverse *IN PLACE*
 |  
 |  sort(...)
 |      L.sort(key=None, reverse=False) -> None -- stable sort *IN PLACE*
 |  
 |  ----------------------------------------------------------------------
 |  Data and other attributes defined here:
 |  
 |  __hash__ = None

>>> a = list()
>>> a
[]
>>> b = 'I love FishC.com'
>>> b = list(b)
>>> b
['I', ' ', 'l', 'o', 'v', 'e', ' ', 'F', 'i', 's', 'h', 'C', '.', 'c', 'o', 'm']
>>> c = (1,1,2,3,5,8,13,21,34)
>>> c = list(c)
>>> c
[1, 1, 2, 3, 5, 8, 13, 21, 34]
>>> help(tuple)
Help on class tuple in module builtins:

class tuple(object)
 |  tuple() -> empty tuple
 |  tuple(iterable) -> tuple initialized from iterable's items
 |  
 |  If the argument is a tuple, the return value is the same object.
 |  
 |  Methods defined here:
 |  
 |  __add__(self, value, /)
 |      Return self+value.
 |  
 |  __contains__(self, key, /)
 |      Return key in self.
 |  
 |  __eq__(self, value, /)
 |      Return self==value.
 |  
 |  __ge__(self, value, /)
 |      Return self>=value.
 |  
 |  __getattribute__(self, name, /)
 |      Return getattr(self, name).
 |  
 |  __getitem__(self, key, /)
 |      Return self[key].
 |  
 |  __getnewargs__(...)
 |  
 |  __gt__(self, value, /)
 |      Return self>value.
 |  
 |  __hash__(self, /)
 |      Return hash(self).
 |  
 |  __iter__(self, /)
 |      Implement iter(self).
 |  
 |  __le__(self, value, /)
 |      Return self<=value.
 |  
 |  __len__(self, /)
 |      Return len(self).
 |  
 |  __lt__(self, value, /)
 |      Return self<value.
 |  
 |  __mul__(self, value, /)
 |      Return self*value.n
 |  
 |  __ne__(self, value, /)
 |      Return self!=value.
 |  
 |  __new__(*args, **kwargs) from builtins.type
 |      Create and return a new object.  See help(type) for accurate signature.
 |  
 |  __repr__(self, /)
 |      Return repr(self).
 |  
 |  __rmul__(self, value, /)
 |      Return self*value.
 |  
 |  count(...)
 |      T.count(value) -> integer -- return number of occurrences of value
 |  
 |  index(...)
 |      T.index(value, [start, [stop]]) -> integer -- return first index of value.
 |      Raises ValueError if the value is not present.

>>> len(sub)
Traceback (most recent call last):
  File "<pyshell#10>", line 1, in <module>
    len(sub)
NameError: name 'sub' is not defined
>>> len(a)
0
>>> len(b)
16
>>> len(c)
9
>>> max(1,2,3,4,5)
5
>>> max(b)
'v'
>>> numbers = [1,18,13,0,-98,34,54,76,92]
>>> max(number)
Traceback (most recent call last):
  File "<pyshell#17>", line 1, in <module>
    max(number)
NameError: name 'number' is not defined
>>> max(numbers)
92
>>> min(numbers)
-98
>>> chars = '1234567890'
>>> min(chars)
'0'
>>> tuple1 = (1,2,3,4,5,6,7,8,9,0)
>>> max(tuple1)
9
>>> numbers.append('a')
>>> numbers
[1, 18, 13, 0, -98, 34, 54, 76, 92, 'a']
>>> max(numbers)
Traceback (most recent call last):
  File "<pyshell#26>", line 1, in <module>
    max(numbers)
TypeError: '>' not supported between instances of 'str' and 'int'
>>> max(tuple1)
9
>>> tuple2 = (3.1,2.3,3.4)
>>> sum(tuple2)
8.8
>>> sum(numbers)
Traceback (most recent call last):
  File "<pyshell#30>", line 1, in <module>
    sum(numbers)
TypeError: unsupported operand type(s) for +: 'int' and 'str'
>>> numbers.pop()
'a'
>>> numbers
[1, 18, 13, 0, -98, 34, 54, 76, 92]
>>> sum(numbers)
190
>>> sum(numbers,8)
198
>>> chars
'1234567890'
>>> sum(chars)
Traceback (most recent call last):
  File "<pyshell#36>", line 1, in <module>
    sum(chars)
TypeError: unsupported operand type(s) for +: 'int' and 'str'
>>> sorted()
Traceback (most recent call last):
  File "<pyshell#37>", line 1, in <module>
    sorted()
TypeError: Function takes at least 1 positional arguments (0 given)
>>> sorted(numbers)
[-98, 0, 1, 13, 18, 34, 54, 76, 92]
>>> reversed()
Traceback (most recent call last):
  File "<pyshell#39>", line 1, in <module>
    reversed()
TypeError: reversed expected 1 arguments, got 0
>>> reversed(numbers)
<list_reverseiterator object at 0x0000000002E92C18>
>>> list(reversed(numbers))
[92, 76, 54, 34, -98, 0, 13, 18, 1]
>>> enumerate()
Traceback (most recent call last):
  File "<pyshell#42>", line 1, in <module>
    enumerate()
TypeError: Required argument 'iterable' (pos 1) not found
>>> enumerate(numbers)
<enumerate object at 0x0000000002ACB678>
>>> list(enumerate(numbers))
[(0, 1), (1, 18), (2, 13), (3, 0), (4, -98), (5, 34), (6, 54), (7, 76), (8, 92)]
>>> zip
<class 'zip'>
>>> a = {1,2,3,4,5,6,7,8}
>>> b = {4,5,6,7,8}
>>> zip(a,b)
<zip object at 0x0000000002BEC488>
>>> list(zip(a,b))
[(1, 4), (2, 5), (3, 6), (4, 7), (5, 8)]
>>> 
