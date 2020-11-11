/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package MMIStandard;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-02")
public class MMesh implements org.apache.thrift.TBase<MMesh, MMesh._Fields>, java.io.Serializable, Cloneable, Comparable<MMesh> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MMesh");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERTICES_FIELD_DESC = new org.apache.thrift.protocol.TField("Vertices", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TRIANGLES_FIELD_DESC = new org.apache.thrift.protocol.TField("Triangles", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("Properties", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MMeshStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MMeshTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String ID; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<MMIStandard.MVector3> Vertices; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> Triangles; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> Properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "ID"),
    VERTICES((short)2, "Vertices"),
    TRIANGLES((short)3, "Triangles"),
    PROPERTIES((short)4, "Properties");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // VERTICES
          return VERTICES;
        case 3: // TRIANGLES
          return TRIANGLES;
        case 4: // PROPERTIES
          return PROPERTIES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("ID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERTICES, new org.apache.thrift.meta_data.FieldMetaData("Vertices", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MMIStandard.MVector3.class))));
    tmpMap.put(_Fields.TRIANGLES, new org.apache.thrift.meta_data.FieldMetaData("Triangles", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("Properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MMesh.class, metaDataMap);
  }

  public MMesh() {
  }

  public MMesh(
    java.lang.String ID,
    java.util.List<MMIStandard.MVector3> Vertices,
    java.util.List<java.lang.Integer> Triangles)
  {
    this();
    this.ID = ID;
    this.Vertices = Vertices;
    this.Triangles = Triangles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MMesh(MMesh other) {
    if (other.isSetID()) {
      this.ID = other.ID;
    }
    if (other.isSetVertices()) {
      java.util.List<MMIStandard.MVector3> __this__Vertices = new java.util.ArrayList<MMIStandard.MVector3>(other.Vertices.size());
      for (MMIStandard.MVector3 other_element : other.Vertices) {
        __this__Vertices.add(new MMIStandard.MVector3(other_element));
      }
      this.Vertices = __this__Vertices;
    }
    if (other.isSetTriangles()) {
      java.util.List<java.lang.Integer> __this__Triangles = new java.util.ArrayList<java.lang.Integer>(other.Triangles);
      this.Triangles = __this__Triangles;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__Properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.Properties);
      this.Properties = __this__Properties;
    }
  }

  public MMesh deepCopy() {
    return new MMesh(this);
  }

  @Override
  public void clear() {
    this.ID = null;
    this.Vertices = null;
    this.Triangles = null;
    this.Properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getID() {
    return this.ID;
  }

  public MMesh setID(@org.apache.thrift.annotation.Nullable java.lang.String ID) {
    this.ID = ID;
    return this;
  }

  public void unsetID() {
    this.ID = null;
  }

  /** Returns true if field ID is set (has been assigned a value) and false otherwise */
  public boolean isSetID() {
    return this.ID != null;
  }

  public void setIDIsSet(boolean value) {
    if (!value) {
      this.ID = null;
    }
  }

  public int getVerticesSize() {
    return (this.Vertices == null) ? 0 : this.Vertices.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<MMIStandard.MVector3> getVerticesIterator() {
    return (this.Vertices == null) ? null : this.Vertices.iterator();
  }

  public void addToVertices(MMIStandard.MVector3 elem) {
    if (this.Vertices == null) {
      this.Vertices = new java.util.ArrayList<MMIStandard.MVector3>();
    }
    this.Vertices.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<MMIStandard.MVector3> getVertices() {
    return this.Vertices;
  }

  public MMesh setVertices(@org.apache.thrift.annotation.Nullable java.util.List<MMIStandard.MVector3> Vertices) {
    this.Vertices = Vertices;
    return this;
  }

  public void unsetVertices() {
    this.Vertices = null;
  }

  /** Returns true if field Vertices is set (has been assigned a value) and false otherwise */
  public boolean isSetVertices() {
    return this.Vertices != null;
  }

  public void setVerticesIsSet(boolean value) {
    if (!value) {
      this.Vertices = null;
    }
  }

  public int getTrianglesSize() {
    return (this.Triangles == null) ? 0 : this.Triangles.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getTrianglesIterator() {
    return (this.Triangles == null) ? null : this.Triangles.iterator();
  }

  public void addToTriangles(int elem) {
    if (this.Triangles == null) {
      this.Triangles = new java.util.ArrayList<java.lang.Integer>();
    }
    this.Triangles.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getTriangles() {
    return this.Triangles;
  }

  public MMesh setTriangles(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> Triangles) {
    this.Triangles = Triangles;
    return this;
  }

  public void unsetTriangles() {
    this.Triangles = null;
  }

  /** Returns true if field Triangles is set (has been assigned a value) and false otherwise */
  public boolean isSetTriangles() {
    return this.Triangles != null;
  }

  public void setTrianglesIsSet(boolean value) {
    if (!value) {
      this.Triangles = null;
    }
  }

  public int getPropertiesSize() {
    return (this.Properties == null) ? 0 : this.Properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.Properties == null) {
      this.Properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.Properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.Properties;
  }

  public MMesh setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> Properties) {
    this.Properties = Properties;
    return this;
  }

  public void unsetProperties() {
    this.Properties = null;
  }

  /** Returns true if field Properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.Properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.Properties = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetID();
      } else {
        setID((java.lang.String)value);
      }
      break;

    case VERTICES:
      if (value == null) {
        unsetVertices();
      } else {
        setVertices((java.util.List<MMIStandard.MVector3>)value);
      }
      break;

    case TRIANGLES:
      if (value == null) {
        unsetTriangles();
      } else {
        setTriangles((java.util.List<java.lang.Integer>)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getID();

    case VERTICES:
      return getVertices();

    case TRIANGLES:
      return getTriangles();

    case PROPERTIES:
      return getProperties();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetID();
    case VERTICES:
      return isSetVertices();
    case TRIANGLES:
      return isSetTriangles();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MMesh)
      return this.equals((MMesh)that);
    return false;
  }

  public boolean equals(MMesh that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ID = true && this.isSetID();
    boolean that_present_ID = true && that.isSetID();
    if (this_present_ID || that_present_ID) {
      if (!(this_present_ID && that_present_ID))
        return false;
      if (!this.ID.equals(that.ID))
        return false;
    }

    boolean this_present_Vertices = true && this.isSetVertices();
    boolean that_present_Vertices = true && that.isSetVertices();
    if (this_present_Vertices || that_present_Vertices) {
      if (!(this_present_Vertices && that_present_Vertices))
        return false;
      if (!this.Vertices.equals(that.Vertices))
        return false;
    }

    boolean this_present_Triangles = true && this.isSetTriangles();
    boolean that_present_Triangles = true && that.isSetTriangles();
    if (this_present_Triangles || that_present_Triangles) {
      if (!(this_present_Triangles && that_present_Triangles))
        return false;
      if (!this.Triangles.equals(that.Triangles))
        return false;
    }

    boolean this_present_Properties = true && this.isSetProperties();
    boolean that_present_Properties = true && that.isSetProperties();
    if (this_present_Properties || that_present_Properties) {
      if (!(this_present_Properties && that_present_Properties))
        return false;
      if (!this.Properties.equals(that.Properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetID()) ? 131071 : 524287);
    if (isSetID())
      hashCode = hashCode * 8191 + ID.hashCode();

    hashCode = hashCode * 8191 + ((isSetVertices()) ? 131071 : 524287);
    if (isSetVertices())
      hashCode = hashCode * 8191 + Vertices.hashCode();

    hashCode = hashCode * 8191 + ((isSetTriangles()) ? 131071 : 524287);
    if (isSetTriangles())
      hashCode = hashCode * 8191 + Triangles.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + Properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MMesh other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetID()).compareTo(other.isSetID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVertices()).compareTo(other.isSetVertices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Vertices, other.Vertices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTriangles()).compareTo(other.isSetTriangles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriangles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Triangles, other.Triangles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Properties, other.Properties);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MMesh(");
    boolean first = true;

    sb.append("ID:");
    if (this.ID == null) {
      sb.append("null");
    } else {
      sb.append(this.ID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Vertices:");
    if (this.Vertices == null) {
      sb.append("null");
    } else {
      sb.append(this.Vertices);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Triangles:");
    if (this.Triangles == null) {
      sb.append("null");
    } else {
      sb.append(this.Triangles);
    }
    first = false;
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("Properties:");
      if (this.Properties == null) {
        sb.append("null");
      } else {
        sb.append(this.Properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ID == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ID' was not present! Struct: " + toString());
    }
    if (Vertices == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Vertices' was not present! Struct: " + toString());
    }
    if (Triangles == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Triangles' was not present! Struct: " + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MMeshStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMeshStandardScheme getScheme() {
      return new MMeshStandardScheme();
    }
  }

  private static class MMeshStandardScheme extends org.apache.thrift.scheme.StandardScheme<MMesh> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ID = iprot.readString();
              struct.setIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERTICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list72 = iprot.readListBegin();
                struct.Vertices = new java.util.ArrayList<MMIStandard.MVector3>(_list72.size);
                @org.apache.thrift.annotation.Nullable MMIStandard.MVector3 _elem73;
                for (int _i74 = 0; _i74 < _list72.size; ++_i74)
                {
                  _elem73 = new MMIStandard.MVector3();
                  _elem73.read(iprot);
                  struct.Vertices.add(_elem73);
                }
                iprot.readListEnd();
              }
              struct.setVerticesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRIANGLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list75 = iprot.readListBegin();
                struct.Triangles = new java.util.ArrayList<java.lang.Integer>(_list75.size);
                int _elem76;
                for (int _i77 = 0; _i77 < _list75.size; ++_i77)
                {
                  _elem76 = iprot.readI32();
                  struct.Triangles.add(_elem76);
                }
                iprot.readListEnd();
              }
              struct.setTrianglesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map78 = iprot.readMapBegin();
                struct.Properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map78.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key79;
                @org.apache.thrift.annotation.Nullable java.lang.String _val80;
                for (int _i81 = 0; _i81 < _map78.size; ++_i81)
                {
                  _key79 = iprot.readString();
                  _val80 = iprot.readString();
                  struct.Properties.put(_key79, _val80);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MMesh struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ID != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.ID);
        oprot.writeFieldEnd();
      }
      if (struct.Vertices != null) {
        oprot.writeFieldBegin(VERTICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.Vertices.size()));
          for (MMIStandard.MVector3 _iter82 : struct.Vertices)
          {
            _iter82.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Triangles != null) {
        oprot.writeFieldBegin(TRIANGLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.Triangles.size()));
          for (int _iter83 : struct.Triangles)
          {
            oprot.writeI32(_iter83);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.Properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter84 : struct.Properties.entrySet())
            {
              oprot.writeString(_iter84.getKey());
              oprot.writeString(_iter84.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MMeshTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMeshTupleScheme getScheme() {
      return new MMeshTupleScheme();
    }
  }

  private static class MMeshTupleScheme extends org.apache.thrift.scheme.TupleScheme<MMesh> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.ID);
      {
        oprot.writeI32(struct.Vertices.size());
        for (MMIStandard.MVector3 _iter85 : struct.Vertices)
        {
          _iter85.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.Triangles.size());
        for (int _iter86 : struct.Triangles)
        {
          oprot.writeI32(_iter86);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProperties()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.Properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter87 : struct.Properties.entrySet())
          {
            oprot.writeString(_iter87.getKey());
            oprot.writeString(_iter87.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.ID = iprot.readString();
      struct.setIDIsSet(true);
      {
        org.apache.thrift.protocol.TList _list88 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.Vertices = new java.util.ArrayList<MMIStandard.MVector3>(_list88.size);
        @org.apache.thrift.annotation.Nullable MMIStandard.MVector3 _elem89;
        for (int _i90 = 0; _i90 < _list88.size; ++_i90)
        {
          _elem89 = new MMIStandard.MVector3();
          _elem89.read(iprot);
          struct.Vertices.add(_elem89);
        }
      }
      struct.setVerticesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list91 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.Triangles = new java.util.ArrayList<java.lang.Integer>(_list91.size);
        int _elem92;
        for (int _i93 = 0; _i93 < _list91.size; ++_i93)
        {
          _elem92 = iprot.readI32();
          struct.Triangles.add(_elem92);
        }
      }
      struct.setTrianglesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map94 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.Properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map94.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key95;
          @org.apache.thrift.annotation.Nullable java.lang.String _val96;
          for (int _i97 = 0; _i97 < _map94.size; ++_i97)
          {
            _key95 = iprot.readString();
            _val96 = iprot.readString();
            struct.Properties.put(_key95, _val96);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
