# 运行
## 1 添加tomcat
## 2 配置项目路径
## 3 运行
[链接](http://localhost:8080/spring/hello)
[链接](https://juejin.im/book/6857911863016390663/section/6857750666513743883)
[链接](https://juejin.im/post/6844904189986897934)
[链接](https://juejin.im/post/6844904050132172808)
[链接](https://juejin.im/post/6844903966438850567)
[链接](https://juejin.im/search?query=spring&utm_source=gold_browser_extension&utm_medium=search)



SpringFramework-@Autowired	根据类型注入	 可指定required=false来避免注入失败
JSR250-@Resource 根据名称注入	  容器中不存在指定Bean会抛出异常
JSR330-@Inject 根据类型注入	容器中不存在指定Bean会抛出异常


SpringFramework-@Qualifier ：如果被标注的成员/方法在根据类型注入时发现有多个相同类型的 Bean ，则会根据该注解声明的 name 寻找特定的 bean
SpringFramework-@Primary ：如果有多个相同类型的 Bean 同时注册到 IOC 容器中，使用 “根据类型注入” 的注解时会注入标注 @Primary 注解的 bean
