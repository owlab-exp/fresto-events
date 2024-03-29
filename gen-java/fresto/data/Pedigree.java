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

public class Pedigree implements org.apache.thrift.TBase<Pedigree, Pedigree._Fields>, java.io.Serializable, Cloneable, Comparable<Pedigree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pedigree");

  private static final org.apache.thrift.protocol.TField RECEIVED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("receivedTime", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PedigreeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PedigreeTupleSchemeFactory());
  }

  public long receivedTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECEIVED_TIME((short)1, "receivedTime");

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
        case 1: // RECEIVED_TIME
          return RECEIVED_TIME;
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
  private static final int __RECEIVEDTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECEIVED_TIME, new org.apache.thrift.meta_data.FieldMetaData("receivedTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pedigree.class, metaDataMap);
  }

  public Pedigree() {
  }

  public Pedigree(
    long receivedTime)
  {
    this();
    this.receivedTime = receivedTime;
    setReceivedTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pedigree(Pedigree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.receivedTime = other.receivedTime;
  }

  public Pedigree deepCopy() {
    return new Pedigree(this);
  }

  @Override
  public void clear() {
    setReceivedTimeIsSet(false);
    this.receivedTime = 0;
  }

  public long getReceivedTime() {
    return this.receivedTime;
  }

  public Pedigree setReceivedTime(long receivedTime) {
    this.receivedTime = receivedTime;
    setReceivedTimeIsSet(true);
    return this;
  }

  public void unsetReceivedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVEDTIME_ISSET_ID);
  }

  /** Returns true if field receivedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetReceivedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVEDTIME_ISSET_ID);
  }

  public void setReceivedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVEDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECEIVED_TIME:
      if (value == null) {
        unsetReceivedTime();
      } else {
        setReceivedTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECEIVED_TIME:
      return Long.valueOf(getReceivedTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECEIVED_TIME:
      return isSetReceivedTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Pedigree)
      return this.equals((Pedigree)that);
    return false;
  }

  public boolean equals(Pedigree that) {
    if (that == null)
      return false;

    boolean this_present_receivedTime = true;
    boolean that_present_receivedTime = true;
    if (this_present_receivedTime || that_present_receivedTime) {
      if (!(this_present_receivedTime && that_present_receivedTime))
        return false;
      if (this.receivedTime != that.receivedTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Pedigree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReceivedTime()).compareTo(other.isSetReceivedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceivedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receivedTime, other.receivedTime);
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
    StringBuilder sb = new StringBuilder("Pedigree(");
    boolean first = true;

    sb.append("receivedTime:");
    sb.append(this.receivedTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'receivedTime' because it's a primitive and you chose the non-beans generator.
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

  private static class PedigreeStandardSchemeFactory implements SchemeFactory {
    public PedigreeStandardScheme getScheme() {
      return new PedigreeStandardScheme();
    }
  }

  private static class PedigreeStandardScheme extends StandardScheme<Pedigree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECEIVED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.receivedTime = iprot.readI64();
              struct.setReceivedTimeIsSet(true);
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
      if (!struct.isSetReceivedTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'receivedTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pedigree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RECEIVED_TIME_FIELD_DESC);
      oprot.writeI64(struct.receivedTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PedigreeTupleSchemeFactory implements SchemeFactory {
    public PedigreeTupleScheme getScheme() {
      return new PedigreeTupleScheme();
    }
  }

  private static class PedigreeTupleScheme extends TupleScheme<Pedigree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.receivedTime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.receivedTime = iprot.readI64();
      struct.setReceivedTimeIsSet(true);
    }
  }

}

