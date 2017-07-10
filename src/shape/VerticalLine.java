package shape;

/*************************************************
	インポート
*************************************************/
// 全パッケージ共用定数を読み込む
import static common.CommonConstants.*;
import static shape.CommonShapeConstants.*;

/*************************************************
	クラス
*************************************************/
/*
 * 垂直線クラス
 */
public class VerticalLine extends AbstractLine{

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	public static final String TEXT_SHAPE_VERTICAL_LINE = "VerticalLine";
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 長さを設定するコンストラクタを定義する
	public VerticalLine(int length){
		// 長さを設定する
		super(length);
	}
	
	/*************************************************
		オーバーライド
	*************************************************/
	/*
	 * 描画する図形を示す文字列を返すメソッドを実装する
	 * @see e13_1_shape.AbstractLine#toString()
	 */
	@Override public String toString(){
		// 描画する図形を示す文字列を返す
		return TEXT_SHAPE_HORIZON_LINE;
	}
	
	/*************************************************
		メソッド実装
	*************************************************/
	// 垂直線を描画するメソッドを定義する
	public void mDraw(){
		// 設定された長さを取得する
		int settingLength = mGetLength();
		// 描画のために設定された分処理を繰り返す
		for(int lengthCount = INITIALIZE_ZERO; lengthCount < settingLength; lengthCount++){
			// 垂直線を描画する
			System.out.println(DRAW_VERTICAL);
		}
	};
}
