class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        //My solution
        
        //int k=1;
        // int ho=h;
        // int arr[]=piles.clone();
        // while(arr[arr.length-1]>0){
        //     ho=h;
        //     int i=0;
        //     arr=piles.clone();
        //     while(i<arr.length && ho!=0){
        //         //System.out.println(arr[i]+" speed =  "+k+" left time = "+ho);
        //         arr[i]-=k;
        //         if(arr[i]<=0){
        //             i++;
        //         }
        //         ho--;
        //     }
        //     k++;
        // }
        // return k-1;
        
        //Slightly different approach but a similar solution
        
        //int k=1;
        // int hourSpent=0;
        // while(true){
        //     hourSpent=0;
        //     for(int i=0;i<piles.length;i++){
        //         hourSpent+=Math.ceil((double)piles[i]/k);
        //         if(hourSpent>h){
        //             break;
        //         }
        //     }
        //     if(hourSpent<=h){
        //         return k;
        //     }
        //     k++;
        // }
        
        //Binary Search Solution
        int min=1;
        int max=1;
        for(int pile : piles){
            max=Math.max(pile,max);
        }
        while(min<max){
            int mid=(min+max)/2;
            int hourSpent=0;
            for(int pile : piles){
                hourSpent+=Math.ceil((double)pile/mid);
            }
            if(hourSpent<=h){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return max;
    }
}