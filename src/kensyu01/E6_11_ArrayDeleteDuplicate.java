package kensyu01;

/*** 機能のインポート ***********************************/
// 入力された値を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;

// 配列が連続した同じ値を持たないようにするクラス
public class E6_11_ArrayDeleteDuplicate {

	/*** 定数の初期化 ***********************************/
	// 数値型変数を初期化する値を設定する
	private static final int NUMBER_INITIALIZE_NUMERIC = 0;
	// 配列の長さを設定する
	private static final int VALUE_LENGTH_ARRAY = 100;
	// 乱数の範囲をシフトする値を設定する
	private static final int NUMBER_SHIFT_RANDOM_RANGE = 1;
	// 配列の値出力フォーマットを設定する
	private static final String FORMAT_OUTPUT_ARRAY_VALUE = "RandomArray[%d] = %d\n";
	

	/*** メソッド定義 ***********************************/
	// 配列が連続した同じ値を持たないようにする処理を行う
	public static void main(String[] arg) {
		
		/*** 変数の初期化 ***********************************/
		// 入力された配列の長さを保持する変数を初期化する
		int lengthRandomArray = VALUE_LENGTH_ARRAY;
		// 乱数の範囲を配列の長さに合わせて設定する
		int valueOfRangeRamdom = lengthRandomArray;

		/*** オブジェクトの作成 ***********************************/
		// 配列の長さの入力を扱うオブジェクトを作成する
		Scanner scannerRandomArray = new Scanner(System.in);
		// 乱数を生成するオブジェクトを作成する
		Random generatorRandomArray = new Random();
		// 配列を作成す
		int[] arrayRandom = new int[lengthRandomArray];
		

		/*** 配列の設定 ***********************************/
		int valueDeleteDuplicate;		// 配列に設定するための乱数を保持する変数を宣言する
		// 最初のインデックスに値を設定する
		arrayRandom[NUMBER_INITIALIZE_NUMERIC] = generatorRandomArray.nextInt(valueOfRangeRamdom) + NUMBER_SHIFT_RANDOM_RANGE;

		// 作成された配列の各インデックスに値を設定する
		for ( int indexCount = NUMBER_INITIALIZE_NUMERIC; indexCount < lengthRandomArray; indexCount++ ) {
			// 配列に設定するための乱数を保持する
			valueDeleteDuplicate = generatorRandomArray.nextInt(valueOfRangeRamdom) + NUMBER_SHIFT_RANDOM_RANGE;

			// すでに配列に同じ値が設定されていないか調べる
			for ( int IndexBackNumber = NUMBER_INITIALIZE_NUMERIC; IndexBackNumber < indexCount; IndexBackNumber++ ){
				
				// 現在まで設定してきた値に,現在設定している値と重複があった場合の処理を行う
				if( arrayRandom[IndexBackNumber] ==  valueDeleteDuplicate ){

					// 確実にその値と異なる乱数を設定するまで処理を行う
					while ( arrayRandom[IndexBackNumber] == valueDeleteDuplicate ) {
						// 現在のインデックスに乱数を設定しなおす
						valueDeleteDuplicate = generatorRandomArray.nextInt(valueOfRangeRamdom) + NUMBER_SHIFT_RANDOM_RANGE;
					}
					// カウントをリセットして他の値とも重複していないか確認する
					IndexBackNumber = NUMBER_INITIALIZE_NUMERIC;
				}
			}
			// 配列に重複を除外した値を設定する
			arrayRandom[indexCount] = valueDeleteDuplicate;
		}
				

		/*** 結果出力 ***********************************/
		// 配列に設定された各インデックスの値を確認する
		for ( int indexCount = NUMBER_INITIALIZE_NUMERIC; indexCount < lengthRandomArray; indexCount++ ) {
			// 現在のインデックスを出力する
			System.out.printf(FORMAT_OUTPUT_ARRAY_VALUE,indexCount,arrayRandom[indexCount]);
		}


		/*** 終了処理 ***********************************/
		// 配列の長さ設定の入力ストリームを閉じる
		scannerRandomArray.close();
	}
}
