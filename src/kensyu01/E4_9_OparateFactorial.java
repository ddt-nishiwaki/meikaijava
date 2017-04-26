package kensyu01;


// 入力を扱う機能を読み込む
import java.util.Scanner;

// 入力された値から階乗を計算するクラス
public class E4_9_OparateFactorial {
	
	// 入力された値から階乗を計算する処理を行う
	public static void main(String[] arg) {
		
		// 入力された値を保持する変数を -1 で初期化する
		int inputValueN = -1;
		
		// 階乗の回数をカウントする変数を 0 で初期化する
		int factorialCounter = 1;
		
		// 階乗の結果を保持する変数を 1 で初期化する
		int resultOfFactorial = 1;
		
		// 入力を扱う為のオブジェクトの生成する
		Scanner standardInput = new Scanner(System.in);
		
		// 階乗することをメッセージで出力する
		System.out.println("1 ~ n の階乗を計算します。");
		
		
		// 入力が正しいかどうか判定する処理を行う
		do {
			
			// 正の整数の入力を促すメッセージを出力する
			System.out.println("1以上の正の整数nを入力してください : ");
			
			// 整数が入力されなかった場合の処理を行う
			if( !standardInput.hasNextInt() ){
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("入力が間違えています。");
				
				// 入力ストリームのトークンを次に移動する
				standardInput.next();
				
			// 入力され値を保持し、負の値だった場合の処理を行う
			} else if ( ( inputValueN = standardInput.nextInt() )  < 0 ) {
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("負の値が入力されています。");

			}
			
		// 入力された値が 0 以下の場合は処理を繰り返す
		} while ( inputValueN <= 0 );
		
		
		// 1 ~ inputValueN までの階乗を計算する
		while ( factorialCounter < inputValueN ) {
			
			// 処理の回数を数える
			++factorialCounter;
			
			// 階乗の結果を保持する
			resultOfFactorial *= factorialCounter;
			
		}
		
		
		// 階乗の結果を出力する
		System.out.println("1から"+ inputValueN +"までの積は"+ resultOfFactorial +"です。");
		
		// 入力ストリームを閉じる
		standardInput.close();
		
		
	}
}
