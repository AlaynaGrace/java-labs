/**
 * Created by alayn on 12/6/2016.
 */
public class BinarySearchTree {
    public static boolean isValid(int[] arr){
        double elements = arr.length - 1;
        double k = Math.log((elements + 1))/Math.log(2);
        if(k%1 == 0){
            int i = 1;
            boolean left = true;
            boolean right = true;
            while(i<arr.length/2 - 1 && left && right){
                if(arr[i] <= arr[2 * i] || arr[i] > arr[2 * i + 1]){
                    left = false;
                    right = false;
                }
                i++;
            }
            if(left && right){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static int[] buildTreeArray(int[] leaves){
        if(leaves.length == 1){
            return new int[] {0,leaves[0]};
        }
        else{
            int[] left = new int[leaves.length/2];
            int[] right = new int[leaves.length/2];
            int[] temp = new int[leaves.length +1];

            int l = 0;
            int r = 0;
            for(int i = 0; i<leaves.length; i++){
                if(i<leaves.length/2){
                    left[l++] = leaves[i];
                    //l++;
                }
                if(i>leaves.length/2){
                    right[r++] = leaves[i];
                    //r++;
                }
            }
            left = buildTreeArray(left);
            right = buildTreeArray(right);
            temp[1] = leaves[leaves.length/2];
            l = 1;
            r = 1;

            for(int i =1; 2*i + 1<temp.length; i++){
                temp[2*i] = left[l++];
                //l++;
                temp[2*i + 1] = right[r++];
                //r++;
            }
            return temp;
        }
    }
    private static TreeNode<Integer> helper(TreeNode<Integer> t, int[] arr){
        if(arr.length == 1){
            return null;
        }
        if(arr.length == 2){
            return new TreeNode<>(arr[1]);
        }
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length/2];
        int l = 0;
        int r = 0;
        for(int i = 0; 2*i+1 < arr.length; i++){
            left[l++] = arr[2*i];
            right[r++] = arr[2*i+1];
        }
        t.setLeftChild(helper(new TreeNode<Integer>(),left));
        t.setRightChild(helper(new TreeNode<Integer>(), right));




    }
    public static TreeNode<Integer> arrayToTree(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return null;
        }
        else
            if(arr.length == 2){
                return new TreeNode<>(arr[1]);
            }
            else{
                TreeNode<Integer> t = new TreeNode<Integer>(arr[1]);
                return helper(t,arr);
            }
    }
    public static int[] treeToArray(TreeNode<Integer> root){
        int[] arr = new int[9];
        for(int i = 0; i<arr.length; i++){

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 7, 4, 10, 3, 9, 8, 15};
        System.out.println(isValid(arr));
        int[] a = {3,4,6,7,8,10,15};
        int[] d = buildTreeArray(a);
        for(int i = 0; i<d.length; i++){
            System.out.println(d[i]);
        }
    }
}
