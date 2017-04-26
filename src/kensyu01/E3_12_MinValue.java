package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 読み込んだ3つの整数値の最小値を表示する為のクラス
public class E3_12_MinValue {

	// 3つの整数値の入力を読み込み、最小値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成を行う
		Scanner stdIn = new Scanner(System.in);
		
		int firstValue; //入力された値1を保持する為の変数
		int secondValue; //入力された値2を保持する為の変数
		int thirdValue; //入力された値3を保持する為の変数

		// 整数値1の入力を促すメッセージを出力する
		System.out.print("整数値1を入力してください。");

		// 入力された値が整数だった場合の処理を行う
		if ( stdIn.hasNextInt() ){
			
			// 入力された値を保持する
			firstValue = stdIn.nextInt();
			
			// 整数値2の入力を促すメッセージを出力する
			System.out.print("整数値2を入力してください。");
			
			// 入力された値が整数だった場合の処理を行う
			if( stdIn.hasNextInt() ){
				
				// 入力された値を保持する
				secondValue = stdIn.nextInt();
				
				// 整数値3の入力を促すメッセージを出力する
				System.out.print("整数値3を入力してください。");
				
				// 入力された値が整数だった場合の処理を行う
				if( stdIn.hasNextInt() ){
					
					// 入力された整数値3の値を保持する
					thirdValue = stdIn.nextInt();

					// 変数minにfirstValueの値を保持する
					int min = firstValue;
					// minより secondValue が小さい場合はminの値をsecondValueの値に置き換える
					if( secondValue < min ) {
						min = secondValue;
					}
					// minより thirdValue が小さい場合はminの値をthirdValueの値に置き換える
					if( thirdValue < min ) {
						min = thirdValue;
					}

					// minの値を出力する
					System.out.println("最小値は" + min + "です。");

				// thirdValueの値が整数でなかった場合の処理を行う
				} else {
					// 入力が不正であることをメッセージで出力する
					System.out.println("入力された値が不正です。");
				}
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
