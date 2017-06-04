package kensyu01;

/*** クラス ******************************/
// 2つの行列の和を求めるメソッドを実行するクラス
public class E7_28_AddMatrixMethod {
	
	/*** 数値型定数設定 ******************************/
	// 配列の最初のインデックスとなる値を設定する
	private static final int FIRST_INDEX = 0;
	
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "2つの行列の和を求めます";
	// 加算対象の行列成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_MATRIX = "加算対象の行列の成分を確認します";
	// 加算する行列の成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ADD_MATRIX = "次の行列を加算対象に設定します";
	// 行列成分出力の際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_MATRIX_ELEMENT = "%d ";
	// 加算結果を表示します
	private static final String MESSAGE_OUTPUT_ADD_RESULT = "加算結果を表示します";

	/*** メソッド addMatrix ******************************/
	// 2つの行列の和を求めるメソッドを設定する
	private static int[][] addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		// 一つ目の行列の行の数を取得する
		int lengthFirstMatrixRow = firstMatrix.length;
		// 同じ行数の行数の行列を設定する
		int[][] matrixAddRusult = new int[lengthFirstMatrixRow][];
		// 行列の各行にアクセスする
		for (int rowCount = FIRST_INDEX; rowCount < lengthFirstMatrixRow; rowCount++){
			// 一つ目の行列の列の数を取得する
			int lengthFirstMatrixColumn = firstMatrix[rowCount].length;
			// 加算結果保持用の行列に列数を設定する
			matrixAddRusult[rowCount] = new int[lengthFirstMatrixColumn];

			// 行列の各行にアクセスする
			for (int columnCount = FIRST_INDEX; columnCount < lengthFirstMatrixColumn; columnCount++){
				// 引数に指定した行列の成分の値を加算した結果を保持する
				matrixAddRusult[rowCount][columnCount] = firstMatrix[rowCount][columnCount] + secondMatrix[rowCount][columnCount];
			}
		}
		return matrixAddRusult;
	}
	
	
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

	/*** メインメソッド ******************************/
	// 2つの行列の和を求めるメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数設定 ******************************/
		// 一つ目の行列を設定する
		int[][] firstMatrix = { {1,2,3}, {4,5,6} };
		// 二つ目の行列を設定する
		int[][] secondMatrix = { {4,5,6}, {1,2,3} };

		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 加算対象確認 ******************************/
		// 一つ目の行列成分を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_MATRIX);
		// 一つ目の行列成分を出力する
		printMatrix(firstMatrix);

		/*** 演算結果出力 ******************************/
		// 加算する行列の成分を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_ADD_MATRIX);
		// 加算する行列の成分を出力する
		printMatrix(secondMatrix);
		// 行列の和の計算を実行する
		int[][] matrixAddResult = addMatrix(firstMatrix, secondMatrix);
		// 加算結果を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_ADD_RESULT);
		// 加算結果を出力する
		printMatrix(matrixAddResult);
	}
}
