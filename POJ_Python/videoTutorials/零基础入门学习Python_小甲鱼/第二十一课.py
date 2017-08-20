Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> def ds(x):
	return 2*x + 1

>>> ds(5)
11
>>> lambda x : 2 * x + 1
<function <lambda> at 0x0000000002DF9BF8>
>>> g = lambda x : 2 * x + 1
>>> g(5)
11
>>> def add(x,y):
	return x + y

>>> add(3,4)
7
>>> lambda x, y : x + y
<function <lambda> at 0x0000000002DF9D08>
>>> g = lambda x, y : x + y
>>> g(3,4）
  
SyntaxError: invalid character in identifier
>>> g(3, 4)
7
>>> help(filter)
Help on class filter in module builtins:

class filter(object)
 |  filter(function or None, iterable) --> filter object
 |  
 |  Return an iterator yielding those items of iterable for which function(item)
 |  is true. If function is None, return the items that are true.
 |  
 |  Methods defined here:
 |  
 |  __getattribute__(self, name, /)
 |      Return getattr(self, name).
 |  
 |  __iter__(self, /)
 |      Implement iter(self).
 |  
 |  __new__(*args, **kwargs) from builtins.type
 |      Create and return a new object.  See help(type) for accurate signature.
 |  
 |  __next__(self, /)
 |      Implement next(self).
 |  
 |  __reduce__(...)
 |      Return state information for pickling.

>>> filter(None,[1, 0, False, True])
<filter object at 0x0000000002E041D0>
>>> list(filter(None,[1,0,False,True])
     )
[1, True]
>>> list(filter(None,[1,0,False,True]))
[1, True]
>>> def odd(x):
	return x % 2

>>> temp = range(10)
>>> show = filter(odd,temp)
>>> list(show)
[1, 3, 5, 7, 9]
>>> list(filter(lambda x : x % 2,range(10)))
[1, 3, 5, 7, 9]
>>> help(map)
Help on class map in module builtins:

class map(object)
 |  map(func, *iterables) --> map object
 |  
 |  Make an iterator that computes the function using arguments from
 |  each of the iterables.  Stops when the shortest iterable is exhausted.
 |  
 |  Methods defined here:
 |  
 |  __getattribute__(self, name, /)
 |      Return getattr(self, name).
 |  
 |  __iter__(self, /)
 |      Implement iter(self).
 |  
 |  __new__(*args, **kwargs) from builtins.type
 |      Create and return a new object.  See help(type) for accurate signature.
 |  
 |  __next__(self, /)
 |      Implement next(self).
 |  
 |  __reduce__(...)
 |      Return state information for pickling.

>>> list(map(lambda x : x * 2，range(10)))
SyntaxError: invalid character in identifier
>>> list(map(lambda x : x * 2, range(10)))
[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
>>> 
