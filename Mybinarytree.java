import java.util.*;

public class Mybinarytree
{


  // creating class node

  static class Node
  {

    int data;

    Node left;

    Node right;

    //constructor

    Node(int data)
    {

      this.data=data;
      
      this.left=null;

      this.right=null;

    }
  }

  //creating class binarytree

  static class Binarytree{

    //function  to return root node

    static int idx=1;


    public Node buildTree(int nodes[])
    {
      idx++;


      if (nodes[idx]==-1)
      {

        return null;

      }

      Node newNode = new Node(nodes[idx]);

      newNode.left=buildTree(nodes);

      newNode.right=buildTree(nodes);

      return newNode;


    }


  }

  public static void preorder(Node root)
  {

    if (root==null)
    {

      return;
    }

    System.out.println(root.data + " ");

    preorder(root.left);

    preorder(root.right);

  }

  public static void inorder(Node root)
  {

    if(root==null)
    {

      return ;

    }


    inorder(root.left);

    System.out.println(root.data+ " ");

    inorder(root.right);

  }

  public static void postorder(Node root)
  {

    if(root==null)
    {

      return;

    }

    postorder(root.left);

    postorder(root.right);

    System.out.println(root.data + " ");
  }


  public static void levelorder(Node root)
  {

    if(root==null)
    {
      return ;

    }

    Queue<Node> q= new LinkedList<Node>();

    q.add(root);

    q.add(null);


    while(!q.isEmpty())
    {

      Node curr= q.remove();

      if(curr==null)
      {

        System.out.println();

        //queue is empty



        if(q.isEmpty())
        {

          break;

        }
        else{

          q.add(null);

        }
      } 
      else{
        System.out.println(curr.data+ " ");
        if(curr.left!=null)
        {
          q.add(curr.left);

        }

        if(curr.right!=null)
        {
          q.add(curr.right);
        }
      }

    }


  }

  //counting the  nodes


  public static int countofNodes(Node root)
  {

    if(root==null)
    {
      return;

    }

    int leftNodes=countofNodes(root.left);

    int rightNodes-countofNpdes(root.right);

    return leftNodes+rightNodes+1;

  }


  //sum of nodes

  public static  void sumofNodes(Nodes root)
  {

    if (root==null)
    {
      return;

    }

    int leftSum= sumofNodes(root.left);

    int rightSum=sumofNodes(root.right);

    return leftSum+ rightSum+ root.data;

  }


  //height of the tree

  public static int height(Node root)
  {
    if (root== null)
    {
      return 0;

    }

    int leftHeight= height(root.left);

    int rightHeight= height(root.right);


    int myHeight= Math.max(leftheight,rightHeight)+1;

    return myHeight;
  }

  //diameter of a tree

  public static int diameter(Node root)
  {

    if(root==null)
    {

      return 0;

    }

    int diam1= height(root.left)+height(root.right);

    int diam2= diameter(root.left);

    int diam3= diameter(root.right);

    return Math.max(diam1, Math.max(diam2,dima3));



  }
  


  public static void main(String[] args)
  {
      int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

      BinaryTree tree= new BinaryTree();


      Node root= tree.buildTree(nodes);


      preorder(root);

      levelorder(root);

      System.out.println(countofNodes(root));

      System.out.println(sumofNodes(root));

      System.out.println(height(root));

      System.out.println(dimeter(root));




      


  }
}