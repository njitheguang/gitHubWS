Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> print("I love fishc.com"）
      
SyntaxError: invalid character in identifier
>>> print("I love fishc.com")
I love fishc.com
>>> print "I love fishc.com"
SyntaxError: Missing parentheses in call to 'print'
>>> printf("I love fishc.oom")
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    printf("I love fishc.oom")
NameError: name 'printf' is not defined
>>> printf("I love fishc.com"）;
       
SyntaxError: invalid character in identifier
>>> printf("I love fishc.com")
Traceback (most recent call last):
  File "<pyshell#5>", line 1, in <module>
    printf("I love fishc.com")
NameError: name 'printf' is not defined
>>> print(5+3)
8
>>> 5+3
8
>>> 123456890987654321*1234567890987654321
152415913534521142967535437789971041
>>> print("well water" + "river")
well waterriver
>>> print("well water" + " river")
well water river
>>> print("I love fishc.com" * 8)
I love fishc.comI love fishc.comI love fishc.comI love fishc.comI love fishc.comI love fishc.comI love fishc.comI love fishc.com
>>> print("I love fishc.com/n" * 8)
I love fishc.com/nI love fishc.com/nI love fishc.com/nI love fishc.com/nI love fishc.com/nI love fishc.com/nI love fishc.com/nI love fishc.com/n
>>> print("I love fishc.com\n" * 8)
I love fishc.com
I love fishc.com
I love fishc.com
I love fishc.com
I love fishc.com
I love fishc.com
I love fishc.com
I love fishc.com

>>> print("I love fishc.com\n" + 8)
Traceback (most recent call last):
  File "<pyshell#14>", line 1, in <module>
    print("I love fishc.com\n" + 8)
TypeError: must be str, not int
>>> 
