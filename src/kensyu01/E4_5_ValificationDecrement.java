package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;


// デクリメントの動作について検証するクラス
public class E4_5_ValificationDecrement {

	// 繰り返し処理を終了させる値を設定する
	public static final int REPEAT_END = 0;
	
	
	// デクリメントの動作について検証を行う
	public static void main (String[] arg) {
		
		// 入力された値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 繰り返し処理を行う為の値を保持する変数を 0 で初期化する
		int repeatCount = 0;
		
		
		// カウントダウンの開始をメッセージで出力する
		System.out.println("カウントダウンします。");
		
		// 特定の条件を満たすまで処理を繰り返す
		do {
			
			// 整数値の入力を促す出力を行う
			System.out.println("正の整数値を入力 : ");
			
			// 整数値が入力されるまで繰り返し処理を行う
			while ( !standardInput.hasNextInt() ) {
				
				// 入力が間違っていることをメッセージで出力する
				System.out.println("入力が間違っています。");
				
				// 整数値入力を促すメッセージを出力する
				System.out.println("整数値を入力してください。");
				
				// standardInput のトークンを次に移す
				standardInput.next();
				
			};
			
			// 入力された値を保持する
			repeatCount = standardInput.nextInt();
			
		// 整数値が入力されるまで繰り返し処理を行う
		} while ( repeatCount <= 0 );
		
		
		// repeatCountを値が0になるまでデクリメントして出力する
		while ( repeatCount >= REPEAT_END ) {
			
			// repeatCount-- から --repeatCountに変更する
			System.out.println(--repeatCount);
			
			/*
			 * 最初に repeatCount - 1 が評価され 入力された値 - 1 が出力される
			 * 以降、repeatCount が 0 になるまで処理を繰り返す  
			 * repeatCount が　0 の時の処理で repeatCount - 1 の値が評価され実行される為
			 * -1 を出力して繰り返し処理を抜ける
			 */
		}
		
		
		standardInput.close();
	}
	
}
