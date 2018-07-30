package rent_car;

import java.util.*;
public class Rent {
    public static void main(String[] args) {
        Car A1 = new Car();              //这几行全是对象的创建和使用
        Minibus A2 = new Minibus();
        Bus A3 = new Bus();
        LowCar A4 = new LowCar();
        HighCar A5 = new HighCar();
        Van A6 = new Van();
        Jtruck A7 = new Jtruck();
        Atruck A8 = new Atruck();

        double cost[]= new double[8];  //用cost数组存放序号1-8的车子的租金
        double money = 0;   //所有车子一天的租金
        double people[]=new double[5];   //用people数组存放能载人的车子的载人数
        double allpeople = 0;  //所有车子的总载人数
        double load[] = new double[5]; //用load数组存放能载货的车子所载的货物数
        double allload = 0; //所有车子的总货物量
        double allnum = 0; //总租车数目
        Scanner s = new Scanner(System.in);
        //下面为展示所有租车信息
        System.out.println("你可租车的信息：");
        System.out.println("序号" + "  " + "汽车名称" + "       " + "租金" + "                   " + "载人数" + "            " + "载货量");
            A1.show();
            A2.show();
            A3.show();
            A4.show();
            A5.show();
            A6.show();
            A7.show();
            A8.show();

        int k=0; //用k作为数组下标
        double num[]=new double[8]; //定义一个数组，用于存放不同序号车辆要租的数量
        //double Num[]=new double[8];
        boolean judeg =true;
        for(int i=0;i<8;i++){           //用一个循环，分别询问租不同序号车辆数，并记入数组num中
            do {                //整个do-while语句就是为了确保输入的数字是非负非小数
                System.out.println("请输入你要租序号为"+(i+1)+"的租用数量");
                num[k]=s.nextDouble();    //用num[0]-num[7]分别存储1-8序号车辆数目
                if (num[k]  == (int)num[k]){    //判断输入是否为小数
                    judeg=false;
                }
            }while(num[k]<0 || judeg);  //若输入为负数或小数，若是，则重新输入
            k++;
        }
        System.out.println("请输入您要租的天数:");
        int days=s.nextInt();
        //下面一大段依次对序号为1-8的车辆进行一天的租金，载货和载人的计算

        cost[0]=A1.getCost()*num[0];      //cost代表租金，people代表载人数，只有编号为4-6不能载人
        people[0]=A1.getPeople()*num[0];

        cost[1]=A2.getCost()*num[1];
        people[1]=A2.getPeople()*num[1];

        cost[2]=A3.getCost()*num[2];
        people[2]=A3.getPeople()*num[2];

        cost[3]=A4.getCost()*num[3];      //load代表载货量，能载货的只有编号为4-8的车
        load[0]=A4.getLoad()*num[3];

        cost[4]=A5.getCost()*num[4];
        load[1]=A5.getLoad()*num[4];

        cost[5]=A6.getCost()*num[5];
        load[2]=A6.getLoad()*num[5];

        cost[6]=A7.getCost()*num[6];
        people[3]=A7.getPeople()*num[6];
        load[3]=A7.getLoad()*num[6];

        cost[7]=A8.getCost()*num[7];
        people[4]=A8.getPeople()*num[7];
        load[4]=A8.getLoad()*num[7];
        //下面是对租金，载人数和载货数进行累加以及租车总数的计算，都是用循环结构实现
        for(int j=0;j<8;j++){
            money=cost[j]+money;
        }
        for(int m=0;m<5;m++){
            allpeople=people[m]+allpeople;
            allload=load[m]+allload;
        }
        for(int n=0;n<8;n++){
            allnum=num[n]+allnum;
        }
        //下面为数据的显示
        System.out.println("最大载人数为"+(int)allpeople+"人  "+"最大载货量为"+allload+"吨  "+"租车总费用为"+(int)(money*days)+"元  "+"租车总天数为"+days+"天 "+"总租车数为"+(int)allnum);
        //下面是分行显示各车租用数目
        for(int p =0;p<8;p++){
            if (num[p]>0)
                System.out.println("序号为"+(p+1)+"的车辆的租用数目为"+num[p]+"辆");
                System.out.println("\n");

        }
        //输入回车才结束程序
        System.out.println("请输入回车结束程序");
        new Scanner(System.in).nextLine();

    }
}