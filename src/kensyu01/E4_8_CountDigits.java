package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;


// 入力された値の桁数を出力する為のクラス
public class E4_8_CountDigits {
	
	// 入力された値の桁数を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された値を保持する変数を 0 で初期化する
		int inputValue = -1;
		
		// 処理回数をカウントする変数を -1 で初期化する
		int loopCount = 0;
		
		//正の整数値入力を促すメッセージの出力を行う
		System.out.println("正の整数を入力してください。 : ");

		
		// 特定の条件を満たすまで処理を繰り返す
		do {
			
			// 入力した値が整数だった場合の処理を行う
			if ( standardInput.hasNextInt() ) {
				
				inputValue = standardInput.nextInt();


				
				// 入力された値が 0 未満だった場合の処理を行う
				if ( inputValue < 0 ) {
					
					// 入力が間違っていることをメッセージで出力する
					System.out.println("正の整数で入力してください。");
					
				}
	
			// 入力した値が整数でない場合の処理を行う
			} else {
				
				// 入力が間違っていることをメッセージで出力する
				System.out.println("入力された値が間違えています。");
	
				// 整数値の入力を再度促すメッセージを出力する
				System.out.println("正の整数値を入力してください。 : ");
	
				// standardInput のトークンを次に移動する
				standardInput.next();
				
			}

		// 入力が 0 未満の場合には処理を繰り返す
		} while ( inputValue < 0 );


		// 10で何回割ったら1以下になるかを数えて出力する
		while ( inputValue >= 1 ) {
		
			// inputValueの値を10で割る
			inputValue /= 10;
			
			// 処理回数をインクリメントする
			loopCount++;
			
		}
		
		// 処理回数を出力する
		System.out.println(loopCount);
		
		
		// 入力ストリームを閉じる
		standardInput.close();
		
	}

}
