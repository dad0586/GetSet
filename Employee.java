public class Employee {
    String firstName;
     String lastName;
//        public void show(){
//            System.out.println("Employee");
//        }
//        public String getDetail(){
//            return "Salom";
//        }
//
//    @Override
//    public String toString() {
//        return "SALOM";
//    }
        public void setFirstName(String a){
            firstName =a ;
        }

    public String getFirstName() {
        return firstName;
    }
         public void setLastName(String a){
            lastName=a;
         }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return " " + firstName + " , "  + lastName ;
    }
}
