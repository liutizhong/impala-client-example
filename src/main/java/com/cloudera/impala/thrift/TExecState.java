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

public enum TExecState implements org.apache.thrift.TEnum {
  REGISTERED(0),
  PLANNING(1),
  QUEUED(2),
  RUNNING(3),
  FINISHED(4),
  CANCELLED(5),
  FAILED(6);

  private final int value;

  private TExecState(int value) {
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
  public static TExecState findByValue(int value) { 
    switch (value) {
      case 0:
        return REGISTERED;
      case 1:
        return PLANNING;
      case 2:
        return QUEUED;
      case 3:
        return RUNNING;
      case 4:
        return FINISHED;
      case 5:
        return CANCELLED;
      case 6:
        return FAILED;
      default:
        return null;
    }
  }
}
