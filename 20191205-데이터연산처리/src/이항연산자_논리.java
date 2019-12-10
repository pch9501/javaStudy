/*
 * 		&& 직렬처리 = a와 b가 둘다 같아야 true 
 * 		|| 병렬처리 = a와 b중 하나만 같아도 true
 * 
 * 		타입확인?
 * 		&& : 범위안에 있는 경우 자주 씀.	
 * 		|| : 범위 밖에 있는 경우 자주 사용.(오류처리)
 * 
 * 		ex) id password
 * 		id=="" && pw==""
 * 		id!="" || pw!=""
 * 
 * 		&&는 조건문 중 왼쪽이 false라면, 오른쪽은 연산에서 제외함.
 * 		||는 조건문 중 왼쪽이 true라면, 오른쪽은 연산에서 제외함.
 * 
 *		
 */
public class 이항연산자_논리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		
		char result =(c>=65 && c<=90)?(char)(c+32):(char)(c-32);
		System.out.println(c+"는(은)"+result);
		System.out.println((int)'A');
	}

}
