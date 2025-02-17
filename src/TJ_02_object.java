//:Property .java
import java.util.Date;
import java.util.Properties;

/** The First Thinking in Java exmple program.
 * List system information on current machine.
 * @author Bruce Eckel
 * @author http://www.BruceEckel.com
 * @version 1.0
 */
//第一个程序
public class TJ_02_object {
    /** Sole entry point to class & application
     * @param args  array of string arguments
     * @return No return value
     * @ exception  exception No exception thrown
     * */

    public static void main(String[] args) {
        //        FirstPro firstPro=new FirstPro();
//        firstPro.lotteryOdds();

        ControlStream controlStream = new ControlStream();

//        controlStream.drawStar(5);
//        controlStream.drawStar(8);
//        controlStream.drawStar(12);

        //switch 语句练习程序
        //controlStream.switchTest();
        MyClass myClass = new MyClass();
        //myClass.calendarTest();
        myClass.pramTest();
    }

}
