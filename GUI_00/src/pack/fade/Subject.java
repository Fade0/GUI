package pack.fade;

import java.util.Arrays;

public class Subject {
    private String subjectName;
    private Person teacher;
    private Person[] studentList;

    public Subject(String subjectName){
        this.subjectName = subjectName;
        studentList = new Person[20];

    }

    public void setTeacher(Person person){
        teacher = person;
    }

    public void addStudent(Person person) throws TooManyStudentsException {
        for (int i = 0; i < studentList.length; i++){
            if(studentList[i] == null){
                studentList[i] = person;
                return;

            }
            throw new TooManyStudentsException();
        }
    }

    @Override
    // GUI , teacher : Jan , students : Jasiek
    public String toString() {
        String text = subjectName + ", teacher: " + teacher.getName() + " students: ";
        for (int i = 0; i<studentList.length; i++){
            if (studentList[i] != null){
                if (i>1){
                    text = text +", " + studentList[i];
                }
                else{
                    text = text + studentList[i];
                }


            }
            if (i == studentList.length - 1){
                text = text + ".";
            }

        }
        return text;
    }
}
