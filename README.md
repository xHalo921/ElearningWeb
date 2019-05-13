# ElearningWeb

## 数据
>**加粗**表示SQL主键
### 学生 Student
|       | SNo | SPassword | SClass | SName | Choice | Email | Phone 
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|:-----:
|说明    |学号 | 密码      |班级    |姓名    |选择    |邮箱   |电话    
|java   | int |  String   |int     |String |int     |String |String 
|sql    |**int**| varchar |int     |varchar|int     |varchar|varchar
> 选择项 0表示未选择 负数表示已选择但教师未确定，正数为选中班级（eg.:选1班 0变-1,教师确认后 -1变1）

### 成绩 Grade
|       | SNo | SName | SClass |Ugrade|Mgrade|Fgrade|Pgrade|Overgrade|
|:-----:|:---:|:-----:|:------:|:-----:|:-----:|:----:|:-----:|:--------:|
|说明    |学号 |姓名   |班级     |平时   |期中   |期末  |实践    | 总成绩    |
|java   | int |String |int     |int    |int    |int   |int    |int       |
|sql    |**int**|varchar|int   |int    |int    |int   |int    |int       |

### 教师 Teacher
|       | TNo | TPassword | TClass | TName |  Email | Phone |
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|
|说明    |工号 |  密码     |教学班级 |姓名    |邮箱    |电话   |
|java   | int |  String   | int    |String | String |String |
|sql    |**int**| varchar | int    |varchar| varchar|varchar|

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

## 可行分工
+ 部分主页面（除下载区、留言板、网上测试功能）
+ 主页面的下载区、留言板          毛瑞钰
+ 主页面的网上测试功能            聂冲
+ 学生网页，教师网页的成绩导入部分  马海萍
+ 剩下的教师网页                 张旭
+ 后端                          许皓
