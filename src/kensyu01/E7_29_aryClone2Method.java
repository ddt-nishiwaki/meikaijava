package kensyu01;

// 二次元配列を複製するメソッドを実行するクラス
public class E7_29_aryClone2Method {
	
	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の最初のインデックスとなる値を設定する
	private static final int FIRST_INDEX = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "二次元配列を複製します";
	// 行列成分出力の際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_MATRIX_ELEMENT = "%d ";
	// オリジナルの二次元配列の成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ORIGIN_ARRAY = "複製元の二次元配列を表示します";
	// 複製した二次元配列の成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_CLONE_ARRAY = "複製した二次元配列を表示します";

	/*** メソッド printMatrix ******************************/
	// 行列の成分を出力するメソッドを設定する
	private static void printMatrix(int[][] targetMatrix) {
		// 一つ目の行列の行の数を取得する
		int lengthTargetMatrixRow = targetMatrix.length;
		// 行列の各行にアクセスする
		for (int rowCount = FIRST_INDEX; rowCount < lengthTargetMatrixRow; rowCount++){
			// 一つ目の行列の列の数を取得する
			int lengthTargetMatrixColumn = targetMatrix[rowCount].length;
			// 各行の列にアクセスする
			for (int columnCount = FIRST_INDEX; columnCount < lengthTargetMatrixColumn; columnCount++){
				// 各成分を出力する
				System.out.printf(FORMAT_OUTPUT_MATRIX_ELEMENT,targetMatrix[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}
	}

	// 二次元配列を複製するメソッドを設定する
	private static int[][] aryClone2(int[][] originMatrix){
		// 引数の二次元配列の一次元目の長さを取得する
		int lengthOneDemention = originMatrix.length;
		// 一次元目が同じ長さの二次元配列を設定する
		int[][] cloneTwoDimentinalArray = new int[lengthOneDemention][];
		// 一次元目の各要素へアクセスする
		for ( int primaryCount = INITIALIZE_ZERO; primaryCount < lengthOneDemention; primaryCount++ ){
			// 二次元目の各配列の長さを取得する
			int lengthTwoDimention = originMatrix[primaryCount].length;
			// 複製中の二次元配列の二次元目の長さを設定する
			cloneTwoDimentinalArray[primaryCount] = new int[lengthTwoDimention];
			// 各要素へアクセスする
			for ( int secondaryCount = INITIALIZE_ZERO; secondaryCount < lengthTwoDimention; secondaryCount++ ){
				// 各要素の値をコピーする
				cloneTwoDimentinalArray[primaryCount][secondaryCount] = originMatrix[primaryCount][secondaryCount];
			}
		}
		// 複製した二次元配列を返す
		return cloneTwoDimentinalArray;
	}

	/*** メインメソッド ******************************/
	// 二次元配列を複製するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数設定 ******************************/
		// 二次元配列を設定する
		int[][] originMatrix = { {1,2,3}, {4,5,6} };
		// 二次元配列の複製を保持するための変数を初期化する
		int[][] cloneTwoDementionalArray;

		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 複製処理 ******************************/
		cloneTwoDementionalArray = aryClone2(originMatrix);

		/*** 複製結果出力 ******************************/
		// オリジナルの二次元配列の成分を出力することをメッセージで表示する
		System.out.println(MESSAGE_OUTPUT_ORIGIN_ARRAY);
		// オリジナルの二次元配列の成分を出力する
		printMatrix(originMatrix);
		// 複製した二次元配列の成分を出力することをメッセージで表示する
		System.out.println(MESSAGE_OUTPUT_CLONE_ARRAY);
		// 複製した二次元配列の成分を出力する
		printMatrix(cloneTwoDementionalArray);
	}
}
