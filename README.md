# ElearningWeb

## github使用教程
1. 注册github账号，将用户名发给我，之后我会发给你一个邀请加入项目的链接，同意
2. 下载github desktop客户端，登陆，File->Clone repository,选择ElearningWeb项目，**路径选择eclipse的workspace**
3. Eclipse新建项目（若为MyEclipse，注意可能在新建项目时需要修改web目录的WebRoot改为WebContent，若为Idea，直接找我），项目名为ElearningWeb，之后若配置正确可直接运行。
4. 将自己写的代码加入项目，若第二步Clone repository时选择的路径与Eclipse新建项目路径一致，那么在eclipse中的修改会被github desktop记录，github desktop左下角Commit to master，再使用右上角push即可将代码上传至网络。
5. 同理，当其他人更改项目时，github desktop右上角会出现Fetch标识，点击即可获得最新版本的项目。


## 数据
>**加粗**表示SQL主键
### 学生 Student
|       | sNo | sPassword | sClass | sName | choice | sEmail|sPhone |notice |
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|:-----:|:-----:|
|说明    |学号 | 密码      |班级    |姓名    |选择    |邮箱   |电话     |通知    |
|java   | int |  String   |int     |String |int     |String |String |String |
|sql    |**int**| varchar |int     |varchar|int     |varchar|varchar|varchar|
> 选择项 0表示未选择 负数表示已选择但教师未确定，正数为选中班级（eg.:选1班 0变-1,教师确认后 -1变1）

### 成绩 Grade
|       | sNo | sName | sClass |uGrade|mGrade|fGrade|pGrade|overGrade|
|:-----:|:---:|:-----:|:------:|:-----:|:-----:|:----:|:-----:|:--------:|
|说明    |学号 |姓名   |班级     |平时   |期中   |期末  |实践    | 总成绩    |
|java   | int |String |int     |int    |int    |int   |int    |int       |
|sql    |**int**|varchar|int   |int    |int    |int   |int    |int       |

### 教师 Teacher
|       | tNo | tPassword | tClass | tName | tEmail |tPhone |
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|
|说明    |工号 |  密码     |教学班级 |姓名    |邮箱    |电话   |
|java   | int |  String   | int    |String | String |String |
|sql    |**int**| varchar | int    |varchar| varchar|varchar|
> 教师的tClass对应的是学生的choice，而不是sClass

> 视情况可能需要增加下载、评论数据库

## 主要网页
### 游客网页（导航页）
  包括课程介绍、课程内容、教学大纲、教学实践、教学团队、行业信息、**下载区**、成绩查询、**留言板**、**网上测试功能**，包含指向“学生登陆”，“教师登陆”链接（可考虑将部分设计为横向导航，部分设计为竖向导航）

### 学生网页
+ 登陆/注册界面
+ 登陆后的“选课”、“选课结果查看”界面，附带“退出登陆”功能（指向游客网页）

### 教师网页
+ 登陆/注册界面
+ 登陆后的网页，包含“选课管理”、**“成绩导入”**、**“成绩分析”**、“成绩预警”子功能，附带“退出登陆”功能（指向游客网页）

## 可行分工（以功能点划分）
1. 毛瑞钰:	部分主页面（除下载区、留言板、网上测试功能）
2. 谢启梦:	主页面的下载区、留言板
3. 聂冲:		主页面的网上测试功能
4. 马海萍:	学生网页，教师网页的成绩导入部分
5. 张旭:		剩下的教师网页
6. 许皓:		部分后端
