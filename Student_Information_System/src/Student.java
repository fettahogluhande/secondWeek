
public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    double avg1;
    double avg2;
    double avg3;
    boolean isPass;

    Student(String name, String classes, String stuNo, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.avg1 = 0.0;
        this.avg2 = 0.0;
        this.avg3 = 0.0;
        this.isPass = false;

    }


    void addBulkExamNote(int note1, int note2, int note3, int note4, int note5, int note6) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (note4 >= 0 && note4 <= 100) {
            this.c1.noteS = note4;
        }
        if (note5 >= 0 && note5 <= 100) {
            this.c2.noteS = note5;
        }
        if (note6 >= 0 && note6 <= 100) {
            this.c3.noteS = note6;
        }
    }


    void isPass() {

        this.average = (((this.c1.note * 0.8) + (this.c1.noteS * 0.2) +
                (this.c2.note * 0.8) + (this.c2.noteS * 0.2) +
                (this.c3.note * 0.8) + (this.c3.noteS * 0.2)) / 3);


        if (this.average > 50) {
            System.out.println("Geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız!");
            this.isPass = false;
        }

        this.avg1 = (this.c1.note * 0.8) + (this.c1.noteS * 0.2);
        this.avg2 = (this.c2.note * 0.8) + (this.c2.noteS * 0.2);
        this.avg3 = (this.c3.note * 0.8) + (this.c3.noteS * 0.2);

        printNote();

    }

    void printNote() {
        System.out.println(this.c1.name + " Notunuz: \t\t" + this.c1.note + " Sözlü Notunuz: \t" + this.c1.noteS + " Ortalamanız: \t" + this.avg1);
        System.out.println(this.c2.name + " Notunuz: \t\t" + this.c2.note + " Sözlü Notunuz: \t" + this.c2.noteS + " Ortalamanız: \t" + this.avg2);
        System.out.println(this.c3.name + " Notunuz: \t" + this.c3.note + " Sözlü Notunuz: \t" + this.c3.noteS + " Ortalamanız: \t" + this.avg3);
        System.out.println("Genel Not Ortalamanız: " + this.average);
        System.out.println("========================");

    }
}
