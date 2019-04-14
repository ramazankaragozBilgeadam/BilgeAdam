package swingmvc;

import java.util.ArrayList;
import java.util.List;

public class StudentRegisterModel {

    private Student student;
    private List<Student> studentList=new ArrayList<>();
    private Student selectedStudent;


    public void onSaveButtonAction(String name,String surname,String phone,String address){

        System.out.println("Name: "+name+" Surname: "+surname+" Phone: "+phone+" Adress: "+address);

        student=new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setPhone(phone);
        student.setAddress(address);

        if (studentList!=null){
            studentList.add(student);
        }
    }

    public void writeStudentList(){

        if (studentList!=null&&studentList.size()>0){
            studentList.stream().forEach(System.out::println);
        }
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }


    public void deleteStudent(Student student){

        if (student!=null&&studentList.size()>0){

            studentList.remove(student);
            //studentList.remove(selectedStudent);
        }

    }



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }
}
