create database student_manager;
use student_manager;
-- 学生表
create table student(
sno bigint primary key, -- 学号
sname varchar(50) not null,-- 学生姓名
sgender enum('男','女') default '男',-- 性别
sgrade int not null, -- 年级
sclass tinyint unsigned not null,-- 班级
sdept varchar(20) not null,-- 专业
saddress varchar(255) not null,-- 家庭住址
sphone varchar(20),-- 联系方式
sparent varchar(20),-- 父/母 名字
sparentPhone varchar(20),-- 父/母 联系方式
sjob varchar(255),-- 任职情况
tfrom bigint not null,-- 所属班级编号
sstate enum('在校','休学','入伍','退学') default '在校'-- 学生状态
);
-- 班级
create table _class(
c_no bigint primary key auto_increment, -- 班级编号
c_name varchar(100) not null-- 班级名称
);
-- 老师表
create table teacher(
tno bigint primary key,-- 老师编号
tname varchar(50) not null,-- 老师名称
tgender enum('男','女') default '男',-- 老师性别
tpassword varchar(16) not null,-- 登录密码
tfrom bigint not null-- 所属班级
);
-- 教室表
create table classroom(
crno tinyint primary key auto_increment,-- 教室编号
craddress varchar(100) not null-- 教室地址
);
-- 学分表
create table credit(
credId bigint primary key auto_increment,
sno bigint not null,-- 学号
cname varchar(100) not null,-- 选课名称
ctype enum('必修','选修','公选') not null,-- 课程类型
cscore tinyint unsigned not null-- 学分
);
-- 评优奖学
create table well(
weid bigint primary key auto_increment,-- ID
sno bigint not null,-- 学号
getTime date not null,-- 获得时间
wtype enum('奖学金','评优') not null,-- 获得类型
wname varchar(100) not null-- 名称
);
-- 通报批评
create table criticism(
crid bigint primary key auto_increment,-- ID
sno bigint not null,-- 学号
ctime varchar(50) not null,-- 获得时间(学期)
creason varchar(255) not null,-- 原因
ctype varchar(50) not null,-- 类型
cpunishment varchar(50) not null-- 处分
);

-- 普通证书
create table general_certificate(
gcid bigint primary key auto_increment,
sno bigint not null,-- 学号
gctype enum('计算机一级','计算机二级','计算机三级','计算机四级','计算机五级','高职高专英语','CET','普通话')-- 类型
not null,-- 证书类型
gctime date not null,-- 通过时间
gcgrade float(4,1) unsigned not null-- 通过成绩
);

-- 职业证书
create table profess_certificate(
pcid bigint primary key auto_increment,
sno bigint not null,-- 学号
pctype varchar(50) not null,-- 类型
pctime date not null,-- 通过时间
pcoffice varchar(100) not null,-- 发行机关
pcstate enum('未确认','已确认') not null-- 确认状态(老师)
);

-- 活动
create table activity(
aid bigint primary key auto_increment,-- 活动ID
proposer bigint not null,-- 申请人
aname varchar(100) not null,-- 活动名称	
acontent text not null,-- 活动内容
aaffect varchar(255) not null,-- 活动作用
astate enum('未通过','已通过') not null-- 活动申请状态
);


-- 学生教材
create table student_textbook(
stno bigint primary key auto_increment,-- 教材选择编号
sno bigint not null,-- 学号
tbname varchar(50) not null,-- 教材名称
num tinyint unsigned not null,-- 数量
price float(5,2) not null,-- 总价
state enum('未确认','已确认') default '未确认'-- 确认状态
);
-- 调课
create table adjustlesson(
tno bigint not null,-- 任课教师
reason varchar(255) not null,-- 调课原因
course varchar(100) not null,-- 课程名称
oldtime varchar(100) not null,-- 原上课时间
oldaddress varchar(100) not null,-- 原上课地点
newtime varchar(100) not null,-- 新上课时间
newaddress varchar(100) not null-- 新上课地点
);

-- 教室申请
create table applyclassroom(
acid int primary key auto_increment,
proposer bigint not null,-- 申请人
reason varchar(255) not null,-- 申请原因
craddress varchar(100) not null,-- 教室地址
startTime datetime not null,-- 使用开始时间
endTime datetime not null,-- 使用结束时间
acstate enum('未通过','已通过') not null-- 教室申请状态
);

-- 主题帖
create table posts(
pid bigint primary key auto_increment,-- id
ptitle varchar(100) not null,-- 标题
pcontent text not null,-- 内容(1楼)
pauthor bigint not null,-- 作者
pdate datetime not null-- 发帖时间
);
-- 回复贴
create table reply(
rid bigint not null primary key auto_increment, -- id
pid bigint not null,-- 回帖id
rcontent text not null,-- 回帖内容
rauthor bigint not null,-- 作者
rdate datetime not null-- 回帖时间
);