package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 入力された2つの整数値の差を計算して 10 超過か以下かを判定するクラス
public class E3_11_SubtractionAboutValue_10 {

	// 入力された2つの整数値の差を計算して 10 超過か以下かを判定する処理を行う
	public static void main(String[] arg){

		// 入力された値を取得する為のオブジェクトの作成を行う
		Scanner stdIn = new Scanner(System.in);

		int firstValue; //入力された値1を保持する為の変数
		int secondValue; //入力された値2を保持する為の変数

		// 整数値1の入力を促すメッセージを出力する
		System.out.print("整数値1を入力してください。");

		// 入力された値が整数だった場合の処理を行う
		if ( stdIn.hasNextInt() ){

			// 入力された値を保持する
			firstValue = stdIn.nextInt();

			// 整数値2の入力を促すメッセージを出力する
			System.out.print("整数値2を入力してください。");

			// 入力された値が整数だった場合の処理を行う
			if( stdIn.hasNextInt() ){

				// 入力された値を保持する
				secondValue = stdIn.nextInt();

				// 二つの値の差を変数に保持する
				int result = firstValue - secondValue;
				// 計算結果を正の値に変換する
				result = result < 0 ? -result : result;

				// 計算結果が「11以上か10未満か」をメッセージに出力する
				System.out.println("それらの差は" + ( result > 10  ? "11以上です。" : "10以下です。" ) );

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
