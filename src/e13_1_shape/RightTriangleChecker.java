package e13_1_shape;


/*************************************************
	インポート
*************************************************/
// 共有の定数を読み込む
import static common.CommonConstants.*;

/*************************************************
	クラス
*************************************************/
/**
 * 直角三角形インスタンスの作成と出力をチェックするためのクラス
 */
public class RightTriangleChecker extends AbstractShapeChecker{

	/*************************************************
		定数(メッセージ)
	*************************************************/
	// 直角三角形の角の位置設定入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_CORNER = "角の位置を決めてください";
	// 直角三角形の角の位置設定入力コマンド示すテキストを設定する
	private static final String MESSAGE_COMMAND_CORNER_POSITION = "1...左下/2...左上/3...右下/4...右上/";
	// 図形のサイズ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_SIZE = "サイズを入力してください";

	
	/*************************************************
		直角三角形型配列
	*************************************************/
	AbstractRightTriangle[] RightTriangleList = {
			new RightTriangleLowerLeft(),
			new RightTriangleUpperLeft(),
			new RightTriangleLowerRight(),
			new RightTriangleUpperRight()
	};
	
	/*************************************************
		メソッド
	*************************************************/
	/**
	 * 角の位置を決めるメソッドを定義する
	 */
	public int mDecideCornerPosition(){
		// 直角三角形の角入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_CORNER);
		// 角入力のためのコマンドを示す
		System.out.println(MESSAGE_COMMAND_CORNER_POSITION);
		// 入力された角位置指定コマンドを保持する
		return sInputScanner.nextInt();
		
	}
	/**
	 * サイズを決めるメソッドを定義する
	 */
	public int mDecideSize(){
		// サイズの入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_INPUT_SIZE);
		// 入力されたサイズを返す
		return sInputScanner.nextInt();
	}
	
	/**
	 * 直角三角形を作成するメソッドを定義する
	 */
	public AbstractRightTriangle mMakeShape(){
		// 角の位置を決める
		int cornerPosition = mDecideCornerPosition() + NUMBER_FORMAT_INDEX;
		// サイズを決める
		RightTriangleList[cornerPosition].mSetSize( mDecideSize());
		// 設定した直角三角形を返す
		return RightTriangleList[cornerPosition];
	};
	
	/**
	 * 図形を描画するメソッド
	 */
	public void mCheckShape(){
		// 直角三角形を作成する
		AbstractRightTriangle rightTriangle = mMakeShape();
		// 直角三角形を描画する
		rightTriangle.print();
	};
}

