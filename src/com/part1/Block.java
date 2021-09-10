package com.part1;

import java.util.Date;

public class Block {
    public String hash;
    public String prevHash;
    public String data;
    public long timestamp;
    public int nonce;

    public Block(String prevHash, String data) {
        this.prevHash = prevHash;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String hash = BlockUtil.applySha256(prevHash + data + nonce + timestamp);
        return hash;
    }

    public void mineBlock(int difficulty) {
        // target = 00
        String target = BlockUtil.getDifficultyString(difficulty);
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
            System.out.println(target + " " + hash);
        }
    }
}
