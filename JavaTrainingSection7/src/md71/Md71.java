package md71;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Md72クラスはユーザーが日付を入力し、一か月後の日付を表示します。
 * 日付のフォーマットとして"yyyy-MM-dd"を使用します。
 * 無効な日付を入力した場合はエラーメッセージを表示します。
 */
public class Md71 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("日付を入力してください。(例：2024-11-20)");
		
		// 日付の入力フォーマット定義
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputDate = br.readLine();
		
		// 入力フォーマットのチェック
		try {
			LocalDate date = LocalDate.parse(inputDate, formatter);
			LocalDate afterOneMonth = date.plusMonths(1);
		
			System.out.println(date);
			System.out.println("一か月後は" + afterOneMonth);
		} catch (Exception e) {
			System.out.println("正しい形式で入力してください。(例：2024-11-20)");
		}
	}
}