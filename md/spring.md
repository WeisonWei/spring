 # Spring 框架

## 1 核心内容：

- **依赖注入**
- **面向切面**

-------------------

## 2 Spring框架架构
 - **spring core**
核心容器提供 Spring 框架的基本功能。核心容器的主要组件是 BeanFactory，它是工厂模式的实现。
BeanFactory 使用控制反转 （IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。
 - **spring context**
 spring 上下文是一个配置文件，向 Spring 框架提供上下文信息。
 上下文中定义的任何bean在spring容器中随处可以使用
 - **spring aop**
 通过配置管理特性，Spring AOP 模块直接将面向方面的编程功能集成到了 Spring 框架中。
 所以，可以很容易地使 Spring 框架管理的任何对象支持 AOP。
 Spring AOP 模块为基于 Spring 的应用程序中的对象提供了事务管理服务。
 通过使用 Spring AOP，不用依赖 EJB 组件，就可以将声明性事务管理集成到应用程序中。
 - **spring orm**
Spring 框架插入了若干个 ORM 框架，从而提供了 ORM 的对象关系工具，其中包括 JDO、Hibernate 和 iBatis SQL Map。
所有这些都遵从 Spring 的通用事务和 DAO 异常层次结构。
 - **spring dao**
 JDBC DAO 抽象层提供了有意义的异常层次结构，可用该结构来管理异常处理和不同数据库供应商抛出的错误消息。
 异常层次结构简化了错误处理，并且极大地降低了需要编写的异常代码数量（例如打开和关闭连接）。
 Spring DAO 的面向 JDBC 的异常遵从通用的 DAO 异常层次结构。
 - **spring web**
Web 上下文模块建立在应用程序上下文模块之上，为基于 Web 的应用程序提供了上下文。
所以，Spring 框架支持与 Jakarta Struts 的集成。Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作。
 - **spring mvc**
 MVC 框架是一个全功能的构建 Web 应用程序的 MVC 实现。
 通过策略接口，MVC 框架变成为高度可配置的，MVC 容纳了大量视图技术，其中包括 JSP、Velocity、Tiles、iText 和 POI。
 - **spring webflux**
 一个全新的异步非阻塞web框架，基于Reactor3。
 
## 2.1 IOC 容器
Spring 框架是一个分层架构，由 7 个定义良好的模块组成。
> Spring 模块构建在核心容器之上，核心容器定义了创建、配置和管理 bean 的方式.核心容器通过配置文件生成bean,以供我们进行依赖注入。

Spring IOC体系结构

(1) BeanFactory
(2) BeanDefinition
>Spring 设计的核心是 org.springframework.beans 包，它的设计目标是与 JavaBean 组件一起使用。这个包通常不是由用户直接使用，而是由服务器将其用作其他多数功能的底层中介。
>下一个最高级抽象是 BeanFactory 接口，它是工厂设计模式的实现，允许通过名称创建和检索对象。BeanFactory 也可以管理对象之间的关系。

### 2.1.1 BeanFactory 支持两个对象模型。
>单态 模型提供了具有特定名称的对象的共享实例，可以在查询时对其进行检索。Singleton 是默认的也是最常用的对象模型。对于无状态服务对象很理想。
原型 模型确保每次检索都会创建单独的对象。在每个用户都需要自己的对象时，原型模型最适合。
bean 工厂的概念是 Spring 作为 IOC 容器的基础。IOC 将处理事情的责任从应用程序代码转移到框架。正如我将在下一个示例中演示的那样，Spring 框架使用 JavaBean 属性和配置数据来指出必须设置的依赖关系。
### 2.1.2 BeanFactory 接口
因为 org.springframework.beans.factory.BeanFactory 是一个简单接口，所以可以针对各种底层存储方法实现。最常用的 BeanFactory 定义是 XmlBeanFactory，它根据 XML 文件中的定义装入 bean，
如 1 所示。
- 1 XmlBeanFactory
```shell script
BeanFactory factory = new XMLBeanFactory(new FileInputSteam("mbean.xml"));
```
在 XML 文件中定义的 Bean 是被消极加载的，这意味在需要 bean 之前，bean 本身不会被初始化。要从 BeanFactory 检索 bean，只需调用 getBean() 方法，传入将要检索的 bean 的名称即可，如 2 所示。
- 2 getBean()
```shell script
MyBean mbean = (MyBean) factory.getBean("mbean");
```
每个bean的定义都可以是POJO（用类名和 JavaBean 初始化属性定义）或FactoryBean。
FactoryBean 接口为使用 Spring 框架构建的应用程序添加了一个间接的级别。
纯java工程加载spring上下文通过ClassPathXmlApplicationContext装入Spring 配置文件。
装入 bean 之后，就可以通过 getBean() 方法访问它们了，
```shell script
ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"springExample.xml"});
CreateCreditCardAccountInterface creditCardAccount = (CreateCreditCardAccountInterface)appContext.getBean("createCreditCard");
```
## 2.2 AOP 面向切面


