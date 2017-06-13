package kensyu01;

// Dayクラスを利用するクラス
public class E9_2_UseDayClass {
	/*** 日付設定用の定数 *****************************/
	// 初回設定のための「年」を設定する
	private static final int NUMBER_SET_YEAR = 2016;
	// 初回設定のための「月」を設定する
	private static final int NUMBER_SET_MONTH = 8;
	// 初回設定のための「日」を設定する
	private static final int NUMBER_SET_DATE = 15;
	// 再設定のための「年」を設定する
	private static final int NUMBER_RESET_YEAR = 2017;
	// 再設定のための「月」を設定する
	private static final int NUMBER_RESET_MONTH = 10;
	// 再設定のための「日」を設定する
	private static final int NUMBER_RESET_DATE = 13;
	
	/*** 出力フォーマットの定数 *****************************/
	// 「年」を表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_YEAR = "this.year : %d\n";
	// 「月」を表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_MONTH = "this.month : %d\n";
	// 「日」を表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_DATE = "this.date : %d\n";
	// 出力に使う区切り線を設定する
	private static final String HORIZONTAL_LINE = "---------------------------------";

	/*** 出力メッセージの定数 *****************************/
	// コピーしたDayクラスの比較を行うことを示すメッセージを設定する
	private static final String MESSAGE_COMPARE_CLASS = "オブジェクトをコピーして値の比較を行う";
	// フィールドを確認することを示すメッセージを設定する
	private static final String MESSAGE_CHECK_FIELD = "(コンストラクタで設定されたフィールドを確認する)";
	// 年月日を異なる値に変えることを示すメッセージを設定する
	private static final String MESSAGE_CHANGE_DAY = "(年月日を異なる値に再設定する)";
	// 変更の確認を行うことを示すメッセージを設定する
	private static final String MESSAGE_CHECK_CHANGE_DAY = "(コピーしておいたオブジェクトと日付を変更したオブジェクトの比較を行う)";
	// Dayオブジェクトを引数なしで作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_NO_ARGUMENT = "Dayクラスのコンストラクタを引数なしで実行";
	// Dayクラスのコピーを行うことを示すメッセージを設定する
	private static final String MESSAGE_COPY_DAY = "Dayクラスのコピーコンストラクタを実行";
	// Dayオブジェクトを引数二つで実行することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_TWO_ARGUMENT = "Dayクラスのコンストラクタを引数二つで実行";
	// 日付を再設定することを示すメッセージを設定する
	private static final String MESSAGE_RESET_DAY = "(変更した日付を再設定する)";
	// Dayオブジェクトを引数一つで作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_ONE_ARGUMENT = "Dayクラスのコンストラクタを引数一つで実行";
	// Dayオブジェクトを引数三つで作成することを示すメッセージを設定する
	private static final String NESSAGE_MAKE_THREE_ARGUMENT = "Dayクラスのコンストラクタを引数三つで実行";

	/*** メソッド *****************************/
	// Dayオブジェクトの動作チェックを行うメソッドを作成する
	private static void checkDayObject(Day Object){
		// コピーしたDayクラスの比較を行うことをメッセージで出力する
		System.out.println(MESSAGE_COMPARE_CLASS);
		// Dayオブジェクトのコピーを保持する
		Day copyObject = new Day(Object);
		// コピーしたオブジェクトとフィールドの値を比較する
		System.out.println(Object.equalTo(copyObject));
		// フィールドを確認することをメッセージで出力する
		System.out.println(MESSAGE_CHECK_FIELD);
		// 年を取得して出力する(getYearメソッドの確認を行う)
		System.out.printf(FORMAT_OUTPUT_YEAR,Object.getYear());
		// 月を取得して出力する(getMonthメソッドの確認を行う)
		System.out.printf(FORMAT_OUTPUT_MONTH,Object.getMonth());
		// 日を取得して出力する(getDateメソッドの確認を行う)
		System.out.printf(FORMAT_OUTPUT_DATE,Object.getDate());
		// 年月日を異なる値に変えることをメッセージで出力する
		System.out.println(MESSAGE_CHANGE_DAY);
		// 年を再設定する(setYearメソッドの確認を行う)
		Object.setYear(NUMBER_RESET_YEAR);
		// 月を再設定する(setMonthメソッドの確認を行う)
		Object.setMonth(NUMBER_RESET_MONTH);
		// 日を再設定する(setDateメソッドの確認を行う)
		Object.setDate(NUMBER_RESET_DATE);
		// 現在の状態を文字列で出力する(セッターメソッドの確認を行う)
		System.out.println(Object);
		// 変更の確認を行うことを示すメッセージを表示する
		System.out.println(MESSAGE_CHECK_CHANGE_DAY);
		// 現在の状態とコピーしておいたオブジェクトの状態を比較する
		System.out.println(Object.equalTo(copyObject));
		// 日付を再設定することを示すメッセージを表示する
		System.out.println(MESSAGE_RESET_DAY);
		// 年月日を再設定する(setメソッドの使用)
		Object.set(NUMBER_SET_YEAR, NUMBER_SET_MONTH, NUMBER_SET_DATE);
		// 現在の状態を文字列で出力する(setメソッドの確認を行う)
		System.out.println(Object);
		// 表示を見やすくするための改行を出力する
		System.out.println("\n");
	}
	
	
	/*** メインメソッド *********/
	// Dayクラスのコンストラクタの動きを確認するクラス
	public static void main(String[] arg){
		
		/*** Dayクラスのコンストラクタを引数なしで実行 *********/
		// Dayオブジェクトを引数なしで作成することを示すメッセージを表示する
		System.out.println(MESSAGE_MAKE_NO_ARGUMENT);
		// Dayクラスを引数なしで初期化する
		Day dayNonArgument = new Day();
		// Dayクラスの状態を確認する
		System.out.println(dayNonArgument);
		// 区切り線を表示する
		System.out.println(HORIZONTAL_LINE);
		// Dayクラスのメソッドの確認を行う
		checkDayObject(dayNonArgument);
		
		/*** Dayクラスのコンストラクタを引数一つで実行 *********/
		// Dayオブジェクトを引数一つで作成することを示すメッセージを表示する
		System.out.println(MESSAGE_MAKE_ONE_ARGUMENT);
		// Dayクラスを引数一つで初期化する
		Day dayOneArgument = new Day(NUMBER_SET_YEAR);
		// Dayクラスの状態を確認する
		System.out.println(dayOneArgument);
		// 区切り線を表示する
		System.out.println(HORIZONTAL_LINE);
		// Dayクラスのメソッドの確認を行う
		checkDayObject(dayOneArgument);

		/*** Dayクラスのコピーコンストラクタを実行 *********/
		// Dayクラスのコピーを行うことを示すメッセージを表示する
		System.out.println(MESSAGE_COPY_DAY);
		// 引数一つで作成したDayインスタンスをコピーする
		Day dayCopyArgument = new Day(dayOneArgument);
		// Dayクラスの状態を確認する
		System.out.println(dayCopyArgument);
		// 区切り線を表示する
		System.out.println(HORIZONTAL_LINE);
		// Dayクラスのメソッドの確認を行う
		checkDayObject(dayCopyArgument);

		/*** Dayクラスのコンストラクタを引数二つで実行 *********/
		// Dayオブジェクトを引数二つで実行することを示すメッセージを表示する
		System.out.println(MESSAGE_MAKE_TWO_ARGUMENT);
		// Dayクラスを引数二つで初期化する
		Day dayTwoArgument = new Day(NUMBER_SET_YEAR, NUMBER_SET_MONTH);
		// Dayクラスの状態を確認する
		System.out.println(dayTwoArgument);
		// 区切り線を表示する
		System.out.println(HORIZONTAL_LINE);
		// Dayクラスのメソッドの確認を行う
		checkDayObject(dayTwoArgument);

		/*** Dayクラスのコンストラクタを引数三つで実行 *********/
		// Dayオブジェクトを引数三つで作成することを示すメッセージを出力する
		System.out.println(NESSAGE_MAKE_THREE_ARGUMENT);
		// Dayクラスを引数三つで初期化する
		Day dayThreeArgument = new Day(NUMBER_SET_YEAR, NUMBER_SET_MONTH, NUMBER_SET_DATE);
		// Dayクラスの状態を確認する
		System.out.println(dayThreeArgument);
		// 区切り線を表示する
		System.out.println(HORIZONTAL_LINE);
		// Dayクラスのメソッドの確認を行う
		checkDayObject(dayThreeArgument);
	}
}
