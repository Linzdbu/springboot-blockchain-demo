package com.niudong.demo.blockchain;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * 区块
 * 
 * @author niudong.
 */
public class Block {
  /**
   * 区块头
   */
  private BlockHeader blockHeader;
  /**
   * 区块body
   */
  private BlockBody blockBody;
  /**
   * 该区块的hash
   */
  private String blockHash;

  /**
   * 根据该区块所有属性计算sha256
   * 
   * @return sha256hex
   */
  public String getBlockHash() {
    return DigestUtil.sha256Hex(blockHeader.toString() + blockBody.toString());
  }

  public BlockHeader getBlockHeader() {
    return blockHeader;
  }

  public void setBlockHeader(BlockHeader blockHeader) {
    this.blockHeader = blockHeader;
  }

  public BlockBody getBlockBody() {
    return blockBody;
  }

  public void setBlockBody(BlockBody blockBody) {
    this.blockBody = blockBody;
  }

  public void setBlockHash(String blockHash) {
    this. blockHash = blockHash;
  }

}
