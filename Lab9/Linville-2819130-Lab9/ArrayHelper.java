public class ArrayHelper {
	ArrayHelper(){
	}
	public void print2DArray(int[][] array){
		System.out.println("Here is your array: ");
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (j == array[i].length - 1){
					System.out.print(array[i][j]);
				} else {
					System.out.print(array[i][j] + ",  ");
				}
			}
			System.out.println();
		}
		
	}
	public int arraySum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return(sum);
	}
	public double arrayAvg(int[] array){
		int sum = arraySum(array);
		double average = sum / (double)(array.length);
		return(average);
	}
	public int arraySum2D(int[][] array){
		int sum2D = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				sum2D +=array[i][j];
			}
		}
		return(sum2D);
	}
	public double arrayAvg2D(int[][] array){
		int sum2D = arraySum2D(array);
		double average2D = sum2D / (double)(array.length * array[0].length);
		return(average2D);
	}
	public int arrayMax2D(int[][] array){
		int max2D = array[0][0];
		for (int i = 0; i < array.length; i ++){
			for (int j = 0; j < array[i].length; j++){
				if (array[i][j] > max2D){
					max2D = array[i][j];
				}
			}
		}
		return(max2D);
	}
}