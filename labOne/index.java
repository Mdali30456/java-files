
public class index {
    public static void main(String[] args) {

        String name = "ali";
        String studentId = "E243045";
        int age = 19;
        String email = "ali123456789004@gmail.com";
        String phone = "+880123456783";
        String address = "sondip, Chattogram";

       
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);


        System.out.printf("\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone, address);
    }
}