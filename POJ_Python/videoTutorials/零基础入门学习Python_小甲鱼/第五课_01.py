Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> '520'+'1314'
'5201314'
>>> 520+1314
1834
>>> a = 0.00000000000000000000000000000025
>>> a
2.5e-31
>>> 150000000000
150000000000
>>> 1.5e11
150000000000.0
>>> 15e10
150000000000.0
>>> 1.5e4
15000.0
>>> True + True
2
>>> True + False
1
>>> True * False
0
>>> True / False
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    True / False
ZeroDivisionError: division by zero
>>> a = '520'
>>> b = int(a)
>>> b
520
>>> b = int('子煜')
Traceback (most recent call last):
  File "<pyshell#15>", line 1, in <module>
    b = int('子煜')
ValueError: invalid literal for int() with base 10: '子煜'
>>> a = 5.99
>>> c = int(a)
>>> c
5
>>> a='520'
>>> b = float(a)
>>> b
520.0
>>> a = 520
>>> b = float(a)
>>> b
520.0
>>> a = 5.99
>>> b = str(a)
>>> b
'5.99'
>>> c = str(5e19)
>>> c
'5e+19'
>>> str = "I Love ziyu.com"
>>> str
'I Love ziyu.com'
>>> c = str(5e19)
Traceback (most recent call last):
  File "<pyshell#32>", line 1, in <module>
    c = str(5e19)
TypeError: 'str' object is not callable
>>> a = '520'
>>> type(a)
<class 'str'>
>>> type(5.2)
<class 'float'>
>>> type（True)
SyntaxError: invalid character in identifier
>>> type(True)
<class 'bool'>
>>> type(5e15)
<class 'float'>
>>> a = "子煜"
>>> isinstance(a,str)
Traceback (most recent call last):
  File "<pyshell#40>", line 1, in <module>
    isinstance(a,str)
TypeError: isinstance() arg 2 must be a type or tuple of types
>>> 
