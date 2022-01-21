class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //Two Pass Solution
        
//         //determine if we have a solution
//         int total = 0;
//         for (int i = 0; i < gas.length; i++) {
//             total += gas[i] - cost[i];
//         }
//         if (total < 0) {
//             return -1;
//         }
        
//         // find out where to start
//         int gasInCar = 0;
//         int startingIndex = 0;
//         for (int i = 0; i < gas.length;i++) {
//             gasInCar += gas[i] - cost[i];
//             if (gasInCar < 0) {
//                 startingIndex = i + 1;
//                 gasInCar = 0;
//             }
//         }
//         return startingIndex;
        
        //One Pass Solution
        int startingIndex=0;
        int totalGas=0;
        int totalCost=0;
        int gasInCar=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            gasInCar+=(gas[i]-cost[i]);
            if(gasInCar<0){
                startingIndex=i+1;
                gasInCar=0;
            }
        }
        if(totalGas<totalCost){
            return -1;
        }
        return startingIndex;
    }
}