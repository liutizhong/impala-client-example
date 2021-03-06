/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TStmtType implements org.apache.thrift.TEnum {
  QUERY(0),
  DDL(1),
  DML(2),
  EXPLAIN(3),
  LOAD(4),
  SET(5);

  private final int value;

  private TStmtType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TStmtType findByValue(int value) { 
    switch (value) {
      case 0:
        return QUERY;
      case 1:
        return DDL;
      case 2:
        return DML;
      case 3:
        return EXPLAIN;
      case 4:
        return LOAD;
      case 5:
        return SET;
      default:
        return null;
    }
  }
}
