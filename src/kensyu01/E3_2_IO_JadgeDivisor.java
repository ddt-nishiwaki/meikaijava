package kensyu01;

//入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;

// 2つの整数A,B入力を受け取りBがAの約数かどうかを判定する為のクラス
public class E3_2_IO_JadgeDivisor {

	// 2つの整数A,B入力を受け取りBがAの約数かどうかを判定する為の処理を行う
	public static void main (String[] arg){

		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);

		// 整数Aの入力を促すメッセージを出力する為の処理を行う
		System.out.print("整数A : ");
		// 入力された値を変数inputValueAに保持する
		int inputValueA = stdIn.nextInt();

		// 整数Bの入力を促すメッセージを出力する為の処理を行う
		System.out.print("整数B : ");
		// 入力された値を変数inputValueBに保持する
		int inputValueB = stdIn.nextInt();

		// inputValueAの値がinputValueBの値で割り切れる(約数)の場合の処理を行う
		if( inputValueA % inputValueB == 0 ) {
			// inputValueBがinputValueAの約数であることをメッセージで出力する
			System.out.println("BはAの約数です。");
		// inputValueBがinputValueAの約数でない場合
		} else {
			// inputValueBがinputValueAの約数でないことをメッセージで出力する
			System.out.println("BはAの約数ではありません。");
		}
				
		// 入力用ストリームを閉じる
		stdIn.close();

	}
}
