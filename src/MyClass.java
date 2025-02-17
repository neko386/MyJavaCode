import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyClass {
    /** The class example.
     * @author zhouhao
     */
    public void calendarTest()
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today =date.getDayOfMonth();
        date=date.minusDays(today-1);
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();

        System.out.println("Mon Fri Wed Thu Fri Sat Sun");
        for (int i=1;i<value;i++)
        {
            System.out.print("    ");
        }

        while(date.getMonthValue()==month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
public  void employeeTest()
{
    //fill the staff array with three Employee objects
    Employee[] staff=new Employee[3];
    staff[0]=new Employee("Cracker",8000);//,1986,8,19);
    staff[1]=new Employee("Hacker",6000);//1988,10,13);
    //staff[0]=new Employee("Tester",9600,1985,6,14);//初始对象赋值赋错位置，导致raiseSalary返回值为空，导致程序错误
    staff[2]=new Employee("Tester",9600);//1985,6,14);

    for (Employee e:staff){
        e.raiseSalary(15);
    }

    for (Employee e:staff){
        System.out.println("name="+e.getName()+", salary="+e.getSalary());//", hireDay"+e.getHireDay());
    }

}

public  void pramTest(){
    /**
     * Test1: Methods can't modify numeric parameters
     */
    System.out.println("Testing tripleValue");
    double percent=10;
    System.out.println("Before:percent="+percent);
    tripleValue(percent);
    System.out.println("After:percent="+percent);
    /**
     * Test2: Methods can change the state of object parameters
     */
    System.out.println("\nTesting tripleSalary:");
    Employee harry =new Employee("Harry",8000);
    System.out.println("Before:Salary="+harry.getSalary());
    tripleSalary(harry);
    System.out.println("After:Salary="+harry.getSalary());

    /**
     * Test4: Methods can change the state of object parameters
     */
    System.out.println("\nTesting triplenumber:");
    Number y=new Number(100);
    int x=y.intNumber;
    System.out.println("Before:intNumber="+y.intNumber);
    tripleNumber(y);
    System.out.println("After:intNumber="+y.intNumber+",原来的intNumber="+x);


    /*
    * Test3: Methods can't attach new objects to object parameters
    * */
    System.out.println("\nTesting swapTest:");
    Employee Bob =new Employee("Bob",9000);
    Employee Alice =new Employee("Alice",4500);
    System.out.println("Before:Bob="+Bob.getName());
    System.out.println("Before:Alice="+Alice.getName());
   swapTest(Bob,Alice);

    System.out.println("After:Bob="+Bob.getName());
    System.out.println("After:Alice="+Alice.getName());


}
// this method don't work
public  static void tripleValue(double x){
        x=x*3;
        System.out.println("End of method: x="+x);
}
//this method work
public  static void tripleSalary(Employee x){
        x.raiseSalary(20);
        System.out.println("End of method: salary="+x.getSalary());

    }
    public  static void tripleNumber(Number x){
        x.intNumber=200;
        System.out.println("End of method: salary="+x.intNumber);

    }

    public static void swapTest(Employee x,Employee y){
        Employee temp=x;
        x=y;
        y=temp;

    }
    class  Number{
        private int intNumber;
        public Number(int number){
            intNumber=number;
        }

        public int getIntNumber() {
            return intNumber;
        }
    }

    class  Employee{
        private  String name;
        private  double salary;
        private  LocalDate hireDay;
        public Employee(String n, double s) {
            name=n;
            salary=s;
            //hireDay=LocalDate.of(year,month,day);
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
//        public LocalDate getHireDay() {
//            return hireDay;
//        }
        public void raiseSalary(double byPercent)
        {
            double raise =salary*byPercent/100;
            salary+=raise;
        }


    }


}
