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

public class ManageResourceEdge implements org.apache.thrift.TBase<ManageResourceEdge, ManageResourceEdge._Fields>, java.io.Serializable, Cloneable, Comparable<ManageResourceEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ManageResourceEdge");

  private static final org.apache.thrift.protocol.TField APPLICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("application", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MANAGED_RESOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("managed_resource", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ManageResourceEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ManageResourceEdgeTupleSchemeFactory());
  }

  public ApplicationID application; // required
  public ManagedResourceID managed_resource; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APPLICATION((short)1, "application"),
    MANAGED_RESOURCE((short)2, "managed_resource");

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
        case 1: // APPLICATION
          return APPLICATION;
        case 2: // MANAGED_RESOURCE
          return MANAGED_RESOURCE;
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
    tmpMap.put(_Fields.APPLICATION, new org.apache.thrift.meta_data.FieldMetaData("application", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ApplicationID.class)));
    tmpMap.put(_Fields.MANAGED_RESOURCE, new org.apache.thrift.meta_data.FieldMetaData("managed_resource", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ManagedResourceID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ManageResourceEdge.class, metaDataMap);
  }

  public ManageResourceEdge() {
  }

  public ManageResourceEdge(
    ApplicationID application,
    ManagedResourceID managed_resource)
  {
    this();
    this.application = application;
    this.managed_resource = managed_resource;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ManageResourceEdge(ManageResourceEdge other) {
    if (other.isSetApplication()) {
      this.application = new ApplicationID(other.application);
    }
    if (other.isSetManaged_resource()) {
      this.managed_resource = new ManagedResourceID(other.managed_resource);
    }
  }

  public ManageResourceEdge deepCopy() {
    return new ManageResourceEdge(this);
  }

  @Override
  public void clear() {
    this.application = null;
    this.managed_resource = null;
  }

  public ApplicationID getApplication() {
    return this.application;
  }

  public ManageResourceEdge setApplication(ApplicationID application) {
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

  public ManageResourceEdge setManaged_resource(ManagedResourceID managed_resource) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
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

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APPLICATION:
      return getApplication();

    case MANAGED_RESOURCE:
      return getManaged_resource();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APPLICATION:
      return isSetApplication();
    case MANAGED_RESOURCE:
      return isSetManaged_resource();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ManageResourceEdge)
      return this.equals((ManageResourceEdge)that);
    return false;
  }

  public boolean equals(ManageResourceEdge that) {
    if (that == null)
      return false;

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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ManageResourceEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    StringBuilder sb = new StringBuilder("ManageResourceEdge(");
    boolean first = true;

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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (application == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'application' was not present! Struct: " + toString());
    }
    if (managed_resource == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'managed_resource' was not present! Struct: " + toString());
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

  private static class ManageResourceEdgeStandardSchemeFactory implements SchemeFactory {
    public ManageResourceEdgeStandardScheme getScheme() {
      return new ManageResourceEdgeStandardScheme();
    }
  }

  private static class ManageResourceEdgeStandardScheme extends StandardScheme<ManageResourceEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ManageResourceEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APPLICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.application = new ApplicationID();
              struct.application.read(iprot);
              struct.setApplicationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MANAGED_RESOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.managed_resource = new ManagedResourceID();
              struct.managed_resource.read(iprot);
              struct.setManaged_resourceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ManageResourceEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ManageResourceEdgeTupleSchemeFactory implements SchemeFactory {
    public ManageResourceEdgeTupleScheme getScheme() {
      return new ManageResourceEdgeTupleScheme();
    }
  }

  private static class ManageResourceEdgeTupleScheme extends TupleScheme<ManageResourceEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ManageResourceEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.application.write(oprot);
      struct.managed_resource.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ManageResourceEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.application = new ApplicationID();
      struct.application.read(iprot);
      struct.setApplicationIsSet(true);
      struct.managed_resource = new ManagedResourceID();
      struct.managed_resource.read(iprot);
      struct.setManaged_resourceIsSet(true);
    }
  }

}

