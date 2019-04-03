
public class SecMax {

	public static void main(String[] args) {
		int num = 1395248, n1, i, n2;
		for (n2 = i = n1 = 0; num > 0; i = num % 10, n2 = n1 < i ? n1 : n2, n1 = n1 < i ? i : n1, num /= 10);
		System.out.println(n1);
		System.out.println(n2);

	}

}
