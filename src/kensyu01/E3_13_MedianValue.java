
package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 読み込んだ3つの整数値の中央値を表示する為のクラス
public class E3_13_MedianValue {

	// 3つの整数値の入力を読み込み、中央値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成を行う
		Scanner stdIn = new Scanner(System.in);
		
		int firstValue; //入力された値1を保持する為の変数
		int secondValue; //入力された値2を保持する為の変数
		int thirdValue; //入力された値3を保持する為の変数

		// 整数値1の入力を促すメッセージを出力を行う
		System.out.print("整数値1を入力してください。");
		
		// 入力された値が整数だった場合の処理を行う
		if ( stdIn.hasNextInt() ){
			
			// 入力された値を保持する
			firstValue = stdIn.nextInt();
			
			// 整数値2の入力を促すメッセージを出力する
			System.out.print("整数値2を入力してください。");
			
			// 入力された値が整数だった場合の処理を行う
			if( stdIn.hasNextInt() ){
				
				// 入力された整数値Bの値を保持する
				secondValue = stdIn.nextInt();
				
				// 整数値3の入力を促すメッセージを出力する
				System.out.print("整数値3を入力してください。");
				
				// 入力された値が整数だった場合の処理を行う
				if( stdIn.hasNextInt() ){
					
					// 入力された整数値3の値を保持する
					thirdValue = stdIn.nextInt();

					// firstValueがsecondValueより大きかったらそれぞれの値を入れ替える
					if ( firstValue > secondValue ) {
						
						// 変数tempにfirstValueの値を一時的に保持する
						int temp = firstValue;
						
						// firstValueの値をsecondValueの値に変更する
						firstValue = secondValue;
						
						// secondValueをtempに保持していたfirstValueの値に変更する
						secondValue = temp;
						
					}
					
					// firstValueの値がthirdValueの値より大きかったらそれぞれの値を入れ替える
					if ( firstValue > thirdValue ) {
						
						// 変数tempにfirstValuleの値を一時的に保持する
						int temp = firstValue;
						
						// firstValueの値をthirdValueの値に変更する
						firstValue = thirdValue;
						
						// thirdValueをtempに保持していたfirstValueの値に変更する
						thirdValue = temp;
					}
					
					// secondValueの値がthirdValueの値より大きかったらそれぞれの値を変更する
					if ( secondValue > thirdValue ) {
						
						// 変数tempにsecondValueの値を一時的に保持する
						int temp = secondValue;
						
						// secondValueの値をthirdValueの値に変更する
						secondValue = thirdValue;
						
						// thirdValueの値をtempに保持していたsecondValueの値に変更する
						thirdValue = temp;
					}
					
					// 中央値を出力する
					System.out.println(secondValue);
				
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
