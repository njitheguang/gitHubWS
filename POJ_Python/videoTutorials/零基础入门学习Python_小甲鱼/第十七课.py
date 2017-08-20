Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> def MyFirstFunction():
	print('这是我创建的第一个函数！')
	print('我表示很激动.....')
	print('在此，我要感谢TVB,感谢CCAV,感谢小子煜，感谢各位友友...!')

	
>>> MyFirstFunction()
这是我创建的第一个函数！
我表示很激动.....
在此，我要感谢TVB,感谢CCAV,感谢小子煜，感谢各位友友...!
>>> MySecondFunction()
Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    MySecondFunction()
NameError: name 'MySecondFunction' is not defined
>>> MyFirstFunction()
这是我创建的第一个函数！
我表示很激动.....
在此，我要感谢TVB,感谢CCAV,感谢小子煜，感谢各位友友...!
>>> MyFirstFunction()
这是我创建的第一个函数！
我表示很激动.....
在此，我要感谢TVB,感谢CCAV,感谢小子煜，感谢各位友友...!
>>> MyFirstFunction()
这是我创建的第一个函数！
我表示很激动.....
在此，我要感谢TVB,感谢CCAV,感谢小子煜，感谢各位友友...!
>>> def MySecondFunction(name):
	print(name + '我爱你!')

	
>>> MySecondFunction()
Traceback (most recent call last):
  File "<pyshell#13>", line 1, in <module>
    MySecondFunction()
TypeError: MySecondFunction() missing 1 required positional argument: 'name'
>>> MySecondFunction('小子煜')
小子煜我爱你!
>>> MySecondFunction('胡洁洁')
胡洁洁我爱你!
>>> def add(num1,num2):
	result = num1 + num2
	print(result)

	
>>> add(1,2)
3
>>> def add(num1,num2):
	return (num1 + num2)

>>> print(add(5,6))
11
>>> 
