import java.util.Random;
import java.util.Scanner;
/**
 * 猜数小游戏
 * 
 */
public class Test3 { 
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String a = "begin";       //声明字符串  
	System.out.println("请输入相关字符串");//系统阶段，输入字符串
	String x = i.next();
	if(a.equals(x))  //判断输入的字符串，进入游戏阶段
		{
		Scanner input = new Scanner(System.in); //输入你猜的数字
        	int number = (int) (Math.random() * 100); // 产生随机数
        	int guess;   // 用户猜的数字
        	int count = 0;  // 猜测次数
        	System.out.println("请你在0到99之间猜一个整数，并将其从键盘输入。");// 用户猜测随机数
                 /*do-while循环，判断输入的数字和
                  随机产生的数字大小关系，若相等则跳出循环*/                                                 
        	do {                                            
            	guess = input.nextInt();
            	if (number < guess) 
			{
                	System.out.println("你猜的数比随机产生数大，再猜。");
               		 count++;
            		} 
		else if (number > guess) 
			{
                	System.out.println("你猜的数比随机产生数小，再猜。");
                	count++;
            		} 
		else 
			{
                	count++;
                	break;
            		}
        	} while (true);
        	 System.out.println("你猜对了，这个数字是"+number);
         	 System.out.println("您总共猜的次数是"+count);
        
		}
else {System.out.println("游戏结束");}
}
}