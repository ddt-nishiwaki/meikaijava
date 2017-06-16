package kensyu01;

/*** クラス ***************************************/
// 2値/3値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティークラス
public class MinMax {

	/*** 数値型定数 ****************/
	// 配列の最初のインデックスを示す値を設定する
	private static final int FIRST_INDEX = 0;
	// 配列の長さを配列の最後のインデックスに変換する値を設定する
	private static final int SECOND_INDEX = 1;

	/*** minメソッド ****************/
	// 最小値を求めるメソッド(2値1)
	public static final int min(int firstValue, int secondValue){
		// 最小値を設定するための変数を宣言する
		int minValue;
		// 2値のうち最小値を設定する
		minValue = (firstValue < secondValue) ? firstValue : secondValue;
		// 設定した最小値を返す
		return minValue;
	}
	public static final int min(int firstValue, int secondValue, int thirdValue){
		// 最小値を設定するための変数を宣言する
		int minValue;
		// 一つ目の引数と二つ目の引数を比較して小さい方を最小値に設定する
		minValue = ( firstValue < secondValue) ? firstValue : secondValue;
		// 設定した最小値と三つ目の引数を比較して小さい方を最小値に設定する
		minValue = ( minValue < thirdValue) ? minValue : thirdValue;
		// 設定した最小値を返す
		return minValue;
	}
	public static final int min(int[] targetArray){
		// 最小値を設定するための変数を宣言する
		int minValue;
		// 配列の最小値を取得する
		int lengthArray = targetArray.length;
		// 比較のため,最初のインデックスの要素を最小値として設定する
		minValue = targetArray[FIRST_INDEX];
		// 設定した最初のインデックスとそれ以降のインデックスを比較する
		for (int indexCount = SECOND_INDEX; indexCount < lengthArray; indexCount++){
			// 現在の要素を取得する
			int numberCurrentElement = targetArray[indexCount];
			// 最初のインデックスの場合は最小値に設定する
			minValue = (minValue < numberCurrentElement) ? minValue : numberCurrentElement;
		}
		// 設定した最小値を返す
		return minValue;
	}
	
	/*** maxメソッド ****************/
	// 最大値を求めるメソッド(2値1)
	public static final int max(int firstValue, int secondValue){
		// 最大値を設定するための変数を宣言する
		int maxValue;
		// 2値のうち最大値を設定する
		maxValue = (firstValue > secondValue) ? firstValue : secondValue;
		// 設定した最大値を返す
		return maxValue;
	}
	public static final int max(int firstValue, int secondValue, int thirdValue){
		// 最大値を設定するための変数を宣言する
		int maxValue;
		// 一つ目の引数と二つ目の引数を比較して小さい方を最大値に設定する
		maxValue = ( firstValue > secondValue) ? firstValue : secondValue;
		// 設定した最大値と三つ目の引数を比較して小さい方を最大値に設定する
		maxValue = ( maxValue > thirdValue) ? maxValue : thirdValue;
		// 設定した最大値を返す
		return maxValue;
	}
	public static final int max(int[] targetArray){
		// 最大値を設定するための変数を宣言する
		int maxValue;
		// 配列の最大値を取得する
		int lengthArray = targetArray.length;
		// 比較のため,最初のインデックスの要素を最大値として設定する
		maxValue = targetArray[FIRST_INDEX];
		// 設定した最初のインデックスとそれ以降のインデックスを比較する
		for (int indexCount = SECOND_INDEX; indexCount < lengthArray; indexCount++){
			// 現在の要素を取得する
			int numberCurrentElement = targetArray[indexCount];
			// 最初のインデックスの場合は最大値に設定する
			maxValue = (maxValue > numberCurrentElement) ? maxValue : numberCurrentElement;
		}
		// 設定した最大値を返す
		return maxValue;
	}
	

}
