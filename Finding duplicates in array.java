package HashFunction;

import java.util.HashSet;
import java.util.Set;

public class duplicate {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		int arr[] = {1,2,3};
		for(int ele: arr) {
			if(hs.contains(ele)) {
				System.out.println("contains duplicate");
				return;
			}
			hs.add(ele);
		}
		System.out.println("contains unique value");
	}
}
