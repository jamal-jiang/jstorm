/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

public class TaskMetricData implements org.apache.thrift7.TBase<TaskMetricData, TaskMetricData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("TaskMetricData");

  private static final org.apache.thrift7.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("task_id", org.apache.thrift7.protocol.TType.I32, (short)1);
  private static final org.apache.thrift7.protocol.TField COMPONENT_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("component_id", org.apache.thrift7.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift7.protocol.TField GAUGE_FIELD_DESC = new org.apache.thrift7.protocol.TField("gauge", org.apache.thrift7.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift7.protocol.TField COUNTER_FIELD_DESC = new org.apache.thrift7.protocol.TField("counter", org.apache.thrift7.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift7.protocol.TField METER_FIELD_DESC = new org.apache.thrift7.protocol.TField("meter", org.apache.thrift7.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift7.protocol.TField TIMER_FIELD_DESC = new org.apache.thrift7.protocol.TField("timer", org.apache.thrift7.protocol.TType.MAP, (short)6);
  private static final org.apache.thrift7.protocol.TField HISTOGRAM_FIELD_DESC = new org.apache.thrift7.protocol.TField("histogram", org.apache.thrift7.protocol.TType.MAP, (short)7);

  private int task_id; // required
  private String component_id; // required
  private Map<String,Double> gauge; // required
  private Map<String,Double> counter; // required
  private Map<String,Double> meter; // required
  private Map<String,Double> timer; // required
  private Map<String,Double> histogram; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    TASK_ID((short)1, "task_id"),
    COMPONENT_ID((short)2, "component_id"),
    GAUGE((short)3, "gauge"),
    COUNTER((short)4, "counter"),
    METER((short)5, "meter"),
    TIMER((short)6, "timer"),
    HISTOGRAM((short)7, "histogram");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // COMPONENT_ID
          return COMPONENT_ID;
        case 3: // GAUGE
          return GAUGE;
        case 4: // COUNTER
          return COUNTER;
        case 5: // METER
          return METER;
        case 6: // TIMER
          return TIMER;
        case 7: // HISTOGRAM
          return HISTOGRAM;
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
  private static final int __TASK_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift7.meta_data.FieldMetaData("task_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPONENT_ID, new org.apache.thrift7.meta_data.FieldMetaData("component_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.GAUGE, new org.apache.thrift7.meta_data.FieldMetaData("gauge", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.COUNTER, new org.apache.thrift7.meta_data.FieldMetaData("counter", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.METER, new org.apache.thrift7.meta_data.FieldMetaData("meter", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.TIMER, new org.apache.thrift7.meta_data.FieldMetaData("timer", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.HISTOGRAM, new org.apache.thrift7.meta_data.FieldMetaData("histogram", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(TaskMetricData.class, metaDataMap);
  }

  public TaskMetricData() {
  }

  public TaskMetricData(
    int task_id,
    String component_id,
    Map<String,Double> gauge,
    Map<String,Double> counter,
    Map<String,Double> meter,
    Map<String,Double> timer,
    Map<String,Double> histogram)
  {
    this();
    this.task_id = task_id;
    set_task_id_isSet(true);
    this.component_id = component_id;
    this.gauge = gauge;
    this.counter = counter;
    this.meter = meter;
    this.timer = timer;
    this.histogram = histogram;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskMetricData(TaskMetricData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.task_id = other.task_id;
    if (other.is_set_component_id()) {
      this.component_id = other.component_id;
    }
    if (other.is_set_gauge()) {
      Map<String,Double> __this__gauge = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.gauge.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__gauge_copy_key = other_element_key;

        Double __this__gauge_copy_value = other_element_value;

        __this__gauge.put(__this__gauge_copy_key, __this__gauge_copy_value);
      }
      this.gauge = __this__gauge;
    }
    if (other.is_set_counter()) {
      Map<String,Double> __this__counter = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.counter.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__counter_copy_key = other_element_key;

        Double __this__counter_copy_value = other_element_value;

        __this__counter.put(__this__counter_copy_key, __this__counter_copy_value);
      }
      this.counter = __this__counter;
    }
    if (other.is_set_meter()) {
      Map<String,Double> __this__meter = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.meter.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__meter_copy_key = other_element_key;

        Double __this__meter_copy_value = other_element_value;

        __this__meter.put(__this__meter_copy_key, __this__meter_copy_value);
      }
      this.meter = __this__meter;
    }
    if (other.is_set_timer()) {
      Map<String,Double> __this__timer = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.timer.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__timer_copy_key = other_element_key;

        Double __this__timer_copy_value = other_element_value;

        __this__timer.put(__this__timer_copy_key, __this__timer_copy_value);
      }
      this.timer = __this__timer;
    }
    if (other.is_set_histogram()) {
      Map<String,Double> __this__histogram = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.histogram.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__histogram_copy_key = other_element_key;

        Double __this__histogram_copy_value = other_element_value;

        __this__histogram.put(__this__histogram_copy_key, __this__histogram_copy_value);
      }
      this.histogram = __this__histogram;
    }
  }

  public TaskMetricData deepCopy() {
    return new TaskMetricData(this);
  }

  @Override
  public void clear() {
    set_task_id_isSet(false);
    this.task_id = 0;
    this.component_id = null;
    this.gauge = null;
    this.counter = null;
    this.meter = null;
    this.timer = null;
    this.histogram = null;
  }

  public int get_task_id() {
    return this.task_id;
  }

  public void set_task_id(int task_id) {
    this.task_id = task_id;
    set_task_id_isSet(true);
  }

  public void unset_task_id() {
    __isset_bit_vector.clear(__TASK_ID_ISSET_ID);
  }

  /** Returns true if field task_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_task_id() {
    return __isset_bit_vector.get(__TASK_ID_ISSET_ID);
  }

  public void set_task_id_isSet(boolean value) {
    __isset_bit_vector.set(__TASK_ID_ISSET_ID, value);
  }

  public String get_component_id() {
    return this.component_id;
  }

  public void set_component_id(String component_id) {
    this.component_id = component_id;
  }

  public void unset_component_id() {
    this.component_id = null;
  }

  /** Returns true if field component_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_component_id() {
    return this.component_id != null;
  }

  public void set_component_id_isSet(boolean value) {
    if (!value) {
      this.component_id = null;
    }
  }

  public int get_gauge_size() {
    return (this.gauge == null) ? 0 : this.gauge.size();
  }

  public void put_to_gauge(String key, double val) {
    if (this.gauge == null) {
      this.gauge = new HashMap<String,Double>();
    }
    this.gauge.put(key, val);
  }

  public Map<String,Double> get_gauge() {
    return this.gauge;
  }

  public void set_gauge(Map<String,Double> gauge) {
    this.gauge = gauge;
  }

  public void unset_gauge() {
    this.gauge = null;
  }

  /** Returns true if field gauge is set (has been assigned a value) and false otherwise */
  public boolean is_set_gauge() {
    return this.gauge != null;
  }

  public void set_gauge_isSet(boolean value) {
    if (!value) {
      this.gauge = null;
    }
  }

  public int get_counter_size() {
    return (this.counter == null) ? 0 : this.counter.size();
  }

  public void put_to_counter(String key, double val) {
    if (this.counter == null) {
      this.counter = new HashMap<String,Double>();
    }
    this.counter.put(key, val);
  }

  public Map<String,Double> get_counter() {
    return this.counter;
  }

  public void set_counter(Map<String,Double> counter) {
    this.counter = counter;
  }

  public void unset_counter() {
    this.counter = null;
  }

  /** Returns true if field counter is set (has been assigned a value) and false otherwise */
  public boolean is_set_counter() {
    return this.counter != null;
  }

  public void set_counter_isSet(boolean value) {
    if (!value) {
      this.counter = null;
    }
  }

  public int get_meter_size() {
    return (this.meter == null) ? 0 : this.meter.size();
  }

  public void put_to_meter(String key, double val) {
    if (this.meter == null) {
      this.meter = new HashMap<String,Double>();
    }
    this.meter.put(key, val);
  }

  public Map<String,Double> get_meter() {
    return this.meter;
  }

  public void set_meter(Map<String,Double> meter) {
    this.meter = meter;
  }

  public void unset_meter() {
    this.meter = null;
  }

  /** Returns true if field meter is set (has been assigned a value) and false otherwise */
  public boolean is_set_meter() {
    return this.meter != null;
  }

  public void set_meter_isSet(boolean value) {
    if (!value) {
      this.meter = null;
    }
  }

  public int get_timer_size() {
    return (this.timer == null) ? 0 : this.timer.size();
  }

  public void put_to_timer(String key, double val) {
    if (this.timer == null) {
      this.timer = new HashMap<String,Double>();
    }
    this.timer.put(key, val);
  }

  public Map<String,Double> get_timer() {
    return this.timer;
  }

  public void set_timer(Map<String,Double> timer) {
    this.timer = timer;
  }

  public void unset_timer() {
    this.timer = null;
  }

  /** Returns true if field timer is set (has been assigned a value) and false otherwise */
  public boolean is_set_timer() {
    return this.timer != null;
  }

  public void set_timer_isSet(boolean value) {
    if (!value) {
      this.timer = null;
    }
  }

  public int get_histogram_size() {
    return (this.histogram == null) ? 0 : this.histogram.size();
  }

  public void put_to_histogram(String key, double val) {
    if (this.histogram == null) {
      this.histogram = new HashMap<String,Double>();
    }
    this.histogram.put(key, val);
  }

  public Map<String,Double> get_histogram() {
    return this.histogram;
  }

  public void set_histogram(Map<String,Double> histogram) {
    this.histogram = histogram;
  }

  public void unset_histogram() {
    this.histogram = null;
  }

  /** Returns true if field histogram is set (has been assigned a value) and false otherwise */
  public boolean is_set_histogram() {
    return this.histogram != null;
  }

  public void set_histogram_isSet(boolean value) {
    if (!value) {
      this.histogram = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unset_task_id();
      } else {
        set_task_id((Integer)value);
      }
      break;

    case COMPONENT_ID:
      if (value == null) {
        unset_component_id();
      } else {
        set_component_id((String)value);
      }
      break;

    case GAUGE:
      if (value == null) {
        unset_gauge();
      } else {
        set_gauge((Map<String,Double>)value);
      }
      break;

    case COUNTER:
      if (value == null) {
        unset_counter();
      } else {
        set_counter((Map<String,Double>)value);
      }
      break;

    case METER:
      if (value == null) {
        unset_meter();
      } else {
        set_meter((Map<String,Double>)value);
      }
      break;

    case TIMER:
      if (value == null) {
        unset_timer();
      } else {
        set_timer((Map<String,Double>)value);
      }
      break;

    case HISTOGRAM:
      if (value == null) {
        unset_histogram();
      } else {
        set_histogram((Map<String,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return Integer.valueOf(get_task_id());

    case COMPONENT_ID:
      return get_component_id();

    case GAUGE:
      return get_gauge();

    case COUNTER:
      return get_counter();

    case METER:
      return get_meter();

    case TIMER:
      return get_timer();

    case HISTOGRAM:
      return get_histogram();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return is_set_task_id();
    case COMPONENT_ID:
      return is_set_component_id();
    case GAUGE:
      return is_set_gauge();
    case COUNTER:
      return is_set_counter();
    case METER:
      return is_set_meter();
    case TIMER:
      return is_set_timer();
    case HISTOGRAM:
      return is_set_histogram();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskMetricData)
      return this.equals((TaskMetricData)that);
    return false;
  }

  public boolean equals(TaskMetricData that) {
    if (that == null)
      return false;

    boolean this_present_task_id = true;
    boolean that_present_task_id = true;
    if (this_present_task_id || that_present_task_id) {
      if (!(this_present_task_id && that_present_task_id))
        return false;
      if (this.task_id != that.task_id)
        return false;
    }

    boolean this_present_component_id = true && this.is_set_component_id();
    boolean that_present_component_id = true && that.is_set_component_id();
    if (this_present_component_id || that_present_component_id) {
      if (!(this_present_component_id && that_present_component_id))
        return false;
      if (!this.component_id.equals(that.component_id))
        return false;
    }

    boolean this_present_gauge = true && this.is_set_gauge();
    boolean that_present_gauge = true && that.is_set_gauge();
    if (this_present_gauge || that_present_gauge) {
      if (!(this_present_gauge && that_present_gauge))
        return false;
      if (!this.gauge.equals(that.gauge))
        return false;
    }

    boolean this_present_counter = true && this.is_set_counter();
    boolean that_present_counter = true && that.is_set_counter();
    if (this_present_counter || that_present_counter) {
      if (!(this_present_counter && that_present_counter))
        return false;
      if (!this.counter.equals(that.counter))
        return false;
    }

    boolean this_present_meter = true && this.is_set_meter();
    boolean that_present_meter = true && that.is_set_meter();
    if (this_present_meter || that_present_meter) {
      if (!(this_present_meter && that_present_meter))
        return false;
      if (!this.meter.equals(that.meter))
        return false;
    }

    boolean this_present_timer = true && this.is_set_timer();
    boolean that_present_timer = true && that.is_set_timer();
    if (this_present_timer || that_present_timer) {
      if (!(this_present_timer && that_present_timer))
        return false;
      if (!this.timer.equals(that.timer))
        return false;
    }

    boolean this_present_histogram = true && this.is_set_histogram();
    boolean that_present_histogram = true && that.is_set_histogram();
    if (this_present_histogram || that_present_histogram) {
      if (!(this_present_histogram && that_present_histogram))
        return false;
      if (!this.histogram.equals(that.histogram))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_task_id = true;
    builder.append(present_task_id);
    if (present_task_id)
      builder.append(task_id);

    boolean present_component_id = true && (is_set_component_id());
    builder.append(present_component_id);
    if (present_component_id)
      builder.append(component_id);

    boolean present_gauge = true && (is_set_gauge());
    builder.append(present_gauge);
    if (present_gauge)
      builder.append(gauge);

    boolean present_counter = true && (is_set_counter());
    builder.append(present_counter);
    if (present_counter)
      builder.append(counter);

    boolean present_meter = true && (is_set_meter());
    builder.append(present_meter);
    if (present_meter)
      builder.append(meter);

    boolean present_timer = true && (is_set_timer());
    builder.append(present_timer);
    if (present_timer)
      builder.append(timer);

    boolean present_histogram = true && (is_set_histogram());
    builder.append(present_histogram);
    if (present_histogram)
      builder.append(histogram);

    return builder.toHashCode();
  }

  public int compareTo(TaskMetricData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TaskMetricData typedOther = (TaskMetricData)other;

    lastComparison = Boolean.valueOf(is_set_task_id()).compareTo(typedOther.is_set_task_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_task_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.task_id, typedOther.task_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_component_id()).compareTo(typedOther.is_set_component_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_component_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.component_id, typedOther.component_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_gauge()).compareTo(typedOther.is_set_gauge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_gauge()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.gauge, typedOther.gauge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_counter()).compareTo(typedOther.is_set_counter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_counter()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.counter, typedOther.counter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_meter()).compareTo(typedOther.is_set_meter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_meter()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.meter, typedOther.meter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_timer()).compareTo(typedOther.is_set_timer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_timer()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.timer, typedOther.timer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_histogram()).compareTo(typedOther.is_set_histogram());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_histogram()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.histogram, typedOther.histogram);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TASK_ID
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.task_id = iprot.readI32();
            set_task_id_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COMPONENT_ID
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.component_id = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // GAUGE
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map209 = iprot.readMapBegin();
              this.gauge = new HashMap<String,Double>(2*_map209.size);
              for (int _i210 = 0; _i210 < _map209.size; ++_i210)
              {
                String _key211; // required
                double _val212; // required
                _key211 = iprot.readString();
                _val212 = iprot.readDouble();
                this.gauge.put(_key211, _val212);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // COUNTER
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map213 = iprot.readMapBegin();
              this.counter = new HashMap<String,Double>(2*_map213.size);
              for (int _i214 = 0; _i214 < _map213.size; ++_i214)
              {
                String _key215; // required
                double _val216; // required
                _key215 = iprot.readString();
                _val216 = iprot.readDouble();
                this.counter.put(_key215, _val216);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // METER
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map217 = iprot.readMapBegin();
              this.meter = new HashMap<String,Double>(2*_map217.size);
              for (int _i218 = 0; _i218 < _map217.size; ++_i218)
              {
                String _key219; // required
                double _val220; // required
                _key219 = iprot.readString();
                _val220 = iprot.readDouble();
                this.meter.put(_key219, _val220);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // TIMER
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map221 = iprot.readMapBegin();
              this.timer = new HashMap<String,Double>(2*_map221.size);
              for (int _i222 = 0; _i222 < _map221.size; ++_i222)
              {
                String _key223; // required
                double _val224; // required
                _key223 = iprot.readString();
                _val224 = iprot.readDouble();
                this.timer.put(_key223, _val224);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // HISTOGRAM
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map225 = iprot.readMapBegin();
              this.histogram = new HashMap<String,Double>(2*_map225.size);
              for (int _i226 = 0; _i226 < _map225.size; ++_i226)
              {
                String _key227; // required
                double _val228; // required
                _key227 = iprot.readString();
                _val228 = iprot.readDouble();
                this.histogram.put(_key227, _val228);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
    oprot.writeI32(this.task_id);
    oprot.writeFieldEnd();
    if (this.component_id != null) {
      oprot.writeFieldBegin(COMPONENT_ID_FIELD_DESC);
      oprot.writeString(this.component_id);
      oprot.writeFieldEnd();
    }
    if (this.gauge != null) {
      oprot.writeFieldBegin(GAUGE_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, this.gauge.size()));
        for (Map.Entry<String, Double> _iter229 : this.gauge.entrySet())
        {
          oprot.writeString(_iter229.getKey());
          oprot.writeDouble(_iter229.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.counter != null) {
      oprot.writeFieldBegin(COUNTER_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, this.counter.size()));
        for (Map.Entry<String, Double> _iter230 : this.counter.entrySet())
        {
          oprot.writeString(_iter230.getKey());
          oprot.writeDouble(_iter230.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.meter != null) {
      oprot.writeFieldBegin(METER_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, this.meter.size()));
        for (Map.Entry<String, Double> _iter231 : this.meter.entrySet())
        {
          oprot.writeString(_iter231.getKey());
          oprot.writeDouble(_iter231.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.timer != null) {
      oprot.writeFieldBegin(TIMER_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, this.timer.size()));
        for (Map.Entry<String, Double> _iter232 : this.timer.entrySet())
        {
          oprot.writeString(_iter232.getKey());
          oprot.writeDouble(_iter232.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.histogram != null) {
      oprot.writeFieldBegin(HISTOGRAM_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, this.histogram.size()));
        for (Map.Entry<String, Double> _iter233 : this.histogram.entrySet())
        {
          oprot.writeString(_iter233.getKey());
          oprot.writeDouble(_iter233.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskMetricData(");
    boolean first = true;

    sb.append("task_id:");
    sb.append(this.task_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("component_id:");
    if (this.component_id == null) {
      sb.append("null");
    } else {
      sb.append(this.component_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gauge:");
    if (this.gauge == null) {
      sb.append("null");
    } else {
      sb.append(this.gauge);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("counter:");
    if (this.counter == null) {
      sb.append("null");
    } else {
      sb.append(this.counter);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("meter:");
    if (this.meter == null) {
      sb.append("null");
    } else {
      sb.append(this.meter);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timer:");
    if (this.timer == null) {
      sb.append("null");
    } else {
      sb.append(this.timer);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("histogram:");
    if (this.histogram == null) {
      sb.append("null");
    } else {
      sb.append(this.histogram);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_task_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'task_id' is unset! Struct:" + toString());
    }

    if (!is_set_component_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'component_id' is unset! Struct:" + toString());
    }

    if (!is_set_gauge()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'gauge' is unset! Struct:" + toString());
    }

    if (!is_set_counter()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'counter' is unset! Struct:" + toString());
    }

    if (!is_set_meter()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'meter' is unset! Struct:" + toString());
    }

    if (!is_set_timer()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'timer' is unset! Struct:" + toString());
    }

    if (!is_set_histogram()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'histogram' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
