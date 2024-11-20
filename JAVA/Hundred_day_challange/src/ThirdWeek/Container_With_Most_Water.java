package ThirdWeek;
//Leetcode problem 11
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int startPointer =0;
        int endPointer = height.length-1;
        int length=0;
        int width=0;
        int area=0;

        while(startPointer<endPointer){
           length=Math.min(height[startPointer],height[endPointer]);
           width=endPointer-startPointer;
           area=Math.max(area, length*width);
            if(height[startPointer]>height[endPointer]){
                endPointer--;
            }
            else{
                startPointer++;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Container_With_Most_Water a=new Container_With_Most_Water();
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println( a.maxArea(height));
    }
}
