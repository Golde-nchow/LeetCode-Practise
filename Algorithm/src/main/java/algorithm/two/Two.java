package algorithm.two;

/**
 * @author: Kam-Chou
 * @date: 2020/7/3 20:43
 * @description: 第二题
 * @version: 1.0
 */
public class Two {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(7);
        l4.next = l5;
        l5.next = l6;

        ListNode listNode = addTwoNumbers(l1, l4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
}
