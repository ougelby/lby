import java.util.Random;
import java.util.Scanner;
/**
 * ����С��Ϸ
 * 
 */
public class Test3 { 
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String a = "begin";       //�����ַ���  
	System.out.println("����������ַ���");//ϵͳ�׶Σ������ַ���
	String x = i.next();
	if(a.equals(x))  //�ж�������ַ�����������Ϸ�׶�
		{
		Scanner input = new Scanner(System.in); //������µ�����
        	int number = (int) (Math.random() * 100); // ���������
        	int guess;   // �û��µ�����
        	int count = 0;  // �²����
        	System.out.println("������0��99֮���һ��������������Ӽ������롣");// �û��²������
                 /*do-whileѭ�����ж���������ֺ�
                  ������������ִ�С��ϵ�������������ѭ��*/                                                 
        	do {                                            
            	guess = input.nextInt();
            	if (number < guess) 
			{
                	System.out.println("��µ�����������������ٲ¡�");
               		 count++;
            		} 
		else if (number > guess) 
			{
                	System.out.println("��µ��������������С���ٲ¡�");
                	count++;
            		} 
		else 
			{
                	count++;
                	break;
            		}
        	} while (true);
        	 System.out.println("��¶��ˣ����������"+number);
         	 System.out.println("���ܹ��µĴ�����"+count);
        
		}
else {System.out.println("��Ϸ����");}
}
}