package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {

    private StudentPerformanceReader reader = new StudentPerformanceReader();

    public String calculate() {
        List<StudentPerformance> students = reader.read();
        int maleStudents = 0;
        int femaleStudents = 0;
        for (StudentPerformance student : students) {
            if (student.getGender().equals("male")) {
                maleStudents++;
            } else {
                femaleStudents++;
            }
        }
        return femaleStudents + ":" + maleStudents;
    }
}
