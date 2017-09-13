Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> num = {}
>>> type(num)
<class 'dict'>
>>> num2 = {1,2,3,4,5}
>>> type(num2)
<class 'set'>
>>> num2 = {1,2,3,4,5,5,4,3,2}
>>> num2
{1, 2, 3, 4, 5}
>>> num2[2]
Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    num2[2]
TypeError: 'set' object does not support indexing
>>> set1 = set([1,2,3,4,5,5])
>>> set1
{1, 2, 3, 4, 5}
>>> num1 = [1,2,3,4,5,5,3,1,0]
>>> temp=[]
>>> for each in num1:
	if each not in temp:
		temp.append(each）
			    
SyntaxError: invalid character in identifier
>>> for each in num1:
	if each not in temp:
		temp.append(each)

		
>>> temp
[1, 2, 3, 4, 5, 0]
>>> num1 = list(set(num1))
>>> num1
[0, 1, 2, 3, 4, 5]
>>> 
