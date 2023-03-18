import java.util.Scanner;

class Student {
    String reg, name, email, phone, cls, dept;

    public Student() {}

    public Student(String reg, String name, String email, String phone, String cls, String dept) {
        this.reg = reg;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cls = cls;
        this.dept = dept;
    }

    public void printDetails() {
        System.out.println("Reg: " + reg + "\nName: " + name + "\nPhone: " + phone + "\nEmail: " + email 
                            + "\nClass: " + cls + "\nDept: " + dept);
    }
}

public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        String cont;

        do {
            
            System.out.println("1. Add a Student");
            System.out.println("2. Search for a Student");
            System.out.println("3. Show all Students");
            
            int opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 1:
                    int cnt = 0;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            cnt++;
                        }
                    }
                    System.out.println("Reg: ");
                    String reg = sc.nextLine();
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    System.out.println("Phone: ");
                    String phone = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Class: ");
                    String cls = sc.nextLine();
                    System.out.println("Dept: ");
                    String dept = sc.nextLine();

                    students[cnt] = new Student(reg, name, email, phone, cls, dept);
                    break;

                case 2:
                    int notNull = 0;
                    for (int k = 0; k < students.length; k++) {
                        if (students[k] != null) {
                            notNull++;
                        }
                    }
                    System.out.print("Search name: ");
                    String sName = sc.nextLine();
                    for (int j = 0; j < notNull; j++) {
                        if ((students[j].name).equals(sName)) {
                            students[j].printDetails();
                        } else {
                            System.out.println("No name found.");
                        }
                    }
                    break;

                case 3:
                    int nonNull = 0;
                    for (int k = 0; k < students.length; k++) {
                        if (students[k] != null) {
                            nonNull++;
                        }
                    }

                    for (int c = 0; c < nonNull; c++) {
                        students[c].printDetails();
                    }
                    break;
            }
            System.out.print("Press 0 to end or any key to continue: ");
            cont = sc.nextLine();
        } while (!cont.equals("0"));
    }
}
