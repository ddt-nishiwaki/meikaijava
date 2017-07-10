package shape;


/*************************************************
	インポート
*************************************************/
// Mathクラスを定数を利用するために読み込む
import static java.lang.Math.*;

/*************************************************
	クラス
*************************************************/
/**
 * 円を作成するクラスです
 * ※drawメソッドは実装しません
 * @author wakkky05
 */
public class Circle {

	/*************************************************
		定数(数値)
	*************************************************/
	// 2倍するための値です
	private static final int TWO_TIMES = 2;

	/*************************************************
		定数(String)
	*************************************************/
	// 図形詳細を出力する際のフォーマットです
	private static final String FORMAT_OUTPUT_TO_STRING = "%s(半径: %.2f, 円周: %.2f, 面積: %.2f)";
	// この図形を示す文字列です
	private static final String TEXT_SHAPE_CIRCLE = "Circle";

	/*************************************************
		インスタンス変数
	*************************************************/
	private double mRadius;				// 半径フィールドです

	/*************************************************
		コンストラクタ
	*************************************************/
	/**
	 * 円を作成するコンストラクタです
	 * @param radius 半径
	 */
	public Circle(double radius){
		// 半径を設定します
		setRadius(radius);
	}
	/*************************************************
		アクセサ
	*************************************************/
	/**
	 * 半径を取得して返します
	 * @return double 半径
	 *
	 **/
	public double getRadius(){
		// 半径を返します
		return mRadius;
	}
	/**
	 * 半径に引数の値を設定します
	 * @param radius 半径
	 */
	public void setRadius(double radius){
		// 半径を設定します
		mRadius = radius;
	}
	/*************************************************
		インスタンスメソッド
	*************************************************/
	/**
	 * 直径の値を返します
	 * @return double 直径
	 */
	public double getDiameter(){
		// 直径の値を返します
		return mRadius * TWO_TIMES;
	}
	/**
	 * 円周の値を返します
	 * @return double 円周
	 */
	public double getCircumference(){
		// 円周の値を返します
		return getDiameter() * PI;
	}
	/*************************************************
		インターフェース実装
	*************************************************/
	/**
	 * 円の面積を返します
	 * @return double
	 */
	public double getArea(){
		// 面積の値を返します
		return (double)mRadius * mRadius * PI;
	}
	/*************************************************
		toString
	*************************************************/
	/*
	 * 描画する図形を示す文字列を返すメソッドを実装する
	 * @see shape.AbstractShape#toString()
	 */
	@Override public String toString(){
		// 描画する図形を示す文字列を返す
		return String.format(FORMAT_OUTPUT_TO_STRING, TEXT_SHAPE_CIRCLE, mRadius, getCircumference(), getArea());
	}
}
