// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee();
//    employee.show();
//    employee.getDetail();
//        System.out.println(employee.getDetail());
      //  System.out.println(employee);

             employee.setFirstName("Ali");
             employee.setLastName("Aliyev");

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.toString());

    }
}