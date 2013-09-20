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

public class EntryInvokeEdge implements org.apache.thrift.TBase<EntryInvokeEdge, EntryInvokeEdge._Fields>, java.io.Serializable, Cloneable, Comparable<EntryInvokeEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntryInvokeEdge");

  private static final org.apache.thrift.protocol.TField ENTRY_INVOKE_FIELD_DESC = new org.apache.thrift.protocol.TField("entry_invoke", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("operation", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntryInvokeEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntryInvokeEdgeTupleSchemeFactory());
  }

  public EntryInvokeID entry_invoke; // required
  public OperationID operation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTRY_INVOKE((short)1, "entry_invoke"),
    OPERATION((short)2, "operation");

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
        case 1: // ENTRY_INVOKE
          return ENTRY_INVOKE;
        case 2: // OPERATION
          return OPERATION;
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
    tmpMap.put(_Fields.ENTRY_INVOKE, new org.apache.thrift.meta_data.FieldMetaData("entry_invoke", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EntryInvokeID.class)));
    tmpMap.put(_Fields.OPERATION, new org.apache.thrift.meta_data.FieldMetaData("operation", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OperationID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntryInvokeEdge.class, metaDataMap);
  }

  public EntryInvokeEdge() {
  }

  public EntryInvokeEdge(
    EntryInvokeID entry_invoke,
    OperationID operation)
  {
    this();
    this.entry_invoke = entry_invoke;
    this.operation = operation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntryInvokeEdge(EntryInvokeEdge other) {
    if (other.isSetEntry_invoke()) {
      this.entry_invoke = new EntryInvokeID(other.entry_invoke);
    }
    if (other.isSetOperation()) {
      this.operation = new OperationID(other.operation);
    }
  }

  public EntryInvokeEdge deepCopy() {
    return new EntryInvokeEdge(this);
  }

  @Override
  public void clear() {
    this.entry_invoke = null;
    this.operation = null;
  }

  public EntryInvokeID getEntry_invoke() {
    return this.entry_invoke;
  }

  public EntryInvokeEdge setEntry_invoke(EntryInvokeID entry_invoke) {
    this.entry_invoke = entry_invoke;
    return this;
  }

  public void unsetEntry_invoke() {
    this.entry_invoke = null;
  }

  /** Returns true if field entry_invoke is set (has been assigned a value) and false otherwise */
  public boolean isSetEntry_invoke() {
    return this.entry_invoke != null;
  }

  public void setEntry_invokeIsSet(boolean value) {
    if (!value) {
      this.entry_invoke = null;
    }
  }

  public OperationID getOperation() {
    return this.operation;
  }

  public EntryInvokeEdge setOperation(OperationID operation) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTRY_INVOKE:
      if (value == null) {
        unsetEntry_invoke();
      } else {
        setEntry_invoke((EntryInvokeID)value);
      }
      break;

    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((OperationID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTRY_INVOKE:
      return getEntry_invoke();

    case OPERATION:
      return getOperation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTRY_INVOKE:
      return isSetEntry_invoke();
    case OPERATION:
      return isSetOperation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntryInvokeEdge)
      return this.equals((EntryInvokeEdge)that);
    return false;
  }

  public boolean equals(EntryInvokeEdge that) {
    if (that == null)
      return false;

    boolean this_present_entry_invoke = true && this.isSetEntry_invoke();
    boolean that_present_entry_invoke = true && that.isSetEntry_invoke();
    if (this_present_entry_invoke || that_present_entry_invoke) {
      if (!(this_present_entry_invoke && that_present_entry_invoke))
        return false;
      if (!this.entry_invoke.equals(that.entry_invoke))
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EntryInvokeEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntry_invoke()).compareTo(other.isSetEntry_invoke());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntry_invoke()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entry_invoke, other.entry_invoke);
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
    StringBuilder sb = new StringBuilder("EntryInvokeEdge(");
    boolean first = true;

    sb.append("entry_invoke:");
    if (this.entry_invoke == null) {
      sb.append("null");
    } else {
      sb.append(this.entry_invoke);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (entry_invoke == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'entry_invoke' was not present! Struct: " + toString());
    }
    if (operation == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'operation' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntryInvokeEdgeStandardSchemeFactory implements SchemeFactory {
    public EntryInvokeEdgeStandardScheme getScheme() {
      return new EntryInvokeEdgeStandardScheme();
    }
  }

  private static class EntryInvokeEdgeStandardScheme extends StandardScheme<EntryInvokeEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntryInvokeEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTRY_INVOKE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entry_invoke = new EntryInvokeID();
              struct.entry_invoke.read(iprot);
              struct.setEntry_invokeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.operation = new OperationID();
              struct.operation.read(iprot);
              struct.setOperationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntryInvokeEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.entry_invoke != null) {
        oprot.writeFieldBegin(ENTRY_INVOKE_FIELD_DESC);
        struct.entry_invoke.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.operation != null) {
        oprot.writeFieldBegin(OPERATION_FIELD_DESC);
        struct.operation.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntryInvokeEdgeTupleSchemeFactory implements SchemeFactory {
    public EntryInvokeEdgeTupleScheme getScheme() {
      return new EntryInvokeEdgeTupleScheme();
    }
  }

  private static class EntryInvokeEdgeTupleScheme extends TupleScheme<EntryInvokeEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntryInvokeEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.entry_invoke.write(oprot);
      struct.operation.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntryInvokeEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.entry_invoke = new EntryInvokeID();
      struct.entry_invoke.read(iprot);
      struct.setEntry_invokeIsSet(true);
      struct.operation = new OperationID();
      struct.operation.read(iprot);
      struct.setOperationIsSet(true);
    }
  }

}
