package hw;
/*
 * Topic:已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
        int h=scn.nextInt();
        float w = 0;
		if(s==1){
			w=(float) ((h-80)*0.7);
		}
		else if(s==2){
			w=(float) ((h-70)*0.6);
		}
		else {
			System.out.println("出錯");	
		}
		
		
	     System.out.println(w+" ");
	}

		}

