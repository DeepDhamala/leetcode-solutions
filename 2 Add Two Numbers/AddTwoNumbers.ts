function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    const dummyHead: ListNode = new ListNode(0);
    let tail: ListNode | null = dummyHead;
    let carry: number = 0;

    while (l1 !== null || l2 !== null || carry !== 0) {
        const digit1: number = l1 ? l1.val : 0;
        const digit2: number = l2 ? l2.val : 0;

        const sum: number = digit1 + digit2 + carry;
        const digit: number = sum % 10;
        carry = Math.floor(sum / 10);

        const newNode: ListNode = new ListNode(digit);
        tail.next = newNode;
        tail = newNode;

        l1 = l1 ? l1.next : null;
        l2 = l2 ? l2.next : null;
    }

    const result: ListNode | null = dummyHead.next;
    dummyHead.next = null;

    return result;
}
