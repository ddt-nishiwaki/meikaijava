package kensyu01;

/*** 機能の読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 入力した月の季節を出力するメソッドを持つクラス
public class E7_6_printSeasonMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 春のスタート月を設定する
	private static final int MARCH = 3;
	// 春の終わり月を設定する
	private static final int MAY = 5;
	// 夏のスタート月を設定する
	private static final int JUNE = 6;
	// 夏の終わり月を設定する
	private static final int OCTOBER = 8;
	// 秋のスタート月を設定する
	private static final int SEPTEMBER = 9;
	// 秋の終わり月を設定する
	private static final int NOVEMBER = 11;


	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "入力した月の季節を出力します";
	// 月の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_MONTH = "月を入力してください(1 ~ 12) : ";
	// 整数値の入力を求めるメッセージを出力する
	private static final String MESSAGE_REQUEST_INPUT_INTEGER = "整数値を入力してください";
	// 入力が不正であることを示すメッセージを設定する
	private static final String MESSAGE_CAUTION_INPUT_INVAILD = "入力が不正です";
	// 単語「春」を設定する
	private static final String WORD_SPRING = "春";
	// 単語「夏」を設定する
	private static final String WORD_SUMMER = "夏";
	// 単語「秋」を設定する
	private static final String WORD_AUTUMN = "秋";
	// 単語「冬」を設定する
	private static final String WORD_WINTER = "冬";
	// 入力された月の季節を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_JADGE_SEASON = "その季節は%sです\n";
	
	
	/*** メソッド ******************************/
	// 月の季節を判定して出力するメソッド
	private static void pringSeason (int month){

		/*** 出力処理 ******************************/
		// 引数が1 ~ 12 以外の値の場合の処理を行う
		if ( month < 1 || month > 12 ) {
			// 何もせず終了する
			return;
		// 引数が3 ~ 5 の場合の処理を行う
		} else if ( month >= MARCH && month <= MAY ) {
			// 春であることをメッセージで出力する
			System.out.printf(FORMAT_OUTPUT_JADGE_SEASON, WORD_SPRING);
		// 引数が6 ~ 8 の場合の処理を行う
		} else if ( month >= JUNE && month <= OCTOBER ) {
			// 夏であることをメッセージで出力する
			System.out.printf(FORMAT_OUTPUT_JADGE_SEASON, WORD_SUMMER);
		// 引数が9 ~ 11 の場合の処理を行う
		} else if ( month >= SEPTEMBER && month <= NOVEMBER ) {
			// 秋であることをメッセージで出力する
			System.out.printf(FORMAT_OUTPUT_JADGE_SEASON, WORD_AUTUMN);
		// その他（引数が12, 1, 2）の場合の処理を行う
		} else {
			// 冬であることをメッセージで出力する
			System.out.printf(FORMAT_OUTPUT_JADGE_SEASON, WORD_WINTER);
		}
	}
	
	
	// 整数値の入力を確実に行うメソッド
	private static int scanInteger () {

		/*** 変数初期化 ******************************/
		// 入力を保持する変数を初期化する
		int inputValue = INITIALIZE_ZERO;

		/*** オブジェクトの作成 ******************************/
		// 整数値の入力を求めるオブジェクトを作成する
		Scanner scannerInteger = new Scanner(System.in); 

		/*** 判定処理 ******************************/
		// 整数値が入力されるまで繰り返す
		do {
			// 入力された値が整数値だった場合の処理を行う
			if ( scannerInteger.hasNextInt() ) {
				// 入力された値を保持する
				inputValue = scannerInteger.nextInt();
				// ループ処理を終了する
				break;
			// 入力された値が整数値ではなかった場合の処理を行う
			} else {
				// 入力が間違えていることを出力する
				System.out.println(MESSAGE_CAUTION_INPUT_INVAILD);
				// 整数値の入力を求めるメッセージを出力する
				System.out.println(MESSAGE_REQUEST_INPUT_INTEGER);
				// 入力ストリームのトークンを次に移動する
				scannerInteger.next();
			}

		// 整数値が設定されるまで繰り返す
		} while ( inputValue == INITIALIZE_ZERO);

		/*** 終了処理 ******************************/
		// 月の入力を求めるストリームを閉じる
		scannerInteger.close();
		// 設定された整数値を返す
		return inputValue;
	}
	
	
	/*** メインメソッド ******************************/
	// 入力した月の季節を出力する処理を行う
	public static void main (String[] arg) {
		
		/*** 変数初期化 ******************************/
		// 入力された月を保持する変数を初期化する
		int inputMonth = INITIALIZE_ZERO;
		
		/*** 処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 月の入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_MONTH);
		// 入力された値を保持する
		inputMonth = scanInteger();
		// 入力された月の季節を表示する
		pringSeason(inputMonth);
	}
}
