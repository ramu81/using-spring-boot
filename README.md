# using-spring-boot

Events are meant for exchanging information between loosely coupled components. 
As there is no direct coupling between publishers and subscribers, it enables us to 
modify subscribers without affecting the publishers and vice-versa.

We can publish application events using the Spring Framework’s event publishing mechanism.

We use the ApplicationEventPublisher interface to publish our events

There are two ways to define a listener. 
We can either use the @EventListener annotation or 
implement the ApplicationListener interface. In either case, 
the listener class has to be managed by Spring.

What You Can Do with Spring Boot :

	Spring Boot offers a fast way to build applications. It looks at your classpath and 
at the beans you have configured, makes reasonable assumptions about what you are missing, 
and adds those items. With Spring Boot, you can focus more on business features and less 
on infrastructure.

	Spring Boot dynamically wires up beans and settings and applies them to your application 
context.

>mkdir src\main\java\edu\chinna\kadhira

>start notepad++ src\main\java\edu\chinna\kadhira\HelloController.java

	The class is flagged as a @RestController, meaning it is ready for use by Spring MVC to 
handle web requests.

>start notepad++ src\main\java\edu\chinna\kadhira\Application.java

set path;

>path=.;C:\softwares\jdk-14.0.1\bin;C:\softwares\gradle-6.4.1\bin;C:\Program Files\Notepad++;

create the gradle wraper

>gradle wrapper --gradle-version 6.4.1

add java home @ gradlew.bat file @ line 54

>set JAVA_HOME=C:\softwares\jdk-14.0.1
Run the application
>gradlew bootRun

Add Unit Tests
You will want to add a test for the endpoint you added, and Spring Test provides 
some machinery for that.

>mkdir src\test\java\edu\chinna\kadhira

>start notepad++ src\test\java\edu\chinna\kadhira\HelloControllerTest.java
>start notepad++ src\test\java\edu\chinna\kadhira\HelloControllerIT.java
run the tests 
>gradlew test

Spring Boot - Dependency Injection 
>mkdir src\main\java\edu\chinna\kadhira\beans
>start notepad++ src\main\java\edu\chinna\kadhira\beans\TextEditor.java
>start notepad++ src\main\java\edu\chinna\kadhira\beans\FancyEditor.java

Stereotype Annotations in Spring :

	Stereotype annotations are markers for any class that fulfills a role within an 
application. Spring @Component, @Repository, @Service and @Controller are Stereotype 
Annotations. @Component is generic stereotype annotation for any Spring-managed component. 
