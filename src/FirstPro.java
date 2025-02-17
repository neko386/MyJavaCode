import java.math.BigInteger;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class FirstPro {

    public void paperInch()
    {
        final double CM_PER_INCH=2.54;
       double PaperWidth=8.4;
        double PaperHight=11;
        System.out.println("Paper size is centimeters:"+PaperWidth*CM_PER_INCH+"by"+PaperHight*CM_PER_INCH);

    }
//        /*
//
//        这部分用于训练java的变量定义和赋值
//        final double CM_PER_INCH=2.54;
//        double PaperWidth=8.4;
//        double PaperHight=11;
//        System.out.println("Paper size is centimeters:"+PaperWidth*CM_PER_INCH+"by"+PaperHight*CM_PER_INCH);
//         */
//
      public void retiredForcast() {
          // read inputs
          Scanner in = new Scanner(System.in);
          System.out.println("How much money do you need to retire?");
          double goal = in.nextDouble();

          System.out.println("How much money do you contribute every year?");
          double payment = in.nextDouble();
          System.out.println("Interest rate in %:");
          double interestRate = in.nextDouble();
          double balance = 0;
          int years = 0;
          while (balance < goal) {
              //add this year's payment and interest
              balance += payment;
              double interest = balance * interestRate / 100;
              balance += interest;
              years++;
          }
          System.out.println("you can retire in " + years + " years");

      }

    public void computerMemory() {
        System.out.println(new Date());
        Properties p=System.getProperties();
        p.list(System.out);
        System.out.println("---Memory Usage:");
        Runtime rt=Runtime.getRuntime();
        System.out.println("Total Memory="
                +rt.totalMemory()
                +" Free Memory="
                +rt.freeMemory()
        );
    }
    /*This program demonstrates console input.
 @version 10.32 2025-02-13
 @author hao_zhou
 * */
    public void InoutTest() {
        Scanner in = new Scanner(System.in);
        //get first input
        System.out.println("what is you name?");
        String name = in.nextLine();

        //get second input
        System.out.println("how old are you?");
        int age = in.nextInt();

        //display output on console
        System.out.println("Hello " + name + " Next year you'll be " + (age + 1));
    }

    /*This program demonstrates a <code> for </code>loop.
    @version 10.48 2025-02-13
    @author hao_zhou
    * */
        public void lotteryOdds()
        {
            Scanner in =new Scanner(System.in);
            System.out.println("how many numbers do you to draw?");
            int n=in.nextInt();

            System.out.println("what is the highest number you can draw?");
            int k=in.nextInt();


            /*
             * compute binomial coefficient n*(n-1)*(n-2)*~*(n-k+1)/1*2*3~*k*/
            BigInteger lotteryOdds=BigInteger.valueOf(1);
            for(int i=1;i<=k;i++)
            {
                lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
            }
            System.out.println("Your odds are 1 in "+lotteryOdds+". Good luck!");
        }

        public void ArrayTest()
        {
            int[] age={61,62,52,63,74,45};
            String[] author={
                    "James",
                    "Bill",
                    "Steel"
            };
            for (int i=0;i<age.length;i++){
                System.out.println(age[i]+" ");
            }
            for (int element:age){
                System.out.println(element+" ");
            }
        }

        public void D2ArrayTest()
        {
            final double STARTRATE=10;
            final  int NRATES=6;
            final int NYEARS=10;
            // set interst rates to 10 , , , 15%

            double [] interestRate=new double[NRATES];
            for(int j=0;j<interestRate.length;j++)
            {
                interestRate[j]=(STARTRATE+j)/100.0;
            }

            double [][] balances =new double [NRATES][NRATES];

            //set initial balances to 1000
            for (int j =0;j<balances.length;j++)
            {
                balances[0][j]=1000;
            }
            //compute interest for future  years

            for(int i=1;i<balances.length;i++){
                for(int j=0;j<balances[i].length;j++){
                    //get last year's balances from previous row
                    double oldBalance=balances[i-1][j];

                    //compute interest
                    double interest =oldBalance*interestRate[j];

                    //compute this year's balances
                    balances[i][j]=interest+oldBalance;
                }
            }
            //print one row of interest rates
            for (int j=0;j<interestRate.length;j++)
            {
                System.out.printf("%9.0f%",100*interestRate[j]);
            }
            System.out.println();

            //print balance table
            for (double [] row:balances)
            {
                // print table row
                for (double b:row)
                {
                    System.out.printf("%10.2f%",b);
                }
                System.out.println();
            }
        }

}

