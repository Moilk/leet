# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry=0;
        l3=ListNode(0)
        p=l3
        while l1 and l2:
        	tmp=ListNode(l1.val+l2.val+carry)
        	if tmp.val >= 10:
        		carry=1
        		tmp.val=tmp.val%10
        	else:
        		carry=0
        	p.next=tmp
        	p=p.next
        	l1=l1.next
        	l2=l2.next
        while l1:
        	tmp=ListNode(l1.val+carry)
        	if tmp.val>=10:
        		carry=1
        		tmp.val=tmp.val%10
        	else:
        		carry=0
        	p.next=tmp
        	p=p.next
        	l1=l1.next
        while l2:
        	tmp=ListNode(l2.val+carry)
        	if tmp.val>=10:
        		carry=1
        		tmp.val=tmp.val%10
        	else:
        		carry=0
        	p.next=tmp
        	p=p.next
        	l2=l2.next
        if carry==1:
        	p.next=ListNode(1);
        return l3.next