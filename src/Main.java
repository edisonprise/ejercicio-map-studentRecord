import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();

        //Agregamos estudiantes al map
        studentRecord.addStudent("Edinson", 85);
        studentRecord.addStudent("Emilio", 90);
        studentRecord.addStudent("Anderson", 78);

        //Validamos si el estudiante esta en el map
        System.out.println("Esta Edinson en el registro de alumnos?: " + studentRecord.isStudentInRecord("Edinson"));
        System.out.println("Esta Ana en el registro de alumnos?: " + studentRecord.isStudentInRecord("Ana"));

        //Obtenemos una calificacion con la clave, el nombre del estudiante;
        System.out.println("Calificacion de Anderson: " + studentRecord.getGrade("Anderson"));

        studentRecord.removeStudent("Emilio");
        System.out.println("Esta Emilio en el registro de alumnos: " + studentRecord.isStudentInRecord("Emilio"));

        System.out.println("la calificacion 85 esta en el registro?: " + studentRecord.isGradeInRecord(85));

        //Obtenemos las claves del map para luego recorrer el map
        Set<String> studentsNames = studentRecord.getStudentsNames();
        System.out.println("Nombres de los alumnos en el registro:");
        for(String name : studentsNames) {
            System.out.println(name);
        }
    }
}