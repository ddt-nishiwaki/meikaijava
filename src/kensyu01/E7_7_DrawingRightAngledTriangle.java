package kensyu01;

/*** ライブラリの読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 直角三角形を描画するメソッドを持つクラス
public class E7_7_DrawingRightAngledTriangle {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "処理内容";
	// 段数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_STAGE = "段数を入力してください : ";
	// 入力が不正であることを示すメッセージを設定する
	private static final String MESSAGE_CAUTION_INPUT_INVAILD = "入力が不正です";
	// 整数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_INTEGER = "整数値を入力してください : ";
	// 正三角形を描画する文字を設定する
	private static final String DRAW_SYMBLE = "*";
	
	/*** メソッド ******************************/
	// 整数値の入力を確実に行うメソッド
	private static int scanInteger () {

		/*** オブジェクトの作成 ******************************/
		// 整数値入力を扱うオブジェクトを作成する
		Scanner scannerInteger = new Scanner(System.in);

		/*** 変数の初期化 ******************************/
		// 入力を保持する変数を初期化する
		int inputValue = INITIALIZE_ZERO;

		/*** 入力処理 ******************************/
		// 整数値が入力されるまで繰り返す
		do {
			// 入力された値が整数値だった場合の処理を行う
			if ( scannerInteger.hasNextInt() ) {
				// 入力された値を保持する
				inputValue = scannerInteger.nextInt();
				// ループ処理を終了する
				break;
			// 入力された値が整数値じゃ勝った場合の処理を行う
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
		// 整数値入力用ストリームを閉じる
		scannerInteger.close();
		// 設定された整数値を返す
		return inputValue;
	}

	/*** メソッド ******************************/
	// 直角三角形を描画するメソッド
	private static void drawRightAngledTriangle (int stageNumber, String drawSymbol ) {
		/*** 処理 ******************************/
		// 上から一段ごとに直角三角形を描画する
		for ( int stageCount = INITIALIZE_ZERO + 1; stageCount <= stageNumber; stageCount++ ) {
			// 格段に応じた図形部分を出力する
			for ( int stageLength = INITIALIZE_ZERO + 1; stageLength <= stageCount; stageLength++ ) {
				// 描画用の文字を出力する
				System.out.print(DRAW_SYMBLE);
			}
			// 改行を出力する
			System.out.println();
		}
	}
	
	/*** メインメソッド ******************************/
	// 直角三角形を描画する処理を行う
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 入力された段数を保持する変数を初期化する
		int numberInputStage = INITIALIZE_ZERO;

		/*** 処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 段数の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_INPUT_STAGE);
		// 入力された段数を変数に保持する
		numberInputStage = scanInteger();
		// 入力された段数から直角三角形を描画する
		drawRightAngledTriangle(numberInputStage, DRAW_SYMBLE);
	}
}
