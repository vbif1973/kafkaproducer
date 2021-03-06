/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.epam.vtbbulpm.nci.avro.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NciChangeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3482146337672215224L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NciChangeEvent\",\"namespace\":\"com.epam.vtbbulpm.nci.avro.model\",\"fields\":[{\"name\":\"dict_name\",\"type\":\"string\"},{\"name\":\"key_name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"Type\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}],\"doc\":\"Event type\"},{\"name\":\"value\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NciChangeEvent> ENCODER =
      new BinaryMessageEncoder<NciChangeEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NciChangeEvent> DECODER =
      new BinaryMessageDecoder<NciChangeEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<NciChangeEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<NciChangeEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NciChangeEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this NciChangeEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a NciChangeEvent from a ByteBuffer. */
  public static NciChangeEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence dict_name;
  @Deprecated public java.lang.CharSequence key_name;
  /** Event type */
  @Deprecated public java.lang.Object type;
  @Deprecated public java.lang.CharSequence value;
  @Deprecated public long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NciChangeEvent() {}

  /**
   * All-args constructor.
   * @param dict_name The new value for dict_name
   * @param key_name The new value for key_name
   * @param type Event type
   * @param value The new value for value
   * @param timestamp The new value for timestamp
   */
  public NciChangeEvent(java.lang.CharSequence dict_name, java.lang.CharSequence key_name, java.lang.Object type, java.lang.CharSequence value, java.lang.Long timestamp) {
    this.dict_name = dict_name;
    this.key_name = key_name;
    this.type = type;
    this.value = value;
    this.timestamp = timestamp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dict_name;
    case 1: return key_name;
    case 2: return type;
    case 3: return value;
    case 4: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dict_name = (java.lang.CharSequence)value$; break;
    case 1: key_name = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.Object)value$; break;
    case 3: value = (java.lang.CharSequence)value$; break;
    case 4: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dict_name' field.
   * @return The value of the 'dict_name' field.
   */
  public java.lang.CharSequence getDictName() {
    return dict_name;
  }

  /**
   * Sets the value of the 'dict_name' field.
   * @param value the value to set.
   */
  public void setDictName(java.lang.CharSequence value) {
    this.dict_name = value;
  }

  /**
   * Gets the value of the 'key_name' field.
   * @return The value of the 'key_name' field.
   */
  public java.lang.CharSequence getKeyName() {
    return key_name;
  }

  /**
   * Sets the value of the 'key_name' field.
   * @param value the value to set.
   */
  public void setKeyName(java.lang.CharSequence value) {
    this.key_name = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return Event type
   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Event type
   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.CharSequence getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.CharSequence value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new NciChangeEvent RecordBuilder.
   * @return A new NciChangeEvent RecordBuilder
   */
  public static com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder newBuilder() {
    return new com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder();
  }

  /**
   * Creates a new NciChangeEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NciChangeEvent RecordBuilder
   */
  public static com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder newBuilder(com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder other) {
    return new com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder(other);
  }

  /**
   * Creates a new NciChangeEvent RecordBuilder by copying an existing NciChangeEvent instance.
   * @param other The existing instance to copy.
   * @return A new NciChangeEvent RecordBuilder
   */
  public static com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder newBuilder(com.epam.vtbbulpm.nci.avro.model.NciChangeEvent other) {
    return new com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder(other);
  }

  /**
   * RecordBuilder for NciChangeEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NciChangeEvent>
    implements org.apache.avro.data.RecordBuilder<NciChangeEvent> {

    private java.lang.CharSequence dict_name;
    private java.lang.CharSequence key_name;
    /** Event type */
    private java.lang.Object type;
    private java.lang.CharSequence value;
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dict_name)) {
        this.dict_name = data().deepCopy(fields()[0].schema(), other.dict_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.key_name)) {
        this.key_name = data().deepCopy(fields()[1].schema(), other.key_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing NciChangeEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.epam.vtbbulpm.nci.avro.model.NciChangeEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.dict_name)) {
        this.dict_name = data().deepCopy(fields()[0].schema(), other.dict_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.key_name)) {
        this.key_name = data().deepCopy(fields()[1].schema(), other.key_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'dict_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getDictName() {
      return dict_name;
    }

    /**
      * Sets the value of the 'dict_name' field.
      * @param value The value of 'dict_name'.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder setDictName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.dict_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dict_name' field has been set.
      * @return True if the 'dict_name' field has been set, false otherwise.
      */
    public boolean hasDictName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dict_name' field.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder clearDictName() {
      dict_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'key_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getKeyName() {
      return key_name;
    }

    /**
      * Sets the value of the 'key_name' field.
      * @param value The value of 'key_name'.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder setKeyName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.key_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'key_name' field has been set.
      * @return True if the 'key_name' field has been set, false otherwise.
      */
    public boolean hasKeyName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'key_name' field.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder clearKeyName() {
      key_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Event type
      * @return The value.
      */
    public java.lang.Object getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * Event type
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder setType(java.lang.Object value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Event type
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * Event type
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.CharSequence getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder setValue(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.value = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder clearValue() {
      value = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder setTimestamp(long value) {
      validate(fields()[4], value);
      this.timestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.epam.vtbbulpm.nci.avro.model.NciChangeEvent.Builder clearTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NciChangeEvent build() {
      try {
        NciChangeEvent record = new NciChangeEvent();
        record.dict_name = fieldSetFlags()[0] ? this.dict_name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.key_name = fieldSetFlags()[1] ? this.key_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.Object) defaultValue(fields()[2]);
        record.value = fieldSetFlags()[3] ? this.value : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.timestamp = fieldSetFlags()[4] ? this.timestamp : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NciChangeEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<NciChangeEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NciChangeEvent>
    READER$ = (org.apache.avro.io.DatumReader<NciChangeEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
