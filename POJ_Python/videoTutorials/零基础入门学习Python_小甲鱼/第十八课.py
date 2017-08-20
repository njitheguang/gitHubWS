Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> def MyFirstFunction(name):
	'函数定义过程中的name是叫形参'
	#因为ta只是一个形式，表示占据一个参数位置
	print('传递进来的' + name + '叫做实参，因为ta是具体的参数值！')

	
>>> MyFirstFunction()
Traceback (most recent call last):
  File "<pyshell#5>", line 1, in <module>
    MyFirstFunction()
TypeError: MyFirstFunction() missing 1 required positional argument: 'name'
>>> MyFirstFunction('小子煜')
传递进来的小子煜叫做实参，因为ta是具体的参数值！
>>> MyFirstFunction.__doc__
'函数定义过程中的name是叫形参'
>>> help(MyFirstFunction)
Help on function MyFirstFunction in module __main__:

MyFirstFunction(name)
    函数定义过程中的name是叫形参

>>> print.__doc__
"print(value, ..., sep=' ', end='\\n', file=sys.stdout, flush=False)\n\nPrints the values to a stream, or to sys.stdout by default.\nOptional keyword arguments:\nfile:  a file-like object (stream); defaults to the current sys.stdout.\nsep:   string inserted between values, default a space.\nend:   string appended after the last value, default a newline.\nflush: whether to forcibly flush the stream."
>>> help(print)
Help on built-in function print in module builtins:

print(...)
    print(value, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
    
    Prints the values to a stream, or to sys.stdout by default.
    Optional keyword arguments:
    file:  a file-like object (stream); defaults to the current sys.stdout.
    sep:   string inserted between values, default a space.
    end:   string appended after the last value, default a newline.
    flush: whether to forcibly flush the stream.

>>> def SaySome(name,words):
	print(name + '->' + words)

	
>>> SaySome('小子煜','让编程改变世界！')
小子煜->让编程改变世界！
>>> SaySome('让编程改变世界！','小子煜')
让编程改变世界！->小子煜
>>> SaySome(words='让编程改变世界！',name='小子煜')
小子煜->让编程改变世界！
>>> def SaySome(name='小子煜',words='让编程改变世界!'):
	print(name + '->' + words)

	
>>> SaySome()
小子煜->让编程改变世界!
>>> SaySome('苍井空')
苍井空->让编程改变世界!
>>> SaySome('苍井空','我脱光衣服躺在镜头前，是为了生存，而你衣冠楚楚的站在镜头前，却是为了私欲和欺骗!')
苍井空->我脱光衣服躺在镜头前，是为了生存，而你衣冠楚楚的站在镜头前，却是为了私欲和欺骗!
>>> def test(*params):
	print('参数的长度是：',len(params));
	print('第二个参数是：',params[1]);

	
>>> test(1,'小鱼',3.14,5,6,7,8)
参数的长度是： 7
第二个参数是： 小鱼
>>> def test(*params,exp):
	print('参数的长度是：',len(params),exp);
	print('第二个参数是：',params[1]);

	
>>> test(1,'小鱼',3.14,5,6,7,exp = 8)
参数的长度是： 6 8
第二个参数是： 小鱼
>>> def test(*params,exp=8):
	print('参数的长度是：',len(params),exp);
	print('第二个参数是：',params[1]);

	
>>> test(1,'小鱼',3.14,5,6,7,8)
参数的长度是： 7 8
第二个参数是： 小鱼
>>> 
