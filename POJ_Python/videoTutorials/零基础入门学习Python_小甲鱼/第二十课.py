Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> count =5
>>> def MyFun():
	count = 10
	print(count)

	
>>> MyFun()
10
>>> print(count)
5
>>> def MyFun():
	global count
	count = 10
	print(count)

	
>>> MyFun()
10
>>> print(count)
10
>>> def fun1()
SyntaxError: invalid syntax
>>> def fun1():
	print('fun1()正在被调用...')
	def fun2():
		print('fun2()正在被调用...')

		
>>> def fun1():
	print('fun1()正在被调用...')
	def fun2():
		print('fun2()正在被调用...')
		fun2()

		
>>> fun1()
fun1()正在被调用...
>>> def fun1():
	print('fun1()正在被调用...')
	def fun2():
		print('fun2()正在被调用...')
	\fun2()
	
SyntaxError: unexpected character after line continuation character
>>> def fun1():
	print('fun1()正在被调用...')
	def fun2():
		print('fun2()正在被调用...')
	fun2()

	
>>> fun1()
fun1()正在被调用...
fun2()正在被调用...
>>> fun2()
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    fun2()
NameError: name 'fun2' is not defined
>>> def funX(x):
	def funY(y):
		return x * y
	return funY

>>> i = funX(8)
>>> i
<function funX.<locals>.funY at 0x0000000002BE8158>
>>> type(i)
<class 'function'>
>>> i(5)
40
>>> funX(8)(5)
40
>>> funY(5)
Traceback (most recent call last):
  File "<pyshell#39>", line 1, in <module>
    funY(5)
NameError: name 'funY' is not defined
>>> def fun1():
	x = 5
	def fun2():
		x*=x
		return x
	return fun2

>>> fun1()
<function fun1.<locals>.fun2 at 0x0000000002BC9D08>
>>> def fun1():
	x = 5
	def fun2():
		x*=x
		return x
	return fun2()def fun1():
		x = 5
		def fun2():
			x*=x
			return x
		return fun2
	
SyntaxError: invalid syntax
>>> def fun1():
	x = 5
	def fun2():
		x*=x
		return x
	return fun2()

>>> fun1()
Traceback (most recent call last):
  File "<pyshell#51>", line 1, in <module>
    fun1()
  File "<pyshell#50>", line 6, in fun1
    return fun2()
  File "<pyshell#50>", line 4, in fun2
    x*=x
UnboundLocalError: local variable 'x' referenced before assignment
>>> def fun1():
	x = [5]
	def fun2():
		x[0]*=x[0]
		return x[0]
	return fun2()

>>> fun1()
25
>>> def fun1():
	x = 5
	def fun2():
		nonlocal x
		x*=x
		return x
	return fun2()

>>> fun1()
25
>>> 
