import java.util.*;
public class TrappedRainWaterClass {
    public static int trappedRainWater(int height[]){
        int n= height.length;
        int leftMax[] = new int[n];
        //calculate the left maximum boundary array
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate the right maximum boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        //WaterLevel = Min(leftMax bound - rightMax bound) - height

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            //waterLevel = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = water level - height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water is " + trappedRainWater(height));
    }
}