/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
public class HiveObjectPrivilege implements org.apache.thrift.TBase<HiveObjectPrivilege, HiveObjectPrivilege._Fields>, java.io.Serializable, Cloneable, Comparable<HiveObjectPrivilege> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HiveObjectPrivilege");

  private static final org.apache.thrift.protocol.TField HIVE_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("hiveObject", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("principalName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("principalType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField GRANT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("grantInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HiveObjectPrivilegeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HiveObjectPrivilegeTupleSchemeFactory());
  }

  public HiveObjectRef hiveObject; // required
  public String principalName; // required
  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType principalType; // required
  public PrivilegeGrantInfo grantInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HIVE_OBJECT((short)1, "hiveObject"),
    PRINCIPAL_NAME((short)2, "principalName"),
    /**
     * 
     * @see PrincipalType
     */
    PRINCIPAL_TYPE((short)3, "principalType"),
    GRANT_INFO((short)4, "grantInfo");

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
        case 1: // HIVE_OBJECT
          return HIVE_OBJECT;
        case 2: // PRINCIPAL_NAME
          return PRINCIPAL_NAME;
        case 3: // PRINCIPAL_TYPE
          return PRINCIPAL_TYPE;
        case 4: // GRANT_INFO
          return GRANT_INFO;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HIVE_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("hiveObject", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HiveObjectRef.class)));
    tmpMap.put(_Fields.PRINCIPAL_NAME, new org.apache.thrift.meta_data.FieldMetaData("principalName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("principalType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    tmpMap.put(_Fields.GRANT_INFO, new org.apache.thrift.meta_data.FieldMetaData("grantInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HiveObjectPrivilege.class, metaDataMap);
  }

  public HiveObjectPrivilege() {
  }

  public HiveObjectPrivilege(
    HiveObjectRef hiveObject,
    String principalName,
    PrincipalType principalType,
    PrivilegeGrantInfo grantInfo)
  {
    this();
    this.hiveObject = hiveObject;
    this.principalName = principalName;
    this.principalType = principalType;
    this.grantInfo = grantInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HiveObjectPrivilege(HiveObjectPrivilege other) {
    if (other.isSetHiveObject()) {
      this.hiveObject = new HiveObjectRef(other.hiveObject);
    }
    if (other.isSetPrincipalName()) {
      this.principalName = other.principalName;
    }
    if (other.isSetPrincipalType()) {
      this.principalType = other.principalType;
    }
    if (other.isSetGrantInfo()) {
      this.grantInfo = new PrivilegeGrantInfo(other.grantInfo);
    }
  }

  public HiveObjectPrivilege deepCopy() {
    return new HiveObjectPrivilege(this);
  }

  @Override
  public void clear() {
    this.hiveObject = null;
    this.principalName = null;
    this.principalType = null;
    this.grantInfo = null;
  }

  public HiveObjectRef getHiveObject() {
    return this.hiveObject;
  }

  public HiveObjectPrivilege setHiveObject(HiveObjectRef hiveObject) {
    this.hiveObject = hiveObject;
    return this;
  }

  public void unsetHiveObject() {
    this.hiveObject = null;
  }

  /** Returns true if field hiveObject is set (has been assigned a value) and false otherwise */
  public boolean isSetHiveObject() {
    return this.hiveObject != null;
  }

  public void setHiveObjectIsSet(boolean value) {
    if (!value) {
      this.hiveObject = null;
    }
  }

  public String getPrincipalName() {
    return this.principalName;
  }

  public HiveObjectPrivilege setPrincipalName(String principalName) {
    this.principalName = principalName;
    return this;
  }

  public void unsetPrincipalName() {
    this.principalName = null;
  }

  /** Returns true if field principalName is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalName() {
    return this.principalName != null;
  }

  public void setPrincipalNameIsSet(boolean value) {
    if (!value) {
      this.principalName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getPrincipalType() {
    return this.principalType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public HiveObjectPrivilege setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public void unsetPrincipalType() {
    this.principalType = null;
  }

  /** Returns true if field principalType is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalType() {
    return this.principalType != null;
  }

  public void setPrincipalTypeIsSet(boolean value) {
    if (!value) {
      this.principalType = null;
    }
  }

  public PrivilegeGrantInfo getGrantInfo() {
    return this.grantInfo;
  }

  public HiveObjectPrivilege setGrantInfo(PrivilegeGrantInfo grantInfo) {
    this.grantInfo = grantInfo;
    return this;
  }

  public void unsetGrantInfo() {
    this.grantInfo = null;
  }

  /** Returns true if field grantInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantInfo() {
    return this.grantInfo != null;
  }

  public void setGrantInfoIsSet(boolean value) {
    if (!value) {
      this.grantInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HIVE_OBJECT:
      if (value == null) {
        unsetHiveObject();
      } else {
        setHiveObject((HiveObjectRef)value);
      }
      break;

    case PRINCIPAL_NAME:
      if (value == null) {
        unsetPrincipalName();
      } else {
        setPrincipalName((String)value);
      }
      break;

    case PRINCIPAL_TYPE:
      if (value == null) {
        unsetPrincipalType();
      } else {
        setPrincipalType((PrincipalType)value);
      }
      break;

    case GRANT_INFO:
      if (value == null) {
        unsetGrantInfo();
      } else {
        setGrantInfo((PrivilegeGrantInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HIVE_OBJECT:
      return getHiveObject();

    case PRINCIPAL_NAME:
      return getPrincipalName();

    case PRINCIPAL_TYPE:
      return getPrincipalType();

    case GRANT_INFO:
      return getGrantInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HIVE_OBJECT:
      return isSetHiveObject();
    case PRINCIPAL_NAME:
      return isSetPrincipalName();
    case PRINCIPAL_TYPE:
      return isSetPrincipalType();
    case GRANT_INFO:
      return isSetGrantInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HiveObjectPrivilege)
      return this.equals((HiveObjectPrivilege)that);
    return false;
  }

  public boolean equals(HiveObjectPrivilege that) {
    if (that == null)
      return false;

    boolean this_present_hiveObject = true && this.isSetHiveObject();
    boolean that_present_hiveObject = true && that.isSetHiveObject();
    if (this_present_hiveObject || that_present_hiveObject) {
      if (!(this_present_hiveObject && that_present_hiveObject))
        return false;
      if (!this.hiveObject.equals(that.hiveObject))
        return false;
    }

    boolean this_present_principalName = true && this.isSetPrincipalName();
    boolean that_present_principalName = true && that.isSetPrincipalName();
    if (this_present_principalName || that_present_principalName) {
      if (!(this_present_principalName && that_present_principalName))
        return false;
      if (!this.principalName.equals(that.principalName))
        return false;
    }

    boolean this_present_principalType = true && this.isSetPrincipalType();
    boolean that_present_principalType = true && that.isSetPrincipalType();
    if (this_present_principalType || that_present_principalType) {
      if (!(this_present_principalType && that_present_principalType))
        return false;
      if (!this.principalType.equals(that.principalType))
        return false;
    }

    boolean this_present_grantInfo = true && this.isSetGrantInfo();
    boolean that_present_grantInfo = true && that.isSetGrantInfo();
    if (this_present_grantInfo || that_present_grantInfo) {
      if (!(this_present_grantInfo && that_present_grantInfo))
        return false;
      if (!this.grantInfo.equals(that.grantInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hiveObject = true && (isSetHiveObject());
    list.add(present_hiveObject);
    if (present_hiveObject)
      list.add(hiveObject);

    boolean present_principalName = true && (isSetPrincipalName());
    list.add(present_principalName);
    if (present_principalName)
      list.add(principalName);

    boolean present_principalType = true && (isSetPrincipalType());
    list.add(present_principalType);
    if (present_principalType)
      list.add(principalType.getValue());

    boolean present_grantInfo = true && (isSetGrantInfo());
    list.add(present_grantInfo);
    if (present_grantInfo)
      list.add(grantInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(HiveObjectPrivilege other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHiveObject()).compareTo(other.isSetHiveObject());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHiveObject()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hiveObject, other.hiveObject);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalName()).compareTo(other.isSetPrincipalName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalName, other.principalName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalType()).compareTo(other.isSetPrincipalType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalType, other.principalType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantInfo()).compareTo(other.isSetGrantInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantInfo, other.grantInfo);
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
    StringBuilder sb = new StringBuilder("HiveObjectPrivilege(");
    boolean first = true;

    sb.append("hiveObject:");
    if (this.hiveObject == null) {
      sb.append("null");
    } else {
      sb.append(this.hiveObject);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalName:");
    if (this.principalName == null) {
      sb.append("null");
    } else {
      sb.append(this.principalName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalType:");
    if (this.principalType == null) {
      sb.append("null");
    } else {
      sb.append(this.principalType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantInfo:");
    if (this.grantInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.grantInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (hiveObject != null) {
      hiveObject.validate();
    }
    if (grantInfo != null) {
      grantInfo.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HiveObjectPrivilegeStandardSchemeFactory implements SchemeFactory {
    public HiveObjectPrivilegeStandardScheme getScheme() {
      return new HiveObjectPrivilegeStandardScheme();
    }
  }

  private static class HiveObjectPrivilegeStandardScheme extends StandardScheme<HiveObjectPrivilege> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HiveObjectPrivilege struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HIVE_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hiveObject = new HiveObjectRef();
              struct.hiveObject.read(iprot);
              struct.setHiveObjectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRINCIPAL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.principalName = iprot.readString();
              struct.setPrincipalNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRINCIPAL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setPrincipalTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GRANT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.grantInfo = new PrivilegeGrantInfo();
              struct.grantInfo.read(iprot);
              struct.setGrantInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HiveObjectPrivilege struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hiveObject != null) {
        oprot.writeFieldBegin(HIVE_OBJECT_FIELD_DESC);
        struct.hiveObject.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.principalName != null) {
        oprot.writeFieldBegin(PRINCIPAL_NAME_FIELD_DESC);
        oprot.writeString(struct.principalName);
        oprot.writeFieldEnd();
      }
      if (struct.principalType != null) {
        oprot.writeFieldBegin(PRINCIPAL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.principalType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.grantInfo != null) {
        oprot.writeFieldBegin(GRANT_INFO_FIELD_DESC);
        struct.grantInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HiveObjectPrivilegeTupleSchemeFactory implements SchemeFactory {
    public HiveObjectPrivilegeTupleScheme getScheme() {
      return new HiveObjectPrivilegeTupleScheme();
    }
  }

  private static class HiveObjectPrivilegeTupleScheme extends TupleScheme<HiveObjectPrivilege> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HiveObjectPrivilege struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHiveObject()) {
        optionals.set(0);
      }
      if (struct.isSetPrincipalName()) {
        optionals.set(1);
      }
      if (struct.isSetPrincipalType()) {
        optionals.set(2);
      }
      if (struct.isSetGrantInfo()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetHiveObject()) {
        struct.hiveObject.write(oprot);
      }
      if (struct.isSetPrincipalName()) {
        oprot.writeString(struct.principalName);
      }
      if (struct.isSetPrincipalType()) {
        oprot.writeI32(struct.principalType.getValue());
      }
      if (struct.isSetGrantInfo()) {
        struct.grantInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HiveObjectPrivilege struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.hiveObject = new HiveObjectRef();
        struct.hiveObject.read(iprot);
        struct.setHiveObjectIsSet(true);
      }
      if (incoming.get(1)) {
        struct.principalName = iprot.readString();
        struct.setPrincipalNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setPrincipalTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.grantInfo = new PrivilegeGrantInfo();
        struct.grantInfo.read(iprot);
        struct.setGrantInfoIsSet(true);
      }
    }
  }

}

