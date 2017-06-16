package kensyu01;

public class E10_2_ChangeClassVariable {

	/*** 数値型定数設定 ***************/
	private static final int NUMBER_CHANGE_ADD_COUNT = 4;
	/*** 出力フォーマット設定 ***************/
	// 一つ目のインスタンスの識別ID確認用の出力フォーマットを作成する
	private static final String FORMAT_OUTPUT_FIRST_ID = "firstInstanceの識別ID : %d\n";
	// 二つ目のインスタンスの識別ID確認用の出力フォーマットを作成する
	private static final String FORMAT_OUTPUT_SECOND_ID = "secondInstanceの識別ID : %d\n";
	// 三つ目のインスタンスの識別ID確認用の出力フォーマットを作成する
	private static final String FORMAT_OUTPUT_THIRD_ID = "thirdInstanceの識別ID : %d\n";
	// 四つ目のインスタンスの識別ID確認用の出力フォーマットを作成する
	private static final String FORMAT_OUTPUT_FOURTH_ID = "thirdInstanceの識別ID : %d\n";
	// IDクラスのクラス変数の変化を確認するための出力フォーマットを作成する
	private static final String FORMAT_OUTPUT_INSTANCE_COUNT = "現在までに %dつ のインスタンスが作成されています。\n";

	/*** メインメソッド ************************/
	// IDクラスのインスタンスを作成し、インスタンス作成回数を確認する処理を行う
	public static void main (String[] arg){
		/*** 変数設定 ********/
		ExId firstInstance;		// 一つ目のインスタンスを保持する変数を宣言する
		ExId secondInstance;		// 二つ目のインスタンスを保持する変数を宣言する
		ExId thirdInstance;		// 三つ目のインスタンスを保持する変数を宣言する
		ExId fourthInstance;		// 四つ目のインスタンスを保持する変数を宣言する
		
		/*** 1回目のインスタンス作成と作成回数の確認 ********/
		// 1回目のインスタンス作成を行う
		firstInstance = new ExId();
		// 作成したインスタンスの識別番号を確認のために出力する
		System.out.printf(FORMAT_OUTPUT_FIRST_ID,firstInstance.getId());
		/*** 2回目のインスタンス作成と作成回数の確認 ********/
		// 2回目のインスタンス作成を行う
		secondInstance = new ExId();
		// 作成したインスタンスの識別番号を確認のために出力する
		System.out.printf(FORMAT_OUTPUT_SECOND_ID,secondInstance.getId());
		/*** 3回目のインスタンス作成と作成回数の確認 ********/ // 3回目のインスタンス作成を行う
		thirdInstance = new ExId();
		// 作成したインスタンスの識別番号を確認のために出力する
		System.out.printf(FORMAT_OUTPUT_THIRD_ID,thirdInstance.getId());
		
		/*** IDカウントの加算量変更 ********/
		// IDの加算量を変更する
		ExId.sNumberAddCount = NUMBER_CHANGE_ADD_COUNT;
		
		/*** 4回目のインスタンス作成と作成回数の確認 ********/ // 3回目のインスタンス作成を行う
		fourthInstance = new ExId();
		// 作成したインスタンスの識別番号を確認のために出力する
		System.out.printf(FORMAT_OUTPUT_FOURTH_ID,fourthInstance.getId());
		
		/*** クラス変数の変化を確認 ********/
		// 現在までに作成したインスタンスの数を取得する
		int instanceCount = Id.getMaxId();
		// 現在までに作成したインスタンスの数を出力する
		System.out.printf(FORMAT_OUTPUT_INSTANCE_COUNT, instanceCount);
	}
}
