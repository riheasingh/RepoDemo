class MedianFinder {
    PriorityQueue<Integer> leftMax;
    PriorityQueue<Integer> rightMax;

    public MedianFinder() {
        leftMax=new PriorityQueue<>(Collections.reverseOrder());
        rightMax=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(leftMax.isEmpty()||num<leftMax.peek())leftMax.add(num);
        else rightMax.add(num);
        if(Math.abs(leftMax.size()-rightMax.size())>1)rightMax.add(leftMax.poll());
        else if(leftMax.size()<rightMax.size())leftMax.add(rightMax.poll());
    }
    
    public double findMedian() {
        if(leftMax.size()==rightMax.size()) return (leftMax.peek()+rightMax.peek())/2.0;
        else  return leftMax.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */