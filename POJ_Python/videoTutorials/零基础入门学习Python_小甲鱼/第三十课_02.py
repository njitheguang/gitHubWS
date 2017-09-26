Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> import random
>>> secret = random.randint(1,10)
>>> secret
9
>>> os
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    os
NameError: name 'os' is not defined
>>> import os
>>> os.getcwd()
'C:\\Users\\Administrator\\AppData\\Local\\Programs\\Python\\Python36'
>>> os.chdir(e:\\)
SyntaxError: invalid syntax
>>> os.chdir(E:\\)
SyntaxError: invalid syntax
>>> os.chdir('E:\\')
>>> os.getcwd()
'E:\\'
>>> os.listdir('E:\\')
['$RECYCLE.BIN', 'developerHome.zip', 'developerHome.zip.baiduyun.uploading.cfg', 'eclipse', 'GitRepertory', 'SoftWare', 'System Volume Information', '视频教程']
>>> os.listdir(os.curdir)
['$RECYCLE.BIN', 'developerHome.zip', 'developerHome.zip.baiduyun.uploading.cfg', 'eclipse', 'GitRepertory', 'SoftWare', 'System Volume Information', '视频教程']
>>> os.sep
'\\'
>>> os.name
'nt'
>>> os.path.basename('E:\\')
''
>>> os.path.dirname('E:\\a\b\a.txt')
'E:\\'
>>> os.path.join('A','B','C')
'A\\B\\C'
>>> os.path.split('E:\\A\\SEXY.AVI')
('E:\\A', 'SEXY.AVI')
>>> os.path.split('E:\\A\\C')
('E:\\A', 'C')
>>> os.path.splitext('E:\\A\\SEXY.AVI')
('E:\\A\\SEXY', '.AVI')
>>> os.path.getatime('E:\\test.txt')
1506437800.0708694
>>> import time
>>> time.gmtime(os.path.getatime('E:\\test.txt'))
time.struct_time(tm_year=2017, tm_mon=9, tm_mday=26, tm_hour=14, tm_min=56, tm_sec=40, tm_wday=1, tm_yday=269, tm_isdst=0)
>>> time.local(os.path.getatime('E:\\test.txt'))
Traceback (most recent call last):
  File "<pyshell#23>", line 1, in <module>
    time.local(os.path.getatime('E:\\test.txt'))
AttributeError: module 'time' has no attribute 'local'
>>> time.localtime(os.path.getatime('E:\\test.txt'))
time.struct_time(tm_year=2017, tm_mon=9, tm_mday=26, tm_hour=22, tm_min=56, tm_sec=40, tm_wday=1, tm_yday=269, tm_isdst=0)
>>> time.localtime(os.path.getatime('E:\\test.txt'))
time.struct_time(tm_year=2017, tm_mon=9, tm_mday=26, tm_hour=22, tm_min=56, tm_sec=40, tm_wday=1, tm_yday=269, tm_isdst=0)
>>> time.localtime(os.path.getmtime('E:\\test.txt'))
time.struct_time(tm_year=2017, tm_mon=9, tm_mday=26, tm_hour=22, tm_min=59, tm_sec=45, tm_wday=1, tm_yday=269, tm_isdst=0)
>>> time.localtime(os.path.getctime('E:\\test.txt'))
time.struct_time(tm_year=2017, tm_mon=9, tm_mday=26, tm_hour=22, tm_min=56, tm_sec=40, tm_wday=1, tm_yday=269, tm_isdst=0)
>>> A\\B\\TEST.TXT
SyntaxError: unexpected character after line continuation character
>>> E:\\A\\B\\TEST.TXT
SyntaxError: unexpected character after line continuation character
>>> os.path.ismount('E:\\')
True
>>> os.path.ismount('E:\\A\\BB')
False
>>> 
