#### 修改内容：

1.管理员功能插入的问题

执行插入操作时未对用户限制输入，也没有格式化处理，导致datatime字段报错。
![](https://img2020.cnblogs.com/blog/1474762/202003/1474762-20200325220755168-137796414.png)
代码段里情况如下：
![](https://img2020.cnblogs.com/blog/1474762/202003/1474762-20200325222026875-326472506.png)
数据库：
![](https://img2020.cnblogs.com/blog/1474762/202003/1474762-20200325222525828-1038450822.png)
代码里用的是String，而数据库中用的是datatime类型所以出现错误问题。
修改datetime 为 varchar
![](https://img2020.cnblogs.com/blog/1474762/202003/1474762-20200325220144335-2069264250.png)

2.重复代码段的删除

在User.java文件中出现重复代码段：

![](https://img2020.cnblogs.com/blog/1474762/202003/1474762-20200325224809152-113115225.png)


3.jdbc连接url路径定义编码格式

由于导入时产生问题，这是诸多问题中的一个，所以url路径添加如下字段
db.properties 中url更改
```
url=jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf8
```