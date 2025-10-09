class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


# Helper function to create a linked list from a list of values
def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    curr = head
    for val in values[1:]:
        curr.next = ListNode(val)
        curr = curr.next
    return head

# Create a test case for a potential palindrome list
head = create_linked_list([1, 2, 3, 2, 1])

def palin(A):
    s = A
    f = A

    while f.next != None:
        s = s.next
        f = f.next.next
        
    r = s
    c = s
    
    

palin(head)
