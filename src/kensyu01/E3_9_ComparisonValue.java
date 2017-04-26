package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 入力された2つの実数を比較して大きい方の値を出力するクラス
public class E3_9_ComparisonValue {
	
	// 入力された2つの実数を比較して大きい方の値を出力する処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 実数値の入力を促すメッセージを出力する
		System.out.print("実数値 A を入力してください : ");
		// 入力された値を取得し変数inputValueAに保持する
		double inputValueA = stdIn.nextDouble();
		
		// 実数値の入力を促すメッセージを出力する
		System.out.print("実数値 B を入力してください : ");
		// 入力された値を変数inputValueBに保持する
		double inputValueB = stdIn.nextDouble();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// 入力された値が異なる場合の処理を行う
		if( inputValueA != inputValueB ) {
			
			// inputValueAとinputValueBを比較して大きい方の値を出力する
			System.out.println("大きい方の値は" + ( inputValueA > inputValueB ? inputValueA : inputValueB) + "です。");
		
		// 入力された値が同じだった場合の処理を行う
		} else {
			
			// 入力された値が同じであることをメッセージで出力する
			System.out.println("AとBの値は同じです。");
			
		}

	}
}
