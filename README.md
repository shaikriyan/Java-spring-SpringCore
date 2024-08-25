Spring Core
--------------

A framework of Java, which helps in achieving loose coupling
Spring uses the concept of IOC, Inversion of control to achieve loose coupling

During the run time, Spring creates the objects in configured in config.xml file & stores them in IOC container

1.BeanFactory (I)
2.ApplicationContext (I) [BeanFactory + extra features]

XML - Way
-----------

Create the config.xml file in the src/main/resources

0.add the mvn dependencies in pom.xml file {spring-core, spring-context}
1.add the xml tag & dtd tag for the spring core
2.specify the bean objects, which you want spring to create inside the beans tags
3.use ClassPathXmlApplicationContext to let the spring know, about the config.xml file in the resources.


Dependency Injection (In short to inject the fields of a POJO)
1.Setter Injection
2.Constructor Injection (No args constructor + all args constructor is needed)

Bonus-Tip : add the Lombok dependency in the pom.xml and use the { @Data = @Getter + @Setter }

----------------------------------------------------------------------------------------------------------------

Annotations
-----------

 <context:annotation-config /> this will need to be added in the config.xml file to enable the annotations.

@Autowired
@Primary
@Qualifier
@Value
@Required

@PropertySource("applications.properties")
@Configuration              ---> to configure the ioc container using the annotations by using a class
@Bean                       ---> added at the method level inside the annotated class
@Component                  ---> added at the POJO level
@ComponentScan(package)     ---> to scan all the components
@PostConstruct              ---> will be executed after the comp has be created
@PreDestroy                 ---> before closing the IOC container

Note : @PostConstruct and @PreDestroy will need the jarkarta annotation dependencies.

Stages life cycle : Object will be created --> setters initialization --> PostConstruct --> PreDestroy


Autowired :- To automatically inject the userDefinedObject into another obj without using ref attribute in bean tag
It can also be achieved by using autowire attribute in the bean Tag

@Autowired can be added at method level (setter method) --> then it will use the setter injection

@Autowired can be added at constructor level (constructor injection) --> then it will use the constructor injection

@Autowired can be added at variable level  --> then it will *not* use the setter or constructor method to initialized

autowire : byName / byType / constructor
by default the value of this autowire attribute is "no"

byName --> It refers to the name specified in the POJO object {this uses setters Injection  + any no of objects are available}
byType --> It refers to the Class Name {this uses setters Injection  + only one single object is expected in the config.xml file}
constructor --> requires constructor to get initialized. {this uses constructor Injection  + only one single object is expected in the config.xml file}


Note : In case of byType or constructor, if two objects are initialized in the container --> then it will throw the Exception.
To avoid this exception we use the @Qualifier or @Primary

@Qualifier (more Preference)  >>>>>> @Primary


@Value("Some random value") above the property in the POJO class
@Value("${stu.val}")

Note : to read it from the properties file we will need to add the following tag to enable

    <context:property-placeholder location="classpath:applications.properties" />


@Required can't be used at variable level , use it at method levels







