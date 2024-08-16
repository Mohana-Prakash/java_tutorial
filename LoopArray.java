class Student {
    int rollno;
    String name;
    int marks;
}

class LoopArray {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 34234;
        s1.name = "Mohan";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 54745;
        s2.name = "Vijay";
        s2.marks = 75;

        Student s3 = new Student();
        s3.rollno = 79867;
        s3.name = "Guru";
        s3.marks = 67;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
