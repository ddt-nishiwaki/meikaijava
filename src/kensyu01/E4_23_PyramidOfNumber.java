package kensyu01;

// 入力された値を扱う機能の読み込みを行う
import java.util.Scanner;

public class E4_23_PyramidOfNumber {

	// int型変数を初期化するための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// String型変数を初期化するための値を設定する
	public static final String INITIALIZATION_STRING = "";
	
	// ピラミッドを描画に使用する一桁の数を求める値を設定する
	public static final int VALUE_OF_KEEP_A_DIGIT = 10;
	
	// オフセットを描画するための文字を設定する
	public static final String OFFSET_CHARACTOR = " ";
	
	
	// 非表示範囲を設定するための処理開始時のカウントを設定する
	public static final int VALUE_OF_REVERSE_START = 0;
	
	// 表示範囲を設定するための処理開始時のカウントを設定する
	public static final int VALUE_OF_COUNT_START = 1;

	
	// ピラミッドサイズの入力を促すメッセージを設定する
	public static final String MESSAGE_OF_PYRAMID_GENERATOR = "ピラミッドを描画します。段数を入力してください。";

	// 出力時のメッセージを設定する
	public static final String MESSAGE_OF_OUTPUT = "出力します。";
	
	
	
	// ピラミッドの中心を除いた左右片方のの直角三角形の幅に変換するための値を設定する
	public static final int VALUE_OF_CONVERT_SIDE_TRIANGLE = -1;
	
	// 二つの直角三角形の幅を合わせるための値を設定する
	public static final int VALUE_OF_MERGE_SIDE_TRIANGLES = 2;
	
	// 中心の幅を設定する
	public static final int VALUE_OF_PYRAMID_CENTER_WIDTH = 1;
	
	
	// 入力された値からピラミッドを描画する処理を行う
	public static void main (String[] arg) {
		
		// ピラミッドの段数の入力を扱うオブジェクトを作成する
		Scanner pyramidHeightInput = new Scanner(System.in);
		
		// ピラミッドの段数の入力を保持する変数を初期化する
		int pyramidStageValue = INITIALIZATION_INTEGER;
		

		

		
		
		// ピラミッドの高さの入力を促すメッセージを出力する
		System.out.println(MESSAGE_OF_PYRAMID_GENERATOR);
		
		// 入力されたピラミッドの段数の値を変数に保持する
		pyramidStageValue = pyramidHeightInput.nextInt();
		
		
		
		//ピラミッドを描画する
		for (int stageCount = VALUE_OF_COUNT_START ; stageCount <= pyramidStageValue; stageCount++) {
			
			// 段を描画するための数値を設定する
			int valueOfDrawStage = stageCount % VALUE_OF_KEEP_A_DIGIT; 
			
			
			// ピラミッドの各段の幅を計算する
			int stageWidthViewValue = ( stageCount + VALUE_OF_CONVERT_SIDE_TRIANGLE ) * VALUE_OF_MERGE_SIDE_TRIANGLES + VALUE_OF_PYRAMID_CENTER_WIDTH;
			
			// ピラミッドの格段を描画する文字列を保持する変数を初期化する
			String stageWidthView = INITIALIZATION_STRING;
			
			// 格段表示までのオフセット文字列を保持する変数を初期化する
			String offsetWidthView = INITIALIZATION_STRING;
			
			// 表示するオフセット文字の数(範囲)を降順に切り替えるための値を設定する
			int offsetValue = pyramidStageValue - stageCount;
 
			// 格段の描画範囲を設定する
			for ( int columnCount = VALUE_OF_COUNT_START; columnCount <= stageWidthViewValue; columnCount++) {
				
				//  描画範囲のテキストを作成する
				stageWidthView += valueOfDrawStage;
				
			}
			
			// 格段表示までのオフセットを空白文字で設定する
			for (int columnCount = VALUE_OF_REVERSE_START; columnCount < offsetValue; columnCount++){
				
				// 描画範囲までのオフセット文字を作成する
				offsetWidthView += OFFSET_CHARACTOR;
				
			}
			
			// ピラミッドを上から一行づつ表示する
			System.out.println(offsetWidthView + stageWidthView);
			
		}

		
		// ピラミッドの高さを扱う入力ストリームを閉じる
		pyramidHeightInput.close();
	}
}
