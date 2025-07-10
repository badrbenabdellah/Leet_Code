import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, buttom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int dir = 0;

        List<Integer> ans = new ArrayList<>();

        while(left <= right && top <= buttom) {
            switch(dir){
                case 0: //move right
                    for(int i = left; i <= right ; i++){
                        ans.add(matrix[top][i]);
                    }
                    top++;
                    break;
                case 1: //move down
                    for(int i = top; i <= buttom ; i++){
                        ans.add(matrix[i][right]);
                    }
                    right--;
                    break;
                case 2: //move left
                    for(int i = right; i >= left ; i--){
                        ans.add(matrix[buttom][i]);
                    }
                    buttom--;
                    break;
                case 3: //move up
                    for(int i = buttom; i >= top ; i--){
                        ans.add(matrix[i][left]);
                    }
                    left++;
                    break;
            }
            dir = (dir + 1) % 4;
        }
        return ans;
    }
}
