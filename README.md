#hello-gradle
用gradle来管理java项目的示例


---
##运行的前提条件：
1.必须要有mysql环境，连接字符串参见src/main/resources/spring-context.xml  

2.数据表的创建脚本见src/main/resources/sql/init.sql  

3.本项目使用log4j2来记录日志，默认级别为debug，运行时会输出大量信息,包括mybatis的执行sql,如果希望看上去清静些，
可以调整src/main/resources/log4j2.xml里的日志级别
  
  
---

##gradle主要用法：

######查看所有可用的task  

gradle task  

---
######编译（编译过程中会进行单元测试）    

gradle build  

---
######单元测试  

gradle test  

---

######编译时跳过单元测试  

gradle build -x test  

---

######直接运行项目
gradle run  

---

######清空所有编译、打包生成的文件(即：清空build目录)  

gradle clean   

---

######生成mybatis的model、mapper、xml映射文件  

gradle mybatisGenerate  

注：
生成前，先修改src/main/resources/generatorConfig.xml 文件中的相关参数 ，
比如：mysql连接串，目标文件的生成路径等等

---
######生成可运行的jar包  

gradle installApp   



生成的文件在build/install/hello-gradle下，其中子目录bin下为启动脚本，
子目录lib为生成的jar包

---
######打包源代码  

gradle sourcesJar  

打包后的源代码，在build/libs目录下


---
######安装到本机maven仓库  

gradle install  

此命令跟maven install的效果一样  

---
######生成pom.xml文件  

gradle createPom  

将会在build根目录下生成pom.xml文件，把它复制项目根目录下，即可将gradle方便转成maven项目