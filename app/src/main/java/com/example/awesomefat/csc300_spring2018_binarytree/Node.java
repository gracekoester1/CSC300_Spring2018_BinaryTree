package com.example.awesomefat.csc300_spring2018_binarytree;

/**
 * Created by awesomefat on 3/6/18.
 */

public class Node
{
    private int payload;
    private Node leftChild;
    private Node rightChild;

    public Node(int payload)
    {
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getPayload() {
        return payload;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node setLeftChild() { return leftChild;}

    public Node setRightChild() { return rightChild; }

    public void move(int newPay)
    {

        if(newPay <= this.payload)
        {

            System.out.println("left");
            if(this.leftChild == null)
            {
                this.setLeftChild(new Node(newPay));
                System.out.println("set");

            }
            else
            {


                this.leftChild.move(newPay);
            }
        }
        else
        {

            System.out.println("right");
            if(this.rightChild == null)
            {
                this.setRightChild(new Node(newPay));
                System.out.println("set");

            }
            else
            {

                this.rightChild.move(newPay);
            }
        }
    }


}
