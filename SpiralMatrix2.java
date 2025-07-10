class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1;
        int top = 0, buttom = n - 1;

        int val = 1;
        int[][] matrix = new int[n][n];

        while(left <= right && top <= buttom){
            //left to right 
            for ( int i = left ; i <= right ; i++){
                matrix[top][i] = val++;
            }
            top++;
            //top to buttom        
            for ( int i = top ; i <= buttom ; i++){
                matrix[i][right] = val++;
            }
            right--;

            //right to left 
            if(top <= buttom){
               for ( int i = right ; i >= left ; i--){
                    matrix[buttom][i] = val++; 
                } 
                buttom--;
            }
            
            //buttom to top 
            if(left <= right){       
                for ( int i = buttom ; i >= top ; i--){
                    matrix[i][left] = val++;
                }
                left++;
            }
        }
        return matrix;
    }
}