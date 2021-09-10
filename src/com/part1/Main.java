package com.part1;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 2; // 앞 두자리가 00

    public static void main(String[] args) {
        addBlock(new Block("first", "0"));
        addBlock(new Block("second", blockchain.get(blockchain.size() -1 ).hash));
        System.out.println(BlockUtil.getJson(blockchain));

    }

    public static void addBlock(Block block) {
        block.mineBlock(difficulty);
        blockchain.add(block);
    }
}
