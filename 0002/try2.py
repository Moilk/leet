# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry=0;
        head=tail=ListNode(0)
        while l1 or l2 or carry:
        	a1=a2=0
        	if l1:
        		a1=l1.val
        		l1=l1.next
        	if l2:
        		a2=l2.val
        		l2=l2.next
        	carry, val=divmod(a1+a2+carry,10)
        	tail.next=ListNode(val)
        	tail=tail.next
        return head.next