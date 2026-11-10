# spring-example

>> Make sure java 17 is installed (see pom.xml requirement) from https://start.spring.io/ <br />
> <br />
> If not Java 17, the do the following <br /><br />
>> 

> cd demo <br />
> chmod a+x ./mvnw <br />
> ./mvnw clean install <br />
> ./mvnw spring-boot:run <br />
> curl http://localhost:8080 <br /> <br />
> curl -i -H 'Content-Type: application/json' -d 'data=Nice!'  http://localhost:8080/say_hi_back
>> NOTE: @RequestParam("data")  in Controller POST wants 'data=Nice!'
