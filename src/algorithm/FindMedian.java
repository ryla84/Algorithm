/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;

import java.util.*;

/**
 *
 *
 */
//Create a data structure that can store a list of integers that can change in size over time
//and find the median from this dynamically growing list 

public class FindMedian {

    class MedianOfStream {

        PriorityQueue<Integer> maxHeap;
        PriorityQueue<Integer> minHeap;

        public MedianOfStream() {
            maxHeap = new PriorityQueue<>((a, b) -> b - a);
            minHeap = new PriorityQueue<>((a, b) -> a - b);
        }
        
        public void insertNum (int num){
            if(maxHeap.isEmpty() || (maxHeap.peek() >= num))
                maxHeap.offer(num);

            else
                minHeap.offer(num);
            
            
            if(maxHeap.size() > minHeap.size()+ 1)
                minHeap.offer(maxHeap.poll());
            
            else if(maxHeap.size() < minHeap.size())
                maxHeap.offer(minHeap.poll());
            
        }
        
        public double findMedian(){
            if (maxHeap.size() == minHeap.size()){
                return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
            }
        
         return maxHeap.peek();
    }

}
