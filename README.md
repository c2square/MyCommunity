# 用Spring Boot 搭建一个社区
参考[码匠社区](https://github.com/codedrinker/community)
,项目入门的[B站视频](https://www.bilibili.com/video/BV1TE41147uw)

## 关于application.properties的配置
将如下内容编辑好，并加入application.properties
```properties
github.client.id=your github id
github.client.secret=your github secret
github.redirect.uri=http://localhost:8887/callback

spring.datasource.url=your database url (for example: jdbc:h2:~/mydb123)
spring.datasource.username=your database username
spring.datasource.password=your database password
spring.datasource.driver-class-name=your database driver (for example:org.h2.Driver)
```
注意：

关于github账户的相关的内容请参考[b站的这个视频](https://www.bilibili.com/video/BV1TE41147uw?p=8)

数据库创建的相关内容参考[这个b站视频](https://www.bilibili.com/video/BV1TE41147uw?p=15)
## 所用到的技术的网址：

[github登录](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

##遇到的问题

- 登录时，返回出错
    1. 连接超时
        - api.github.com的ping不通，修改host
    2. 其他问题看报错信息，输出中间结果在查看
- 数据库连接不上，总是提示用户名或密码不对
    - 不知道是不是mysql和H2数据库的管理权限出问题，查了半天也没找到原因
    - 解决方法（缓兵之计）：换数据库名字+换用户名和密码，一直尝试，总会成功
- flayway无法合并版本，只有`Detected failed migration to version x`的警告信息
    - 找到flyway_schema_history这个表，删除失败上传的记录（该表最后一个参数是success）重试即可。（这个bug很蛋疼）