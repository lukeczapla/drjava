package edu.rice.cs.drjava.model.repl.types;

import edu.rice.cs.drjava.model.repl.newjvm.*;

/**
 * Class PrimitiveType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Thu Oct 16 08:57:12 CDT 2014
 */
//@SuppressWarnings("unused")
public abstract class PrimitiveType extends ValidType {

  /**
   * Constructs a PrimitiveType.
   * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
   */
  public PrimitiveType() {
    super();
  }


  public abstract int generateHashCode();
}