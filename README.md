# Base64的使用

------

> * JavaSE 1.8
> * Eclipse Neon

在Java中有三种实现方式：JDK方式、BC方式（bouncycastle）、CC方式（commons-codec）
其中：
JDK方式，是使用JDK1.8或JRE1.8版本；
BC方式，使用bouncycastle的jar包bcprov-jdk15on-155.jar，实现Base64加密、解密；
jar包的下载地址：http://www.bouncycastle.org/latest_releases.html 
CC方式，使用apache的jar包commons-codec-1.10.jar，实现Base64加密、解密；jar包的下载地址：http://commons.apache.org/proper/commons-codec/download_codec.cgi

目录结构：<br>
![](https://github.com/wyue2015/Base64/blob/master/1.png)

测试结果:
aGVsbG8gd29ybGSjusTjusOjoQ==
hello world：你好！

---------
#Base64编码由来
   &nbsp; &nbsp; &nbsp; &nbsp;为什么会有Base64编码呢?因为某些网络传送渠道不支持传送所有的字节。比如，传统的邮件只支持传送可见字符，诸如图片这种包含不可见字符的内容就无法传送。所以Base64编码方式诞生，将不可打印的字符用可打印字符表示。
 &nbsp; &nbsp; &nbsp; &nbsp;Base64就是一种基于64个可打印字符来表示二进制数据的表示方法；其中，52个大小写英文字母、10个阿拉伯数字、+、/  共64个可打印字符；
 
#编码规则：
&nbsp; &nbsp; &nbsp; &nbsp;将文本转成对应编码格式的二进制序列，对二进制序列做如下处理：
首先，对于序列，从左到右，每6bit作为一个字节；
然后，转换完成后的字节数若不足4的整数倍，则在后面添加1或2个等号“=”，填充完成整数倍；
最后，按照Base64编码表，找出对应字符。