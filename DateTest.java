public class DateTest{
  public static void main(String[] args){
    Date birthday = new Date(6, 7, 1998);
    birthday.displayDate();
    birthday.setMonth(7);
    birthday.setDay(8);
    birthday.setYear(1999);
    birthday.displayDate();
  }
}
