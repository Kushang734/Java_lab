class Student {
    private int age;       // hidden

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        if(age < 0 || age > 100) {
            System.out.println("age is invalid, setting age to 0");
            age = 0;
        }
        return age;
    }
}

public class mainwsq {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(-20);
        System.out.println(s.getAge());
    }
}