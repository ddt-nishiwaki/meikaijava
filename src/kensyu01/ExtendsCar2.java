package kensyu01;

/****************************************************
	クラス
****************************************************/
/*
 * Carクラス第二版 に以下機能を拡張したクラス
 * 
 * 総走行距離フィールドを設定する
 * スペック表示の出力に総走行距離情報を追加する
 * 
 */
public class ExtendsCar2 extends Car2 {

	/****************************************************
		定数(数値)
	****************************************************/
	// 総走行距離の初期値を設定する
	private static final double NUMBER_START_MILEAGE = 0;

	/****************************************************
		定数(メッセージ)
	****************************************************/
	private static final String MESSAGE_CAUTION_NOT_MOVE = "移動に失敗しました";

	/****************************************************
		定数(フォーマット)
	****************************************************/
	// スペック(double)出力フォーマットを設定する
	protected static final String FORMAT_OUTPUT_SPEC_DOUBLE = "%s : %f\n";
	// 移動距離を出力する際のフォーマットを設定する
	protected static final String FORMAT_OUTPUT_MILEAGE = "%f 移動しました\n\n";

	/****************************************************
		定数(テキスト)
	****************************************************/
	// テキスト「総走行距離」を設定する
	protected static final String TEXT_TOTAL_MILEAGE = "総走行距離";
	
	
	/****************************************************
		インスタンス変数
	****************************************************/
	private double mTotalMileage;


	/****************************************************
		コンストラクタ
	****************************************************/
	public ExtendsCar2(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		// 親クラスのコンストラクタを実行する
		super(name,width,height,length,fuel,purchaseDay);
		// 総走行距離に初期値を設定する
		this.mTotalMileage = NUMBER_START_MILEAGE;
	}


	/****************************************************
		セッター
	****************************************************/
	// 総走行距離のセッターを設定する
	protected void mSetTotalMileage(double mileage){
		// 走行距離を加算する
		this.mTotalMileage += mileage;
	}


	/****************************************************
		インスタンスメソッド
	****************************************************/
	/*
	 * 総走行距離を求めるメソッドを設定する
	 * 
	 */
	protected double mGetTotalMileage(double moveX, double moveY){
		// 移動距離を求めて返す
		return Math.sqrt(moveX * moveX + moveY * moveY);
	}
	
	
	/*
	 * 移動を行うメソッドを設定する
	 * 
	 * 求めた走行距離をそう走行距離に加算する
	 * 移動を行う際に、移動距離と同じ値を燃料からマイナスすることとする
	 * 移動距離が燃料を超えていた場合、何もせず false を返す
	 * 
	 */
	protected boolean mMove(double moveX, double moveY){
		// 移動を行い、その際のステータスを保持する
		boolean isMove = super.mMove(moveX, moveY);
		// 移動に成功した場合の処理を行う
		if(isMove){
			// 走行距離を求める
			double mileage = this.mGetTotalMileage(moveX, moveY);
			// 総走行距離を加算する
			this.mSetTotalMileage(mileage);
			// 移動距離を確認のために出力する
			System.out.printf(FORMAT_OUTPUT_MILEAGE,mileage);
		// 移動に失敗した場合の処理を行う
		}else{
			// 移動に失敗したことを出力する
			System.out.println(MESSAGE_CAUTION_NOT_MOVE);
		}
		// 移動ステータスを返す
		return isMove;
	}
	

	/*
	 * スペック表示を行うメソッドを設定する
	 */
	protected void mPrintSpec(){
		super.mPrintSpec();
		// 総走行距離を出力する
		System.out.printf(FORMAT_OUTPUT_SPEC_DOUBLE,TEXT_TOTAL_MILEAGE,this.mTotalMileage);
	}
}
