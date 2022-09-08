class Solution {
    public void sortColors(int[] A) {
        int n=A.length;
        int lastPos0 = -1, lastPos1 = -1, lastPos2 = -1;
        for (int i = 0; i < n; ++i) {
            if (A[i] == 0) 
            {
                A[++lastPos2] = 2;
                A[++lastPos1] = 1;
                A[++lastPos0] = 0;
            }
            else if (A[i] == 1) 
            {
                A[++lastPos2] = 2;
                A[++lastPos1] = 1;
            }
            else if (A[i] == 2) 
            {
                A[++lastPos2] = 2;
            }
        }
    }
}