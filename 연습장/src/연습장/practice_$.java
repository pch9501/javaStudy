package ������;
// �Է��Ѱ�, ����, ¦����, Ȧ����

// 100 999  7�ǹ��  4�ǹ��   1211 �������� �ݺ���4�� �ش�
import java.util.Scanner;

class Vehicle {
	  protected int speed = 3;

	  public int getSpeed(){
	    return speed;
	  }
	  public void setSpeed(int speed){
	    this.speed = speed;
	  }
	}

	class Car extends Vehicle{
	  public void printspd(){
	    System.out.println(speed);
	  }
	}

public class practice_$ {
			// �ټ��� �迭 : class or �迭?, ������ �迭�̳� Ŭ������ ����� �ȵȴ�.
			//	������ ���ϼ����ֱ⶧��!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car A = new Car();
	    A.setSpeed(30);
	    System.out.println(A.getSpeed());
	    A.printspd();
		
	}
}
