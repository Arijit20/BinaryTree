package com.cg;

import org.junit.Test;

import com.cg.BinaryTree;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class BinaryTreeTest {
  @Test
  public void numbersAddedToTreeReturnSize() {
	  BinaryTree<Integer> binaryTree = new BinaryTree<>();
	  binaryTree.add(56);
	  binaryTree.add(30);
	  binaryTree.add(70);
	  Assert.assertEquals(3, binaryTree.getSize());
  }
}
