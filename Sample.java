public class Employee{

  public void empName(){
    System.out.println("Employee Name is : Krish");
  }

  public void empId(){
    System.out.println("Employee Id is : 211");
  }

  public void empAddress(){
    System.out.println("Employee Address is : Chennai");
  }

  public static void main(String[] args) {
    Employee e = new Employee();
    e.empId();
    e.empName();
    e.empAddress();
  }
}
