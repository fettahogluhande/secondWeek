public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteS;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.noteS = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve bölüm uyuşmuyor!");
        }
    }

    void printTeacherinfo() {
        this.teacher.print();
    }
}
