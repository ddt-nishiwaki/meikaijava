package kensyu01;

// 入力された値を取得する為の機能の読み込み
import java.util.Scanner;

// 読み込んだ2つの整数値を比較し、大きい方の値と、小さい方の値を出力する為のクラス
public class E3_15_Sort_DescendingValue {

	// 2つの整数値の入力を読み込み、大きい方の値と、小さい方の値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成する
		Scanner stdIn = new Scanner(System.in);
		
		int firstValue; //入力された値1を保持する為の変数
		int secondValue; //入力された値2を保持する為の変数

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

				// firstValue,secondValueの値が同じ場合の処理を行う
				if ( firstValue == secondValue ){

					// firstValue,secondValueの値が同じであることを表示する
					System.out.println("2つの値は同じです");

				// firstValue,secondValueの値と異なる場合の処理を行う
				} else if (firstValue != secondValue ) {

					// firstValue,secondValueの値を大きい順にソートし表示する
					if ( firstValue < secondValue ) {
						// 変数tにfirstValueの値を保持する
						int temp = firstValue;
						// firstValueの値をsecondValueの値に変更する
						firstValue = secondValue;
						// secondValueの値を tempに保持していたfirstValueの値 に変更する
						secondValue = temp;
					}

					// 大きい方の値を出力する
					System.out.println(firstValue);
					// 小さい方の値を出力する
					System.out.println(secondValue);

				}

			// secondValueの値が整数以外の場合の処理を行う
			} else {
				// 入力が不正であることをメッセージで出力する
				System.out.println("入力された値が不正です。");
			}
		
		// firstValueの値が整数以外の場合の処理を行う
		} else {
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
	}
}
