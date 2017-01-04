public class Employee{
  String firstName;
  String lastName;
  double salary;
  public Employee(){
    firstName = "Bob";
    lastName = "Fox";
    salary = 5000;
  }
  public Employee(String fName, String lName, double sal){
    firstName = fName;
    lastName = lName;
    salary = sal;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public double getSalary(){
    return salary;
  }
  public void setFirstName(String name){
    firstName = name;
  }
  public void setLastName(String name){
    lastName = name;
  }
  public void setSalary(double value){
    if (value>0)
      salary = value;
  }
}
