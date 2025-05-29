/**
 * 
 */
package exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author user
 * 첫줄에는 숫자의 총개수 N이 입력됩니다.
 * 2줄에는 N개의 숫자가 랜덤하게 입력됩니다.
 * 입력된 숫자가 오름차순 정렬해서 화면에 표시하는 코드를 작성하세요.
 */
public class S3 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 첫 번째 줄: 숫자의 총 개수 N 입력
	        int N = sc.nextInt();

	        // 두 번째 줄: N개의 숫자들이 붙어서 입력됨 (예: 52341)
	        String num = sc.next();

	        // 숫자들을 문자 배열로 변환 후 정렬
	        char[] digits = num.toCharArray();
	        Arrays.sort(digits);

	        // 정렬된 결과 출력 향상된 for문으로 순차적 출력 
	        for (char digit : digits) {
	            System.out.print(digit);
	        }
	       
	    }
	}