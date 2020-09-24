SpringFramework中控制Bean生命周期的三种方式:
init-method & destroy-method 最后         xml 、注解原生支持
@PostConstruct & @PreDestroy 最先	     注解原生支持，xml需开启注解驱动
InitializingBean & DisposableBean 中间    xml 、注解原生支持
