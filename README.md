# myshop

该项目是我学习过程中做的一个Dubbo + zookeeper 的框架型，主流框架都有涉及。该项目使用GitLab做代码管理，使用Nexus做依赖私服，使用Registry做Docker镜像私服，使用GitLab Runner 和jenkins做持续集成。

 该项目所有的项目支撑性框架都使用linux 虚拟机docker容器的方式提供服务，大体的虚拟机结构如下：

![](https://img2020.cnblogs.com/blog/1454956/202009/1454956-20200927165321380-418549834.png)

## 开发

### 开发依赖平台组件

| 名称        | 说明                                                  |
| ----------- | ----------------------------------------------------- |
| GitLab      | 代码管理                                              |
| Nexus       | 依赖管理                                              |
| Zookeeper   | 服务注册发现                                          |
| Dubbo Admin | 服务监控                                              |
| Apollo      | 分布式配置中心                                        |
| Solr        | 全文检索引擎                                          |
| Mysql       | 数据库                                                |
| Nginx       | 反向代理服务器，主要解决跨域问题，以及FastDFS的ng模块 |
| FastDFS     | 分布式文件存储服务                                    |



### 代码结构如下：

![](https://img2020.cnblogs.com/blog/1454956/202009/1454956-20200927170107506-1723236386.png)

每个项目简单说明：

| 名称                            | 说明                                                         |
| ------------------------------- | ------------------------------------------------------------ |
| myshop-dependencies             | 所有项目的父项目，主要管理依赖版本，依赖私服地址，发布私服地址，插件 |
| myshop-commons                  | 通用工具类，主要提供一个AppContext，用于手动注册Bean         |
| myshop-commons-domain           | 通用的领域模型                                               |
| myshop-commons-mapper           | 通用的数据访问，使用tk.mybatis，简化访问代码                 |
| myshop-databases                | 该项目只负责生成相关文件，使用 MyBatis 自动生成插件生成实体类对象和数据访问接口，再把实体类和数据访问接口放到Domain和Mapper项目下，用于避免生成错误覆盖原有的文件 |
| myshop-static-backend           | 该项目的主要作用是将通用的静态资源文件打包到一个项目里，利用 Maven 的依赖机制其他项目可以很方便的共用，就不需要手工重复复制这些静态资源文件了，主要使用了Metronic 4.7.5的模板项目 |
| myshop-commons-dubbo            | 通用的Dubbo依赖项目，以便于所有 Dubbo 项目统一依赖，序列化器使用kyro |
| myshop-service-user-api         | 定义用户管理相关接口                                         |
| myshop-service-user-provider    | 用户管理服务提供者，用redis实现了mybatis的二级缓存           |
| myshop-service-user-consumer    | 用户管理服务消费者                                           |
| myshop-service-content-api      | 定义内容管理相关接口                                         |
| myshop-service-content-provider | 内容管理服务提供者                                           |
| myshop-service-content-consumer | 内容管理服务消费者                                           |
| myshop-api-gateway              | 服务网关，手动实现服务聚合功能                               |
| myshop-web-admin                | 因为感觉api-gateway项目不太合适，因此聚合功能挪到该项目下    |
| myshop-service-upload           | 文件上传服务，使用了FastDFS客户端                            |
| myshop-service-redis-api        | redis缓存服务相关接口                                        |
| myshop-service-redis-provider   | redis缓存服务提供者                                          |
| myshop-service-search-api       | 全文搜索服务相关接口                                         |
| myshop-service-search-provider  | 全文搜索服务提供者                                           |
| myshop-service-search-consumer  | 全文搜索服务消费者                                           |

## 部署

使用了GitLab runner 和 jenkins两套部署方式，都实现了从git拉取代码，构建代码，打包镜像整个过程

## 其他

资源文件夹里，主要存放有数据库脚本等

bin文件夹，主要存放maven 清理、安装、部署等的bat文件，避免重复操作