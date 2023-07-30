# SofLite

## 什么东西

团队管理工具  类似于办公自动化的系统

## 什么功能

系统的核心功能、主要使用的功能

### 用户管理

1. 用户
2. 用户组
3. 部门
4. 角色
5. 权限

### 项目管理

1. 项目组
2. 项目
3. 任务
   1. 工时
   2. 日志

### 其他功能

这些是之后的可能会塞进去的功能了

IM系统、网盘、流程引擎

## 什么技术

技术上 以精简为主  但要考虑支持分布式部署

### 需要的服务

+ mysql 数据持久化
+ redis 部分数据的缓存  为了支持分布式部署  

### 使用的技术栈

#### 后端

+ spring boot 2.7
+ mybatis-plus
+ jedis

#### 前端

+ react
+ ant-design
+ vite

## 一些要点

后端分模块  按照common  entity   service  api 开发

api 和 entity 所有的模块全部应用

service 是 mappr、dao 和 service包含  其他服务引用的时候通过 service调用

包路径  com.soflite.user\project

 



