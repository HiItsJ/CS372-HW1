public class Date{
  int month;
  int day;
  int year;
  public Date(int m, int d, int y){
    month = m;
    day = d;
    year = y;
  }
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }
  public int getYear(){
    return year;
  }
  public void setMonth(int m){
    month = m;
  }
  public void setDay(int d){
    day = d;
  }
  public void setYear(int y){
    year = y;
  }
  public void displayDate(){
    System.out.printf("%d/%d/%d\n", month, day, year);
  }
}
