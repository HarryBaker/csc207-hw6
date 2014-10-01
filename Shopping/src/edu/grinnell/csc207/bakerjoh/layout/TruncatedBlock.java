package edu.grinnell.csc207.bakerjoh.layout;

public class TruncatedBlock
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /*
   * Width of new Block
   */
  int width;

  /*
   * Block that is truncated
   */
  TextBlock tb;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 

  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width)
  {
    this.width = width;
    this.tb = tb;
  } // TruncatedBlock(TextBlock, int)

  // +--------------+------------------------------------------------------
  // | Medthods     |
  // +--------------+ 

  /**
   * Get the ith row of the block.
   * 
   * @throws Exception
   */
  public String row(int i)
    throws Exception
  {
    String result = "";
    if ((i >= 0) & (i <= tb.height()))
      {
        result = result.concat(this.tb.row(i).substring(0, width));
      }
    else
      {
        throw new Exception("Invalid row " + i);
      }
    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return tb.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()
} // class TruncatedBlock

