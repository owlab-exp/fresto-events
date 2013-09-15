/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fresto.event;

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

public class HttpRequestEvent implements org.apache.thrift.TBase<HttpRequestEvent, HttpRequestEvent._Fields>, java.io.Serializable, Cloneable, Comparable<HttpRequestEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HttpRequestEvent");

  private static final org.apache.thrift.protocol.TField STAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("stage", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HTTP_METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("httpMethod", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCAL_HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("localHost", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField LOCAL_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("localPort", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CONTEXT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("contextPath", org.apache.thrift.protocol.TType.STRING, (short)9);
  private static final org.apache.thrift.protocol.TField SERVLET_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("servletPath", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField FRESTO_UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("frestoUUID", org.apache.thrift.protocol.TType.STRING, (short)13);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)15);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HttpRequestEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HttpRequestEventTupleSchemeFactory());
  }

  public String stage; // required
  public String httpMethod; // optional
  public String localHost; // required
  public String localPort; // optional
  public String contextPath; // required
  public String servletPath; // required
  public String frestoUUID; // required
  public long timestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAGE((short)1, "stage"),
    HTTP_METHOD((short)3, "httpMethod"),
    LOCAL_HOST((short)5, "localHost"),
    LOCAL_PORT((short)7, "localPort"),
    CONTEXT_PATH((short)9, "contextPath"),
    SERVLET_PATH((short)11, "servletPath"),
    FRESTO_UUID((short)13, "frestoUUID"),
    TIMESTAMP((short)15, "timestamp");

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
        case 1: // STAGE
          return STAGE;
        case 3: // HTTP_METHOD
          return HTTP_METHOD;
        case 5: // LOCAL_HOST
          return LOCAL_HOST;
        case 7: // LOCAL_PORT
          return LOCAL_PORT;
        case 9: // CONTEXT_PATH
          return CONTEXT_PATH;
        case 11: // SERVLET_PATH
          return SERVLET_PATH;
        case 13: // FRESTO_UUID
          return FRESTO_UUID;
        case 15: // TIMESTAMP
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HTTP_METHOD,_Fields.LOCAL_PORT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAGE, new org.apache.thrift.meta_data.FieldMetaData("stage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HTTP_METHOD, new org.apache.thrift.meta_data.FieldMetaData("httpMethod", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCAL_HOST, new org.apache.thrift.meta_data.FieldMetaData("localHost", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCAL_PORT, new org.apache.thrift.meta_data.FieldMetaData("localPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTEXT_PATH, new org.apache.thrift.meta_data.FieldMetaData("contextPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVLET_PATH, new org.apache.thrift.meta_data.FieldMetaData("servletPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FRESTO_UUID, new org.apache.thrift.meta_data.FieldMetaData("frestoUUID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HttpRequestEvent.class, metaDataMap);
  }

  public HttpRequestEvent() {
  }

  public HttpRequestEvent(
    String stage,
    String localHost,
    String contextPath,
    String servletPath,
    String frestoUUID,
    long timestamp)
  {
    this();
    this.stage = stage;
    this.localHost = localHost;
    this.contextPath = contextPath;
    this.servletPath = servletPath;
    this.frestoUUID = frestoUUID;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HttpRequestEvent(HttpRequestEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStage()) {
      this.stage = other.stage;
    }
    if (other.isSetHttpMethod()) {
      this.httpMethod = other.httpMethod;
    }
    if (other.isSetLocalHost()) {
      this.localHost = other.localHost;
    }
    if (other.isSetLocalPort()) {
      this.localPort = other.localPort;
    }
    if (other.isSetContextPath()) {
      this.contextPath = other.contextPath;
    }
    if (other.isSetServletPath()) {
      this.servletPath = other.servletPath;
    }
    if (other.isSetFrestoUUID()) {
      this.frestoUUID = other.frestoUUID;
    }
    this.timestamp = other.timestamp;
  }

  public HttpRequestEvent deepCopy() {
    return new HttpRequestEvent(this);
  }

  @Override
  public void clear() {
    this.stage = null;
    this.httpMethod = null;
    this.localHost = null;
    this.localPort = null;
    this.contextPath = null;
    this.servletPath = null;
    this.frestoUUID = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public String getStage() {
    return this.stage;
  }

  public HttpRequestEvent setStage(String stage) {
    this.stage = stage;
    return this;
  }

  public void unsetStage() {
    this.stage = null;
  }

  /** Returns true if field stage is set (has been assigned a value) and false otherwise */
  public boolean isSetStage() {
    return this.stage != null;
  }

  public void setStageIsSet(boolean value) {
    if (!value) {
      this.stage = null;
    }
  }

  public String getHttpMethod() {
    return this.httpMethod;
  }

  public HttpRequestEvent setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  public void unsetHttpMethod() {
    this.httpMethod = null;
  }

  /** Returns true if field httpMethod is set (has been assigned a value) and false otherwise */
  public boolean isSetHttpMethod() {
    return this.httpMethod != null;
  }

  public void setHttpMethodIsSet(boolean value) {
    if (!value) {
      this.httpMethod = null;
    }
  }

  public String getLocalHost() {
    return this.localHost;
  }

  public HttpRequestEvent setLocalHost(String localHost) {
    this.localHost = localHost;
    return this;
  }

  public void unsetLocalHost() {
    this.localHost = null;
  }

  /** Returns true if field localHost is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalHost() {
    return this.localHost != null;
  }

  public void setLocalHostIsSet(boolean value) {
    if (!value) {
      this.localHost = null;
    }
  }

  public String getLocalPort() {
    return this.localPort;
  }

  public HttpRequestEvent setLocalPort(String localPort) {
    this.localPort = localPort;
    return this;
  }

  public void unsetLocalPort() {
    this.localPort = null;
  }

  /** Returns true if field localPort is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalPort() {
    return this.localPort != null;
  }

  public void setLocalPortIsSet(boolean value) {
    if (!value) {
      this.localPort = null;
    }
  }

  public String getContextPath() {
    return this.contextPath;
  }

  public HttpRequestEvent setContextPath(String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  public void unsetContextPath() {
    this.contextPath = null;
  }

  /** Returns true if field contextPath is set (has been assigned a value) and false otherwise */
  public boolean isSetContextPath() {
    return this.contextPath != null;
  }

  public void setContextPathIsSet(boolean value) {
    if (!value) {
      this.contextPath = null;
    }
  }

  public String getServletPath() {
    return this.servletPath;
  }

  public HttpRequestEvent setServletPath(String servletPath) {
    this.servletPath = servletPath;
    return this;
  }

  public void unsetServletPath() {
    this.servletPath = null;
  }

  /** Returns true if field servletPath is set (has been assigned a value) and false otherwise */
  public boolean isSetServletPath() {
    return this.servletPath != null;
  }

  public void setServletPathIsSet(boolean value) {
    if (!value) {
      this.servletPath = null;
    }
  }

  public String getFrestoUUID() {
    return this.frestoUUID;
  }

  public HttpRequestEvent setFrestoUUID(String frestoUUID) {
    this.frestoUUID = frestoUUID;
    return this;
  }

  public void unsetFrestoUUID() {
    this.frestoUUID = null;
  }

  /** Returns true if field frestoUUID is set (has been assigned a value) and false otherwise */
  public boolean isSetFrestoUUID() {
    return this.frestoUUID != null;
  }

  public void setFrestoUUIDIsSet(boolean value) {
    if (!value) {
      this.frestoUUID = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public HttpRequestEvent setTimestamp(long timestamp) {
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
    case STAGE:
      if (value == null) {
        unsetStage();
      } else {
        setStage((String)value);
      }
      break;

    case HTTP_METHOD:
      if (value == null) {
        unsetHttpMethod();
      } else {
        setHttpMethod((String)value);
      }
      break;

    case LOCAL_HOST:
      if (value == null) {
        unsetLocalHost();
      } else {
        setLocalHost((String)value);
      }
      break;

    case LOCAL_PORT:
      if (value == null) {
        unsetLocalPort();
      } else {
        setLocalPort((String)value);
      }
      break;

    case CONTEXT_PATH:
      if (value == null) {
        unsetContextPath();
      } else {
        setContextPath((String)value);
      }
      break;

    case SERVLET_PATH:
      if (value == null) {
        unsetServletPath();
      } else {
        setServletPath((String)value);
      }
      break;

    case FRESTO_UUID:
      if (value == null) {
        unsetFrestoUUID();
      } else {
        setFrestoUUID((String)value);
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
    case STAGE:
      return getStage();

    case HTTP_METHOD:
      return getHttpMethod();

    case LOCAL_HOST:
      return getLocalHost();

    case LOCAL_PORT:
      return getLocalPort();

    case CONTEXT_PATH:
      return getContextPath();

    case SERVLET_PATH:
      return getServletPath();

    case FRESTO_UUID:
      return getFrestoUUID();

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
    case STAGE:
      return isSetStage();
    case HTTP_METHOD:
      return isSetHttpMethod();
    case LOCAL_HOST:
      return isSetLocalHost();
    case LOCAL_PORT:
      return isSetLocalPort();
    case CONTEXT_PATH:
      return isSetContextPath();
    case SERVLET_PATH:
      return isSetServletPath();
    case FRESTO_UUID:
      return isSetFrestoUUID();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HttpRequestEvent)
      return this.equals((HttpRequestEvent)that);
    return false;
  }

  public boolean equals(HttpRequestEvent that) {
    if (that == null)
      return false;

    boolean this_present_stage = true && this.isSetStage();
    boolean that_present_stage = true && that.isSetStage();
    if (this_present_stage || that_present_stage) {
      if (!(this_present_stage && that_present_stage))
        return false;
      if (!this.stage.equals(that.stage))
        return false;
    }

    boolean this_present_httpMethod = true && this.isSetHttpMethod();
    boolean that_present_httpMethod = true && that.isSetHttpMethod();
    if (this_present_httpMethod || that_present_httpMethod) {
      if (!(this_present_httpMethod && that_present_httpMethod))
        return false;
      if (!this.httpMethod.equals(that.httpMethod))
        return false;
    }

    boolean this_present_localHost = true && this.isSetLocalHost();
    boolean that_present_localHost = true && that.isSetLocalHost();
    if (this_present_localHost || that_present_localHost) {
      if (!(this_present_localHost && that_present_localHost))
        return false;
      if (!this.localHost.equals(that.localHost))
        return false;
    }

    boolean this_present_localPort = true && this.isSetLocalPort();
    boolean that_present_localPort = true && that.isSetLocalPort();
    if (this_present_localPort || that_present_localPort) {
      if (!(this_present_localPort && that_present_localPort))
        return false;
      if (!this.localPort.equals(that.localPort))
        return false;
    }

    boolean this_present_contextPath = true && this.isSetContextPath();
    boolean that_present_contextPath = true && that.isSetContextPath();
    if (this_present_contextPath || that_present_contextPath) {
      if (!(this_present_contextPath && that_present_contextPath))
        return false;
      if (!this.contextPath.equals(that.contextPath))
        return false;
    }

    boolean this_present_servletPath = true && this.isSetServletPath();
    boolean that_present_servletPath = true && that.isSetServletPath();
    if (this_present_servletPath || that_present_servletPath) {
      if (!(this_present_servletPath && that_present_servletPath))
        return false;
      if (!this.servletPath.equals(that.servletPath))
        return false;
    }

    boolean this_present_frestoUUID = true && this.isSetFrestoUUID();
    boolean that_present_frestoUUID = true && that.isSetFrestoUUID();
    if (this_present_frestoUUID || that_present_frestoUUID) {
      if (!(this_present_frestoUUID && that_present_frestoUUID))
        return false;
      if (!this.frestoUUID.equals(that.frestoUUID))
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
  public int compareTo(HttpRequestEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStage()).compareTo(other.isSetStage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage, other.stage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHttpMethod()).compareTo(other.isSetHttpMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHttpMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.httpMethod, other.httpMethod);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocalHost()).compareTo(other.isSetLocalHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localHost, other.localHost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocalPort()).compareTo(other.isSetLocalPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localPort, other.localPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContextPath()).compareTo(other.isSetContextPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContextPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contextPath, other.contextPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServletPath()).compareTo(other.isSetServletPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServletPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.servletPath, other.servletPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFrestoUUID()).compareTo(other.isSetFrestoUUID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrestoUUID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frestoUUID, other.frestoUUID);
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
    StringBuilder sb = new StringBuilder("HttpRequestEvent(");
    boolean first = true;

    sb.append("stage:");
    if (this.stage == null) {
      sb.append("null");
    } else {
      sb.append(this.stage);
    }
    first = false;
    if (isSetHttpMethod()) {
      if (!first) sb.append(", ");
      sb.append("httpMethod:");
      if (this.httpMethod == null) {
        sb.append("null");
      } else {
        sb.append(this.httpMethod);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("localHost:");
    if (this.localHost == null) {
      sb.append("null");
    } else {
      sb.append(this.localHost);
    }
    first = false;
    if (isSetLocalPort()) {
      if (!first) sb.append(", ");
      sb.append("localPort:");
      if (this.localPort == null) {
        sb.append("null");
      } else {
        sb.append(this.localPort);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("contextPath:");
    if (this.contextPath == null) {
      sb.append("null");
    } else {
      sb.append(this.contextPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("servletPath:");
    if (this.servletPath == null) {
      sb.append("null");
    } else {
      sb.append(this.servletPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("frestoUUID:");
    if (this.frestoUUID == null) {
      sb.append("null");
    } else {
      sb.append(this.frestoUUID);
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
    if (stage == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stage' was not present! Struct: " + toString());
    }
    if (localHost == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'localHost' was not present! Struct: " + toString());
    }
    if (contextPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'contextPath' was not present! Struct: " + toString());
    }
    if (servletPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'servletPath' was not present! Struct: " + toString());
    }
    if (frestoUUID == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'frestoUUID' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
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

  private static class HttpRequestEventStandardSchemeFactory implements SchemeFactory {
    public HttpRequestEventStandardScheme getScheme() {
      return new HttpRequestEventStandardScheme();
    }
  }

  private static class HttpRequestEventStandardScheme extends StandardScheme<HttpRequestEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HttpRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stage = iprot.readString();
              struct.setStageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HTTP_METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.httpMethod = iprot.readString();
              struct.setHttpMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LOCAL_HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.localHost = iprot.readString();
              struct.setLocalHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LOCAL_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.localPort = iprot.readString();
              struct.setLocalPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // CONTEXT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contextPath = iprot.readString();
              struct.setContextPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // SERVLET_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.servletPath = iprot.readString();
              struct.setServletPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // FRESTO_UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.frestoUUID = iprot.readString();
              struct.setFrestoUUIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 15: // TIMESTAMP
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
      if (!struct.isSetTimestamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HttpRequestEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stage != null) {
        oprot.writeFieldBegin(STAGE_FIELD_DESC);
        oprot.writeString(struct.stage);
        oprot.writeFieldEnd();
      }
      if (struct.httpMethod != null) {
        if (struct.isSetHttpMethod()) {
          oprot.writeFieldBegin(HTTP_METHOD_FIELD_DESC);
          oprot.writeString(struct.httpMethod);
          oprot.writeFieldEnd();
        }
      }
      if (struct.localHost != null) {
        oprot.writeFieldBegin(LOCAL_HOST_FIELD_DESC);
        oprot.writeString(struct.localHost);
        oprot.writeFieldEnd();
      }
      if (struct.localPort != null) {
        if (struct.isSetLocalPort()) {
          oprot.writeFieldBegin(LOCAL_PORT_FIELD_DESC);
          oprot.writeString(struct.localPort);
          oprot.writeFieldEnd();
        }
      }
      if (struct.contextPath != null) {
        oprot.writeFieldBegin(CONTEXT_PATH_FIELD_DESC);
        oprot.writeString(struct.contextPath);
        oprot.writeFieldEnd();
      }
      if (struct.servletPath != null) {
        oprot.writeFieldBegin(SERVLET_PATH_FIELD_DESC);
        oprot.writeString(struct.servletPath);
        oprot.writeFieldEnd();
      }
      if (struct.frestoUUID != null) {
        oprot.writeFieldBegin(FRESTO_UUID_FIELD_DESC);
        oprot.writeString(struct.frestoUUID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HttpRequestEventTupleSchemeFactory implements SchemeFactory {
    public HttpRequestEventTupleScheme getScheme() {
      return new HttpRequestEventTupleScheme();
    }
  }

  private static class HttpRequestEventTupleScheme extends TupleScheme<HttpRequestEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HttpRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.stage);
      oprot.writeString(struct.localHost);
      oprot.writeString(struct.contextPath);
      oprot.writeString(struct.servletPath);
      oprot.writeString(struct.frestoUUID);
      oprot.writeI64(struct.timestamp);
      BitSet optionals = new BitSet();
      if (struct.isSetHttpMethod()) {
        optionals.set(0);
      }
      if (struct.isSetLocalPort()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHttpMethod()) {
        oprot.writeString(struct.httpMethod);
      }
      if (struct.isSetLocalPort()) {
        oprot.writeString(struct.localPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HttpRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.stage = iprot.readString();
      struct.setStageIsSet(true);
      struct.localHost = iprot.readString();
      struct.setLocalHostIsSet(true);
      struct.contextPath = iprot.readString();
      struct.setContextPathIsSet(true);
      struct.servletPath = iprot.readString();
      struct.setServletPathIsSet(true);
      struct.frestoUUID = iprot.readString();
      struct.setFrestoUUIDIsSet(true);
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.httpMethod = iprot.readString();
        struct.setHttpMethodIsSet(true);
      }
      if (incoming.get(1)) {
        struct.localPort = iprot.readString();
        struct.setLocalPortIsSet(true);
      }
    }
  }

}

