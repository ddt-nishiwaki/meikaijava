package kensyu01;

// 入力を扱う機能の読み込みを行う
import java.util.Scanner;

// 入力された数だけ記号を出力するクラス
public class E4_7_PutSymbol {
	
	public static final int REPEAT_END = 0;

	// 入力された数だけ記号を出力する処理を行う
	public static void main (String[] arg){
		
		// 入力した値を保持する変数を 0 で初期化する
		int reqestValue = 0;
		
		// ループ処理の回数を数える変数を 0 で初期化する
		int loopCount = 0;
		
		
		// 入力扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);

		// "記号を出力する数"の入力を促すメッセージを出力する
		System.out.println("いくつ出力しますか？ : ");

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
		reqestValue = standardInput.nextInt();
		
		// 入力された値分だけ処理を行う
		while ( reqestValue > loopCount ) {
			
			// 偶数回、奇数回で記号振り分けながら出力する
			System.out.print(loopCount % 2 == 0 ? "*" : "+");
			
			// 処理回数をカウントする
			++loopCount;
			
		}
		
		
		// 入力ストリームを閉じる
		standardInput.close();

	}
}
