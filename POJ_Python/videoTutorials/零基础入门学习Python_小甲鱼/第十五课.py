Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> "{0} love {1}.{2}".format("I","FishC","com")
'I love FishC.com'
>>> "{a} love {b}.{c}".format(a="I",b="FishC",c="com")
'I love FishC.com'
>>> "{0} love {b}.{c}".format("I",b="FishC",c="com")
'I love FishC.com'
>>> "{a} love {b}.{0}".format(a="I",b="FishC","com")
SyntaxError: positional argument follows keyword argument
>>> '\ta'
'\ta'
>>> print('\ta')
	a
>>> "{{0}}".ormat("不打野")
Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    "{{0}}".ormat("不打野")
AttributeError: 'str' object has no attribute 'ormat'
>>> print('\\')
\
>>> "{{0}}".format("不打印")
'{0}'
>>> '{0:.1f}{1}'.format(27.658,'GB')
'27.7GB'
>>> '%c' % 97
'a'
>>> '%c %c %c' %(97,98,99)
'a b c'
>>> '%s' % 'I love FishC.com'
'I love FishC.com'
>>> '%d + %d = %d' % (4, 5, 4+5)
'4 + 5 = 9'
>>> '%o' % 10
'12'
>>> '%x' % 10
'a'
>>> '%X' % 10
'A'
>>> '%x' % 160
'a0'
>>> '%f' % 27.658
'27.658000'
>>> '%e' % 27.658
'2.765800e+01'
>>> '%E' % 27.658
'2.765800E+01'
>>> >>> '%E' % 27.658
'2.765800E+01'
SyntaxError: invalid syntax
>>> '%g' % 27.658
'27.658'
>>> '%5.1f' % 27.658
' 27.7'
>>> '%.2e' % 27.658
'2.77e+01'
>>> '%10d' %5
'         5'
>>> '%-10d' %5
'5         '
>>> '+d' %d
Traceback (most recent call last):
  File "<pyshell#27>", line 1, in <module>
    '+d' %d
NameError: name 'd' is not defined
>>> '+d' %5
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    '+d' %5
TypeError: not all arguments converted during string formatting
>>> '%+d' %5
'+5'
>>> '%+d' %-5
'-5'
>>> '%#0' % 10
Traceback (most recent call last):
  File "<pyshell#31>", line 1, in <module>
    '%#0' % 10
ValueError: incomplete format
>>> '%#o' % 10
'0o12'
>>> '%#X' % 108
'0X6C'
>>> '%#d' % 10
'10'
>>> '%010d' %5
'0000000005'
>>> '%-010d' %5
'5         '
>>> 
