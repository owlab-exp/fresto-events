/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fresto.data;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntryInvokePropertyValue implements org.apache.thrift.TBase<EntryInvokePropertyValue, EntryInvokePropertyValue._Fields>, java.io.Serializable, Cloneable, Comparable<EntryInvokePropertyValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntryInvokePropertyValue");

  private static final org.apache.thrift.protocol.TField HTTP_METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("http_method", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField APPLICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("application", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField MANAGED_RESOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("managed_resource", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField OPERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("operation", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntryInvokePropertyValueStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntryInvokePropertyValueTupleSchemeFactory());
  }

  public String http_method; // required
  public HostID host; // required
  public int port; // required
  public ApplicationID application; // required
  public ManagedResourceID managed_resource; // required
  public OperationID operation; // required
  public long timestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HTTP_METHOD((short)1, "http_method"),
    HOST((short)2, "host"),
    PORT((short)3, "port"),
    APPLICATION((short)4, "application"),
    MANAGED_RESOURCE((short)5, "managed_resource"),
    OPERATION((short)6, "operation"),
    TIMESTAMP((short)7, "timestamp");

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
        case 1: // HTTP_METHOD
          return HTTP_METHOD;
        case 2: // HOST
          return HOST;
        case 3: // PORT
          return PORT;
        case 4: // APPLICATION
          return APPLICATION;
        case 5: // MANAGED_RESOURCE
          return MANAGED_RESOURCE;
        case 6: // OPERATION
          return OPERATION;
        case 7: // TIMESTAMP
          return TIMESTAMP;
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
  private static final int __PORT_ISSET_ID = 0;
  private static final int __TIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HTTP_METHOD, new org.apache.thrift.meta_data.FieldMetaData("http_method", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HostID.class)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLICATION, new org.apache.thrift.meta_data.FieldMetaData("application", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ApplicationID.class)));
    tmpMap.put(_Fields.MANAGED_RESOURCE, new org.apache.thrift.meta_data.FieldMetaData("managed_resource", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ManagedResourceID.class)));
    tmpMap.put(_Fields.OPERATION, new org.apache.thrift.meta_data.FieldMetaData("operation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OperationID.class)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntryInvokePropertyValue.class, metaDataMap);
  }

  public EntryInvokePropertyValue() {
  }

  public EntryInvokePropertyValue(
    String http_method,
    HostID host,
    int port,
    ApplicationID application,
    ManagedResourceID managed_resource,
    OperationID operation,
    long timestamp)
  {
    this();
    this.http_method = http_method;
    this.host = host;
    this.port = port;
    setPortIsSet(true);
    this.application = application;
    this.managed_resource = managed_resource;
    this.operation = operation;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntryInvokePropertyValue(EntryInvokePropertyValue other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHttp_method()) {
      this.http_method = other.http_method;
    }
    if (other.isSetHost()) {
      this.host = new HostID(other.host);
    }
    this.port = other.port;
    if (other.isSetApplication()) {
      this.application = new ApplicationID(other.application);
    }
    if (other.isSetManaged_resource()) {
      this.managed_resource = new ManagedResourceID(other.managed_resource);
    }
    if (other.isSetOperation()) {
      this.operation = new OperationID(other.operation);
    }
    this.timestamp = other.timestamp;
  }

  public EntryInvokePropertyValue deepCopy() {
    return new EntryInvokePropertyValue(this);
  }

  @Override
  public void clear() {
    this.http_method = null;
    this.host = null;
    setPortIsSet(false);
    this.port = 0;
    this.application = null;
    this.managed_resource = null;
    this.operation = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public String getHttp_method() {
    return this.http_method;
  }

  public EntryInvokePropertyValue setHttp_method(String http_method) {
    this.http_method = http_method;
    return this;
  }

  public void unsetHttp_method() {
    this.http_method = null;
  }

  /** Returns true if field http_method is set (has been assigned a value) and false otherwise */
  public boolean isSetHttp_method() {
    return this.http_method != null;
  }

  public void setHttp_methodIsSet(boolean value) {
    if (!value) {
      this.http_method = null;
    }
  }

  public HostID getHost() {
    return this.host;
  }

  public EntryInvokePropertyValue setHost(HostID host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public EntryInvokePropertyValue setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public ApplicationID getApplication() {
    return this.application;
  }

  public EntryInvokePropertyValue setApplication(ApplicationID application) {
    this.application = application;
    return this;
  }

  public void unsetApplication() {
    this.application = null;
  }

  /** Returns true if field application is set (has been assigned a value) and false otherwise */
  public boolean isSetApplication() {
    return this.application != null;
  }

  public void setApplicationIsSet(boolean value) {
    if (!value) {
      this.application = null;
    }
  }

  public ManagedResourceID getManaged_resource() {
    return this.managed_resource;
  }

  public EntryInvokePropertyValue setManaged_resource(ManagedResourceID managed_resource) {
    this.managed_resource = managed_resource;
    return this;
  }

  public void unsetManaged_resource() {
    this.managed_resource = null;
  }

  /** Returns true if field managed_resource is set (has been assigned a value) and false otherwise */
  public boolean isSetManaged_resource() {
    return this.managed_resource != null;
  }

  public void setManaged_resourceIsSet(boolean value) {
    if (!value) {
      this.managed_resource = null;
    }
  }

  public OperationID getOperation() {
    return this.operation;
  }

  public EntryInvokePropertyValue setOperation(OperationID operation) {
    this.operation = operation;
    return this;
  }

  public void unsetOperation() {
    this.operation = null;
  }

  /** Returns true if field operation is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation() {
    return this.operation != null;
  }

  public void setOperationIsSet(boolean value) {
    if (!value) {
      this.operation = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public EntryInvokePropertyValue setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HTTP_METHOD:
      if (value == null) {
        unsetHttp_method();
      } else {
        setHttp_method((String)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((HostID)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Integer)value);
      }
      break;

    case APPLICATION:
      if (value == null) {
        unsetApplication();
      } else {
        setApplication((ApplicationID)value);
      }
      break;

    case MANAGED_RESOURCE:
      if (value == null) {
        unsetManaged_resource();
      } else {
        setManaged_resource((ManagedResourceID)value);
      }
      break;

    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((OperationID)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HTTP_METHOD:
      return getHttp_method();

    case HOST:
      return getHost();

    case PORT:
      return Integer.valueOf(getPort());

    case APPLICATION:
      return getApplication();

    case MANAGED_RESOURCE:
      return getManaged_resource();

    case OPERATION:
      return getOperation();

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HTTP_METHOD:
      return isSetHttp_method();
    case HOST:
      return isSetHost();
    case PORT:
      return isSetPort();
    case APPLICATION:
      return isSetApplication();
    case MANAGED_RESOURCE:
      return isSetManaged_resource();
    case OPERATION:
      return isSetOperation();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntryInvokePropertyValue)
      return this.equals((EntryInvokePropertyValue)that);
    return false;
  }

  public boolean equals(EntryInvokePropertyValue that) {
    if (that == null)
      return false;

    boolean this_present_http_method = true && this.isSetHttp_method();
    boolean that_present_http_method = true && that.isSetHttp_method();
    if (this_present_http_method || that_present_http_method) {
      if (!(this_present_http_method && that_present_http_method))
        return false;
      if (!this.http_method.equals(that.http_method))
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_application = true && this.isSetApplication();
    boolean that_present_application = true && that.isSetApplication();
    if (this_present_application || that_present_application) {
      if (!(this_present_application && that_present_application))
        return false;
      if (!this.application.equals(that.application))
        return false;
    }

    boolean this_present_managed_resource = true && this.isSetManaged_resource();
    boolean that_present_managed_resource = true && that.isSetManaged_resource();
    if (this_present_managed_resource || that_present_managed_resource) {
      if (!(this_present_managed_resource && that_present_managed_resource))
        return false;
      if (!this.managed_resource.equals(that.managed_resource))
        return false;
    }

    boolean this_present_operation = true && this.isSetOperation();
    boolean that_present_operation = true && that.isSetOperation();
    if (this_present_operation || that_present_operation) {
      if (!(this_present_operation && that_present_operation))
        return false;
      if (!this.operation.equals(that.operation))
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EntryInvokePropertyValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHttp_method()).compareTo(other.isSetHttp_method());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHttp_method()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.http_method, other.http_method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplication()).compareTo(other.isSetApplication());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplication()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.application, other.application);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetManaged_resource()).compareTo(other.isSetManaged_resource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetManaged_resource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.managed_resource, other.managed_resource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperation()).compareTo(other.isSetOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operation, other.operation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
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
    StringBuilder sb = new StringBuilder("EntryInvokePropertyValue(");
    boolean first = true;

    sb.append("http_method:");
    if (this.http_method == null) {
      sb.append("null");
    } else {
      sb.append(this.http_method);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("application:");
    if (this.application == null) {
      sb.append("null");
    } else {
      sb.append(this.application);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("managed_resource:");
    if (this.managed_resource == null) {
      sb.append("null");
    } else {
      sb.append(this.managed_resource);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operation:");
    if (this.operation == null) {
      sb.append("null");
    } else {
      sb.append(this.operation);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
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

  private static class EntryInvokePropertyValueStandardSchemeFactory implements SchemeFactory {
    public EntryInvokePropertyValueStandardScheme getScheme() {
      return new EntryInvokePropertyValueStandardScheme();
    }
  }

  private static class EntryInvokePropertyValueStandardScheme extends StandardScheme<EntryInvokePropertyValue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntryInvokePropertyValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HTTP_METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.http_method = iprot.readString();
              struct.setHttp_methodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.host = new HostID();
              struct.host.read(iprot);
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // APPLICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.application = new ApplicationID();
              struct.application.read(iprot);
              struct.setApplicationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MANAGED_RESOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.managed_resource = new ManagedResourceID();
              struct.managed_resource.read(iprot);
              struct.setManaged_resourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.operation = new OperationID();
              struct.operation.read(iprot);
              struct.setOperationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntryInvokePropertyValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.http_method != null) {
        oprot.writeFieldBegin(HTTP_METHOD_FIELD_DESC);
        oprot.writeString(struct.http_method);
        oprot.writeFieldEnd();
      }
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        struct.host.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.application != null) {
        oprot.writeFieldBegin(APPLICATION_FIELD_DESC);
        struct.application.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.managed_resource != null) {
        oprot.writeFieldBegin(MANAGED_RESOURCE_FIELD_DESC);
        struct.managed_resource.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.operation != null) {
        oprot.writeFieldBegin(OPERATION_FIELD_DESC);
        struct.operation.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntryInvokePropertyValueTupleSchemeFactory implements SchemeFactory {
    public EntryInvokePropertyValueTupleScheme getScheme() {
      return new EntryInvokePropertyValueTupleScheme();
    }
  }

  private static class EntryInvokePropertyValueTupleScheme extends TupleScheme<EntryInvokePropertyValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntryInvokePropertyValue struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHttp_method()) {
        optionals.set(0);
      }
      if (struct.isSetHost()) {
        optionals.set(1);
      }
      if (struct.isSetPort()) {
        optionals.set(2);
      }
      if (struct.isSetApplication()) {
        optionals.set(3);
      }
      if (struct.isSetManaged_resource()) {
        optionals.set(4);
      }
      if (struct.isSetOperation()) {
        optionals.set(5);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetHttp_method()) {
        oprot.writeString(struct.http_method);
      }
      if (struct.isSetHost()) {
        struct.host.write(oprot);
      }
      if (struct.isSetPort()) {
        oprot.writeI32(struct.port);
      }
      if (struct.isSetApplication()) {
        struct.application.write(oprot);
      }
      if (struct.isSetManaged_resource()) {
        struct.managed_resource.write(oprot);
      }
      if (struct.isSetOperation()) {
        struct.operation.write(oprot);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntryInvokePropertyValue struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.http_method = iprot.readString();
        struct.setHttp_methodIsSet(true);
      }
      if (incoming.get(1)) {
        struct.host = new HostID();
        struct.host.read(iprot);
        struct.setHostIsSet(true);
      }
      if (incoming.get(2)) {
        struct.port = iprot.readI32();
        struct.setPortIsSet(true);
      }
      if (incoming.get(3)) {
        struct.application = new ApplicationID();
        struct.application.read(iprot);
        struct.setApplicationIsSet(true);
      }
      if (incoming.get(4)) {
        struct.managed_resource = new ManagedResourceID();
        struct.managed_resource.read(iprot);
        struct.setManaged_resourceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.operation = new OperationID();
        struct.operation.read(iprot);
        struct.setOperationIsSet(true);
      }
      if (incoming.get(6)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

}
