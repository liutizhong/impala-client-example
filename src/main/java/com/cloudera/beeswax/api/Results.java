/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.beeswax.api;

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
public class Results implements org.apache.thrift.TBase<Results, Results._Fields>, java.io.Serializable, Cloneable, Comparable<Results> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Results");

  private static final org.apache.thrift.protocol.TField READY_FIELD_DESC = new org.apache.thrift.protocol.TField("ready", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField START_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("start_row", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField HAS_MORE_FIELD_DESC = new org.apache.thrift.protocol.TField("has_more", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultsTupleSchemeFactory());
  }

  public boolean ready; // required
  public List<String> columns; // required
  public List<String> data; // required
  public long start_row; // required
  public boolean has_more; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    READY((short)1, "ready"),
    COLUMNS((short)2, "columns"),
    DATA((short)3, "data"),
    START_ROW((short)4, "start_row"),
    HAS_MORE((short)5, "has_more");

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
        case 1: // READY
          return READY;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // DATA
          return DATA;
        case 4: // START_ROW
          return START_ROW;
        case 5: // HAS_MORE
          return HAS_MORE;
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
  private static final int __READY_ISSET_ID = 0;
  private static final int __START_ROW_ISSET_ID = 1;
  private static final int __HAS_MORE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.READY, new org.apache.thrift.meta_data.FieldMetaData("ready", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.START_ROW, new org.apache.thrift.meta_data.FieldMetaData("start_row", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HAS_MORE, new org.apache.thrift.meta_data.FieldMetaData("has_more", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Results.class, metaDataMap);
  }

  public Results() {
  }

  public Results(
    boolean ready,
    List<String> columns,
    List<String> data,
    long start_row,
    boolean has_more)
  {
    this();
    this.ready = ready;
    setReadyIsSet(true);
    this.columns = columns;
    this.data = data;
    this.start_row = start_row;
    setStart_rowIsSet(true);
    this.has_more = has_more;
    setHas_moreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Results(Results other) {
    __isset_bitfield = other.__isset_bitfield;
    this.ready = other.ready;
    if (other.isSetColumns()) {
      List<String> __this__columns = new ArrayList<String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetData()) {
      List<String> __this__data = new ArrayList<String>(other.data);
      this.data = __this__data;
    }
    this.start_row = other.start_row;
    this.has_more = other.has_more;
  }

  public Results deepCopy() {
    return new Results(this);
  }

  @Override
  public void clear() {
    setReadyIsSet(false);
    this.ready = false;
    this.columns = null;
    this.data = null;
    setStart_rowIsSet(false);
    this.start_row = 0;
    setHas_moreIsSet(false);
    this.has_more = false;
  }

  public boolean isReady() {
    return this.ready;
  }

  public Results setReady(boolean ready) {
    this.ready = ready;
    setReadyIsSet(true);
    return this;
  }

  public void unsetReady() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __READY_ISSET_ID);
  }

  /** Returns true if field ready is set (has been assigned a value) and false otherwise */
  public boolean isSetReady() {
    return EncodingUtils.testBit(__isset_bitfield, __READY_ISSET_ID);
  }

  public void setReadyIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __READY_ISSET_ID, value);
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(String elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(elem);
  }

  public List<String> getColumns() {
    return this.columns;
  }

  public Results setColumns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<String> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(String elem) {
    if (this.data == null) {
      this.data = new ArrayList<String>();
    }
    this.data.add(elem);
  }

  public List<String> getData() {
    return this.data;
  }

  public Results setData(List<String> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public long getStart_row() {
    return this.start_row;
  }

  public Results setStart_row(long start_row) {
    this.start_row = start_row;
    setStart_rowIsSet(true);
    return this;
  }

  public void unsetStart_row() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __START_ROW_ISSET_ID);
  }

  /** Returns true if field start_row is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_row() {
    return EncodingUtils.testBit(__isset_bitfield, __START_ROW_ISSET_ID);
  }

  public void setStart_rowIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __START_ROW_ISSET_ID, value);
  }

  public boolean isHas_more() {
    return this.has_more;
  }

  public Results setHas_more(boolean has_more) {
    this.has_more = has_more;
    setHas_moreIsSet(true);
    return this;
  }

  public void unsetHas_more() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HAS_MORE_ISSET_ID);
  }

  /** Returns true if field has_more is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_more() {
    return EncodingUtils.testBit(__isset_bitfield, __HAS_MORE_ISSET_ID);
  }

  public void setHas_moreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HAS_MORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case READY:
      if (value == null) {
        unsetReady();
      } else {
        setReady((Boolean)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<String>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<String>)value);
      }
      break;

    case START_ROW:
      if (value == null) {
        unsetStart_row();
      } else {
        setStart_row((Long)value);
      }
      break;

    case HAS_MORE:
      if (value == null) {
        unsetHas_more();
      } else {
        setHas_more((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case READY:
      return isReady();

    case COLUMNS:
      return getColumns();

    case DATA:
      return getData();

    case START_ROW:
      return getStart_row();

    case HAS_MORE:
      return isHas_more();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case READY:
      return isSetReady();
    case COLUMNS:
      return isSetColumns();
    case DATA:
      return isSetData();
    case START_ROW:
      return isSetStart_row();
    case HAS_MORE:
      return isSetHas_more();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Results)
      return this.equals((Results)that);
    return false;
  }

  public boolean equals(Results that) {
    if (that == null)
      return false;

    boolean this_present_ready = true;
    boolean that_present_ready = true;
    if (this_present_ready || that_present_ready) {
      if (!(this_present_ready && that_present_ready))
        return false;
      if (this.ready != that.ready)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_start_row = true;
    boolean that_present_start_row = true;
    if (this_present_start_row || that_present_start_row) {
      if (!(this_present_start_row && that_present_start_row))
        return false;
      if (this.start_row != that.start_row)
        return false;
    }

    boolean this_present_has_more = true;
    boolean that_present_has_more = true;
    if (this_present_has_more || that_present_has_more) {
      if (!(this_present_has_more && that_present_has_more))
        return false;
      if (this.has_more != that.has_more)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ready = true;
    list.add(present_ready);
    if (present_ready)
      list.add(ready);

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_start_row = true;
    list.add(present_start_row);
    if (present_start_row)
      list.add(start_row);

    boolean present_has_more = true;
    list.add(present_has_more);
    if (present_has_more)
      list.add(has_more);

    return list.hashCode();
  }

  @Override
  public int compareTo(Results other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReady()).compareTo(other.isSetReady());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReady()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ready, other.ready);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_row()).compareTo(other.isSetStart_row());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_row()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_row, other.start_row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHas_more()).compareTo(other.isSetHas_more());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_more()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_more, other.has_more);
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
    StringBuilder sb = new StringBuilder("Results(");
    boolean first = true;

    sb.append("ready:");
    sb.append(this.ready);
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_row:");
    sb.append(this.start_row);
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_more:");
    sb.append(this.has_more);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class ResultsStandardSchemeFactory implements SchemeFactory {
    public ResultsStandardScheme getScheme() {
      return new ResultsStandardScheme();
    }
  }

  private static class ResultsStandardScheme extends StandardScheme<Results> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Results struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // READY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ready = iprot.readBool();
              struct.setReadyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.columns = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.columns.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.data = new ArrayList<String>(_list11.size);
                String _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readString();
                  struct.data.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_row = iprot.readI64();
              struct.setStart_rowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HAS_MORE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_more = iprot.readBool();
              struct.setHas_moreIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Results struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(READY_FIELD_DESC);
      oprot.writeBool(struct.ready);
      oprot.writeFieldEnd();
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (String _iter14 : struct.columns)
          {
            oprot.writeString(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.data.size()));
          for (String _iter15 : struct.data)
          {
            oprot.writeString(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_ROW_FIELD_DESC);
      oprot.writeI64(struct.start_row);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
      oprot.writeBool(struct.has_more);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultsTupleSchemeFactory implements SchemeFactory {
    public ResultsTupleScheme getScheme() {
      return new ResultsTupleScheme();
    }
  }

  private static class ResultsTupleScheme extends TupleScheme<Results> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Results struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReady()) {
        optionals.set(0);
      }
      if (struct.isSetColumns()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      if (struct.isSetStart_row()) {
        optionals.set(3);
      }
      if (struct.isSetHas_more()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetReady()) {
        oprot.writeBool(struct.ready);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (String _iter16 : struct.columns)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (String _iter17 : struct.data)
          {
            oprot.writeString(_iter17);
          }
        }
      }
      if (struct.isSetStart_row()) {
        oprot.writeI64(struct.start_row);
      }
      if (struct.isSetHas_more()) {
        oprot.writeBool(struct.has_more);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Results struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.ready = iprot.readBool();
        struct.setReadyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columns = new ArrayList<String>(_list18.size);
          String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.columns.add(_elem19);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.data = new ArrayList<String>(_list21.size);
          String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.data.add(_elem22);
          }
        }
        struct.setDataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.start_row = iprot.readI64();
        struct.setStart_rowIsSet(true);
      }
      if (incoming.get(4)) {
        struct.has_more = iprot.readBool();
        struct.setHas_moreIsSet(true);
      }
    }
  }

}

