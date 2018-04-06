package model;

public class Binary {
	
	public Binary() {
	}
	
	public boolean search(int[] array, int num) {
		return binarySearch(array, num, array.length/2, 4);
	}
	
	private boolean binarySearch(int[] array, int num, int index, int div) {
		if (array.length/div < 1) {
			return false;
		} else if (array[index] == num) {
			return true;
		} else if (array[index] < num) {
			return binarySearch(array, num, index+=array.length/div , div+=2);
		}else if (num < array[index]) {
			return binarySearch(array, num, index-=array.length/div , div+=2);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Binary binary = new Binary();
		int[] array = {0,4,8,10,25,30,45,70,101};
		System.out.println(binary.search(array, 45));
	}
}