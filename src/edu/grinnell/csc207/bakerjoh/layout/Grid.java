package edu.grinnell.csc207.bakerjoh.layout;

public class Grid
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+	

  /*
   * Width of the new block
   */

  int width;

  /*
   * Height of the new block
   */

  int height;

  /*
   * Characters composing the new block
   */
  char ch;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /*
   * Creates new block of a grid of characters
   */
  public Grid(int width, int height, char ch)
  {
    this.width = width;
    this.height = height;
    this.ch = ch;
  }//Grid (int, int, char)

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
    String str = "";
    if ((i >= 0) & (i <= this.height()))
      {
        for (int w = 0; w < this.width; w++)
          {
            str = str + ch;
          }//for
      }//if
    else
      {
        throw new Exception("Invalid Row" + i);
      }//else
    return str;
  }//row(int)
  
  /*
   * Determines amount of rows in new block
   */

  public int height()
  {
    return this.height;
  }//height()
  
  /*
   * Determines amount of columns in new block
   */

  public int width()
  {
    return this.width;
  }//width()
}//class Grid

