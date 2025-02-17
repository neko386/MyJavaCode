import java.util.Scanner;

public class ControlStream {
    //Assignment with objects is a bit tricky

    //绘画出三角星星
    public void drawStar(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    Scanner Input=new Scanner(System.in);
    public void  switchTest()
    {
        //等级的初始值
        int Score=-1;

        //实例化输入类

        System.out.println("请输入张倩同学的美术学习班结业评价（请你输入1、2、3、4）:");
        //获取等级评价分数
        Score=Input.nextInt();

        //根据成绩等级给她给予相应的奖励
        switch(Score)
        {
            case 1:
                System.out.println("带去九寨沟旅游！");
                break;
            case 2:
                System.out.println("奖励一个变形金刚！");
                break;
            case 3:
                System.out.println("中性评价，勉励他继续努力。");
                break;
            case 4:
                System.out.println("拖家里的地板一个星期");
                break;
            default:
                System.out.println("结果输入错误");
                break;
        }
    }

    //这是瑞达系统基础的显示代码
    int engNo=-1;
    String engName="";
    int engSex=-1;

    int engEdu=-1;
    int basSalary=6000;
    boolean status=false;

    public  int showMenu()
    {
        System.out.println("--------------------------");
        System.out.println("|瑞达计划java工程师管理系统|");
        System.out.println("输入java工程师的资料");
        System.out.println("删除java工程师的资料");
        System.out.println("查询java工程师的资料");
        System.out.println("修改java工程师的资料");
        System.out.println("计算java工程师的月薪");
        int userSel=Input.nextInt();

        return  userSel;

    }
    public void inputEngInf()
    {
        if(status){
            System.out.println("java工程师的录入完成，可以选择4进行修改！");
        }
        else {
            while(!status)
            {
                System.out.print("请输入java工程师的编号");
                engNo=Input.nextInt();
                if(engNo<0){
                    status=false;
                    System.out.print("java工程师的编号不能为负号！");
                    continue;
                }
                else {
                    status=true;
                }

                System.out.print("请输入java工程师的姓名");
                engNo=Input.nextInt();
                if(engName.length()==0){
                    status=false;
                    System.out.print("java工程师的编号不能为空！");
                    continue;
                }
                else {
                    status=true;
                }

                System.out.print("请输入java工程师的姓别（1为男性，2为女性）");
                engSex=Input.nextInt();
                if(engSex!=1&&engSex!=2){
                    status=false;
                    System.out.print("java工程师的编号不能为空！");
                    continue;
                }
                else {
                    status=true;
                }
            }

        }

    }




}
