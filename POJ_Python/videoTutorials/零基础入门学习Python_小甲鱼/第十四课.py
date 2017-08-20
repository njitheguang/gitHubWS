Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> str1 = "I love fishc.com"
>>> str1[:6]
'I love'
>>> str1
'I love fishc.com'
>>> str1[5]\
	\

	
'e'
>>> str1[5]
'e'
>>> str1=str1[:6] +  "插入的字符串" + str1[6:]
>>> str1
'I love插入的字符串 fishc.com'
>>> str1
'I love插入的字符串 fishc.com'
>>> str2 = "xiaoxie"
>>> str2.capitalize()
'Xiaoxie'
>>> str2 = "DAXIExiaoxie"
>>> str2.casefold()
'daxiexiaoxie'
>>> str2
'DAXIExiaoxie'
>>> str2.center(40)
'              DAXIExiaoxie              '
>>> str2.count("xi")
2
>>> str2
'DAXIExiaoxie'
>>> str2.endwith("xi")
Traceback (most recent call last):
  File "<pyshell#18>", line 1, in <module>
    str2.endwith("xi")
AttributeError: 'str' object has no attribute 'endwith'
>>> str2.endswith("xi")
False
>>> str3 = "I\tlove\tfishc.com"
>>> str3.expandtabs()
'I       love    fishc.com'
>>> str4 = "小甲鱼"
>>> str4.islower()
False
>>> str5 = "FishC"
>>> str5.istitle()
False
>>> str5 = "Fishc"
>>> str5.istitle()
True
>>> str5.join("12345")
'1Fishc2Fishc3Fishc4Fishc5'
>>> str6 = "    I love you"
>>> str6.lstrip()
'I love you'
>>> str6 = "I love fishc"
>>> str6.partition("ov")
('I l', 'ov', 'e fishc')
>>> str6.replace("fishc","FishC")
'I love FishC'
>>> str6
'I love fishc'
>>> str6.split()
['I', 'love', 'fishc']
>>> str6.split("I")
['', ' love fishc']
>>> str7 = '    ssssssssaaaa    "
SyntaxError: EOL while scanning string literal
>>> str7 = '    sssssssaaaaa     '
>>> str7.strip()
'sssssssaaaaa'
>>> str7 = str7.strip()
>>> str7
'sssssssaaaaa'
>>> str7 = str7.strip('s')
>>> str7
'aaaaa'
>>> str5
'Fishc'
>>> str5.swapcase()
'fISHC'
>>> str7
'aaaaa'
>>> str7 = 'ssssssaaaaa'
>>> str7 = 'ssssaaaasss'
>>> str7.translate(str.makentrans('s','b'))
Traceback (most recent call last):
  File "<pyshell#49>", line 1, in <module>
    str7.translate(str.makentrans('s','b'))
AttributeError: type object 'str' has no attribute 'makentrans'
>>> str7.translate(str.maketrans('s','b'))
'bbbbaaaabbb'
>>> str.maketrans('s','b')
{115: 98}
>>> 
