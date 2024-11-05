class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int size = flowerbed.length;
        int count = 0;
        while(i<size){
            
                if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == size - 1 || flowerbed[i + 1] == 0)){
                    flowerbed[i] = 1;
                    count++;
                    i = i+2;
                }else{
                    i++;
                }
                if (count >= n) {
                return true;
            }
            }
        return count == n;
    }
}