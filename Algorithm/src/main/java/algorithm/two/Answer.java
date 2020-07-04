package algorithm.two;

/**
 * @author: Kam-Chou
 * @date: 2020/7/3 20:45
 * @description: 第二题的答案
 * @version: 1.0
 */
public class Answer {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            // 获取进位和当前位
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);

            // 下一个节点值
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (carry == 1) {
                cur.next = new ListNode(carry);
            }
        }
        return pre.next;
    }

}
