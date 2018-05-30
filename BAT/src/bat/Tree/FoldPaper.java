package bat.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。 此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕
 * ；突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。 如果每次都从下边向上⽅ 对折，对折N次。请从上到下计算出所有折痕的⽅向。
 * 给定折的次数n,请返回从上到下的折痕的数组，若为下折痕则对应元素为"down",若为上折痕则为"up". 测试样例： 1 返回：["down"]
 * 
 * @author luxin
 *
 */
public class FoldPaper {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(foldPaper(2)));
	}

	public static String[] foldPaper(int n) {
		// write code here
		List<String> result = new ArrayList<>();
		traversal(1, 1, n, result);
		String[] a = new String[result.size()];
		int i = 0;
		for (String string : result) {
			a[i] = string;
			i++;
		}
		return a;
	}

	public static void traversal(int cur, int index, int deep, List<String> result) {
		if (cur > deep)
			return;
		traversal(cur + 1, 1, deep, result);
		if (index == 0) {
			result.add("up");
		} else {
			result.add("down");
		}
		traversal(cur + 1, 0, deep, result);
	}
}
