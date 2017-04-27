package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 入力された2つの整数値の差を計算して出力するクラス
public class E3_10_SubtractionValue {

	// 入力された2つの整数値の差を計算して出力する処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成を行う
		Scanner stdIn = new Scanner(System.in);
		
		int firstValue; //入力された値firstValueを保持する為の変数
		int secondValue; //入力された値secondValueを保持する為の変数
		
		// 整数値1の入力を促すメッセージを出力する
		System.out.print("整数値1を入力してください。");

		
		// firstValueの値が整数だった場合の処理を行う
		if ( stdIn.hasNextInt() ){
			
			// 入力されたfirstValueの値を保持する
			firstValue = stdIn.nextInt();
			
			// 整数値2の入力を促すメッセージを出力する
			System.out.print("整数値2を入力してください。");
			// 入力された値firstValueが整数かどうかの判定結果を保持する
			
			// secondValueの値が整数だった場合の処理を行う
			if( stdIn.hasNextInt() ){
				
				// 入力されたsecondValueの値を保持する
				secondValue = stdIn.nextInt();
					
					// 入力用のストリームを閉じる
					stdIn.close();	
					// 二つの値の差を出力する
					System.out.println("1番目の値と2番目の値の差は" + (firstValue- secondValue ) + "です。");
			
			// secondValueの値が整数でなかった場合の処理を行う
			} else {
				// 入力が不正であることをメッセージで出力する
				System.out.println("入力された値が不正です。");
			}
		
		// firstValueの値が整数でなかった場合の処理を行う
		} else {
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
	}
}
