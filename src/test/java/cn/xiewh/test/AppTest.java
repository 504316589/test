package cn.xiewh.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void test() {
//		int arr[] = { 9 };
//		int arr[] = { 2, 3 };
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		print(arr);
	}

	public void print(int[] arr) {
		List<char[]> list = new ArrayList<>();
		// 遍历数字集合，并将对应的字母集合存放list中
		for (int num : arr) {
			char[] charArr = getCharArrByNum(num);
			if (charArr != null) {
				list.add(charArr);
			}
		}

		doExchange(list, 0);
		System.out.println(results);

	}

	Character[] result = new Character[100];
	List<String> results = new ArrayList<>();

	public void doExchange(List<char[]> list, int depth) {
		for (int i = 0; i < list.get(depth).length; i++) {
			result[depth] = list.get(depth)[i];
			if (depth != list.size() - 1) {
				doExchange(list, depth + 1);
			} else {
				String temp = "";
				for (Character c : result) {
					if (c != null) {
						temp += c;
					}
				}
				results.add(temp);
			}
		}
	}

	/**
	 * 根据 num 获取对应映射的字母数组
	 * 
	 * @param num
	 * @return
	 */
	public char[] getCharArrByNum(int num) {
		return getMapping().get(num);
	}

	/**
	 * 获取所有数字与字母的映射关系
	 * 
	 * @return
	 */
	public Map<Integer, char[]> getMapping() {
		Map<Integer, char[]> map = new HashMap<>();
		map.put(2, new char[] { 'a', 'b', 'c' });
		map.put(3, new char[] { 'd', 'e', 'f' });
		map.put(4, new char[] { 'g', 'h', 'i' });
		map.put(5, new char[] { 'j', 'k', 'l' });
		map.put(6, new char[] { 'm', 'n', 'o' });
		map.put(7, new char[] { 'p', 'q', 'r', 's' });
		map.put(8, new char[] { 't', 'u', 'v' });
		map.put(9, new char[] { 'w', 'x', 'y', 'z' });
		return map;
	}

}
