public class segTree{

    public static void main(String[] args) {
        int[] testArray = { 1, -1, 2, 2, 3, 1, 2, 0, 1, 1 };
        SegTree mySegmentTree = new SegTree(0, testArray.length - 1, testArray);
        System.out.println(mySegmentTree.rangeMin(0, 3));
    }

    static class SegTree{
        SegTree lChild, rChild;
        int leftmost, rightmost;
        int sum, min;

        public SegTree(int leftmost, int rightmost, int[] arr){
            this.leftmost = leftmost;
            this.rightmost = rightmost;
            if(leftmost == rightmost){
                sum = arr[leftmost];
                min = arr[leftmost];
            } else {
                int mid = (leftmost+rightmost) / 2;
                lChild = new SegTree(leftmost, mid, arr);
                rChild = new SegTree(mid+1, rightmost, arr);
                sum = lChild.sum + rChild.sum;
                min = Math.min(lChild.min, rChild.min);
            }
        }

        public int rangeMin(int l, int r){
            if(l > rightmost ||  r < leftmost){
                return 0;
            }
            if (l <= leftmost && r >= rightmost) {
                return min;
            }
            return Math.min(lChild.rangeMin(l, r), rChild.rangeMin(l, r));
        }
    }

}