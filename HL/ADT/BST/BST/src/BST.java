public class BST
{
    private BTNode root;
    public int c = 0;

    public BST(int rootData)
    {   //BTNode newNode = new BTNode(rootData);
        //root = newNode;
        root = new BTNode(rootData);
        System.out.println("--> Inserted " +
                root.getData() + " as the root");
    }

    // overloading the constructor
    public BST(BTNode root)
    {   this.root = root;
        System.out.println("--> Inserted " +
                root.getData() + " as the root");
    }

    public boolean isEmpty()
    {   return root == null;
    }

    public void addNode(int data)
    {   BTNode newBNode = new BTNode(data);
        if ( !isEmpty() )
        {   addNode(root, newBNode);
        } else
        {   root = newBNode;
            System.out.println("--> Inserted " +
                    newBNode.getData() + " as the root");
        }
    }

    public void addNode(BTNode node, BTNode newNode)
    {
        if (newNode.getData() < node.getData())
        {   if (node.getLeft() != null)
            {   addNode(node.getLeft(), newNode);
            } else
            {   System.out.println("--> Inserted " + newNode.getData() +
                        " to the left of " + node.getData());
                node.setLeft(newNode);
            }
        } else if (newNode.getData() > node.getData()) {
            if (node.getRight() != null) {
                addNode(node.getRight(), newNode);
            } else {
                System.out.println("--> Inserted " + newNode.getData() +
                        " to the right of " + node.getData());
                node.setRight(newNode);
            }
        }
    }

    public boolean search(int search)
    {   if(isEmpty())
        {   return false;
        }
        return search(root, search);
    }

    private boolean search(BTNode node, int search)
    {
        c++;
        if (node.getData() == search)
        {   return true;
        }
        if (search > node.getData())
        {   if (node.getRight() != null)
            {   return search(node.getRight(), search);
            }
        } else if (search < node.getData())
        {   if (node.getLeft() != null)
            {   return search(node.getLeft(), search);
            }
        }
        return false;
    }

    public void preOrder()
    {   if (!isEmpty())
            preOrder(root);
        else
        {   System.out.println("empty tree. can't go on.");
        }
    }

    public void preOrder(BTNode node)
    {
        System.out.print(node + " ");
        if (node.getLeft() != null)
            preOrder(node.getLeft());
        if (node.getRight() != null)
            preOrder(node.getRight());
    }

    public void inOrder()
    {   if (!isEmpty())
            inOrder(root);
        else
        {   System.out.println("empty tree. can't go on.");
        }
    }

    public void inOrder(BTNode node)
    {
        if (node.getLeft() != null)
        {   inOrder(node.getLeft());
        }
        System.out.print(node + " ");
        if (node.getRight() != null)
        {   inOrder(node.getRight());
        }
    }

    public void postOrder()
    {   if (!isEmpty())
            postOrder(root);
        else
        {   System.out.println("empty tree. can't go on.");
        }
    }

    public void postOrder(BTNode node)
    {
        if (node.getLeft() != null)
            preOrder(node.getLeft());
        if (node.getRight() != null)
            preOrder(node.getRight());
        System.out.print(node + " ");
    }

    // how to count all the nodes in a tree?
    // how to count all the leaves in a tree?
}
