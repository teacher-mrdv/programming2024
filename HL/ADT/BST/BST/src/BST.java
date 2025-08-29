public class BST
{
    private BTNode root;

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
}
