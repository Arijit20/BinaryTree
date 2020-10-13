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
	
	@Test
	public void allNumbersAddedToTreeReturnSize() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		Assert.assertEquals(13, binaryTree.getSize());
	}
	@Test
	public void searchBinaryTree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		Assert.assertTrue(binaryTree.search(63));
	}
}
