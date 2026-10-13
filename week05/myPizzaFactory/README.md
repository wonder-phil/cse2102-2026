# myPizzaFactory

>
> javac *.java <br />
> java PizzaStore <br />
>> Enter your favorite type of pizza <br />

--- <br />

> wget https://search.maven.org/remotecontent?filepath=junit/junit/4.13.2/junit-4.13.2.jar -O junit-4.13.2.jar <br />
> wget https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -O hamcrest-core-1.3.jar <br />

---<br />

> javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar  PizzaFactoryTest.java <br />
> java  -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore PizzaFactoryTest <br />
> javac  -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar TranslatePizzaTypeTest.java <br />
> java  -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TranslatePizzaTypeTest <br />

> 