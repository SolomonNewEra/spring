package com.motivationReloaded;

public class MyNotes {
    /*
    for XML Configuration

    create a file named spring.xml under resources.
    In your main class, write ApplicationContext context = new ClassPathXMLApplicationContext(spring.xml);
    then create your object, eg Doctor doctor = context.getBean("Doctor.class");
     In your XML file, create your bean definition
     <beans>
        <bean  id="doctor" class="packageName.nameOfClass">
            <property name="qualification" value="MBBS"></>
        </bean>
     </beans>

     for Annotation based Configuration
     In your xml file, remove the bean definition you had earlier for xml configuration and replace it with:
     <context:component-scan base-package="packageName></context:component-scan>
     Go to the class you want to bring in from spring contain, annotate it with @Component

     for Java Based Configuration
     create a configuration class in your package and name it BeanConfig
     In the class created, annotate it with @Configuration and @ComponentScan(basePackages ="packageName")
     Then go to your main class where you are to get the object into:

     ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
     each of the class you want to get from the bean container should be annotated with @Component.
     However, you can remove the annotation and write the bean in the bean configuration file as this:

     @Bean
     public Doctor doctor(){
     return new Doctor();
     }

     Scopes in Bean Definition
     There are five types of scope available in bean configuration
     --- Singleton
     --- Prototype
     ---Request
     --- Session
     --- Global Session

     The last three are used when web application is available.

     By default, all bean are created using singleton scope, by default one, it is only one object that is available for only one class
     int the application.
     one object in one application.

     LIFE CYCLE OF A BEAN
     Instantiate->Populate properties-> BeanNameAware's setBeanName()
            ->
      BeanFactoryAware's setBeanFactory() -> ApplicationContextAware's setApplicationContext() -> Preinitialization BeanPostProcessors
            ->
      InitializingBean's afterPropertiesSet() -> Call Custom init-method -> Postinitialization BeanPostProcessors

                    ->
                Bean is Ready to use
                Container is Shut Down
                    ->
       DisposableBean's destroy() -> Call Custom destroy-method ((stop)) Then bean will be cleared from the jvm
                ->

                Figure 2.3 The lifecyle of a bean in a spring application context extends the lifecycle of a factory-contained
                bean by adding a step to make the bean application context aware.

                AOP
                It removes the crosscutting concepts
                it keeps login, authentication seperate from business logic.
                We will use aspectJ framework.


     */
}
