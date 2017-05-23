package kensyu01;

/*** 機能の読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 直角三角形を描画するメソッドを持つクラス
public class E7_7_DrawingRightAngledTriangle {

	/*** 定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "処理内容";
	// 段数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_STAGE = "段数を入力してください : ";
	// 入力が不正であることを示すメッセージを設定する
	private static final String MESSAGE_CAUTION_INPUT_INVAILD = "入力が不正です";
	// 正三角形を描画する文字を設定する
	private static final String DRAW_SYMBLE = "*";
	

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

		/*** オブジェクト作成 ******************************/
		// 段数入力用オブジェクトを作成する
		Scanner scannerNumberStage = new Scanner(System.in);

		/*** 処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 段数の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_INPUT_STAGE);
		// 入力された段数を変数に保持する
		numberInputStage = scannerNumberStage.nextInt();
		// 入力された段数から直角三角形を描画する
		drawRightAngledTriangle(numberInputStage, DRAW_SYMBLE);

		/*** 終了処理 ******************************/
		// 段数入力用ストリームを閉じる
		scannerNumberStage.close();
	}
}
