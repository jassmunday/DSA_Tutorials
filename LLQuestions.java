public class LLQuestions {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow =squareSum(slow);
            fast=squareSum(squareSum(fast));
        }while(fast!=slow);

        if(slow==1){
            return true;
        }
        return false;
    }
    public int squareSum(int num){
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans += rem*rem;
            num/=10;
        }
        return ans;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;
        while (head!=null&headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }
            head = head.next;
            headSecond=headSecond.next;
        }
        reverseList(reReverseHead);
        return head == null || headSecond == null;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode prsnt = head;
        ListNode next = prsnt.next;
        while(prsnt!=null){
            prsnt.next=prev;
            prev=prsnt;
            prsnt=next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f!=null&&f.next!=null){
            s =s.next;
            f= f.next.next;
        }
        return s;
    }
    public void reorderList(ListNode head) {
        if(head==null&&head.next==null){
            return;
        }
        ListNode hf = head;
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);

        while(hs!=null && hf !=null){
            ListNode temp = hf.next;
            hf.next=hs;
            hf=temp;

            temp = hs.next;
            hs.next=hf;
            hs = temp;

            //point next of tail to null,in the end last of hf will be at tail
            if(hf!=null){
                hf.next=null;
            }
        }
    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



    public static void main(String[] args) {

    }
}
