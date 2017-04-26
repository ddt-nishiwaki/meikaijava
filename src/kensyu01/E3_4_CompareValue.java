package kensyu01;

// 入力した値を取得する機能の読み込みを行う
import java.util.Scanner;

// 入力した値の大小を比較し結果を表示する為のクラス
public class E3_4_CompareValue {

	// 入力した値を比較して結果を表示する為の処理を行う
	public static void main(String[] arg){
		
		// 入力した値を取得するオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		// A の値の入力を促すメッセージを出力する
		System.out.print("整数値 A を入力してください : ");
		// 変数inputValueAに入力された値を保持する
		int inputValueA = stdIn.nextInt();
		
		// B の値の入力を促すメッセージを出力する
		System.out.print("整数値 B を入力してください : ");
		// 変数inputValueBに入力された値を保持する
		int inputValueB = stdIn.nextInt();
		
		// inputValueAの値がinputValueBの値より大きい場合の処理を行う
		if( inputValueA > inputValueB ) {
			// inputValueAの値の方が大きいことをメッセージで出力する
			System.out.println("Aのほうが大きいです。");
		// inputValueAの値がinputValueBの値より大きい場合の処理を行う
		} else if ( inputValueA < inputValueB ) {
			// inputValueBの値の方が大きいことをメッセージで出力する
			System.out.println("Bのほうが大きいです。");
		// inputValueAの値がinputValueBの値と同じ場合の処理を行う
		} else {
			// inputValueAの値とinputValueBの値が同じことをメッセージで出力する
			System.out.println("AとBは同じ値です。");
		}
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
	}
	
}
