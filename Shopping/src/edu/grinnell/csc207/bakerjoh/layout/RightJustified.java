package edu.grinnell.csc207.bakerjoh.layout;

public class RightJustified
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /*
   * Block given to justify
   */
  TextBlock tb;

  /*
   * Width of the new block
   */
  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 

  /*
   * Creates new block by right justifying the given one
   */

  public RightJustified(TextBlock tb, int width)
  {
    this.tb = tb;
    this.width = width;
  }//RightJustified(TextBlock, int)

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
    String result;
    String space1;
    if ((i >= 0) & (i <= this.tb.height()))
      {
        if (this.width < this.tb.row(i).length())
          {
            throw new Exception("Invalid Width" + this.width);
          }//if
        else
          {
            space1 = TBUtils.spaces(this.width - this.tb.row(i).length());
            result = space1.concat(this.tb.row(i));
          }//else
      }//if
    else
      {
        throw new Exception("Invalid Row" + i);
      }//else
    return result;
  }//row(int)

  /*
   * Determines number of rows in the block
   */

  public int height()
  {
    return this.tb.height();
  }//height()

  /*
   * Determines number of columns in the block
   */
  public int width()
  {
    return this.width;
  }//width()
}//class RightJustified
