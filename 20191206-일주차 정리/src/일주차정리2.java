/*
 *		�ڹٿ��� �����ϴ� Ư������
 *		1. \n = newLine = �����ٿ� ���
 *		2. \t = tab = ���������� ��� �� ���
 *		3. \" = " = ����ǥ�� ����ϰ������ ���.
 *		ex) System.out.println("\"hello java\"") = "hello java"�� ��µȴ�.
 *		
 *
 *		System.out.println �� �����ٿ� ��� / \n�� ��������
 *		System.out.print �� ���η� �� ��� / ������ �ֱ����� \t�� ���� ����ϱ⵵��.
 *
 *
 *		System.out.printf
 *		1. %d	������ ����� ��
 *		ex) System.out.printf("��������:%d",10); �� ���� ���, d�� 10�� �־��.
 *			d�� �տ� ���� ���ڸ�ŭ ĭ�� �����Ѵ�. %5d�� �ټ�ĭ�� ����, ���ڴ� ����������
 *			("%5d",100)= �������100 �� ���°� �ȴ�.
 *			���� -5�� �ְԵȴٸ�, ���ڴ� ��������. ("%-5d",100) = 100�������.
 *		2. %f (float)	�Ǽ��� ����� ��
 *		3. %c (char)	���ڸ� ����� ��
 *		4. %s (String)	���ڿ��� ����� ��
 */
public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5d%-5d%-5d\n",10,50,60);
		System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.3);
		System.out.printf("%2c%2c%2c\n",'A','B','C');
		System.out.printf("%7s%7s%7s\n","Hello","Java","!!");
		System.out.printf("%7s%5d%5d%5d%7.2f%3c\n","ȫ�浿",80,80,80,80.000,'B');
	}

}
