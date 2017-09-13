Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:57:36) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> help(open)
Help on built-in function open in module io:

open(file, mode='r', buffering=-1, encoding=None, errors=None, newline=None, closefd=True, opener=None)
    Open file and return a stream.  Raise IOError upon failure.
    
    file is either a text or byte string giving the name (and the path
    if the file isn't in the current working directory) of the file to
    be opened or an integer file descriptor of the file to be
    wrapped. (If a file descriptor is given, it is closed when the
    returned I/O object is closed, unless closefd is set to False.)
    
    mode is an optional string that specifies the mode in which the file
    is opened. It defaults to 'r' which means open for reading in text
    mode.  Other common values are 'w' for writing (truncating the file if
    it already exists), 'x' for creating and writing to a new file, and
    'a' for appending (which on some Unix systems, means that all writes
    append to the end of the file regardless of the current seek position).
    In text mode, if encoding is not specified the encoding used is platform
    dependent: locale.getpreferredencoding(False) is called to get the
    current locale encoding. (For reading and writing raw bytes use binary
    mode and leave encoding unspecified.) The available modes are:
    
    ========= ===============================================================
    Character Meaning
    --------- ---------------------------------------------------------------
    'r'       open for reading (default)
    'w'       open for writing, truncating the file first
    'x'       create a new file and open it for writing
    'a'       open for writing, appending to the end of the file if it exists
    'b'       binary mode
    't'       text mode (default)
    '+'       open a disk file for updating (reading and writing)
    'U'       universal newline mode (deprecated)
    ========= ===============================================================
    
    The default mode is 'rt' (open for reading text). For binary random
    access, the mode 'w+b' opens and truncates the file to 0 bytes, while
    'r+b' opens the file without truncation. The 'x' mode implies 'w' and
    raises an `FileExistsError` if the file already exists.
    
    Python distinguishes between files opened in binary and text modes,
    even when the underlying operating system doesn't. Files opened in
    binary mode (appending 'b' to the mode argument) return contents as
    bytes objects without any decoding. In text mode (the default, or when
    't' is appended to the mode argument), the contents of the file are
    returned as strings, the bytes having been first decoded using a
    platform-dependent encoding or using the specified encoding if given.
    
    'U' mode is deprecated and will raise an exception in future versions
    of Python.  It has no effect in Python 3.  Use newline to control
    universal newlines mode.
    
    buffering is an optional integer used to set the buffering policy.
    Pass 0 to switch buffering off (only allowed in binary mode), 1 to select
    line buffering (only usable in text mode), and an integer > 1 to indicate
    the size of a fixed-size chunk buffer.  When no buffering argument is
    given, the default buffering policy works as follows:
    
    * Binary files are buffered in fixed-size chunks; the size of the buffer
      is chosen using a heuristic trying to determine the underlying device's
      "block size" and falling back on `io.DEFAULT_BUFFER_SIZE`.
      On many systems, the buffer will typically be 4096 or 8192 bytes long.
    
    * "Interactive" text files (files for which isatty() returns True)
      use line buffering.  Other text files use the policy described above
      for binary files.
    
    encoding is the name of the encoding used to decode or encode the
    file. This should only be used in text mode. The default encoding is
    platform dependent, but any encoding supported by Python can be
    passed.  See the codecs module for the list of supported encodings.
    
    errors is an optional string that specifies how encoding errors are to
    be handled---this argument should not be used in binary mode. Pass
    'strict' to raise a ValueError exception if there is an encoding error
    (the default of None has the same effect), or pass 'ignore' to ignore
    errors. (Note that ignoring encoding errors can lead to data loss.)
    See the documentation for codecs.register or run 'help(codecs.Codec)'
    for a list of the permitted encoding error strings.
    
    newline controls how universal newlines works (it only applies to text
    mode). It can be None, '', '\n', '\r', and '\r\n'.  It works as
    follows:
    
    * On input, if newline is None, universal newlines mode is
      enabled. Lines in the input can end in '\n', '\r', or '\r\n', and
      these are translated into '\n' before being returned to the
      caller. If it is '', universal newline mode is enabled, but line
      endings are returned to the caller untranslated. If it has any of
      the other legal values, input lines are only terminated by the given
      string, and the line ending is returned to the caller untranslated.
    
    * On output, if newline is None, any '\n' characters written are
      translated to the system default line separator, os.linesep. If
      newline is '' or '\n', no translation takes place. If newline is any
      of the other legal values, any '\n' characters written are translated
      to the given string.
    
    If closefd is False, the underlying file descriptor will be kept open
    when the file is closed. This does not work when a file name is given
    and must be True in that case.
    
    A custom opener can be used by passing a callable as *opener*. The
    underlying file descriptor for the file object is then obtained by
    calling *opener* with (*file*, *flags*). *opener* must return an open
    file descriptor (passing os.open as *opener* results in functionality
    similar to passing None).
    
    open() returns a file object whose type depends on the mode, and
    through which the standard file operations such as reading and writing
    are performed. When open() is used to open a file in a text mode ('w',
    'r', 'wt', 'rt', etc.), it returns a TextIOWrapper. When used to open
    a file in a binary mode, the returned class varies: in read binary
    mode, it returns a BufferedReader; in write binary and append binary
    modes, it returns a BufferedWriter, and in read/write mode, it returns
    a BufferedRandom.
    
    It is also possible to use a string or bytearray as a file for both
    reading and writing. For strings StringIO can be used like a file
    opened in a text mode, and for bytes a BytesIO can be used like a file
    opened in a binary mode.

>>> f=open('E:\\record.txt')
Traceback (most recent call last):
  File "<pyshell#1>", line 1, in <module>
    f=open('E:\\record.txt')
FileNotFoundError: [Errno 2] No such file or directory: 'E:\\record.txt'
>>> f=open('E:\\record.txt')
>>> f
<_io.TextIOWrapper name='E:\\record.txt' mode='r' encoding='cp936'>
>>> f.read()
'aa'
>>> f.read()
''
>>> f.close()
>>> f=open('E:\\record.txt')
>>> f.read(5)
'Ctrl '
>>> f.tell()
5
>>> f.seek(45,0)
45
>>> f.readline()
'  注释、取消注释代码行\n'
>>> list(f)
['Alt+5 Alt+6      切换缩进方式 空格<=>Tab\n', 'Alt+/               单词完成，只要文中出现过，就可以帮你自动补齐。多按几次可以循环选择\n', 'Alt+M              打开模块代码，先选中模块，然后按下此快捷键，会帮你打开改模块的py源码供浏览\n', 'Alt+C              打开类浏览器，方便在源码文件中的各个方法体之间切换\n', 'Alt+FP             打开路径浏览器，方便选择导入包进行查看浏览\n', 'F1                   打开Python文档，比Editplus 方便吧，不用设置了，呵呵。\n', '\n', '值得注意的是 Ctrl+Space这个快捷键和Windows的输入法切换热键冲突，不要紧，当你实在需要提示的时候停下来，仍然会有代码提示的。其他常用快捷键就按习惯来好了。\n', '\n', '在编辑过程中，按F5进入shell调试。shell中也有快捷键，都还方便\n', 'Alt+DG \u3000\u3000先定位到错误行，按此快捷键可以快速定位到出错位置\n', 'Alt+DS \u3000\u3000直接显示出错历史，找到根源，方便啊\n', 'Alt+DA \u3000\u3000如果每次都要按，还不够方便,按这个，以后出错都出历史\n', 'Alt+DD \u3000\u3000打开调试窗口，进入单步调试，方便。\n', 'Ctrl+F6 \u3000\u3000为了清空前面的导入记录等，重新启动shell\n', ' \n', '另外值得注意的是\n', 'Alt+N Alt+P \u3000\u3000可以查找以前输入的命令用于补全当前命令\n', 'Ctrl+方向键 \u3000\u3000能够得到增强功能，试试就灵(4490)。\n', ' \n', ' \n', '没有整理与归纳的知识，一文不值！高度概括与梳理的知识，才是自己真正的知识与技能。 永远不要让自己的自由、好奇、充满创造力的想法被现实的框架所束缚，让创造力自由成长吧！ 多花时间，关心他（她）人，正如别人所关心你的。理想的腾飞与实现，没有别人的支持与帮助，是万万不能的。']
>>> f.seek(0,0)
0
>>> lines = list(f)
>>> for each_line in lines:
	print each_line
	
SyntaxError: Missing parentheses in call to 'print'
>>> for each_line in lines:
	print(each_line)

	
Ctrl + [ 、Ctrl + ] 缩进代码

Alt+3 Alt+4      注释、取消注释代码行

Alt+5 Alt+6      切换缩进方式 空格<=>Tab

Alt+/               单词完成，只要文中出现过，就可以帮你自动补齐。多按几次可以循环选择

Alt+M              打开模块代码，先选中模块，然后按下此快捷键，会帮你打开改模块的py源码供浏览

Alt+C              打开类浏览器，方便在源码文件中的各个方法体之间切换

Alt+FP             打开路径浏览器，方便选择导入包进行查看浏览

F1                   打开Python文档，比Editplus 方便吧，不用设置了，呵呵。



值得注意的是 Ctrl+Space这个快捷键和Windows的输入法切换热键冲突，不要紧，当你实在需要提示的时候停下来，仍然会有代码提示的。其他常用快捷键就按习惯来好了。



在编辑过程中，按F5进入shell调试。shell中也有快捷键，都还方便

Alt+DG 　　先定位到错误行，按此快捷键可以快速定位到出错位置

Alt+DS 　　直接显示出错历史，找到根源，方便啊

Alt+DA 　　如果每次都要按，还不够方便,按这个，以后出错都出历史

Alt+DD 　　打开调试窗口，进入单步调试，方便。

Ctrl+F6 　　为了清空前面的导入记录等，重新启动shell

 

另外值得注意的是

Alt+N Alt+P 　　可以查找以前输入的命令用于补全当前命令

Ctrl+方向键 　　能够得到增强功能，试试就灵(4490)。

 

 

没有整理与归纳的知识，一文不值！高度概括与梳理的知识，才是自己真正的知识与技能。 永远不要让自己的自由、好奇、充满创造力的想法被现实的框架所束缚，让创造力自由成长吧！ 多花时间，关心他（她）人，正如别人所关心你的。理想的腾飞与实现，没有别人的支持与帮助，是万万不能的。
>>> f.seek(0,0)
0
>>> for each_line in f:
	print(each_line)

	
Ctrl + [ 、Ctrl + ] 缩进代码

Alt+3 Alt+4      注释、取消注释代码行

Alt+5 Alt+6      切换缩进方式 空格<=>Tab

Alt+/               单词完成，只要文中出现过，就可以帮你自动补齐。多按几次可以循环选择

Alt+M              打开模块代码，先选中模块，然后按下此快捷键，会帮你打开改模块的py源码供浏览

Alt+C              打开类浏览器，方便在源码文件中的各个方法体之间切换

Alt+FP             打开路径浏览器，方便选择导入包进行查看浏览

F1                   打开Python文档，比Editplus 方便吧，不用设置了，呵呵。



值得注意的是 Ctrl+Space这个快捷键和Windows的输入法切换热键冲突，不要紧，当你实在需要提示的时候停下来，仍然会有代码提示的。其他常用快捷键就按习惯来好了。



在编辑过程中，按F5进入shell调试。shell中也有快捷键，都还方便

Alt+DG 　　先定位到错误行，按此快捷键可以快速定位到出错位置

Alt+DS 　　直接显示出错历史，找到根源，方便啊

Alt+DA 　　如果每次都要按，还不够方便,按这个，以后出错都出历史

Alt+DD 　　打开调试窗口，进入单步调试，方便。

Ctrl+F6 　　为了清空前面的导入记录等，重新启动shell

 

另外值得注意的是

Alt+N Alt+P 　　可以查找以前输入的命令用于补全当前命令

Ctrl+方向键 　　能够得到增强功能，试试就灵(4490)。

 

 

没有整理与归纳的知识，一文不值！高度概括与梳理的知识，才是自己真正的知识与技能。 永远不要让自己的自由、好奇、充满创造力的想法被现实的框架所束缚，让创造力自由成长吧！ 多花时间，关心他（她）人，正如别人所关心你的。理想的腾飞与实现，没有别人的支持与帮助，是万万不能的。
>>> f.write("I love ziyu')
	
SyntaxError: EOL while scanning string literal
>>> f.write('I love ziyu')
Traceback (most recent call last):
  File "<pyshell#25>", line 1, in <module>
    f.write('I love ziyu')
io.UnsupportedOperation: not writable
>>> f=open('E:\\test.txt','w')
>>> f.write('我爱子煜工作室')
7
>>> f.close()
>>> 
