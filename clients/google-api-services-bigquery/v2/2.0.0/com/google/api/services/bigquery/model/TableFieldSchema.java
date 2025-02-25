/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.bigquery.model;

/**
 * Model definition for TableFieldSchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableFieldSchema extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] The categories attached to this field, used for field-level access control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Categories categories;

  /**
   * Optional. Collation specification of the field. It only can be set on string type field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collation;

  /**
   * Optional. A SQL expression to specify the default value for this field. It can only be set for
   * top level fields (columns). You can use struct or array expression to specify default value for
   * the entire struct or array. The valid SQL expressions are: - Literals for all data types,
   * including STRUCT and ARRAY. - Following functions: - CURRENT_TIMESTAMP - CURRENT_TIME -
   * CURRENT_DATE - CURRENT_DATETIME - GENERATE_UUID - RAND - SESSION_USER - ST_GEOGPOINT - Struct
   * or array composed with the above allowed functions, for example, [CURRENT_DATE(), DATE
   * '2020-01-01']
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultValueExpression;

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableFieldSchema> fields;

  /**
   * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not
   * specified, no maximum length constraint is imposed on this field. If type = "STRING", then
   * max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES",
   * then max_length represents the maximum number of bytes in this field. It is invalid to set this
   * field if type ≠ "STRING" and ≠ "BYTES".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxLength;

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 300
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyTags policyTags;

  /**
   * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of
   * digits in the fractional part in base 10) constraints for values of this field for NUMERIC or
   * BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If
   * precision and scale are not specified, no value range constraint is imposed on this field
   * insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be
   * in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S]
   * - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero):
   * [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type
   * = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤
   * precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is
   * specified but not scale (and thus scale is interpreted to be equal to zero): - If type =
   * "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is
   * specified but not precision, then it is invalid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long precision;

  /**
   * Optional. Rounding Mode specification of the field. It only can be set on NUMERIC or BIGNUMERIC
   * type fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roundingMode;

  /**
   * [Optional] See documentation for precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scale;

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN),
   * TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field
   * contains a nested schema) or STRUCT (same as RECORD).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Optional] The categories attached to this field, used for field-level access control.
   * @return value or {@code null} for none
   */
  public Categories getCategories() {
    return categories;
  }

  /**
   * [Optional] The categories attached to this field, used for field-level access control.
   * @param categories categories or {@code null} for none
   */
  public TableFieldSchema setCategories(Categories categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Optional. Collation specification of the field. It only can be set on string type field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCollation() {
    return collation;
  }

  /**
   * Optional. Collation specification of the field. It only can be set on string type field.
   * @param collation collation or {@code null} for none
   */
  public TableFieldSchema setCollation(java.lang.String collation) {
    this.collation = collation;
    return this;
  }

  /**
   * Optional. A SQL expression to specify the default value for this field. It can only be set for
   * top level fields (columns). You can use struct or array expression to specify default value for
   * the entire struct or array. The valid SQL expressions are: - Literals for all data types,
   * including STRUCT and ARRAY. - Following functions: - CURRENT_TIMESTAMP - CURRENT_TIME -
   * CURRENT_DATE - CURRENT_DATETIME - GENERATE_UUID - RAND - SESSION_USER - ST_GEOGPOINT - Struct
   * or array composed with the above allowed functions, for example, [CURRENT_DATE(), DATE
   * '2020-01-01']
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultValueExpression() {
    return defaultValueExpression;
  }

  /**
   * Optional. A SQL expression to specify the default value for this field. It can only be set for
   * top level fields (columns). You can use struct or array expression to specify default value for
   * the entire struct or array. The valid SQL expressions are: - Literals for all data types,
   * including STRUCT and ARRAY. - Following functions: - CURRENT_TIMESTAMP - CURRENT_TIME -
   * CURRENT_DATE - CURRENT_DATETIME - GENERATE_UUID - RAND - SESSION_USER - ST_GEOGPOINT - Struct
   * or array composed with the above allowed functions, for example, [CURRENT_DATE(), DATE
   * '2020-01-01']
   * @param defaultValueExpression defaultValueExpression or {@code null} for none
   */
  public TableFieldSchema setDefaultValueExpression(java.lang.String defaultValueExpression) {
    this.defaultValueExpression = defaultValueExpression;
    return this;
  }

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * @param description description or {@code null} for none
   */
  public TableFieldSchema setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * @return value or {@code null} for none
   */
  public java.util.List<TableFieldSchema> getFields() {
    return fields;
  }

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * @param fields fields or {@code null} for none
   */
  public TableFieldSchema setFields(java.util.List<TableFieldSchema> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not
   * specified, no maximum length constraint is imposed on this field. If type = "STRING", then
   * max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES",
   * then max_length represents the maximum number of bytes in this field. It is invalid to set this
   * field if type ≠ "STRING" and ≠ "BYTES".
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxLength() {
    return maxLength;
  }

  /**
   * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not
   * specified, no maximum length constraint is imposed on this field. If type = "STRING", then
   * max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES",
   * then max_length represents the maximum number of bytes in this field. It is invalid to set this
   * field if type ≠ "STRING" and ≠ "BYTES".
   * @param maxLength maxLength or {@code null} for none
   */
  public TableFieldSchema setMaxLength(java.lang.Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @param mode mode or {@code null} for none
   */
  public TableFieldSchema setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 300
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 300
   * characters.
   * @param name name or {@code null} for none
   */
  public TableFieldSchema setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PolicyTags getPolicyTags() {
    return policyTags;
  }

  /**
   * @param policyTags policyTags or {@code null} for none
   */
  public TableFieldSchema setPolicyTags(PolicyTags policyTags) {
    this.policyTags = policyTags;
    return this;
  }

  /**
   * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of
   * digits in the fractional part in base 10) constraints for values of this field for NUMERIC or
   * BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If
   * precision and scale are not specified, no value range constraint is imposed on this field
   * insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be
   * in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S]
   * - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero):
   * [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type
   * = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤
   * precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is
   * specified but not scale (and thus scale is interpreted to be equal to zero): - If type =
   * "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is
   * specified but not precision, then it is invalid.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrecision() {
    return precision;
  }

  /**
   * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of
   * digits in the fractional part in base 10) constraints for values of this field for NUMERIC or
   * BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If
   * precision and scale are not specified, no value range constraint is imposed on this field
   * insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be
   * in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S]
   * - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero):
   * [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type
   * = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤
   * precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is
   * specified but not scale (and thus scale is interpreted to be equal to zero): - If type =
   * "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is
   * specified but not precision, then it is invalid.
   * @param precision precision or {@code null} for none
   */
  public TableFieldSchema setPrecision(java.lang.Long precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Optional. Rounding Mode specification of the field. It only can be set on NUMERIC or BIGNUMERIC
   * type fields.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoundingMode() {
    return roundingMode;
  }

  /**
   * Optional. Rounding Mode specification of the field. It only can be set on NUMERIC or BIGNUMERIC
   * type fields.
   * @param roundingMode roundingMode or {@code null} for none
   */
  public TableFieldSchema setRoundingMode(java.lang.String roundingMode) {
    this.roundingMode = roundingMode;
    return this;
  }

  /**
   * [Optional] See documentation for precision.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScale() {
    return scale;
  }

  /**
   * [Optional] See documentation for precision.
   * @param scale scale or {@code null} for none
   */
  public TableFieldSchema setScale(java.lang.Long scale) {
    this.scale = scale;
    return this;
  }

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN),
   * TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field
   * contains a nested schema) or STRUCT (same as RECORD).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN),
   * TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field
   * contains a nested schema) or STRUCT (same as RECORD).
   * @param type type or {@code null} for none
   */
  public TableFieldSchema setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TableFieldSchema set(String fieldName, Object value) {
    return (TableFieldSchema) super.set(fieldName, value);
  }

  @Override
  public TableFieldSchema clone() {
    return (TableFieldSchema) super.clone();
  }

  /**
   * [Optional] The categories attached to this field, used for field-level access control.
   */
  public static final class Categories extends com.google.api.client.json.GenericJson {

    /**
     * A list of category resource names. For example, "projects/1/taxonomies/2/categories/3". At most
     * 5 categories are allowed.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> names;

    /**
     * A list of category resource names. For example, "projects/1/taxonomies/2/categories/3". At most
     * 5 categories are allowed.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getNames() {
      return names;
    }

    /**
     * A list of category resource names. For example, "projects/1/taxonomies/2/categories/3". At most
     * 5 categories are allowed.
     * @param names names or {@code null} for none
     */
    public Categories setNames(java.util.List<java.lang.String> names) {
      this.names = names;
      return this;
    }

    @Override
    public Categories set(String fieldName, Object value) {
      return (Categories) super.set(fieldName, value);
    }

    @Override
    public Categories clone() {
      return (Categories) super.clone();
    }

  }

  /**
   * Model definition for TableFieldSchemaPolicyTags.
   */
  public static final class PolicyTags extends com.google.api.client.json.GenericJson {

    /**
     * A list of category resource names. For example,
     * "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> names;

    /**
     * A list of category resource names. For example,
     * "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getNames() {
      return names;
    }

    /**
     * A list of category resource names. For example,
     * "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed.
     * @param names names or {@code null} for none
     */
    public PolicyTags setNames(java.util.List<java.lang.String> names) {
      this.names = names;
      return this;
    }

    @Override
    public PolicyTags set(String fieldName, Object value) {
      return (PolicyTags) super.set(fieldName, value);
    }

    @Override
    public PolicyTags clone() {
      return (PolicyTags) super.clone();
    }

  }

}
