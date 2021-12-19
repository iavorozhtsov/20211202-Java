package lesson_05;

public class Employee {
        String fio;
        String title;
        String email;
        String phone;
        int salary;
        int age;

        public Employee(){}

        public Employee(String fio, String title, String email, String  phone, int salary, int age){
            this.fio = fio;
            this.title = title;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }


        void info(){
            System.out.println("+--------------------------");
            System.out.println("|\tName:\t|\t" + fio);
            System.out.println("|\tTitle:\t|\t" + title);
            System.out.println("|\tE-mail:\t|\t" + email);
            System.out.println("|\tPhone:\t|\t" + phone);
            System.out.println("|\tSalary:\t|\t" + salary);
            System.out.println("|\tAge: \t|\t" + age);
            System.out.println("+--------------------------");
        }
}
