package kensyu01;

// 乱数を生成する機能を読み込む
import java.util.Random;
// 入力を扱う機能を読み込む
import java.util.Scanner;


/********************************************************/

// 1~10までの乱数を格納した配列を設定し、各値を棒グラフで表示するクラス
public class E6_4_DrawBarGraph {
	
	// 数値型変数を初期化する値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// String型変数を初期化する値を設定する
	public static final String INITIALIZE_STRING = "";
	// 配列の長さを求めるメッセージを設定する
	public static final String REQUEST_ARRAY_LENGTH = "配列の長さを設定してください : ";
	// グラフ描画用の文字を設定する
	public static final String DRAW_GRAPH = "*";
	// グラフ内のオフセットに使う文字を設定する
	public static final String DRAW_OFFSET = " ";
	// グラフ描画文字のマージンを文字で設定する
	public static final String DRAW_MARGIN = " ";
	// 区切り線を描画する文字列を設定する
	public static final String DRAW_SEPARATOR = "-";
	// 乱数の範囲を設定する
	public static final int RAMDOME_RANGE = 10;
	// 乱数の範囲をシフトする値を設定する
	public static final int SHIFT_RANGE = 1;
	// 配列の操作を終了するカウントの値を設定する
	public static final int END_SEARCH = 0;
	// グラフ間のマージンの幅を設定する
	public static final int WIDTH_MARGIN = 2;
	// 配列のインデックスの一の位を取得するための値を設定する
	public static final int GET_A_DIGIT = 10;
	
	
	/********************************************************/

	// 1~10までの乱数を格納した配列を設定し、各値を棒グラフで表示する処理を行う
	public static void main(String[] arg) {
	
		// 乱数を生成するオブジェクトを作成する
		Random randomGenerator = new Random();
		// 配列の長さの入力を扱うオブジェクトを作成する
		Scanner arrayLengthInput = new Scanner(System.in);
		// グラフ間マージンを設定する変数を初期化する
		String graphMargin = INITIALIZE_STRING;
		// グラフ間マージンに応じてセパレータを設定する変数を初期化する
		String graphSeparator = DRAW_SEPARATOR;
		// 配列の長さを保持する変数を初期化する
		int arrayLength = INITIALIZE_INTEGER;
		
		
		/********************************************************/

		// 配列の長さを求めるメッセージを出力する
		System.out.println(REQUEST_ARRAY_LENGTH);
		// 入力された配列の長さを保持する
		arrayLength = arrayLengthInput.nextInt();
		// 配列を作成する
		int[] randomArray = new int[arrayLength];
		
		// 配列の各インデックスに値を設定する
		for ( int count = INITIALIZE_INTEGER; count < arrayLength; count++) {
			// 乱数を生成して値を設定する
			randomArray[count] = randomGenerator.nextInt(RAMDOME_RANGE) + SHIFT_RANGE;
		}

		// マージンの設定から描画文字を調整する
		for ( int count = 0; count < WIDTH_MARGIN; count++ ){
			// 描画に使うマージンを文字列で設定する
			graphMargin += DRAW_MARGIN;
			// 描画に使うセパレータを文字列で設定する
			graphSeparator += DRAW_SEPARATOR;
		}
		

		/********************************************************/

		// 各配列に格納された値をグラフで描画する
		for ( int rangeCount = RAMDOME_RANGE; rangeCount > END_SEARCH; rangeCount-- ) {
			// 配列の値を走査する
			for ( int arrayCount = INITIALIZE_INTEGER; arrayCount < arrayLength; arrayCount++) {
				// グラフ間のマージンを描画する
				System.out.print(graphMargin);
				// 配列の値がカウント以上の場合
				if( randomArray[arrayCount] >= rangeCount ) {
					// グラフを描画する文字を表示する
					System.out.print(DRAW_GRAPH);
				} else {
					// オフセット文字を表示する
					System.out.print(DRAW_OFFSET);
				}
			}
			// 改行を出力する
			System.out.println();
		}

		// 配列の長さに応じて区切り線を表示する
		for ( int count = INITIALIZE_INTEGER; count < arrayLength; count++ ){
			// 区切り線を表示する
			System.out.print(graphSeparator);
		}

		// 改行を出力する
		System.out.println();

		// 各配列のインデックスを表示する
		for ( int count = INITIALIZE_INTEGER; count < arrayLength; count++ ){
			// インデックスの一の位だけ出力する
			System.out.print(graphMargin + count%GET_A_DIGIT);
		}
	

		/********************************************************/

		// 配列の長さの入力ストリームを閉じる
		arrayLengthInput.close();
	}
}
