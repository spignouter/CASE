class MinMax {
	public static void main (String [] args){
		int nums [] = new int[10];
		int min, max;
		
		nums [0] = 33;
		nums [1] = 41;
		nums [2] = 1;
		nums [3] = 32;
		nums [4] = 51515;
		nums [5] = 31;
		nums [6] = 333;
		nums [7] = 353;
		nums [8] = 3144;
		nums [9] = 412;
		min = max = nums[0];
		for (int i = 0; i < 10; i++){
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("мин значения " + min + " макс значения "+ max);
	}
}