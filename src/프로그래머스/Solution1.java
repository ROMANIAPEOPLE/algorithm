package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Truck{
	int truckWeight;
	int distance;
	
	Truck(int truckWeight, int distance){
		this.truckWeight=truckWeight;
		this.distance=distance;
	}
}


public class Solution1 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		ArrayList<Truck> inList = new ArrayList<>();
		Queue<Truck> outList  = new LinkedList<>();
		
		for(int i=0; i<truck_weights.length; i++) {
			outList.add(new Truck(truck_weights[i],bridge_length));
		}
		
		int time =0;
		int weightLeft = weight;
		
		while(!(outList.isEmpty() && inList.isEmpty())) {
			time++;
			
			if(!inList.isEmpty() && inList.get(0).distance ==0) {
				weightLeft+=inList.get(0).truckWeight;
				inList.remove(0);
			}
			
			if(!outList.isEmpty() && outList.peek().truckWeight <=weightLeft) {
				weightLeft-=outList.peek().truckWeight;
				inList.add(outList.poll());
			}
			
			
			for(int i=0; i<inList.size(); i++) {
				inList.get(i).distance--;
			}
			
		}
		return time;
		
		
	}
}