# Inversion of control
el contenedor de spring IoC crea los objetos, configura sus dependencias, maneja todo su ciclo de vida. el contenedor usa la inyeccion de dependencia para manejar los componentes de la aplicacion.

BeanFactory --> es la version mas basica de los contenedores IoC

la idea es que no queremos modificar el codigo fuente en caso de por ejemplo tener otro nuevo tipo de sim 

## beans
the objects that form the backbone of our application and that are managed by the Spring IoC container. A bean is an objetc that is instantiated, assembled and managed by a spring IoC container.
Java objects that are configured at runtime by spring ioC container.

# BeanFactory
Se usa por lo general cuando se va a construir una aplicacion no tan grande. 
this interface is the simplest way in which we can manage the lifecycle of beans.
ojito: beanfactory no soporta la configuracion con anotaciones, ApplicationContext si.
![alt text](<Screenshot 2025-02-19 at 5.52.11 PM.png>)

# ApplicationContext
es la sub-interface de beanfactory. se usa cuando estamos creando una aplicacion de nivel empresarial o web. 
Tiene unas caracteristicas de mas que no tiene beanfactory. 

## AnnotationConfigApplicationContext
`
@Configuration  
@Component
`
## AnnotationConfigWebApplicationContext
para un ambiente web.
`
@Configuration  
@Component
`
## XmlWebApplicationContext
podemos configurar aplicaciones web con xml o con codigo de java. 

## FileSystemXmlApplicationContext

## ClassPathXmlApplicationContext

# Dependency Injection in Spring
definir interfaces para funcionalidades comunes. la tarea de instanciar objetos es hecha por el contenedor, de acuerdo a las configuraciones del desarrollador.  
Dos principales tipos de Inyeccion de dependencia en spring:
* SDI - setter dependency injection: `@Autowired`, en el archivo de configuracion de beans: `<property>`

* CDI - Constructor Dependency Injection: `<constructor-arg>` en el archivo de bean

Use constructor injection for mandatory dependencies and setter injection for optional ones. Mandatory dependencies are crucial for business logic, while optional dependencies do not hinder core functionality if null.

`
<bean id="InjectwithConstructor" class="com.example.demo.domain.Vehicle">
    <constructor-arg name="engine" ref="ToyotaBean">
    </constructor-arg>

    <constructor-arg name="tyre" ref="tyre2Bean">
    </constructor-arg>
    
</bean>
`
name attribute correlates with the constructor argument name in vehicle class. ref attribute points to the bean reference (in the bean config file) which is used for injecting

# Difference between Inversion of Control and Dependency Injection
## Spring IoC (Inversion of Control)
is the core spring framework. it handles everything about objects. 
* Creating Object for us,
* Managing our objects,
* Helping our application to be configurable,
* Managing dependencies

Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control.
The idea is to keep java classes independent of each other.

## Spring Dependency Injection
is the main functionality provided by Sprin IoC. 

### 1) Constructor-based dependency injection

`
<bean id="beanId" class="BeanClass"> 
  <constructor-arg type="String" value="test"/> 
  <constructor-arg type="int" value="1002"/> 
</bean>
`
### 2) Setter-based dependency injection

`
<bean id="beanId" class="BeanClass"> 
  <property name="secondBean" ref="SecondBean"/> 
  <property name="message" value="This is message."/> 
</bean>
`

Through setter injection using <property> tag, we can provide values like Strings, Primitives, Collections, etc. based on our requirement. In this example, we will see setter injection using Map. While we are using the map, we need to use <map> and <entry> tags to set the values to it.

`
<bean id="beanId" class="BeanClass"> 
		<property name="name" value="geeks" /> 
		<property name="name2"> 
			<map> 
				<entry key="key1" value="value1"/> 
				<entry key ="key2" value-ref="DataSource"/> 
			</map> 
		</property> 
</bean>
`

setter injection is a dependency injection in which the call first goes to no argument constructor and then to the setter method. it does not create any new bean instance. 

## constructor injection with collection
The following collections can be used inside the `<constructor-arg>` tag:
* list
* set
* map
## Bean lifecycle in Spring

beans lifecyle is managed by the spring container. 

![alt text](<Bean-Life-Cycle-Process-flow3.png>)

three ways to implement the life cycle of a bean:
* xml:  In this approach, in order to avail custom init() and destroy() methods for a bean we have to register these two methods inside the Spring XML configuration file while defining a bean.
`
<beans>
    <bean id="hw" class="beans.HelloWorld"
            init-method="init" destroy-method="destroy"/>
     
</beans>
`
* programmatic
`java
package beans;
 
import org.springframework
    .beans.factory.DisposableBean;
 
import org.springframework
    .beans.factory.InitializingBean;
 
// HelloWorld class which implements the
// interfaces
public class HelloWorld
    implements InitializingBean,
 DisposableBean {
`
* annotation

Note: To invoke the destroy() method we have to call the close() method of ConfigurableApplicationContext.

aiuda: no me estan funcionando @pre y @post

