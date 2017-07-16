/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-07-16")
public class TScalarType implements org.apache.thrift.TBase<TScalarType, TScalarType._Fields>, java.io.Serializable, Cloneable, Comparable<TScalarType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScalarType");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("len", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRECISION_FIELD_DESC = new org.apache.thrift.protocol.TField("precision", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScalarTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScalarTypeTupleSchemeFactory());
  }

  /**
   * 
   * @see TPrimitiveType
   */
  public TPrimitiveType type; // required
  public int len; // optional
  public int precision; // optional
  public int scale; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPrimitiveType
     */
    TYPE((short)1, "type"),
    LEN((short)2, "len"),
    PRECISION((short)3, "precision"),
    SCALE((short)4, "scale");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // LEN
          return LEN;
        case 3: // PRECISION
          return PRECISION;
        case 4: // SCALE
          return SCALE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LEN_ISSET_ID = 0;
  private static final int __PRECISION_ISSET_ID = 1;
  private static final int __SCALE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LEN,_Fields.PRECISION,_Fields.SCALE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPrimitiveType.class)));
    tmpMap.put(_Fields.LEN, new org.apache.thrift.meta_data.FieldMetaData("len", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRECISION, new org.apache.thrift.meta_data.FieldMetaData("precision", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScalarType.class, metaDataMap);
  }

  public TScalarType() {
  }

  public TScalarType(
    TPrimitiveType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScalarType(TScalarType other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.len = other.len;
    this.precision = other.precision;
    this.scale = other.scale;
  }

  public TScalarType deepCopy() {
    return new TScalarType(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setLenIsSet(false);
    this.len = 0;
    setPrecisionIsSet(false);
    this.precision = 0;
    setScaleIsSet(false);
    this.scale = 0;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  public TPrimitiveType getType() {
    return this.type;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  public TScalarType setType(TPrimitiveType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getLen() {
    return this.len;
  }

  public TScalarType setLen(int len) {
    this.len = len;
    setLenIsSet(true);
    return this;
  }

  public void unsetLen() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  /** Returns true if field len is set (has been assigned a value) and false otherwise */
  public boolean isSetLen() {
    return EncodingUtils.testBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  public void setLenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEN_ISSET_ID, value);
  }

  public int getPrecision() {
    return this.precision;
  }

  public TScalarType setPrecision(int precision) {
    this.precision = precision;
    setPrecisionIsSet(true);
    return this;
  }

  public void unsetPrecision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  /** Returns true if field precision is set (has been assigned a value) and false otherwise */
  public boolean isSetPrecision() {
    return EncodingUtils.testBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  public void setPrecisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRECISION_ISSET_ID, value);
  }

  public int getScale() {
    return this.scale;
  }

  public TScalarType setScale(int scale) {
    this.scale = scale;
    setScaleIsSet(true);
    return this;
  }

  public void unsetScale() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TPrimitiveType)value);
      }
      break;

    case LEN:
      if (value == null) {
        unsetLen();
      } else {
        setLen((Integer)value);
      }
      break;

    case PRECISION:
      if (value == null) {
        unsetPrecision();
      } else {
        setPrecision((Integer)value);
      }
      break;

    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LEN:
      return getLen();

    case PRECISION:
      return getPrecision();

    case SCALE:
      return getScale();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LEN:
      return isSetLen();
    case PRECISION:
      return isSetPrecision();
    case SCALE:
      return isSetScale();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScalarType)
      return this.equals((TScalarType)that);
    return false;
  }

  public boolean equals(TScalarType that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_len = true && this.isSetLen();
    boolean that_present_len = true && that.isSetLen();
    if (this_present_len || that_present_len) {
      if (!(this_present_len && that_present_len))
        return false;
      if (this.len != that.len)
        return false;
    }

    boolean this_present_precision = true && this.isSetPrecision();
    boolean that_present_precision = true && that.isSetPrecision();
    if (this_present_precision || that_present_precision) {
      if (!(this_present_precision && that_present_precision))
        return false;
      if (this.precision != that.precision)
        return false;
    }

    boolean this_present_scale = true && this.isSetScale();
    boolean that_present_scale = true && that.isSetScale();
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_len = true && (isSetLen());
    list.add(present_len);
    if (present_len)
      list.add(len);

    boolean present_precision = true && (isSetPrecision());
    list.add(present_precision);
    if (present_precision)
      list.add(precision);

    boolean present_scale = true && (isSetScale());
    list.add(present_scale);
    if (present_scale)
      list.add(scale);

    return list.hashCode();
  }

  @Override
  public int compareTo(TScalarType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLen()).compareTo(other.isSetLen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.len, other.len);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrecision()).compareTo(other.isSetPrecision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrecision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.precision, other.precision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScale()).compareTo(other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TScalarType(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetLen()) {
      if (!first) sb.append(", ");
      sb.append("len:");
      sb.append(this.len);
      first = false;
    }
    if (isSetPrecision()) {
      if (!first) sb.append(", ");
      sb.append("precision:");
      sb.append(this.precision);
      first = false;
    }
    if (isSetScale()) {
      if (!first) sb.append(", ");
      sb.append("scale:");
      sb.append(this.scale);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TScalarTypeStandardSchemeFactory implements SchemeFactory {
    public TScalarTypeStandardScheme getScheme() {
      return new TScalarTypeStandardScheme();
    }
  }

  private static class TScalarTypeStandardScheme extends StandardScheme<TScalarType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScalarType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.cloudera.impala.thrift.TPrimitiveType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.len = iprot.readI32();
              struct.setLenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRECISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.precision = iprot.readI32();
              struct.setPrecisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.scale = iprot.readI32();
              struct.setScaleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScalarType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetLen()) {
        oprot.writeFieldBegin(LEN_FIELD_DESC);
        oprot.writeI32(struct.len);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPrecision()) {
        oprot.writeFieldBegin(PRECISION_FIELD_DESC);
        oprot.writeI32(struct.precision);
        oprot.writeFieldEnd();
      }
      if (struct.isSetScale()) {
        oprot.writeFieldBegin(SCALE_FIELD_DESC);
        oprot.writeI32(struct.scale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScalarTypeTupleSchemeFactory implements SchemeFactory {
    public TScalarTypeTupleScheme getScheme() {
      return new TScalarTypeTupleScheme();
    }
  }

  private static class TScalarTypeTupleScheme extends TupleScheme<TScalarType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScalarType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetLen()) {
        optionals.set(0);
      }
      if (struct.isSetPrecision()) {
        optionals.set(1);
      }
      if (struct.isSetScale()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLen()) {
        oprot.writeI32(struct.len);
      }
      if (struct.isSetPrecision()) {
        oprot.writeI32(struct.precision);
      }
      if (struct.isSetScale()) {
        oprot.writeI32(struct.scale);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScalarType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = com.cloudera.impala.thrift.TPrimitiveType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.len = iprot.readI32();
        struct.setLenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.precision = iprot.readI32();
        struct.setPrecisionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.scale = iprot.readI32();
        struct.setScaleIsSet(true);
      }
    }
  }

}

