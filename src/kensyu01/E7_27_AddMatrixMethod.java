package kensyu01;

/*** クラス ******************************/
/*
 *  3つの行列の行数、列数が同じかどうか判定し、
 *  異なればfalse同じであれば加算してtrueを返すメソッドを実行するクラス
 */
public class E7_27_AddMatrixMethod {

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "行列の行数、列数が同じかどうか判定し、\n異なればfalse同じであれば加算してtrueを返すメソッドを実行する";
	// 加算対象の行列成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_MATRIX = "加算対象の行列の成分を確認します";
	// 加算する行列の成分を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ADD_MATRIX = "次の行列を加算対象に設定します";
	// 加算結果を保持する行列を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_RESULT_MATRIX = "加算結果を出力します";
	// 加算できなかったことを示すメッセージを出力する
	private static final String MESSAGE_FAILED_ADD_MATRIX = "加算できませんでした";
	// 行列成分出力の際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_MATRIX_ELEMENT = "%d ";
	// 二つ目の行列を行数の異なる行列に設定して和の計算を実行することを示すメッセージを出力する
	private static final String MESSAGE_OPERATE_DIFFERENT_ROW = "加算する行列を行数の異なる行列に設定して和の計算を実行する";
	// 二つ目の行列を列数の異なる行列に設定して和の計算を実行することを示すメッセージを出力する
	private static final String MESSAGE_OPERATE_DEFFERENT_COLUMN = "加算する行列を列数の異なる行列に設定して和の計算を実行する";
	// 同じ行数、列数の3つの行列を指定して和の計算を実行することを示すメッセージを出力する
	private static final String MESSAGE_OPERATE_SAME_MATRIX = "同じ行数、列数の3つの行列を指定して和の計算を実行する";

	/*** メソッド addMatrix ******************************/
	/*
	 *  3つの行列の行数、列数が同じかどうか判定し、
	 *  異なればfalse同じであれば加算してtrueを返すメソッドを設定する
	 */
	private static boolean addMatrix(int[][] firstMatrix, int[][] secondMatrix, int[][] thirdMatrix) {
		// 加算の可否ステータスを保持する変数を初期化する
		boolean isSameLength = true;
		// 一つ目の行列の行の数を取得する
		int lengthFirstMatrixRow = firstMatrix.length;
		// 一つ目の行列の行の数を取得する
		int lengthSecondMatrixRow = secondMatrix.length;
		// 一つ目の行列の行の数を取得する
		int lengthThirdMatrixRow = thirdMatrix.length;
		
		// 3つの行列の行数が同じ場合の処理を行う
		if(lengthFirstMatrixRow == lengthSecondMatrixRow && lengthFirstMatrixRow == lengthThirdMatrixRow){
			// 行列の各行にアクセスする
			for (int rowCount = 0; rowCount < lengthFirstMatrixRow; rowCount++){
				// 一つ目の行列の列の数を取得する
				int lengthFirstMatrixColumn = firstMatrix[rowCount].length;
				// 一つ目の行列の列の数を取得する
				int lengthSecondMatrixColumn = secondMatrix[rowCount].length;
				// 一つ目の行列の列の数を取得する
				int lengthThirdMatrixColumn = thirdMatrix[rowCount].length;
				
				// 各列の長さが同じ場合の処理を行う
				if (lengthFirstMatrixColumn == lengthSecondMatrixColumn && lengthFirstMatrixColumn == lengthThirdMatrixColumn){
					// 行列の各行にアクセスする
					for (int columnCount = 0; columnCount < lengthFirstMatrixColumn; columnCount++){
						// 3つめの行列に 一つ目の行列と2つ目の行列の和を設定する
						thirdMatrix[rowCount][columnCount] = firstMatrix[rowCount][columnCount] + secondMatrix[rowCount][columnCount];
					}
				// 列数に差分があった場合の処理を行う
				} else {
					// 加算可否ステータスを false に設定する
					isSameLength = false;
					// 繰り返し処理を終了する
					break;
				}
			}
		} else {
			// 加算可否ステータスを false に設定する
			isSameLength = false;
		}
		// 加算可否ステータスを返す
		return isSameLength;
	}
	
	
	/*** メソッド printMatrix ******************************/
	// 行列の成分を出力するメソッドを設定する
	private static void printMatrix(int[][] targetMatrix) {
		// 一つ目の行列の行の数を取得する
		int lengthTargetMatrixRow = targetMatrix.length;
		// 行列の各行にアクセスする
		for (int rowCount = 0; rowCount < lengthTargetMatrixRow; rowCount++){
			// 一つ目の行列の列の数を取得する
			int lengthTargetMatrixColumn = targetMatrix[rowCount].length;
			// 各行の列にアクセスする
			for (int columnCount = 0; columnCount < lengthTargetMatrixColumn; columnCount++){
				// 各成分を出力する
				System.out.printf(FORMAT_OUTPUT_MATRIX_ELEMENT,targetMatrix[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}
	}


	/*** メソッド outputOperationMatrix ******************************/
	// 行列の計算結果をメッセージで出力するメソッドを設定する
	private static void outputOperationMatrix ( boolean operationStatus, int[][] resultOperationMatrix){
		if ( operationStatus == true ) {
			System.out.println(MESSAGE_OUTPUT_RESULT_MATRIX);
			printMatrix(resultOperationMatrix);
		} else {
			System.out.println(MESSAGE_FAILED_ADD_MATRIX);
		}
	}

	/*** メインメソッド ******************************/
	/*
	 *  3つの行列の行数、列数が同じかどうか判定し、
	 *  異なればfalse同じであれば加算してtrueを返すメソッドを実行する
	 */
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		boolean statusAddMatrix;		// 行列の和の計算の実行結果を保持する変数を宣言す
		/*** 変数設定 ******************************/
		// 一つ目の行列を設定する
		int[][] firstMatrix = { {1,2,3}, {4,5,6} };
		// 行数の異なる行列を設定する
		int[][] matrixNotSameRow = { {1,2,3}, {4,5,6}, {7,8,9} };
		// 列数の異なる行列を設定する
		int[][] matrixNotSameColumn = { {1,2,3,4}, {5,6,7,8} };
		// 二つ目の行列を設定する
		int[][] secondMatrix = { {4,5,6}, {1,2,3} };
		// 三つ目の行列を設定する
		int[][] matrixResultAdd = new int[2][3];

		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 加算対象確認 ******************************/
		// 一つ目の行列成分を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_MATRIX);
		// 一つ目の行列成分を出力する
		printMatrix(firstMatrix);
		
		/*** 演算結果出力 ******************************/
		// 二つ目の行列を行数の異なる行列に設定して和の計算を実行することを示すメッセージを出力する
		System.out.println(MESSAGE_OPERATE_DIFFERENT_ROW);
		// 加算する行列を表示することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_ADD_MATRIX);
		// 加算する行列の成分を出力する
		printMatrix(matrixNotSameRow);
		// 二つ目の行列を行数の異なる行列に設定して和の計算を実行する
		statusAddMatrix = addMatrix(firstMatrix, matrixNotSameRow, matrixResultAdd);
		// 加算結果を出力する
		outputOperationMatrix(statusAddMatrix, matrixResultAdd);
		// 二つ目の行列を列数の異なる行列に設定して和の計算を実行することを示すメッセージを出力する
		System.out.println(MESSAGE_OPERATE_DEFFERENT_COLUMN);
		// 加算する行列を表示することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_ADD_MATRIX);
		// 加算する行列の成分を出力する
		printMatrix(matrixNotSameColumn);
		// 二つ目の行列を列数の異なる行列に設定して和の計算を実行する
		statusAddMatrix = addMatrix(firstMatrix, matrixNotSameColumn, matrixResultAdd);
		// 加算結果を出力する
		outputOperationMatrix(statusAddMatrix, matrixResultAdd);
		// 同じ行数、列数の3つの行列を指定して和の計算を実行することを示すメッセージを出力する
		System.out.println(MESSAGE_OPERATE_SAME_MATRIX);
		// 同じ行数、列数の3つの行列を指定して和の計算を実行する
		statusAddMatrix = addMatrix(firstMatrix, secondMatrix, matrixResultAdd);
		// 加算結果を出力する
		outputOperationMatrix(statusAddMatrix, matrixResultAdd);
	}
}
