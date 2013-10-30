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

public class JdbcReturnEdge implements org.apache.thrift.TBase<JdbcReturnEdge, JdbcReturnEdge._Fields>, java.io.Serializable, Cloneable, Comparable<JdbcReturnEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JdbcReturnEdge");

  private static final org.apache.thrift.protocol.TField JDBC_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jdbcId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ELAPSED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("elapsedTime", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("sequence", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField DEPTH_FIELD_DESC = new org.apache.thrift.protocol.TField("depth", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JdbcReturnEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JdbcReturnEdgeTupleSchemeFactory());
  }

  public JdbcID jdbcId; // required
  public long timestamp; // required
  public int elapsedTime; // required
  public String uuid; // required
  public int sequence; // required
  public int depth; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JDBC_ID((short)1, "jdbcId"),
    TIMESTAMP((short)3, "timestamp"),
    ELAPSED_TIME((short)4, "elapsedTime"),
    UUID((short)5, "uuid"),
    SEQUENCE((short)6, "sequence"),
    DEPTH((short)7, "depth");

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
        case 1: // JDBC_ID
          return JDBC_ID;
        case 3: // TIMESTAMP
          return TIMESTAMP;
        case 4: // ELAPSED_TIME
          return ELAPSED_TIME;
        case 5: // UUID
          return UUID;
        case 6: // SEQUENCE
          return SEQUENCE;
        case 7: // DEPTH
          return DEPTH;
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
  private static final int __ELAPSEDTIME_ISSET_ID = 1;
  private static final int __SEQUENCE_ISSET_ID = 2;
  private static final int __DEPTH_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JDBC_ID, new org.apache.thrift.meta_data.FieldMetaData("jdbcId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JdbcID.class)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ELAPSED_TIME, new org.apache.thrift.meta_data.FieldMetaData("elapsedTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("sequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEPTH, new org.apache.thrift.meta_data.FieldMetaData("depth", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JdbcReturnEdge.class, metaDataMap);
  }

  public JdbcReturnEdge() {
  }

  public JdbcReturnEdge(
    JdbcID jdbcId,
    long timestamp,
    int elapsedTime,
    String uuid,
    int sequence,
    int depth)
  {
    this();
    this.jdbcId = jdbcId;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.elapsedTime = elapsedTime;
    setElapsedTimeIsSet(true);
    this.uuid = uuid;
    this.sequence = sequence;
    setSequenceIsSet(true);
    this.depth = depth;
    setDepthIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JdbcReturnEdge(JdbcReturnEdge other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJdbcId()) {
      this.jdbcId = new JdbcID(other.jdbcId);
    }
    this.timestamp = other.timestamp;
    this.elapsedTime = other.elapsedTime;
    if (other.isSetUuid()) {
      this.uuid = other.uuid;
    }
    this.sequence = other.sequence;
    this.depth = other.depth;
  }

  public JdbcReturnEdge deepCopy() {
    return new JdbcReturnEdge(this);
  }

  @Override
  public void clear() {
    this.jdbcId = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
    setElapsedTimeIsSet(false);
    this.elapsedTime = 0;
    this.uuid = null;
    setSequenceIsSet(false);
    this.sequence = 0;
    setDepthIsSet(false);
    this.depth = 0;
  }

  public JdbcID getJdbcId() {
    return this.jdbcId;
  }

  public JdbcReturnEdge setJdbcId(JdbcID jdbcId) {
    this.jdbcId = jdbcId;
    return this;
  }

  public void unsetJdbcId() {
    this.jdbcId = null;
  }

  /** Returns true if field jdbcId is set (has been assigned a value) and false otherwise */
  public boolean isSetJdbcId() {
    return this.jdbcId != null;
  }

  public void setJdbcIdIsSet(boolean value) {
    if (!value) {
      this.jdbcId = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public JdbcReturnEdge setTimestamp(long timestamp) {
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

  public int getElapsedTime() {
    return this.elapsedTime;
  }

  public JdbcReturnEdge setElapsedTime(int elapsedTime) {
    this.elapsedTime = elapsedTime;
    setElapsedTimeIsSet(true);
    return this;
  }

  public void unsetElapsedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ELAPSEDTIME_ISSET_ID);
  }

  /** Returns true if field elapsedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetElapsedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ELAPSEDTIME_ISSET_ID);
  }

  public void setElapsedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ELAPSEDTIME_ISSET_ID, value);
  }

  public String getUuid() {
    return this.uuid;
  }

  public JdbcReturnEdge setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public void unsetUuid() {
    this.uuid = null;
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return this.uuid != null;
  }

  public void setUuidIsSet(boolean value) {
    if (!value) {
      this.uuid = null;
    }
  }

  public int getSequence() {
    return this.sequence;
  }

  public JdbcReturnEdge setSequence(int sequence) {
    this.sequence = sequence;
    setSequenceIsSet(true);
    return this;
  }

  public void unsetSequence() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCE_ISSET_ID);
  }

  /** Returns true if field sequence is set (has been assigned a value) and false otherwise */
  public boolean isSetSequence() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCE_ISSET_ID);
  }

  public void setSequenceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCE_ISSET_ID, value);
  }

  public int getDepth() {
    return this.depth;
  }

  public JdbcReturnEdge setDepth(int depth) {
    this.depth = depth;
    setDepthIsSet(true);
    return this;
  }

  public void unsetDepth() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEPTH_ISSET_ID);
  }

  /** Returns true if field depth is set (has been assigned a value) and false otherwise */
  public boolean isSetDepth() {
    return EncodingUtils.testBit(__isset_bitfield, __DEPTH_ISSET_ID);
  }

  public void setDepthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEPTH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JDBC_ID:
      if (value == null) {
        unsetJdbcId();
      } else {
        setJdbcId((JdbcID)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case ELAPSED_TIME:
      if (value == null) {
        unsetElapsedTime();
      } else {
        setElapsedTime((Integer)value);
      }
      break;

    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((String)value);
      }
      break;

    case SEQUENCE:
      if (value == null) {
        unsetSequence();
      } else {
        setSequence((Integer)value);
      }
      break;

    case DEPTH:
      if (value == null) {
        unsetDepth();
      } else {
        setDepth((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JDBC_ID:
      return getJdbcId();

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case ELAPSED_TIME:
      return Integer.valueOf(getElapsedTime());

    case UUID:
      return getUuid();

    case SEQUENCE:
      return Integer.valueOf(getSequence());

    case DEPTH:
      return Integer.valueOf(getDepth());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JDBC_ID:
      return isSetJdbcId();
    case TIMESTAMP:
      return isSetTimestamp();
    case ELAPSED_TIME:
      return isSetElapsedTime();
    case UUID:
      return isSetUuid();
    case SEQUENCE:
      return isSetSequence();
    case DEPTH:
      return isSetDepth();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JdbcReturnEdge)
      return this.equals((JdbcReturnEdge)that);
    return false;
  }

  public boolean equals(JdbcReturnEdge that) {
    if (that == null)
      return false;

    boolean this_present_jdbcId = true && this.isSetJdbcId();
    boolean that_present_jdbcId = true && that.isSetJdbcId();
    if (this_present_jdbcId || that_present_jdbcId) {
      if (!(this_present_jdbcId && that_present_jdbcId))
        return false;
      if (!this.jdbcId.equals(that.jdbcId))
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

    boolean this_present_elapsedTime = true;
    boolean that_present_elapsedTime = true;
    if (this_present_elapsedTime || that_present_elapsedTime) {
      if (!(this_present_elapsedTime && that_present_elapsedTime))
        return false;
      if (this.elapsedTime != that.elapsedTime)
        return false;
    }

    boolean this_present_uuid = true && this.isSetUuid();
    boolean that_present_uuid = true && that.isSetUuid();
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (!this.uuid.equals(that.uuid))
        return false;
    }

    boolean this_present_sequence = true;
    boolean that_present_sequence = true;
    if (this_present_sequence || that_present_sequence) {
      if (!(this_present_sequence && that_present_sequence))
        return false;
      if (this.sequence != that.sequence)
        return false;
    }

    boolean this_present_depth = true;
    boolean that_present_depth = true;
    if (this_present_depth || that_present_depth) {
      if (!(this_present_depth && that_present_depth))
        return false;
      if (this.depth != that.depth)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(JdbcReturnEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJdbcId()).compareTo(other.isSetJdbcId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdbcId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdbcId, other.jdbcId);
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
    lastComparison = Boolean.valueOf(isSetElapsedTime()).compareTo(other.isSetElapsedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetElapsedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.elapsedTime, other.elapsedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequence()).compareTo(other.isSetSequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequence, other.sequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepth()).compareTo(other.isSetDepth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.depth, other.depth);
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
    StringBuilder sb = new StringBuilder("JdbcReturnEdge(");
    boolean first = true;

    sb.append("jdbcId:");
    if (this.jdbcId == null) {
      sb.append("null");
    } else {
      sb.append(this.jdbcId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("elapsedTime:");
    sb.append(this.elapsedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequence:");
    sb.append(this.sequence);
    first = false;
    if (!first) sb.append(", ");
    sb.append("depth:");
    sb.append(this.depth);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (jdbcId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jdbcId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'elapsedTime' because it's a primitive and you chose the non-beans generator.
    if (uuid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuid' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (jdbcId != null) {
      jdbcId.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JdbcReturnEdgeStandardSchemeFactory implements SchemeFactory {
    public JdbcReturnEdgeStandardScheme getScheme() {
      return new JdbcReturnEdgeStandardScheme();
    }
  }

  private static class JdbcReturnEdgeStandardScheme extends StandardScheme<JdbcReturnEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JdbcReturnEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JDBC_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jdbcId = new JdbcID();
              struct.jdbcId.read(iprot);
              struct.setJdbcIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ELAPSED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.elapsedTime = iprot.readI32();
              struct.setElapsedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uuid = iprot.readString();
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sequence = iprot.readI32();
              struct.setSequenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DEPTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.depth = iprot.readI32();
              struct.setDepthIsSet(true);
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
      if (!struct.isSetElapsedTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'elapsedTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JdbcReturnEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jdbcId != null) {
        oprot.writeFieldBegin(JDBC_ID_FIELD_DESC);
        struct.jdbcId.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ELAPSED_TIME_FIELD_DESC);
      oprot.writeI32(struct.elapsedTime);
      oprot.writeFieldEnd();
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        oprot.writeString(struct.uuid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEQUENCE_FIELD_DESC);
      oprot.writeI32(struct.sequence);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DEPTH_FIELD_DESC);
      oprot.writeI32(struct.depth);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JdbcReturnEdgeTupleSchemeFactory implements SchemeFactory {
    public JdbcReturnEdgeTupleScheme getScheme() {
      return new JdbcReturnEdgeTupleScheme();
    }
  }

  private static class JdbcReturnEdgeTupleScheme extends TupleScheme<JdbcReturnEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JdbcReturnEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.jdbcId.write(oprot);
      oprot.writeI64(struct.timestamp);
      oprot.writeI32(struct.elapsedTime);
      oprot.writeString(struct.uuid);
      BitSet optionals = new BitSet();
      if (struct.isSetSequence()) {
        optionals.set(0);
      }
      if (struct.isSetDepth()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSequence()) {
        oprot.writeI32(struct.sequence);
      }
      if (struct.isSetDepth()) {
        oprot.writeI32(struct.depth);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JdbcReturnEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jdbcId = new JdbcID();
      struct.jdbcId.read(iprot);
      struct.setJdbcIdIsSet(true);
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
      struct.elapsedTime = iprot.readI32();
      struct.setElapsedTimeIsSet(true);
      struct.uuid = iprot.readString();
      struct.setUuidIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sequence = iprot.readI32();
        struct.setSequenceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.depth = iprot.readI32();
        struct.setDepthIsSet(true);
      }
    }
  }

}

