public class BTNode
{
    private BTNode left;
    private int data;
    private BTNode right;

    public BTNode(int data)
    {
        this.left = null;
        this.data = data;
        this.right = null;
    }

    public BTNode getLeft()
    {
        return left;
    }

    public void setLeft(BTNode left)
    {
        this.left = left;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public BTNode getRight()
    {
        return right;
    }

    public void setRight(BTNode right)
    {
        this.right = right;
    }

    @Override
    public String toString()
    {
        return Integer.toString(data);
    }
}
