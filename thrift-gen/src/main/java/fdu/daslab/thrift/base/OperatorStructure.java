/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fdu.daslab.thrift.base;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-10-11")
public enum OperatorStructure implements org.apache.thrift.TEnum {
  SOURCE(0),
  SINK(1),
  MAP(2),
  JOIN(3),
  FORK(4),
  OTHERS(5);

  private final int value;

  private OperatorStructure(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static OperatorStructure findByValue(int value) { 
    switch (value) {
      case 0:
        return SOURCE;
      case 1:
        return SINK;
      case 2:
        return MAP;
      case 3:
        return JOIN;
      case 4:
        return FORK;
      case 5:
        return OTHERS;
      default:
        return null;
    }
  }
}
