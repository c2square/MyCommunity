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

### idea快捷键

| 功能                                      | 操作             |
| ----------------------------------------- | ---------------- |
| 快速查找某个文件                          | Ctrl+Shift+N     |
| 快速换行到行首                            | Shift+Enter      |
| 快速添加get+set方法                       | Alt+Insert       |
| 快速创建一个已经调用，却未创建的函数      | Alt+Enter        |
| 快速行末加;                               | Ctrl+Shift+Enter |
| 根据（new）实例化对象，快速初始构建变量名 | Alt+Enter        |

##遇到的问题

- Spring里的Autowired 出现`Could not autowire. No beans of 'xxxx' type found`
    - 一般来说如果项目可以正常编译，那就是idea的问题
    - 降低其安全等级
    - ![image-20200510165702194](https://i.loli.net/2020/05/10/wtjnPKMGdhHqef2.png)
    
- 登录时，返回出错
    - 连接超时
        - api.github.com的ping不通，修改host
    - 其他问题看报错信息，输出中间结果在查看
    
- 数据库连接不上，总是提示用户名或密码不对
    - 不知道是不是mysql和H2数据库的管理权限出问题，查了半天也没找到原因
    - 解决方法（缓兵之计）：换数据库名字+换用户名和密码，一直尝试，总会成功
    
- flayway无法合并版本，只有`Detected failed migration to version x`的警告信息
    - 找到flyway_schema_history这个表，删除失败上传的记录（该表最后一个参数是success）重试即可。（这个bug很蛋疼）
    - 其他一般都有报错信息，如语法错误等
    
- 写html时，css无法正确显示
    - 在浏览器F12查看css是否正确加载（Sources选项卡里）
    - 如果css能被加载，但内容不正确
        - 比如显示的内容为HTML代码，而不是自己写的css内容
        - 说明该页面的Controller写错了
        - 查看@GetMapping注解有没有写对
            - 如`@GetMapping("/publish")`写错成`@GetMapping`（流下辛酸泪）
    
- lombok使用无效
  
    - 在idea里需要安装Lombok的插件，否则调用get或者set编译器会识别不了
    
- 修改css后，Chrome浏览器无法识别css的修改

    - 可以在开发者模式里的Sources里查看自己的css是否修改

    - 若是css没有修改，说明浏览器自动缓存了原来的css（无奈）

    - [在开发者模式下按F1进入设置，勾选 Disable cache (while DevTools is open)](https://blog.csdn.net/dreamstone_xiaoqw/article/details/78122581)

