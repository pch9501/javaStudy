package 연습장;
// 입력한값, 총합, 짝수합, 홀수합

// 100 999  7의배수  4의배수   1211 수업내용 반복문4에 해당
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
			// 다수의 배열 : class or 배열?, 무조건 배열이나 클래스로 묶어서는 안된다.
			//	개별로 쓰일수도있기때문!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car A = new Car();
	    A.setSpeed(30);
	    System.out.println(A.getSpeed());
	    A.printspd();
		
	}
}
