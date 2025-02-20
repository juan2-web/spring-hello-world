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