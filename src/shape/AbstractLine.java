package shape;

/*************************************************
	抽象クラス
*************************************************/
/*
 *  直線クラス(抽象)
 */
public abstract class AbstractLine extends AbstractShape {

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	public static final String TEXT_SHAPE_HORIZON_LINE = "HorizonLine";
	// toStringの返値フォーマットを設定する
	public static final String FORMAT_OUTPUT_TO_STRING = "%s(Length: %d)\n";
	
	/*************************************************
		フィールド
	*************************************************/
	private int mLength;		// 長さフィールドを設定する
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 長さを設定するコンストラクタを定義する
	public AbstractLine(int mLength){
		// 長さを設定する
		mSetLength(mLength);
	}

	/*************************************************
		ゲッター
	*************************************************/
	// 長さフィールドのゲッターを設定する
	protected int mGetLength(){
		// 長さを返す
		return mLength;
	}
	/*************************************************
		セッター
	*************************************************/
	// 長さフィールドのセッターを設定する
	protected void mSetLength(int length){
		// 長さを設定する
		mLength = length;
	}
	
	/*************************************************
		メソッド実装(オーバーライド)
	*************************************************/
	// 描画する図形を示す文字列を返すメソッドを実装する
	@Override public String toString(){
		// 描画する図形を示す文字列を返す
		return String.format(FORMAT_OUTPUT_TO_STRING, mGetLength());
	}
}
