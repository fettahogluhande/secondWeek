public class Main {
    public static void main(String[] args) {

    Teacher t1 = new Teacher("Hande","000","TRH");
    Teacher t2 = new Teacher("Şebnem","111","FZK");
    Teacher t3 = new Teacher("Özlem","222","BIO");

    Course tarih = new Course("Tarih","101","TRH",t1);
    tarih.addTeacher(t1);
    Course fizik = new Course("Fizik","101","FZK",t2);
    fizik.addTeacher(t2);
    Course biyoloji = new Course("Biyoloji","101","BIO",t3);
    biyoloji.addTeacher(t3);

    Student s1 = new Student("Neşet","4","188",tarih,fizik,biyoloji);
    s1.addBulkExamNote(70,80,90,10,20,30);
    s1.isPass();

    Student s2 = new Student("Nalan","4","199",tarih,fizik,biyoloji);
    s2.addBulkExamNote(50,60,70,40,50,60);
    s1.isPass();
    }
}