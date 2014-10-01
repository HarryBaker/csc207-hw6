package edu.grinnell.csc207.bakerjoh.layout;

public class BlockPair
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  /*
   * The TextBlock modified
   */

  TextBlock tb;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /*
   * Creates a new TextBlock by adding a given block's pair next to it
   */

  public BlockPair(TextBlock tb)
  {
    this.tb = tb;
  }//BlockPair (TextBlock)
  
  // +--------------+------------------------------------------------------
  // | Methods      |
  // +--------------+
  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception
   *              if the precondition is not met
   */

  public String row(int i)
    throws Exception
  {
    String result = this.tb.row(i);
    if ((i >= 0) & (i <= this.tb.height()))
      {
        result = result.concat(result);
      }//if
    else
      {
        throw new Exception("Invalid Row" + i);
      }//else
    return result;
  }//row (int)

  /*
   * Determines how many rows are in the block
   */
  public int height()
  {
    return this.tb.height();
  }//height()
  /*
   * Determines how many columns are in the block
   */

  public int width()
  {
    return (this.tb.width() * 2);
  }//width
}//class BlockPair
