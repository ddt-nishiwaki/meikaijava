package kensyu01;

/*** インポート **********************************/
// 入力を扱うクラスの読み込み
import java.util.Scanner;


/*** クラス **********************************/
// 日付クラス第四版を検証するクラス
public class E10_4_UseDay4Class {
	
	/*** 数値型定数設定 **********************************/
	// 検証のために使用する 年　を設定する
	private static final int NUMBER_SETTING_YEAR = 2016;
	// 検証のために使用する 月　を設定する
	private static final int NUMBER_SETTING_MONTH = 2;
	// 検証のために使用する 日　を設定する
	private static final int NUMBER_SETTING_DATE = 29;
	// 検証のために使用する 不正な日(超過)　を設定する
	private static final int NUMBER_SETTING_UPPER_DATE = 32;
	// 検証のために使用する 不正な月(超過)　を設定する
	private static final int NUMBER_SETTING_UPPER_MONTH = 13;
	// 検証のために使用する 不正な日付(0以下)　を設定する
	private static final int NUMBER_SETTING_LOWER_DAY = -1;
	
	/*** 文字列型定数設定 **********************************/
	// 現在の日付を設定することを示す文字列を設定する
	private static final String MESSAGE_CHECK_CURRENT_DAY = "引数なしの場合、現在の日付を設定する";
	// 下限の制限をチェックすることを示す文字列を設定する
	private static final String MESSAGE_CHECK_LOWER_DAY = "1以下の入力でインスタンスを作成した場合、下限 以内に値を抑えて設定する";
	// 上限の制限をチェックすることを示す文字列を設定する
	private static final String MESSAGE_CHECK_UPPER_DAY = "上限以上の入力でインスタンスを作成した場合、下限 以内に値を抑えて設定する";
	// 経過日数の取得をチェックすることを示す文字列を設定する
	private static final String MESSAGE_CHECK_ELAPSED_DATE = "経過日数取得メソッドを検証します";
	// 残日数の取得をチェックすることを示す文字列を設定する
	private static final String MESSAGE_CHECK_REMAINING_DATE = "残日数取得メソッドを検証します";
	// 他の日付との前後関係を確認するためのインスタンスを複製する ことを示す文字列を設定する
	private static final String MESSAGE_MAKE_COMPARE_DAY = "他の日付との前後関係を確認するためのインスタンスを複製します";
	// 作成したインスタンスを出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_MAKE_DAY = "以下の日付を設定しました";
	// 同じ日付の比較結果を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_COMPRE_SAME = "↓ 同じ日付との比較結果";
	// 次の日付との比較結果を設定することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_COMPRE_NEXT = "↓ 未来の日付との比較結果";
	// 前の日付との比較結果を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_COMPRE_PREVIOUS = "↓ 過去の日付との比較結果";
	// 二つの日付の前後関係を判定するクラスメソッドの確認を行うことを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_COMPRE_TWO = "二つの日付の前後関係を判定するクラスメソッドの確認を行う";
	// 日付をn日後ろに進めるメソッドの確認を行うことを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ANY_FUTURE = "日付をn日後ろに進めるメソッドの確認を行う";
	// 進めたい日数入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ANY_FUTURE = "進めたい日付を入力してください : ";
	// 任意の日数先の日付を出力する際のメッセージを設定する
	private static final String FORMAT_OUTPUT_ANY_FUTURE = "↓ %d日後の日付\n";
	// 日付をn日後ろに進めるメソッドの確認を行うことを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_ANY_OLD = "日付をn日前に戻すメソッドの確認を行う";
	// 戻したい日数入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ANY_OLD = "戻したい日付を入力してください : ";
	// 任意の日数前の日付を出力する際のメッセージを設定する
	private static final String FORMAT_OUTPUT_ANY_OLD = "↓ %d日前の日付\n";
	
	/*** スキャナー作成 **********************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner inputScanner = new Scanner(System.in);
	
	/*** メソッド **********************************/
	// 日付クラス第四版を検証する処理を行う
	public static void main(String[] arg){
		
		/*** コンストラクタ検証 *******************/
		
		/*
		 * 引数を受け取らないコンストラクタはによるインスタンスの生成時は、
		 * 西暦1年1月1日で初期化するのではなく、
		 * プログラム実行時の日付で初期化するように変更する機能の確認を行う
		 */
		// 引数なしの場合、現在の日付を設定する
		Day4 currentDay = new Day4();
		// 現在の日付を確認することを示すメッセージを出力する
		System.out.println(MESSAGE_CHECK_CURRENT_DAY);
		// 現在の日付を確認する
		System.out.println(currentDay);
		// 出力を見やすくするために改行を開ける
		System.out.println();

		
		/*
		 * 引数を受け取るコンストラクタに不正な値が指定された場合は、
		 * 適当な値に調整するよう変更する機能の確認を行う
		 * (例えば13月が指定された場合は12月とする/ 9月31と指定された場合は9月30日とする。)
		 */
		// 1以下の入力でインスタンスを作成した場合、下限 以内に値を抑えて設定する
		Day4 dayLimitLower = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_LOWER_DAY,NUMBER_SETTING_LOWER_DAY);
		// 入力の下限を制限することを示すメッセージを出力する
		System.out.println(MESSAGE_CHECK_LOWER_DAY);
		// 適当な値に変更されていることを確認する
		System.out.println(dayLimitLower);
		// 出力を見やすくするために改行を開ける
		System.out.println();

		// 上限以上の入力でインスタンスを作成した場合、上限 以内に値を抑えて設定する
		Day4 dayLimitUpper = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_UPPER_MONTH,NUMBER_SETTING_UPPER_DATE);
		// 入力の下限を制限することを示すメッセージを出力する
		System.out.println(MESSAGE_CHECK_UPPER_DAY);
		// 適当な値に変更されていることを確認する
		System.out.println(dayLimitUpper);
		// 出力を見やすくするために改行を開ける
		System.out.println();

		
		/*** メソッド検証 *******************/
		/*
		 * 年内での経過日数(その年の元旦から数えて何日目であるか)
		 * を求めるメソッドの確認を行う
		 */
		// 経過日数の取得検証用のインスタンスを作成する
		Day4 dayCheckElapsedDate = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_MONTH,NUMBER_SETTING_DATE);
		// 入力の下限を制限することを示すメッセージを出力する
		System.out.println(MESSAGE_CHECK_ELAPSED_DATE);
		// 設定された日付を出力する
		System.out.println(dayCheckElapsedDate);
		// 経過日数を出力する
		System.out.println(dayCheckElapsedDate.mGetElapsedDate());
		// 出力を見やすくするために改行を開ける
		System.out.println();
		
		
		/*
		 * 年内の残りの日数を求めるメソッドの確認を行う
		 */
		// 残日数の取得検証用のインスタンスを作成する
		Day4 dayCheckRemaininigDate = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_MONTH,NUMBER_SETTING_DATE);
		// 入力の下限を制限することを示すメッセージを出力する
		System.out.println(MESSAGE_CHECK_REMAINING_DATE);
		// 設定された日付を出力する
		System.out.println(dayCheckRemaininigDate);
		// 残日数を出力する
		System.out.println(dayCheckRemaininigDate.mGetRemainingDaysYear());
		// 出力を見やすくするために改行を開ける
		System.out.println();

		
		/*
		 * 他の日付との前後関係(より前の日か / 同じ日付か / より後ろの日付か)を判定する
		 * インスタンスメソッドの確認を行う
		 */
		// 他の日付との前後関係を確認するためのインスタンスを作成することを示すメッセージを表示する	
		System.out.println(MESSAGE_MAKE_COMPARE_DAY);
		// 他の日付との前後関係を確認するためのインスタンスを作成する
		Day4 dayCheckCompareTarget = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_MONTH,NUMBER_SETTING_DATE);
		// 他の日付との前後関係を確認するためのインスタンスを複製する
		Day4 dayCheckCompareClone = new Day4(dayCheckCompareTarget);
		// 他の日付との前後関係を確認するためのインスタンスを複製する
		Day4 dayCheckCompareNext = new Day4(dayCheckCompareTarget);
		/*
		 * 次の日の日付を返却するメソッドを利用している
		 * 日付を一つ後ろに進めるメソッド
		 * の確認を行う
		 */
		// 比較のために日付を1日進める
		dayCheckCompareNext.mSetNextDay();
		// 他の日付との前後関係を確認するためのインスタンスを複製する
		Day4 dayCheckComparePrevious = new Day4(dayCheckCompareTarget);
		/*
		 * 前の日の日付を返却するメソッドを利用している
		 * 日付を一つ前に戻すメソッドの確認を行う
		 */
		// 比較のために日付を1日戻す
		dayCheckComparePrevious.mSetPreviousDay();
		
		// 作成したインスタンスを確認することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MAKE_DAY);
		// 比較対象の日付を表示する
		System.out.println(dayCheckCompareTarget);
		// 同じ日付を表示する
		System.out.println(dayCheckCompareClone);
		// 次の日付を表示する
		System.out.println(dayCheckCompareNext);
		// 前の日付を表示する
		System.out.println(dayCheckComparePrevious);
		
		// 同じ日付の比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_SAME );
		// 同じ日付の比較結果を出力する
		System.out.println( dayCheckCompareTarget.mCompareDay(dayCheckCompareClone) );
		// 次の日付との比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_NEXT );
		// 次の日付との比較結果を出力する
		System.out.println( dayCheckCompareTarget.mCompareDay(dayCheckCompareNext) );
		// 前の日付との比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_PREVIOUS );
		// 前の日付との比較結果を出力する
		System.out.println( dayCheckCompareTarget.mCompareDay(dayCheckComparePrevious) );
		
		
		/*
		 * 二つの日付の前後関係を判定するクラスメソッドの確認を行う
		 */
		// 二つの日付の前後関係を判定するクラスメソッドの確認を行うことを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_TWO );
		// 同じ日付の比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_SAME );
		// 同じ日付の比較結果を出力する
		System.out.println( Day4.sCompareDay(dayCheckCompareTarget, dayCheckCompareClone) );
		// 次の日付との比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_NEXT );
		// 次の日付との比較結果を出力する
		System.out.println( Day4.sCompareDay(dayCheckCompareTarget, dayCheckCompareNext) );
		// 前の日付との比較結果を出力することを示すメッセージを出力する
		System.out.println( MESSAGE_OUTPUT_COMPRE_PREVIOUS );
		// 前の日付との比較結果を出力する
		System.out.println( Day4.sCompareDay(dayCheckCompareTarget, dayCheckComparePrevious) );
		// 出力を見やすくするために改行を開ける
		System.out.println();

		/*
		 * n日後の日付を返却するメソッドを利用している
		 * 日付をn日後ろに進めるメソッドの確認を行う
		 */
		// 日付をn日後ろに進めるメソッドの確認を行うことを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ANY_FUTURE);
		// 基準となる日付を設定する
		Day4 BaseDay = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_MONTH,NUMBER_SETTING_DATE);
		// 作成したインスタンスを確認することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MAKE_DAY);
		// 基準日を出力する
		System.out.println(BaseDay);
		// 進めたい日数入力を求めるメッセージを出力する
		System.out.print(MESSAGE_REQUEST_ANY_FUTURE);
		// 入力された値を受け取る
		int daysChangeFuture = inputScanner.nextInt();
		// 入力された値分日付を進める
		BaseDay.mSetFutureDay(daysChangeFuture);
		// 任意の日数先の日付を出力することを示すメッセージを出力する
		System.out.printf(FORMAT_OUTPUT_ANY_FUTURE,daysChangeFuture);
		// 任意の日数先の日付を出力する
		System.out.println(BaseDay);
		// 出力を見やすくするために改行を開ける
		System.out.println();

		
		
		/*
		 * n日前の日付を返却するメソッドを利用している
		 * 日付をn日前に戻すメソッドの確認を行う
		 */
		// 日付をn日前に戻すメソッドの確認を行うことを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ANY_OLD);
		// 基準となる日付を設定する
		BaseDay = new Day4(NUMBER_SETTING_YEAR,NUMBER_SETTING_MONTH,NUMBER_SETTING_DATE);
		// 作成したインスタンスを確認することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MAKE_DAY);
		// 基準日を出力する
		System.out.println(BaseDay);
		// 戻したい日数入力を求めるメッセージを出力する
		System.out.print(MESSAGE_REQUEST_ANY_OLD);
		// 入力された値を受け取る
		int daysChangeOld = inputScanner.nextInt();
		// 入力された値分日付を進める
		BaseDay.mSetOldDay(daysChangeOld);
		// 任意の日数先の日付を出力することを示すメッセージを出力する
		System.out.printf(FORMAT_OUTPUT_ANY_OLD,daysChangeOld);
		// 任意の日数先の日付を出力する
		System.out.println(BaseDay);	
	}
}
