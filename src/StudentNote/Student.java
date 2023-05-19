package StudentNote;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matQuiz;
    Course fizikQuiz;
    Course kimyaQuiz;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya , Course matQuiz, Course fizikQuiz, Course kimyaQuiz) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matQuiz =matQuiz;
        this.fizikQuiz =fizikQuiz;
        this.kimyaQuiz =kimyaQuiz;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matQuiz, int fizikQuiz, int kimyaQuiz) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (matQuiz >= 0 && matQuiz <= 100) {
            this.matQuiz.note = matQuiz;
        }
        if (fizikQuiz >= 0 && fizikQuiz <= 100) {
            this.fizikQuiz.note = fizikQuiz;
        }
        if (kimyaQuiz >= 0 && kimyaQuiz <= 100) {
            this.kimyaQuiz.note = kimyaQuiz;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||
           this.matQuiz.note == 0 || this.fizikQuiz.note == 0 || this.kimyaQuiz.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {


        this.avarage = (((this.fizik.note * 0.8) + (this.fizikQuiz.note * 0.2)) +
                ((this.kimya.note * 0.8) + (this.kimyaQuiz.note * 0.2)) +
                ((this.mat.note * 0.8) + (this.matQuiz.note * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Quiz Notu : " + this.matQuiz.note);
        System.out.println("Fizik Quiz Notu : " + this.fizikQuiz.note);
        System.out.println("Kimya Quiz Notu : " + this.kimyaQuiz.note);
    }
}
