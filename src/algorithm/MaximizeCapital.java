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
//Question: with an initial capital, c, we need an automated investment program. we can select k distinct projects from a list of n projects with corresponding capitals requirements
//and expected profits. The goal is to maximize our cumulative capital by selecting a maximum of k distinct projects to invest in, subject to the constraint that 
//our current capital must be greater than or equal to the capital requirement of all selected projects.

public class MaximizeCapital {

    public static int maxCapital(int[] capitals, int[] profits, int k, int c) {

        int currentCapital = c;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < capitals.length; i++) {
            minHeap.offer(new int[]{capitals[i], i});
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= currentCapital) {
                int[] j = minHeap.poll();
                maxHeap.offer(new int[]{profits[j[1]]});
            }
                if (maxHeap.isEmpty()) {
                    break;
                }

            int x = maxHeap.poll()[0];
            currentCapital += x;
        }
        return currentCapital;
    }
}
