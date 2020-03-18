# SpringBootUdemyCompleteGuide
SpringBootUdemyCompleteGuide


https://www.udemy.com/spring-boot-getting-started/
https://www.udemy.com/spring-boot-complete-guide-from-development-to-deployment/




Windows :

É necesário instalar Java JDK8, Groovy, Gradle, Spring CLI, IntelliJ no Windows.
Todos esses programas é necesário ir na página deles e instalar.

MAC :

:: - Java -
	//Verifica a versao do Java
		$ java -version
	//Verifica a versao do Gradle
		$ gradle -v
	//Ir no chrome e baixar java JDK 8
		baixar o .dmg (double click)
	//Verifica a versao do Java
		$ java -version

GVM , Groovy Environment Manager

	SKDMAN e una ferramenta para configurararversoes paralelas
		https://sdkman.io/install (Mac Installation)

	$ sdk version

	$ sdk install groovy
	$ sdk install gradle
	$ sdk install springboot





Testing the SpringBoot:

create a file: app.groovy
------------------------
@RestController
public class HelloWorld {



	@RequestMapping("/")
	public String home(){
		"Hello World!"
	}



}
------------------------
And type: spring run app.groovy 

localhost:8080

************************





Download the demo na pagina: https://start.spring.io/
Extrair o arquivo e executar:
	//Apenas listar
	spring init -list

	//Inicializando
	spring init -d web my-app

	Percemos que  tem o mesmo formato.


	-*-*-*-*-*-*-*-*
	Vamos no IntelliJ, selecionamos novo projeto, e selecionamos,
	Spring Initializr, Project Sdk (8, 11), Default: http://start.spring.io





-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*
É possível criar uma aplicacao MAVEN ou aplicacao Gradle.

Para rodar a aplicacao Maven é necesário:
	mvn spring-boot:run


Para rodar a aplicacao Gradle é necesário:
	gradle build
	gradle bootRun (tips se for no canto direito do projecto é possível ver as funcionalidades)



-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

Executable JARS
	Can be executed by Spring CLI - spring jar command
	Maven using spring-boot-maven-plugin
		mvn package
		/target/myproject-0.0.0-SNAPSHOT.jar
	Gradle using spring-boot plugin
		gradle build
		/build/libs/myproject-0.0.1-SNAPSHOT.jar


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*


	using the example app.groovy
	terminal: 
		spring jar my-app.jar app.groovy
		jar tf my-app.jar.original
	To execute:
		java -jar my-app.jar


	En un projeto Maven
		mvn clean package
		cd target/
		java -jar <nameofjarfile.jar>


	En um projecto gradle --->
		gradle build
		cd build/libs/
		java -jar <nameofjarfile.jar>




DevTools & Live Reload

	Find Action:
		buscar por Registry e ativar a opcao:
			compiler.automake.allow.when.app.running = ativar
	Ir en Preference -> Build, Execution, Deployment -> Build project automatically (activar)














Resources
There are some great resources that will be of great help along your journey into the Spring Framework and Spring Boot. I am going to list the ones I find helpful and try to update this when I find more.

Spring IO

Spring IO Website: http://www.spring.io
Spring Projects: http://spring.io/projects
Spring Guides: http://spring.io/guides
Spring Document: http://spring.io/guides
Spring Boot Docs: http://docs.spring.io/spring-boot/docs/current/ref...
Spring Boot API: http://docs.spring.io/spring-boot/docs/current/api...
Stay Connected

Twitter: twitter.com/springcentral
YouTube: spring.io/video
Questions: spring.io/questions
JIRA: jira.spring.io
Blog: http://spring.io/blog
Help

Stack Overflow: http://stackoverflow.com/questions/tagged/spring-b...
Dan Vega

Email: danvega@gmail.com
Twitter: http://www.twitter.com/therealdanvega
Facebook: http://www.facebook.com/therealdanvega
Website: http://therealdanvega.com
Blogs

Twitter

Presentations

Books















To run profiles on Spring Boot 2.x
https://stackoverflow.com/questions/31038250/setting-active-profile-and-config-location-from-command-line-in-spring-boot

mvn spring-boot:run -Dspring-boot.run.profiles=qa




