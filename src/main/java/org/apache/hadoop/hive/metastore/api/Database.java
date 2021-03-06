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
public class Database implements org.apache.thrift.TBase<Database, Database._Fields>, java.io.Serializable, Cloneable, Comparable<Database> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Database");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_URI_FIELD_DESC = new org.apache.thrift.protocol.TField("locationUri", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privileges", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DatabaseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DatabaseTupleSchemeFactory());
  }

  public String name; // required
  public String description; // required
  public String locationUri; // required
  public Map<String,String> parameters; // required
  public PrincipalPrivilegeSet privileges; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    DESCRIPTION((short)2, "description"),
    LOCATION_URI((short)3, "locationUri"),
    PARAMETERS((short)4, "parameters"),
    PRIVILEGES((short)5, "privileges");

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
        case 1: // NAME
          return NAME;
        case 2: // DESCRIPTION
          return DESCRIPTION;
        case 3: // LOCATION_URI
          return LOCATION_URI;
        case 4: // PARAMETERS
          return PARAMETERS;
        case 5: // PRIVILEGES
          return PRIVILEGES;
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
  private static final _Fields optionals[] = {_Fields.PRIVILEGES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION_URI, new org.apache.thrift.meta_data.FieldMetaData("locationUri", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("privileges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrincipalPrivilegeSet.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Database.class, metaDataMap);
  }

  public Database() {
  }

  public Database(
    String name,
    String description,
    String locationUri,
    Map<String,String> parameters)
  {
    this();
    this.name = name;
    this.description = description;
    this.locationUri = locationUri;
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Database(Database other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetLocationUri()) {
      this.locationUri = other.locationUri;
    }
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>(other.parameters);
      this.parameters = __this__parameters;
    }
    if (other.isSetPrivileges()) {
      this.privileges = new PrincipalPrivilegeSet(other.privileges);
    }
  }

  public Database deepCopy() {
    return new Database(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.description = null;
    this.locationUri = null;
    this.parameters = null;
    this.privileges = null;
  }

  public String getName() {
    return this.name;
  }

  public Database setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public Database setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public String getLocationUri() {
    return this.locationUri;
  }

  public Database setLocationUri(String locationUri) {
    this.locationUri = locationUri;
    return this;
  }

  public void unsetLocationUri() {
    this.locationUri = null;
  }

  /** Returns true if field locationUri is set (has been assigned a value) and false otherwise */
  public boolean isSetLocationUri() {
    return this.locationUri != null;
  }

  public void setLocationUriIsSet(boolean value) {
    if (!value) {
      this.locationUri = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public Database setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public PrincipalPrivilegeSet getPrivileges() {
    return this.privileges;
  }

  public Database setPrivileges(PrincipalPrivilegeSet privileges) {
    this.privileges = privileges;
    return this;
  }

  public void unsetPrivileges() {
    this.privileges = null;
  }

  /** Returns true if field privileges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivileges() {
    return this.privileges != null;
  }

  public void setPrivilegesIsSet(boolean value) {
    if (!value) {
      this.privileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case LOCATION_URI:
      if (value == null) {
        unsetLocationUri();
      } else {
        setLocationUri((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    case PRIVILEGES:
      if (value == null) {
        unsetPrivileges();
      } else {
        setPrivileges((PrincipalPrivilegeSet)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case LOCATION_URI:
      return getLocationUri();

    case PARAMETERS:
      return getParameters();

    case PRIVILEGES:
      return getPrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case LOCATION_URI:
      return isSetLocationUri();
    case PARAMETERS:
      return isSetParameters();
    case PRIVILEGES:
      return isSetPrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Database)
      return this.equals((Database)that);
    return false;
  }

  public boolean equals(Database that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_locationUri = true && this.isSetLocationUri();
    boolean that_present_locationUri = true && that.isSetLocationUri();
    if (this_present_locationUri || that_present_locationUri) {
      if (!(this_present_locationUri && that_present_locationUri))
        return false;
      if (!this.locationUri.equals(that.locationUri))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_privileges = true && this.isSetPrivileges();
    boolean that_present_privileges = true && that.isSetPrivileges();
    if (this_present_privileges || that_present_privileges) {
      if (!(this_present_privileges && that_present_privileges))
        return false;
      if (!this.privileges.equals(that.privileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    boolean present_locationUri = true && (isSetLocationUri());
    list.add(present_locationUri);
    if (present_locationUri)
      list.add(locationUri);

    boolean present_parameters = true && (isSetParameters());
    list.add(present_parameters);
    if (present_parameters)
      list.add(parameters);

    boolean present_privileges = true && (isSetPrivileges());
    list.add(present_privileges);
    if (present_privileges)
      list.add(privileges);

    return list.hashCode();
  }

  @Override
  public int compareTo(Database other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocationUri()).compareTo(other.isSetLocationUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocationUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locationUri, other.locationUri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(other.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, other.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivileges()).compareTo(other.isSetPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privileges, other.privileges);
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
    StringBuilder sb = new StringBuilder("Database(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locationUri:");
    if (this.locationUri == null) {
      sb.append("null");
    } else {
      sb.append(this.locationUri);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (isSetPrivileges()) {
      if (!first) sb.append(", ");
      sb.append("privileges:");
      if (this.privileges == null) {
        sb.append("null");
      } else {
        sb.append(this.privileges);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (privileges != null) {
      privileges.validate();
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

  private static class DatabaseStandardSchemeFactory implements SchemeFactory {
    public DatabaseStandardScheme getScheme() {
      return new DatabaseStandardScheme();
    }
  }

  private static class DatabaseStandardScheme extends StandardScheme<Database> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Database struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCATION_URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locationUri = iprot.readString();
              struct.setLocationUriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map70 = iprot.readMapBegin();
                struct.parameters = new HashMap<String,String>(2*_map70.size);
                String _key71;
                String _val72;
                for (int _i73 = 0; _i73 < _map70.size; ++_i73)
                {
                  _key71 = iprot.readString();
                  _val72 = iprot.readString();
                  struct.parameters.put(_key71, _val72);
                }
                iprot.readMapEnd();
              }
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.privileges = new PrincipalPrivilegeSet();
              struct.privileges.read(iprot);
              struct.setPrivilegesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Database struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      if (struct.locationUri != null) {
        oprot.writeFieldBegin(LOCATION_URI_FIELD_DESC);
        oprot.writeString(struct.locationUri);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (Map.Entry<String, String> _iter74 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter74.getKey());
            oprot.writeString(_iter74.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.privileges != null) {
        if (struct.isSetPrivileges()) {
          oprot.writeFieldBegin(PRIVILEGES_FIELD_DESC);
          struct.privileges.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DatabaseTupleSchemeFactory implements SchemeFactory {
    public DatabaseTupleScheme getScheme() {
      return new DatabaseTupleScheme();
    }
  }

  private static class DatabaseTupleScheme extends TupleScheme<Database> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Database struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetDescription()) {
        optionals.set(1);
      }
      if (struct.isSetLocationUri()) {
        optionals.set(2);
      }
      if (struct.isSetParameters()) {
        optionals.set(3);
      }
      if (struct.isSetPrivileges()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetLocationUri()) {
        oprot.writeString(struct.locationUri);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (Map.Entry<String, String> _iter75 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter75.getKey());
            oprot.writeString(_iter75.getValue());
          }
        }
      }
      if (struct.isSetPrivileges()) {
        struct.privileges.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Database struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.locationUri = iprot.readString();
        struct.setLocationUriIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map76 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.parameters = new HashMap<String,String>(2*_map76.size);
          String _key77;
          String _val78;
          for (int _i79 = 0; _i79 < _map76.size; ++_i79)
          {
            _key77 = iprot.readString();
            _val78 = iprot.readString();
            struct.parameters.put(_key77, _val78);
          }
        }
        struct.setParametersIsSet(true);
      }
      if (incoming.get(4)) {
        struct.privileges = new PrincipalPrivilegeSet();
        struct.privileges.read(iprot);
        struct.setPrivilegesIsSet(true);
      }
    }
  }

}

