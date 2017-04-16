# ssh
Spring + Struts2 + Hibernate

项目结构如下：

![enter image description here](http://oimbmvqt3.bkt.clouddn.com/00001.PNG)

层次写得比较细：

- jsp 是表示层。通过它提交过来的数据交给 Controller（Struts2_filter）；

- Controller 帮我们调用具体的 Action；

- Action 再帮我们调用后面的业务逻辑（UserManager、UserManagerImpl、User）；

- 根据业务逻辑返回的结果，找到对应的 view，反馈给客户端，MVC 中 V 和 C；

- Model 中，两大层：

   - business 层：管理层（抽象的抽象层 UserManager、具体的实现层 UserManagerImpl）、实体层 User；
   
   - DAO 层：抽象层、实现层。DAO 负责和数据库打交道。






