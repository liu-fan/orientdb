/* Generated By:JJTree: Do not edit this line. OUpdateRemoveItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OUpdateRemoveItem extends SimpleNode {
  public OUpdateRemoveItem(int id) {
    super(id);
  }

  public OUpdateRemoveItem(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=72e240d3dc1196fdea69e8fdc2bd69ca (do not edit this line) */