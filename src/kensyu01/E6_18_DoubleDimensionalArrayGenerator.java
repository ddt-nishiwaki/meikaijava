package kensyu01;

/*** 機能の読み込み **************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス **************************/
// 入力した値から二次元配列を作成するクラス
public class E6_18_DoubleDimensionalArrayGenerator {

	/*** 定数設定 **************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITITIALIZE_NUMBER = 0;
	// 二次元配列の行、列の設定を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_ARRAY_LENGTH = "%sの値を設定してください\n";
	// 単語「行」を設定する 
	private static final String WORD_COLUMN = "行";
	// 単語「列」を設定する 
	private static final String WORD_ROW = "列";
	// 二次元配列の値の設定を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_ARRAY_VALUE = "%d,%d の値を設定してください";
	// 設定した二次元配列の値出力のためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_ARRAY_VALUE = "%d ";
	// 入力した結果を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ARRAY_DETAIL = "\n入力結果　↓ \n";

	/*** メソッド **************************/
	// 入力した値から二次元配列を作成する処理を行う
	public static void main (String[] arg){	
		
		/*** オブジェクト作成 **************************/
		// 二次元配列設定のためのオブジェクトを作成する
		Scanner scannerArraySetting = new Scanner(System.in);
		
		/*** 変数の初期化 **************************/
		// 入力された行数を保持する変数を初期化する
		int lengthArrayRow = INITITIALIZE_NUMBER;
		// 入力された列数を保持する変数を初期化する
		int lengthArrayColumn = INITITIALIZE_NUMBER;


		/*** 二次元配列の作成 **************************/
		// 二次元配列の行数入力を求めるメッセージを出力する
		System.out.printf(FORMAT_REQUEST_ARRAY_LENGTH,WORD_COLUMN);
		// 入力された行数を保持する
		lengthArrayRow = scannerArraySetting.nextInt();
		// 二次元配列を作成する　doubledimensional array
		int[][] doubleDimensionalArray = new int[lengthArrayRow][];
		
		
		/*** 二次元配列に値を設定する **************************/
		// 各行にアクセスする
		for ( int rowCount = INITITIALIZE_NUMBER; rowCount < lengthArrayRow; rowCount++) {
			// 二次元配列の列数入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_ARRAY_LENGTH,WORD_ROW);
			// 入力された列数を保持する
			lengthArrayColumn = scannerArraySetting.nextInt();
			// 各行に列を設定する
			doubleDimensionalArray[rowCount] = new int[lengthArrayColumn];

			// 各列にアクセスする
			for ( int columnCount = INITITIALIZE_NUMBER; columnCount < lengthArrayColumn; columnCount++) {
				// 値の入力を求めるメッセージを出力する
				System.out.printf(FORMAT_REQUEST_ARRAY_VALUE, rowCount, columnCount);
				// 値を設定する
				doubleDimensionalArray[rowCount][columnCount] = scannerArraySetting.nextInt();
			}
		}


		/*** 二次元配列に設定した値を出力する **************************/
		// 作成した二次元配列の値を出力するメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ARRAY_DETAIL);
		// 各行にアクセスする
		for ( int rowCount = INITITIALIZE_NUMBER; rowCount < lengthArrayRow; rowCount++) {
			// 列の長さを取得する
			int columnLength = doubleDimensionalArray[rowCount].length;
			// 各列にアクセスする
			for ( int columnCount = INITITIALIZE_NUMBER; columnCount < columnLength; columnCount++) {
				// 値を出力する
				System.out.printf(FORMAT_OUTPUT_ARRAY_VALUE, doubleDimensionalArray[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}


		/*** 終了処理 **************************/
		// 二次元配列設定用入力ストリームを閉じる
		scannerArraySetting.close();
	}
}

