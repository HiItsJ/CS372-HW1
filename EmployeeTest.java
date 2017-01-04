public class EmployeeTest{
  public static void main(String[] args){
    Employee Bob = new Employee();
    Employee Dave = new Employee("Dave", "Hill", 6000);
    double raisedSalary1 = (Bob.getSalary()*12)*1.1;
    double raisedSalary2 = (Dave.getSalary()*12)*1.1;
    System.out.printf("%s's yearly salary is %f\n%s's yearly salary is %f\nAfter a 10%% raise:\n%s's yearly salary becomes %f\n%s's yearly salary becomes %f\n", Bob.getFirstName(), Bob.getSalary()*12, Dave.getFirstName(), Dave.getSalary()*12, Bob.getFirstName(), raisedSalary1, Dave.getFirstName(), raisedSalary2);
  }
}
