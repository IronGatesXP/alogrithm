package chapter_2;

public class MergeSort {
	public static void main(String[] args) {

	}

	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		for (int i = 0;i <= high - low + 1;i++) {
			temp[i] = a[i + low];
		}
		int i = low;
		int j = mid + 1;
		for (int k = low;k <= high;k++) {
			if (i > mid) {
			a[k++] = temp[j++];
			} else if (j > high) {
				a[k++] = temp[i++];
			} else if (temp[i] <= temp[j]) {
				a[k++] = temp[i++];
			} else {
				a[k++] = temp[j++];
			}
		}
	}

	public static void sort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sort(a, low, mid);
		sort(a, mid + 1, high);
		if(a[mid] > a[mid + 1]) {
			merge(a, low, mid, high);
		}
 	}
}

