/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fresto.event.client;

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

public class RequestResourceEdge implements org.apache.thrift.TBase<RequestResourceEdge, RequestResourceEdge._Fields>, java.io.Serializable, Cloneable, Comparable<RequestResourceEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RequestResourceEdge");

  private static final org.apache.thrift.protocol.TField REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("request", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("resource", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestResourceEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestResourceEdgeTupleSchemeFactory());
  }

  public RequestID request; // required
  public ResourceID resource; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST((short)1, "request"),
    RESOURCE((short)2, "resource");

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
        case 1: // REQUEST
          return REQUEST;
        case 2: // RESOURCE
          return RESOURCE;
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
    tmpMap.put(_Fields.REQUEST, new org.apache.thrift.meta_data.FieldMetaData("request", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RequestID.class)));
    tmpMap.put(_Fields.RESOURCE, new org.apache.thrift.meta_data.FieldMetaData("resource", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResourceID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RequestResourceEdge.class, metaDataMap);
  }

  public RequestResourceEdge() {
  }

  public RequestResourceEdge(
    RequestID request,
    ResourceID resource)
  {
    this();
    this.request = request;
    this.resource = resource;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RequestResourceEdge(RequestResourceEdge other) {
    if (other.isSetRequest()) {
      this.request = new RequestID(other.request);
    }
    if (other.isSetResource()) {
      this.resource = new ResourceID(other.resource);
    }
  }

  public RequestResourceEdge deepCopy() {
    return new RequestResourceEdge(this);
  }

  @Override
  public void clear() {
    this.request = null;
    this.resource = null;
  }

  public RequestID getRequest() {
    return this.request;
  }

  public RequestResourceEdge setRequest(RequestID request) {
    this.request = request;
    return this;
  }

  public void unsetRequest() {
    this.request = null;
  }

  /** Returns true if field request is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest() {
    return this.request != null;
  }

  public void setRequestIsSet(boolean value) {
    if (!value) {
      this.request = null;
    }
  }

  public ResourceID getResource() {
    return this.resource;
  }

  public RequestResourceEdge setResource(ResourceID resource) {
    this.resource = resource;
    return this;
  }

  public void unsetResource() {
    this.resource = null;
  }

  /** Returns true if field resource is set (has been assigned a value) and false otherwise */
  public boolean isSetResource() {
    return this.resource != null;
  }

  public void setResourceIsSet(boolean value) {
    if (!value) {
      this.resource = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST:
      if (value == null) {
        unsetRequest();
      } else {
        setRequest((RequestID)value);
      }
      break;

    case RESOURCE:
      if (value == null) {
        unsetResource();
      } else {
        setResource((ResourceID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST:
      return getRequest();

    case RESOURCE:
      return getResource();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST:
      return isSetRequest();
    case RESOURCE:
      return isSetResource();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RequestResourceEdge)
      return this.equals((RequestResourceEdge)that);
    return false;
  }

  public boolean equals(RequestResourceEdge that) {
    if (that == null)
      return false;

    boolean this_present_request = true && this.isSetRequest();
    boolean that_present_request = true && that.isSetRequest();
    if (this_present_request || that_present_request) {
      if (!(this_present_request && that_present_request))
        return false;
      if (!this.request.equals(that.request))
        return false;
    }

    boolean this_present_resource = true && this.isSetResource();
    boolean that_present_resource = true && that.isSetResource();
    if (this_present_resource || that_present_resource) {
      if (!(this_present_resource && that_present_resource))
        return false;
      if (!this.resource.equals(that.resource))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(RequestResourceEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequest()).compareTo(other.isSetRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request, other.request);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResource()).compareTo(other.isSetResource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource, other.resource);
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
    StringBuilder sb = new StringBuilder("RequestResourceEdge(");
    boolean first = true;

    sb.append("request:");
    if (this.request == null) {
      sb.append("null");
    } else {
      sb.append(this.request);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resource:");
    if (this.resource == null) {
      sb.append("null");
    } else {
      sb.append(this.resource);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (request == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'request' was not present! Struct: " + toString());
    }
    if (resource == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resource' was not present! Struct: " + toString());
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

  private static class RequestResourceEdgeStandardSchemeFactory implements SchemeFactory {
    public RequestResourceEdgeStandardScheme getScheme() {
      return new RequestResourceEdgeStandardScheme();
    }
  }

  private static class RequestResourceEdgeStandardScheme extends StandardScheme<RequestResourceEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RequestResourceEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.request = new RequestID();
              struct.request.read(iprot);
              struct.setRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resource = new ResourceID();
              struct.resource.read(iprot);
              struct.setResourceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RequestResourceEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.request != null) {
        oprot.writeFieldBegin(REQUEST_FIELD_DESC);
        struct.request.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.resource != null) {
        oprot.writeFieldBegin(RESOURCE_FIELD_DESC);
        struct.resource.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestResourceEdgeTupleSchemeFactory implements SchemeFactory {
    public RequestResourceEdgeTupleScheme getScheme() {
      return new RequestResourceEdgeTupleScheme();
    }
  }

  private static class RequestResourceEdgeTupleScheme extends TupleScheme<RequestResourceEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RequestResourceEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.request.write(oprot);
      struct.resource.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RequestResourceEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.request = new RequestID();
      struct.request.read(iprot);
      struct.setRequestIsSet(true);
      struct.resource = new ResourceID();
      struct.resource.read(iprot);
      struct.setResourceIsSet(true);
    }
  }

}

