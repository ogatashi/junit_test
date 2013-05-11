package sample.main.test1;

/**
 * Practice 1(Page 353)
 * 
 */
public class StringUtils {

	public static void main(String args[]) {
		System.out.println(toSnakeCase("HelloWorld"));
	}

	/**
	 * snake case method.
	 * Replace upper letter to lower letter with underscore.
	 * (e.g. HelloWorld -> hello_world)
	 * @param src
	 * @return
	 */
	public static String toSnakeCase(String src) {
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				ch = Character.toLowerCase(ch);
				temp.append("_" + ch);
			} else {
				temp.append(ch);
			}
		}
		String ret = temp.toString();
		if (ret.startsWith("_")) {
			ret = ret.substring(1, ret.length());
		}
		return ret.toString();
	}
}
