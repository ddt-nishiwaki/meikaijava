package e13_1_shape;
/*************************************************
	インポート
*************************************************/
// 全パッケージ共有定数を読み込む
import static common.CommonConstants.*;

public abstract class AbstractRightTriangle extends AbstractShape{

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	public static final String TEXT_SHAPE_RIGHT_TRIANGLE= "RightTriangle";
	// toStringの返値フォーマットを設定する
	public static final String FORMAT_OUTPUT_TO_STRING = "%s(size: %d)";

	/*************************************************
		インスタンス変数
	*************************************************/
	// サイズフィールドを定義する
	private int mSize = INITIALIZE_ZERO;
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 何もしないコンストラクタを設定する
	public AbstractRightTriangle(){}
	// 大きさを設定するコンストラクタを設定する
	public AbstractRightTriangle(int size){
		mSize = size;
	}
	
	/*************************************************
		ゲッター
	*************************************************/
	/*
	 * 大きさを取得するゲッターを定義する
	 */
	protected int mGetSize(){
		// 大きさの設定を返す
		return mSize;
	}
	/*************************************************
		セッター
	*************************************************/
	/*
	 * 大きさを設定するセッターを定義する
	 */
	protected void mSetSize(int size){
		// 大きさを設定する
		mSize = size;
	}

}
