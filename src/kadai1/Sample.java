package kadai1;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Sample {
	public static void main(String[] args) {
		System.out.println("開発に抵抗がありますが、この授業をきっかけに楽しめるようになりたいです！");
		System.out.println("よろしくお願いします!");
		
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("今日は"+sdf.format(cl.getTime())+"です");
	}

}
