package domain.db;

import domain.model.Student;

import java.util.ArrayList;

public class StudentDB {
    public ArrayList<Student> students;
    public StudentDB(){
        students = new ArrayList<>();
        Student greetje = new Student("Jongen", "Greetje", "Toegepaste Informatica", 23);
        Student kristien = new Student("Melaerts", "Kristien", "Chemie", 21);
        Student elke = new Student("Steegmans", "Elke", "Vroedkunde", 16);
        Student jan = new Student("Van Hee", "Jan", "Verpleegkunde", 18);
        students.add(greetje);
        students.add(kristien);
        students.add(elke);
        students.add(jan);
    }
    public Student FindStudent(String voornaam, String famillienaam){
        for (Student s: students) {
            if (s.getVoornaam().equals(voornaam) && s.getNaam().equals(famillienaam)) {
                return s;
            }
        }
        return null;
    }
}
