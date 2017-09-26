Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> secret = random.randint(1,10)
Traceback (most recent call last):
  File "<pyshell#0>", line 1, in <module>
    secret = random.randint(1,10)
NameError: name 'random' is not defined
>>> import random
>>> secret = random.randint(1,10)
>>> secret
7
>>> getcwd()
Traceback (most recent call last):
  File "<pyshell#4>", line 1, in <module>
    getcwd()
NameError: name 'getcwd' is not defined
>>> import os
>>> getcwd()
Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    getcwd()
NameError: name 'getcwd' is not defined
>>> os.getcwd()
'C:\\Users\\Administrator\\AppData\\Local\\Programs\\Python\\Python36'
>>> os.chdir('E:\\')
>>> os.getcwd()
'E:\\'
>>> os.listdir('E:\\')
['$RECYCLE.BIN', 'developerHome.zip', 'developerHome.zip.baiduyun.uploading.cfg', 'eclipse', 'GitRepertory', 'SoftWare', 'System Volume Information', '视频教程']
>>> os.mkdir('E:\\A')
>>> os.mkdir('E:\\A\\B')
>>> os.rmdir('E:\\A\\B')
Traceback (most recent call last):
  File "<pyshell#13>", line 1, in <module>
    os.rmdir('E:\\A\\B')
OSError: [WinError 145] 目录不是空的。: 'E:\\A\\B'
>>> os.remove('E:\\A\\B\\test.txt')
>>> os.rmdir('E:\\A\\B')
>>> os.rmdir('E:\\A')
>>> os.system('cmd')
0
>>> os.system('calc')
0
>>> os.curdir
'.'
>>> os.listdir(os.curdir)
['$RECYCLE.BIN', 'developerHome.zip', 'developerHome.zip.baiduyun.uploading.cfg', 'eclipse', 'GitRepertory', 'SoftWare', 'System Volume Information', '视频教程']
>>> os.sep
'\\'
>>> os.name
'nt'
>>> os.path.basename('E:\\A')
'A'
>>> os.path.basename('E:\\A\\B\\C\\sexy.avi')
'sexy.avi'
>>> 
