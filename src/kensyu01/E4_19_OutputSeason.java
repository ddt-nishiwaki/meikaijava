package kensyu01;

// 入力された値を扱う機能の読み込みを行う
import java.util.Scanner;

// 入力された月に対応する季節を表示するためのクラス
public class E4_19_OutputSeason {
	
	// int型変数を初期化するための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// 1月の値を設定する
	public static final int JANUARY = 1;
	// 2月の値を設定する
	public static final int FEBLUARY = 2;
	// 3月の値を設定する
	public static final int MARCH = 3;
	// 4月の値を設定する
	public static final int APRIL = 4;
	// 5月の値を設定する
	public static final int MAY = 5;
	// 6月の値を設定する
	public static final int JUNE = 6;
	// 7月の値を設定する
	public static final int JULY = 7;
	// 8月の値を設定する
	public static final int AUGUST = 8;
	// 9月の値を設定する
	public static final int SEPTEMBER = 9;
	// 10月の値を設定する
	public static final int OCTOBER = 10;
	// 11月の値を設定する
	public static final int NOVEMBER = 11;
	// 12月の値を設定する
	public static final int DECEMBER = 12;
	
	// 入力された値に対応する季節を表示するための処理を行う
	public static void main(String[] arg) {
		
		// 入力された月を扱うオブジェクトを作成する
		Scanner monthValueInput = new Scanner(System.in);
		
		// 数字で入力された月を保持する変数を初期化する
		int monthValue = INITIALIZATION_INTEGER;
		
		// 月の入力を促すメッセージを出力する
		System.out.println("季節を求めます。\n何月ですか？");

		// 入力された月の値を保持する
		monthValue = monthValueInput.nextInt();

		// 1 ~ 12 が入力されるまで処理を繰り返す
		while ( !( monthValue >= JANUARY && monthValue <= DECEMBER )  ) {

			// 正しい値の入力を求めるメッセージを出力する
			System.out.println("1 ~ 12 の範囲で入力してください。");
			
			// 入力された月の値を保持する
			monthValue = monthValueInput.nextInt();
			
		}			

		// 3 ~ 5 が入力された場合の処理を行う
		if ( monthValue >= MARCH && monthValue <= MAY ) {
			
			// 春のメッセージを出力する
			System.out.println( "それは春です。" );
			
		// 6 ~ 8 が入力された場合の処理を行う
		} else if ( monthValue >= JUNE && monthValue <= AUGUST ) {
			
			// 夏のメッセージを出力する
			System.out.println( "それは夏です。" );
			
		// 9 ~ 11 が入力された場合の処理を行う
		} else if ( monthValue >= SEPTEMBER && monthValue <= NOVEMBER ) {
			
			// 秋のメッセージを出力する
			System.out.println( "それは秋です。" );

		// 12, 1, 2 が入力された場合の処理を行う
		} else if ( monthValue== DECEMBER || monthValue== JANUARY || monthValue== FEBLUARY ) {
			
			// 冬のメッセージを出力する
			System.out.println( "それは冬です。" );
			
		}
		
		
		// 月の入力を扱う入力ストリームを閉じる
		monthValueInput.close();
		
	}

}

