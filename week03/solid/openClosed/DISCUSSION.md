

rm *.class
javac Student.java
mkdir hide
mv Student.java ./hide/.
jar cf Student.jar Student.class
javac -cp "Student.jar" Discussion.java
java Discussion



