Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> favourite = "FishC"
>>> for i in favourite
SyntaxError: invalid syntax
>>> for i in favourite:
	print(i,end=' ')

	
F i s h C 
>>> member = ['子煜','小布丁','黑夜','迷途','易静']
>>> for each in member:
	print(each,len(member))

	
子煜 5
小布丁 5
黑夜 5
迷途 5
易静 5
>>> for each in member
SyntaxError: invalid syntax
>>> for each in member:
	print(each,len(each))

	
子煜 2
小布丁 3
黑夜 2
迷途 2
易静 2
>>> range(5)
range(0, 5)
>>> list(range(5))
[0, 1, 2, 3, 4]
>>> for i in range(5):
	print(i)

	
0
1
2
3
4
>>> for i in range(2,9):
	print(i)

	
2
3
4
5
6
7
8
>>> for i in range(1,10,2):
	print(i)

	
1
3
5
7
9
>>> 
 RESTART: E:/GitRepertory/gitWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第九课_01.py 
请输入小甲鱼最想听的一句话:去死
抱歉，错了，请重新输入（答案正确才能退出游戏）!
抱歉，错了，请重新输入（答案正确才能退出游戏）!冲不过
抱歉，错了，请重新输入（答案正确才能退出游戏）!你妈
抱歉，错了，请重新输入（答案正确才能退出游戏）!小甲鱼是帅哥
抱歉，错了，请重新输入（答案正确才能退出游戏）!子煜是帅哥
啊哟，帅哦
您真是小甲鱼肚子里的蛔虫啊!
>>> 
 RESTART: E:/GitRepertory/gitWS/POJ_Python/videoTutorials/零基础入门学习Python_小甲鱼/第九课_02.py 
2
1
4
3
6
5
8
7
10
9
>>> 
