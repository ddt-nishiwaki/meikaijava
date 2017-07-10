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
 * 水平線クラス
 */
public class HorizonLine extends AbstractLine{
	
	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	public static final String TEXT_SHAPE_HORIZON_LINE = "HorizonLine";
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 長さを設定するコンストラクタを定義する
	public HorizonLine(int length){
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
//	// 水平線を描画するメソッドを定義する
	public void mDraw(){
		// 設定された長さを取得する
		int settingLength = mGetLength();
		// 水平線描画のために設定された長さ分処理を繰り返す
		for(int lengthCount = INITIALIZE_ZERO; lengthCount < settingLength; lengthCount++){
			// 水平線を描画する
			System.out.print(DRAW_HORIZON);
		}
		// 水平線の長さを調整する改行を出力する
		System.out.println();
	};

}
