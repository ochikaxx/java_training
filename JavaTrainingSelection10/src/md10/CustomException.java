package md10;

/**
 * CustomExceptionクラスは独自例外クラスです。
 * 
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * CustomExceptionコンストラクタ
	 * @param message
	 */
	public CustomException(String message) {
		super(message);
	}
}