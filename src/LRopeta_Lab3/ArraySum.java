
public class ArraySum {
	public int sumOfArray(Integer[] a, int index) {
		// base case, once there are no more items in the array,
		// return 0 and bounce back.
		if(index == -1) {
			return 0;
		} else {
			return a[index] + sumOfArray(a, index - 1);
		}
	}
}
