package calendar;

/***************************************
	インポート
***************************************/
// 全パッケージ共有の定数を読み込む
import static common.CommonConstants.*;
// カレンダークラスを読み込む
import java.util.Calendar;
// グレゴリアンカレンダーを読み込む
import java.util.GregorianCalendar;
// グレゴリアンカレンダーの定数を扱えるようにする
import static java.util.GregorianCalendar.*;

/**
 * カレンダーを出力するクラスです
 * メンバ変数にCalendarインスタンスへの参照を持ちます
 * デフォルト値は 作成時の時刻です
 * @author wakkky05
 *
 */
public class CalendarPrinter {

	/***************************************
		定数
	***************************************/
	/***** 数値 *******/
	// 4文字以上の数値を年として処理を行うための値です
	private static final int MINIMUM_LENGTH_YEAR = 4;
	// 2文字までの数値を月として処理を行うための値です
	private static final int MAX_LENGTH_MONTH = 2;
	// 月の最大出力数を示す値です
	private static final int MAX_PRINT_MONTH = 12;
	// 出力数を1にする値です
	private static final int ONE_PRINT_MONTH = 1;
	// ついたちを示す値です
	private static final int FIRST_DAY_OF_MONTH = 1;
	// 1月を示す値です
	private static final int FIRST_MONTH_OF_YEAR = 1;
	// 曜日を示す値が土曜日かどうか判定するための値です
	private static final int NUMBER_JADGE_SATURDAY = 0;
	// カレンダーの月フィールドの値に変換するための値です
	private static final int NUMBER_FORMAT_MONTH = -1;
	// 月フィールドの値を出力用に変換するための値です
	private static final int NUMBER_FORMAT_OUTPUT_MONTH = 1;
	// 月が入力されていない状態を示す値です
	private static final int NUMBER_UNSETTING_MONTH = 0;
	/***** 文字列 *****/
	// カレンダー表示に使用する水平線です
	private static final String HORIZON_LINE = "---------------------------";
	// カレンダーを示すテキストです
	private static final String CALENDAR  = "Calendar";
	// 月曜日を示すテキストです
	private static final String MONDAY    = "Mon";
	// 火曜日を示すテキストです
	private static final String TUESDAY   = "Tue";
	// 水曜日を示すテキストです
	private static final String WEDNESDAY = "Wed";
	// 木曜日を示すテキストです
	private static final String THURSDAY  = "Thu";
	// 金曜日を示すテキストです
	private static final String FRIDAY    = "Fri";
	// 土曜日を示すテキストです
	private static final String SATURDAY  = "Sat";
	// 日曜日を示すテキストです
	private static final String SUNDAY    = "Sun";
	// 1月を示すテキストです
	private static final String JANUARY   = "Jan";
	// 2月を示すテキストです
	private static final String FEBRUARY  = "Feb";
	// 3月を示すテキストです
	private static final String MARCH     = "Mar";
	// 4月を示すテキストです
	private static final String APRIL     = "Apr";
	// 5月を示すテキストです
	private static final String MAY       = "May";
	// 6月を示すテキストです
	private static final String JUNE      = "Jun";
	// 7月を示すテキストです
	private static final String JULY      = "Jul";
	// 8月を示すテキストです
	private static final String AUGUST    = "Aug";
	// 9月を示すテキストです
	private static final String SEPTEMBER = "Sep";
	// 10月を示すテキストです
	private static final String OCTOBER   = "Oct";
	// 11月を示すテキストです
	private static final String NOVEMBER  = "Nov";
	// 12月を示すテキストです
	private static final String DECEMBER  = "Dec";
	/***** フォーマット *****/
	// カレンダーの曜日カラムを出力するフォーマットです
	private static final String FORMAT_OUTPUT_WEEK     = "%-4s";
	// カレンダーの日付を出力するフォーマットです
	private static final String FORMAT_OUTPUT_DATE     = " %2d ";
	// 先月・来月の日付部分を空白にするテキストです
	private static final String FORMAT_OUTPUT_OFFSET   = "    ";
	// カレンダーのヘッダーを出力するフォーマットです
	private static final String FORMAT_CALENDAR_HEADER = "   %s %d (%s)\n";

	/********************************************
		メンバ変数
	********************************************/
	// Calendarインスタンスへの参照フィールドです
	private Calendar mCalendarSetting;
	// 出力する月の数を設定するフィールドです
	private int mPrintMonthLength = ONE_PRINT_MONTH;
	// 月が入力された場合に値を保持するフィールドです
	private int mSettingMonth = NUMBER_UNSETTING_MONTH;

	/********************************************
		クラス変数
	********************************************/
	// 曜日を示すテキストの一覧です
	private static final String[] sWeekList = {
		SUNDAY,			//日曜 
		MONDAY,			//月曜
		TUESDAY,		//火曜 
		WEDNESDAY,		//水曜	
		THURSDAY,		//木曜
		FRIDAY,			//金曜	
		SATURDAY		//土曜
	};
	// 月を示すテキストの一覧です
	private static final String[] sMonthList = {
		JANUARY,		//1月
		FEBRUARY,		//2月 
		MARCH,			//3月	
		APRIL,			//4月	
		MAY,			//5月	
		JUNE,			//6月
		JULY,			//7月
		AUGUST,			//8月
		SEPTEMBER,		//9月
		OCTOBER,		//10月
		NOVEMBER,		//11月
		DECEMBER		//12月
	};

	/********************************************
		インスタンス初期化子
	********************************************/
	// デフォルト値を設定します
	{
		// 現在時刻に設定します
		mCalendarSetting = GregorianCalendar.getInstance();
	}

	/********************************************
		コンストラクタ
	********************************************/
	/**
	 * 引数がない場合はインスタンス初期化子で
	 * インスタンス作成時の年・月が設定されます
	 */
	public CalendarPrinter(){}

	/**
	 * コマンドライン引数を受け取って
	 * 有効な値があればデフォルト値を変更します
	 * @param commandArguments
	 */
	CalendarPrinter(String[] commandArguments){
		// コマンドライン引数が有効ならカレンダーフィールドを書き換えます
		changeCalendarField(commandArguments);
	};


	/********************************************
		インスタンスメソッド
	********************************************/
	/**
	 * 文字列に応じてカレンダーのフィールドを変更します<br>
	 * 無効な文字列は無視します
	 * @param commandArguments コマンドライン引数
	 * 
	 */
	public void changeCalendarField(String[] commandArguments){
		// 各コマンド引数にアクセスします
		for(String commandArgument : commandArguments){
			// 引数が年か月か判定するために文字数を取得します
			int numberOfChar = commandArgument.length();
			// 引数が年の場合の処理を行います
			if( numberOfChar >= MINIMUM_LENGTH_YEAR){
				// 引数を年として設定します
				setYearWithMonth(commandArgument);
			// 引数が月の場合の処理を行います
			} else if(numberOfChar <= MAX_LENGTH_MONTH){
				// 引数を月として設定します
				changeMonthSetting(commandArgument);
			};
		}
	}

	/**
	 * 年を設定します<br>
	 * 月の入力が特にない場合は出力開始月を1月に変更します
	 * @param commandArgument 各コマンドライン引数
	 */
	private void setYearWithMonth(String commandArgument){
		// 引数を年として設定する
		mCalendarSetting.set(YEAR, Integer.parseInt( commandArgument) );
		// コマンドラインから月が設定されていない場合の処理を行う
		if(mSettingMonth == NUMBER_UNSETTING_MONTH){
			// 月のデフォルト設定を 1月 に変更する
			mCalendarSetting.set(MONTH, FIRST_MONTH_OF_YEAR + NUMBER_FORMAT_INDEX);
			// すべての月を出力するように設定する
			mPrintMonthLength = MAX_PRINT_MONTH;
		}
	}

	/**
	 * 文字列が月だったらカレンダーフィールドを変更します
	 * 変更した際は出力範囲をその月だけに設定します
	 * @param commandArgument コマンドライン引数
	 */
	private void changeMonthSetting(String commandArgument){
		// 引数が年か月か判定するために文字数を取得します
		int numberOfChar = commandArgument.length();
		// 引数が月の場合(2文字)の処理を行う
		if(numberOfChar <= MAX_LENGTH_MONTH){
			// 引数を月として設定する
			mCalendarSetting.set(MONTH, Integer.parseInt( commandArgument) + NUMBER_FORMAT_MONTH); 
			// 月が設定された状態を保持する
			mSettingMonth = mCalendarSetting.get(MONTH);
			// 出力範囲を設定した月に限定する
			limitPrintMonthRange();
		};
	}

	/**
	 * 出力する'月の範囲'を変更した月に限定します
	 */
	private void limitPrintMonthRange(){
		// 出力する月の数を 1 に設定する
		mPrintMonthLength = ONE_PRINT_MONTH;
	}

	/**
	 * カレンダーの設定範囲の出力処理を行います
	 */
	public void startPrintProcess(){
		// 出力開始月の設定を取得する
		int startPrintMonth = mCalendarSetting.get(MONTH) + NUMBER_FORMAT_OUTPUT_MONTH;
		// 出力数を設定します
		int numberOfSheet = startPrintMonth + mPrintMonthLength;
		// 設定した範囲の月でカレンダーを出力します
		for(int monthCount = startPrintMonth; monthCount < numberOfSheet; monthCount++){
			// カレンダーを出力します
			printCalendar(monthCount);
		}
	}

	/**
	 * カレンダーの出力を行います
	 * @param month 月( 1 ~ 12 )
	 */
	public void printCalendar(int month){
		// 出力する月を設定します
		mCalendarSetting.set(MONTH, month + NUMBER_FORMAT_MONTH);
		// ヘッダーを出力します
		System.out.print( getCalendarHeader() );
		// ヘッダーと曜日を分けるラインを出力します
		System.out.println(HORIZON_LINE);
		// 曜日のカラムをしめす文字列を出力します
		printCalendarWeek();
		// ヘッダーと日付を分けるラインを出力します
		System.out.println(HORIZON_LINE);
		// 指定した月のカレンダーを出力します
		printCalendarDate(mCalendarSetting);
	}
	/**
	 * カレンダーのヘッダーを出力します。<br>
	 * 出力例: Calendar 2017 (Jan)
	 */
	private String getCalendarHeader(){
		// 年設定を取得します
		int settingYear = mCalendarSetting.get(YEAR);
		// 月設定を示すテキストを取得します
		String settingMonth = sMonthList[mCalendarSetting.get(MONTH)];
		// 年と月を示すテキストを返します
		return String.format(FORMAT_CALENDAR_HEADER,CALENDAR, settingYear, settingMonth);
	}
	/**
	 * カレンダーの曜日を出力します
	 */
	public void printCalendarWeek(){
		// 各曜日テキストの数を取得します
		int weekLength = sWeekList.length;
		// 各曜日のテキストにアクセスします
		for(int weekCount = INITIALIZE_ZERO; weekCount < weekLength; weekCount++){
			// 曜日を出力する
			System.out.printf(FORMAT_OUTPUT_WEEK,sWeekList[weekCount]);
		}
		// 表示を整えるための改行を出力する
		System.out.println();
		
	}
	/**
	 * カレンダーの日付を出力します
	 */
	public void printCalendarDate(Calendar calendar){
		// 年/月から月の日数を取得します
		int numberDaysMonth = calendar.getActualMaximum(DATE);
		// 1日の曜日を取得します
		int firstDayOfWeek = getFirstDayOfWeek(calendar);
		// 曜日の値とインデックスカウントのずれを修正する
		firstDayOfWeek--;
		// 1日以前の日付は空白文字を出力します
		for(int dateCount = NUMBER_FIRST_INDEX; dateCount < firstDayOfWeek; dateCount++){
			// 先月分の日付部分は空白文字を出力します
			System.out.print(FORMAT_OUTPUT_OFFSET);
		}
		// 何曜日を出力したかを1日からカウントする変数です
		int weekCount = firstDayOfWeek;
		// 1日に対応する曜日から日付を出力します
		for(int dateCount = NUMBER_FIRST_INDEX; dateCount < numberDaysMonth; dateCount++){
			// 曜日の出力を数えます
			weekCount++;
			// 現在の日にちを出力します
			System.out.printf(FORMAT_OUTPUT_DATE, dateCount + NUMBER_FORMAT_NUMBER);
			// 土曜日になったら出力位置を日曜日に戻します
			if( (weekCount % 7) == NUMBER_JADGE_SATURDAY){
				// 出力位置を日曜日に戻すために改行を出力する
				System.out.println();
			}
		}
		// 日付の出力を終えるための改行を出力する
		System.out.println();
		// カレンダー間の余白を開ける
		System.out.println();
	}
	/**
	 * 設定された月の1日の曜日を取得します
	 */
	private int getFirstDayOfWeek(Calendar calendar){
		// 曜日取得用にカレンダーを複製します
		Calendar copyCalendar = (Calendar)calendar.clone();
		// 複製したカレンダーの日付を1日に設定します
		copyCalendar.set(DATE, FIRST_DAY_OF_MONTH);
		// 曜日を取得して返します
		return copyCalendar.get(DAY_OF_WEEK);
	}
}	