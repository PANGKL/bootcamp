public class Test {


  public int[][] construct2DArray(int[] original, int m, int n) {

    if( m * n < original.length) 
    return new int[0][0];
    else if ( m * n > original.length){
    return new int[0][0];
    }
    
    int idx = 0;
    int[][] matrix = new int[m][n];
    
    for(int i = 0 ; i < m ; i++){
      for(int j = 0 ; j < n; j++){
        matrix[i][j] = original[idx++];
      }
    }
    
    
    return matrix;
  }

  public static void main(String[] args) {


  }

}
