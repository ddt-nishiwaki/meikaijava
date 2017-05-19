package kensyu01;

/*** 機能の読み込み *********************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス *********************************/
// 行列を乗算するクラス
public class E6_16_MultiplicationMatrix {

	/*** 定数設定 *********************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 行う演算内容を設定する
	private static final String MESSAGE_OPERATION_PROCESS = "行列の積を計算します\n各行列の成分を設定してください";
	// テキスト「4行3列の行列」を設定する
	private static final String TEXT_MATRIX_FOUR_THREE = "4行3列の行列";
	// 配列の長さを3にする値を設定する
	private static final int LENGTH_ARRAY_THREE = 3;
	// 配列の長さを4にする値を設定する
	private static final int LENGTH_ARRAY_FOUR = 4;
	// テキスト「3行4列の行列」を設定する
	private static final String TEXT_MATRIX_THREE_FOUR = "3行4列の行列";
	// 対象とする行列の設定を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_MATRIX_SETTING = "%sの成分を設定してください\n";
	// 入力対象を示すフォーマットを設定する
	private static final String FORMAT_REQUEST_MATRIX_VALUE = "\t(%s) %d,%d ";
	// 成分を表示するフォーマットを設定する
	private static final String FORMAT_OUTPUT_MATRIX_ELEMENT = "%d ";
	// 乗算結果を示すテキストを設定する
	private static final String TEXT_RESULT_MATRIX_MULTIPLICATION = " 乗算結果 : ";
	
	//　行列を乗算する処理を行う
	public static void main(String[] arg){

		/*** オブジェクトの作成 *********************************/
		// 行列成分の入力を扱うオブジェクトを作成する
		Scanner scannerMatrixElement = new Scanner(System.in);
		// 四行三列の行列を初期化する
		int[][] matrixFourThree = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		// 三行四列の行列を初期化する
		int[][] matrixThreeFour = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		// 演算結果を保持する行列を初期化する
		int[][] matrixOperationResult = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};

		/*** 初期メッセージの出力 *********************************/
		// 行う演算内容を出力する
		System.out.println(MESSAGE_OPERATION_PROCESS);

		/*** 成分の入力 *********************************/
		// 4行3列の行列の設定を求めるメッセージを出力する
		System.out.printf(FORMAT_REQUEST_MATRIX_SETTING,TEXT_MATRIX_FOUR_THREE);
		// 行列の各行にアクセスする
		for (int rowCount = INITIALIZE_NUMBER; rowCount < LENGTH_ARRAY_FOUR; rowCount++){ 
			// 各成分にアクセスする
			for(int columnCount = INITIALIZE_NUMBER; columnCount < LENGTH_ARRAY_THREE; columnCount++) {
				// 成分の入力を求めるメッセージを出力する
				System.out.printf(FORMAT_REQUEST_MATRIX_VALUE,TEXT_MATRIX_FOUR_THREE,rowCount+1,columnCount+1);
				// 行列に成分を設定する
				matrixFourThree[rowCount][columnCount] = scannerMatrixElement.nextInt();
			}
		}
		
		// 3行4列の行列の設定を求めるメッセージを出力する
		System.out.printf(FORMAT_REQUEST_MATRIX_SETTING,TEXT_MATRIX_THREE_FOUR);
		// 各行にアクセスする
		for (int rowCount = INITIALIZE_NUMBER; rowCount < LENGTH_ARRAY_THREE; rowCount++){ 
			// 各成分にアクセスする
			for(int columnCount = INITIALIZE_NUMBER; columnCount < LENGTH_ARRAY_FOUR; columnCount++) {
				// 成分の入力を求めるメッセージを出力する
				System.out.printf(FORMAT_REQUEST_MATRIX_VALUE,TEXT_MATRIX_THREE_FOUR,rowCount+1,columnCount+1);
				// 行列に成分を設定する
				matrixThreeFour[rowCount][columnCount] = scannerMatrixElement.nextInt();
			}
		}

		/*** 入力された行列を確認する *********************************/
		// 4行3列の行列の値を示すテキストを表示する
		System.out.println(TEXT_MATRIX_FOUR_THREE);
		// 4行3列の行列の各行にアクセスする
		for (int rowCount = INITIALIZE_NUMBER; rowCount < LENGTH_ARRAY_FOUR; rowCount++){ 
			// 各成分にアクセスする
			for(int columnCount = INITIALIZE_NUMBER; columnCount < LENGTH_ARRAY_THREE; columnCount++) {
				// 各成分を出力する
				System.out.printf(FORMAT_OUTPUT_MATRIX_ELEMENT,matrixFourThree[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}

		// 3行4列の行列の値を示すテキストを表示する
		System.out.println(TEXT_MATRIX_THREE_FOUR);
		// 4行3列の行列の各行にアクセスする
		for (int rowCount = INITIALIZE_NUMBER; rowCount < LENGTH_ARRAY_THREE; rowCount++){ 
			// 各成分にアクセスする
			for(int columnCount = INITIALIZE_NUMBER; columnCount < LENGTH_ARRAY_FOUR; columnCount++) {
				// 各成分を出力する
				System.out.printf(FORMAT_OUTPUT_MATRIX_ELEMENT,matrixThreeFour[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}
		
		
		/*** 行列の乗算 *********************************/
		// 4行3列の行列の各行にアクセスする
		for (int rowCountFourThree = INITIALIZE_NUMBER; rowCountFourThree < LENGTH_ARRAY_FOUR; rowCountFourThree++){ 
			// 各成分を保持する変数を宣言する
			int matrixElementFourThree;
			// 各成分にアクセスする
			for(int columnCountFourThree = INITIALIZE_NUMBER; columnCountFourThree < LENGTH_ARRAY_THREE; columnCountFourThree++) {
				// 各成分を保持する
				matrixElementFourThree = matrixFourThree[rowCountFourThree][columnCountFourThree];
				
				// 結果を保持する行列に 4行3列の行列と 3行4列の行列 の乗算結果を設定していく
				for(int rowCountThreeFour = INITIALIZE_NUMBER; rowCountThreeFour < LENGTH_ARRAY_THREE; rowCountThreeFour++) {
					int resultMatrixMultiplication;		// 乗算結果を保持する変数を宣言する
					for(int columnCountThreeFour = INITIALIZE_NUMBER; columnCountThreeFour < LENGTH_ARRAY_FOUR; columnCountThreeFour++) {
						//乗算結果を保持する
						resultMatrixMultiplication = matrixThreeFour[columnCountFourThree][columnCountThreeFour] * matrixElementFourThree;
						// 各成分をと4行3列の成分を乗算して、結果を保持する行列に加算していく
						matrixOperationResult[rowCountThreeFour][columnCountThreeFour] += resultMatrixMultiplication;
					}
				}
			}
		}
		
		/*** 行列の乗算結果を出力する *********************************/
		// 乗算結果を示すテキストを表示する
		System.out.println(TEXT_RESULT_MATRIX_MULTIPLICATION);
		// 演算結果を保持する行列の各行にアクセスする
		for (int rowCount = INITIALIZE_NUMBER; rowCount < LENGTH_ARRAY_THREE; rowCount++){ 
			// 各成分にアクセスする
			for(int columnCount = INITIALIZE_NUMBER; columnCount < LENGTH_ARRAY_FOUR; columnCount++) {
				// 各成分を出力する
				System.out.printf(FORMAT_OUTPUT_MATRIX_ELEMENT,matrixOperationResult[rowCount][columnCount]);
			}
			// 改行を出力する
			System.out.println();
		}
		/*** 終了処理 *********************************/
		scannerMatrixElement.close();
	}
}

