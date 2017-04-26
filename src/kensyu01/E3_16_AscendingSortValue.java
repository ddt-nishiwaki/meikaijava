package kensyu01;

// 入力された値を取得する為の機能を読み込む
import java.util.Scanner;

// 読み込んだ3つの整数値を比較し、大きい方の値と、小さい方の値を出力する為のクラス
public class E3_16_AscendingSortValue {

	// 3つの整数値の入力を読み込み、大きい方の値と、小さい方の値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		int firstValue; //入力された値1を保持する為の変数
		int secondValue; //入力された値2を保持する為の変数
		int thirdValue; //入力された値cを保持する為の変数

		// 整数値1の入力を促すメッセージを出力する
		System.out.print("整数値1を入力してください。");
		
		// 入力された値が整数だった場合の処理を行う
		if ( stdIn.hasNextInt() ){
			
			// 入力されたfirstValueの値を保持する
			firstValue = stdIn.nextInt();
			
			// 整数値2の入力を促すメッセージを出力する
			System.out.print("整数値2を入力してください。");
			
			// 入力された値が整数だった場合の処理を行う
			if ( stdIn.hasNextInt() ){
				
				// 入力されたsecondValueの値を保持する
				secondValue = stdIn.nextInt();
				
				// 整数値cの入力を促すメッセージを出力する
				System.out.print("整数値cを入力してください。");
			
				// 入力された値が整数だった場合の処理を行う
				if( stdIn.hasNextInt() ){
				
					// 入力された値を保持する
					thirdValue = stdIn.nextInt();

					// firstValue,secondValueを比較して firstValueがsecondValueより大きければ値を入れ替える
					if ( firstValue > secondValue ) {

						// firstValueの値を変数tempに保持する
						int temp = firstValue;
						// firstValueの値をsecondValueの値に変更する
						firstValue = secondValue;
						// secondValueの値をtに保持したfirstValueの値に変更する
						secondValue = temp;

					}

					// firstValue,thirdValueを比較して firstValueがsecondValueより大きければ値を入れ替える
					if ( firstValue > thirdValue ) {

						// firstValueの値を変数tempに保持する
						int temp = firstValue;
						// firstValueの値をcの値に変更する
						firstValue = thirdValue;
						// thirdValueの値を変数tempに保持したfirstValueの値に変更する
						thirdValue = temp;
					}

					// firstValueには最小値が入っているはずなので secondValue,thirdValueを比較して secondValueがthirdValueより大きければ値を入れ替える
					if( secondValue > thirdValue ) {

						// secondValueの値を変数tempに保持する
						int temp = secondValue;
						// secondValueの値をthirdValueの値に変更する
						secondValue = thirdValue;
						// thirdValueの値を変数tempに保持したsecondValueの値に変更する
						thirdValue = temp;

					}

					// firstValueの値を出力する
					System.out.println(firstValue);
					// secondValueの値を出力する
					System.out.println(secondValue);
					// thirdValueの値を出力する
					System.out.println(thirdValue);

				// thirdValueの値が整数でない場合の処理を行う
				} else {
					// 入力が不正であることをメッセージで出力する
					System.out.println("入力された値が不正です。");
				}
			
			// secondValueの値が整数でない場合の処理を行う
			} else {
				// 入力が不正であることをメッセージで出力する
				System.out.println("入力された値が不正です。");
			}
		
		// firstValueの値が整数でない場合の処理を行う
		} else {
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
	}
}
