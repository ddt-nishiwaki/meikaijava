package kensyu01;

// 入力を扱う機能の読み込み
import java.util.Scanner;


// 入力した数の文だけアスタリスクを出力するクラス
public class E4_6_PutAsterisk1 {

	// 入力した数分だけアスタリスクを出力する処理
	public static void main (String[] arg) {
		
		// 入力された値を保持する変数を0で初期化する
		int inputValue = 0;
		
		// ループ回数をカウントする変数を 0 で初期化する
		int LOOP_COUNT = 0;
		

		// 入力した値を扱うオブジェクトの作成
		Scanner standardInput = new Scanner(System.in);
		
		// アスタリスクの個数入力を促すメッセージを出力する
		System.out.println("何個*を表示しますか？ : ");
		
		// 入力した値が整数値出ない場合の処理を行う
		while ( !standardInput.hasNextInt() ) {
			
			// 入力が間違っていることをメッセージで出力する
			System.out.println("入力された値が間違えています。");
			
			// 整数値の入力を再度促すメッセージを出力する
			System.out.println("整数値を入力してください。 : ");
			
			// standardInput のトークンを次に移動する
			standardInput.next();

		}
		
		// 入力された値を変数に保持する
		inputValue = standardInput.nextInt();
		
		// 入力された値が1未満だった場合の処理
		if ( inputValue <= 0 ) {
			
			// 入力ストリームを閉じる
			standardInput.close();
			
			//プログラムを終了する
			return;
			
		}
		
		// 入力された値分だけ処理を行う
		do {

			// 入力された値をインクリメントする
			LOOP_COUNT++;
			
			// アスタリスクを出力する
			System.out.print("*");
			
		} while ( inputValue > LOOP_COUNT );
		
		
		// 改行文字を出力する
		System.out.println();
		
		// 入力ストリームを閉じる
		standardInput.close();

	}
}
