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