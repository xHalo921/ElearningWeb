# ElearningWeb

## 数据结构
>\*表示主键
## 学生 Student
|       | SNo | SPassword | SClass | SName | Choice | Email | Phone 
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|:-----:
|说明    |学号 | 密码      |班级    |姓名    |选择    |邮箱   |电话    
|java   | int |  String   |int     |String |int     |String |String 
|sql    |\*int|  varchar  |int     |varchar|int     |varchar|varchar
> 选择项 0表示未选择 负数表示已选择但教师未确定，正数为选中班级（eg:选1班 0->-1教师确认后 -1->1）

### 成绩表
| SNo | SName | SClass |Ugrades|Mgrades|Fgrade|Pgrades|Overgrades|
|:---:|:-----:|:------:|:-----:|:-----:|:----:|:-----:|:--------:|
|学号 |姓名    |班级    |平时   |期中    |期末  |实践    |总成绩    |
| int |String |int     |int    |int    |int   |int    |int       |
|\*int|varchar|int     |int    |int    |int   |int    |int       |

### 教师 Teacher
|       | TNo | TPassword | TClass | TName |  Email | Phone |
|:-----:|:---:|:---------:|:------:|:-----:|:------:|:-----:|
|说明    |工号 |  密码     |教学班级 |姓名    |邮箱    |电话   |
|java   | int |  String   | int    |String | String |String |
|sql    |\*int|  varchar  | int    |varchar| varchar|varchar|
