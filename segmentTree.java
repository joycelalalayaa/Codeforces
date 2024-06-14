public class segmentTree {

    public static void main(String[] args) {
        int[] testArray = { 1, 0, 2, 2, 3, 1, 2, 0, 1, 1 };
        SegTree mySegmentTree = new SegTree(0, testArray.length - 1, testArray);
        // mySegmentTree.update(0, 10);
        System.out.println(mySegmentTree.rangeMean(0, 1));
    }

    static class SegTree {
        SegTree lChild, rChild;
        int leftmost, rightmost; // indecies, not values
        int sum;
        int max;

        public SegTree(int leftmost, int rightmost, int[] a) {
            this.leftmost = leftmost;
            this.rightmost = rightmost;
            if (leftmost == rightmost) {
                // then no kids
                sum = a[leftmost];
                max = a[leftmost];
            } else {
                // have exactly 2 kids
                int mid = (leftmost + rightmost) / 2;
                // if odd, lChild has one more
                lChild = new SegTree(leftmost, mid, a);
                rChild = new SegTree(mid + 1, rightmost, a);
                sum = lChild.sum + rChild.sum;
                max = Math.max(lChild.max, rChild.max);
            }
        }

        // the same as a[index] = changeTo
        void update(int index, int changeTo) {
            if (index < leftmost || index > rightmost) {
                return;
            }
            // this is affecting us!
            if (leftmost == rightmost) {
                sum = changeTo;
                max = changeTo;
            } else {
                // we are a parent
                if (index <= lChild.rightmost) {
                    lChild.update(index, changeTo);
                } else {
                    rChild.update(index, changeTo);
                }
                sum = lChild.sum + rChild.sum;
                max = Math.max(lChild.max, rChild.max);
            }
        }

        int rangeSum(int l, int r) {
            // if the range is entirely separate from the range this node cares about
            // then return 0;
            if (l > rightmost || r < leftmost) {
                return 0;
            }
            if (l <= leftmost && r >= rightmost) {
                return sum;
            }
            return lChild.rangeSum(l, r) + rChild.rangeSum(l, r);

        }

        int rangeMax(int l, int r) {
            if (l > rightmost || r < leftmost) {
                return 0;
            }
            if (l <= leftmost && r >= rightmost) {
                return max;
            }
            return Math.max(lChild.rangeMax(l, r), rChild.rangeMax(l, r));
        }

        double rangeMean(int l, int r) {
            return (double) (rangeSum(l, r)) / (r + 1 - l);
        }
    }
}
