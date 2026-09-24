public class DigitalTwinFacotry {

    public Student createStudent(String studentType) {
        switch (studentType) {
        case "superStudent":
            return new Student();
        case "TA":
            return new TeachingAssistant();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
    }
    }

    public Student createStudentClone(Student studentToClone) {

    }

}