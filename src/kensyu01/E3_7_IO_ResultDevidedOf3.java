package kensyu01;

// 入力された値を取得する為の機能を読み込みを行う
import java.util.Scanner;

//  入力された値を3で割った結果をメッセージで出力するクラス
public class E3_7_IO_ResultDevidedOf3 {

	// 入力された値を3で割った結果をメッセージで出力する処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 正の整数の入力を促すメッセージを出力する
		System.out.print("正の整数を入力してください : ");
		// 入力された値を変数に保持する
		int inputNumber = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// inputNumberが正の整数でない場合の処理を行う
		if ( inputNumber < 1 ) {
			// 入力された値が正の整数でないことをメッセージで出力する
			System.out.println("正ではない値が入力されました。");
		// inputNumberが3で割り切れる場合の処理を行う
		} else if ( inputNumber % 3 == 0 ) {
			// 入力された値が3で割り切れることをメッセージで出力する
			System.out.println("その値は3で割り切れます。");
		// inputNumberを3で割った余りが1の場合の処理を行う
		} else if ( inputNumber % 3 == 1 ) {
			// 入力された値を3で割ると1余ることをメッセージで出力する
			System.out.println("その値を3で割った余りは1です。");
		// inputNumberを3で割った余りが2の場合の処理を行う
		} else {
			// 入力された値を3で割ると2余ることをメッセージで出力する
			System.out.println("その値を3で割った余りは2です。");
		}
		
	}
}
