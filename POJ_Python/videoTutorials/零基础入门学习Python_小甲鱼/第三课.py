Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> teacher = "子煜"
>>> print(teacher)
子煜
>>> teacher = "老子煜"
>>> print(teacher)
老子煜
>>> first = 3
>>> second = 8
>>> third = first + second
>>> print(third)
11
>>> myteacher = "小子煜"
>>> yourteacher = "黑夜"
>>> ourteacher = myteacher + yourteacher
>>> print(ourteacher)
小子煜黑夜
>>> fishc
Traceback (most recent call last):
  File "<pyshell#12>", line 1, in <module>
    fishc
NameError: name 'fishc' is not defined
>>> first
3
>>> 5 + 8
13
>>> '5' + '8'
'58'
>>> ‘Let\'s go'
SyntaxError: invalid character in identifier
>>> "Let\'s go“
SyntaxError: EOL while scanning string literal
>>> "Let\'s go"
"Let's go"
>>> str = 'C:\now'
>>> print(str)
C:
ow
>>> str
'C:\now'
>>> str = 'C:\\now'
>>> print(str)
C:\now
>>> str
'C:\\now'
>>> str = r'C:\now'
>>> str
'C:\\now'
>>> print(str)
C:\now
>>> str = r'C:\now\fishc\a'
>>> str
'C:\\now\\fishc\\a'
>>> print(str)
C:\now\fishc\a
>>> str = r'C:\now\finsch\a\'
SyntaxError: EOL while scanning string literal
>>> str = """我爱中国
我爱中国
爱中过
爱爱
AIIB
爱中国！！！"""
>>> str
'我爱中国\n我爱中国\n爱中过\n爱爱\nAIIB\n爱中国！！！'
>>> print(str)
我爱中国
我爱中国
爱中过
爱爱
AIIB
爱中国！！！
>>> 
