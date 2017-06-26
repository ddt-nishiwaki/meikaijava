package kensyu01;


/****************************************************
	クラス
****************************************************/
/*
 * Carクラス第二版
 */
public class Car2 {
	
	/****************************************************
		定数(数値)
	****************************************************/
	// スタート位置を設定する
	private static final double NUMBER_START_POSITION = 0.0;

	/****************************************************
		定数(フォーマット)
	****************************************************/
	// スペック(テキスト)出力フォーマットを設定する
	protected static final String FORMAT_OUTPUT_SPEC_TEXT = "%s : %s\n";
	// スペック(int)出力フォーマットを設定する
	protected static final String FORMAT_OUTPUT_SPEC_INT = "%s : %d\n";

	/****************************************************
		定数(テキスト)
	****************************************************/
	// テキスト「名前」を設定する
	private static final String TEXT_NAME = "名前";
	// テキスト「幅」を設定する
	private static final String TEXT_WIDTH = "幅";
	// テキスト「高さ」を設定する
	private static final String TEXT_HEIGHT = "高さ";
	// テキスト「長さ」を設定する
	private static final String TEXT_LENGTH = "長さ";
	
	/****************************************************
		定数(真偽)
	****************************************************/
	// 処理が成功したことを示す値を設定する
	private static final boolean STATUS_SUCCESS = true;
	// 処理が失敗したことを示す値を設定する
	private static final boolean STATUS_FAILURE = false;


	/****************************************************
		インスタンス変数
	****************************************************/
	private String mName;		//名前フィールド を設定する
	private int mWidth;			//幅フィールド を設定する
	private int mHeight;		//高さフィールド を設定する
	private int mLength;		//長さフィールド を設定する
	private double mDotX;		//位置(x座標)フィールド を設定する
	private double mDotY;		//位置(x座標)フィールド を設定する
	private double mFuel;		//燃料フィールド を設定する
	private Day mPurchaseDay;	//購入美フィールド を設定する
	

	/****************************************************
		コンストラクタ
	****************************************************/
	public Car2(String name, int width, int height, int length, double fuel, Day purchaseDay){
		// 名前を設定する
		this.mName = name;
		// 幅を設定する
		this.mWidth = width;
		// 高さを設定する
		this.mHeight = height;
		// 長さを設定する
		this.mLength = length;
		// 燃料を設定する
		this.mFuel = fuel;
		// 座標を設定する
		this.mDotX = this.mDotY = NUMBER_START_POSITION;
		// 購入美を設定する
		this.mPurchaseDay = new Day(purchaseDay);
	}
		

	/****************************************************
		ゲッター
	****************************************************/
	// 座標xのゲッターを設定する
	protected double mGetDotX(){
		return this.mDotX;
	};
	// 座標yのゲッターを設定する
	protected double mGetDotY(){
		return this.mDotY;
	};
	// 燃料のゲッターを設定する
	protected double mGetFuel(){
		return this.mFuel;
	};
	// 購入日のゲッターを設定する
	protected Day mGetDotPurchaseDay(){
		return this.mPurchaseDay;
	};
		

	/****************************************************
		インスタンスメソッド
	****************************************************/
	/*
	 * スペック表示を行うメソッドを設定する
	 */
	protected void mPrintSpec(){
		// 名前を出力する
		System.out.printf(FORMAT_OUTPUT_SPEC_TEXT,TEXT_NAME,this.mName);
		// 幅を出力する
		System.out.printf(FORMAT_OUTPUT_SPEC_INT,TEXT_WIDTH,this.mWidth);
		// 高さを出力する
		System.out.printf(FORMAT_OUTPUT_SPEC_INT,TEXT_HEIGHT,this.mHeight);
		// 長さを出力する
		System.out.printf(FORMAT_OUTPUT_SPEC_INT,TEXT_LENGTH,this.mLength);
	}
	
	/*
	 * 移動を行うメソッドを設定する
	 * 
	 * 移動を行う際に、移動距離と同じ値を燃料からマイナスすることとする
	 * 移動距離が燃料を超えていた場合、何もせず false を返す
	 */
	protected boolean mMove(double moveX, double moveY){
		// 移動を行ったかどうかのステータスを保持する変数を宣言する
		boolean isMove;
		// 移動距離を求める
		double movingDistance = Math.sqrt(moveX * moveX + moveY * moveY);
		// 燃料が不足している場合の処理を行う
		if (movingDistance > this.mFuel){
			// ステータスを 失敗 にする
			isMove = STATUS_FAILURE;
		// 燃料が足りている場合の処理を行う
		} else {
			// 移動距離分の燃料を減らす
			this.mFuel -= movingDistance;
			// x座標を更新する
			this.mDotX += moveX;
			// y座標を更新する
			this.mDotY += moveY;
			// ステータスを 成功 にする 
			isMove = STATUS_SUCCESS;
		}
		// 処理のステータスを返す
		return isMove;
	}

}
