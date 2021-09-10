package com.test;

public class BlockchainTest {

    public static void main(String[] args) {
        Block block = new Block(1);
        block.next = new Block(2);
        block.next.next = new Block(3);
        block.next.next.next = new Block(4);

        printBlock(block);
    }

    public static void printBlock(Block block) {
        while (block != null) {
            System.out.println(block.val);
            block = block.next;
        }
    }
}
