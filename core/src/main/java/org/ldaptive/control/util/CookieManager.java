/*
  $Id$

  Copyright (C) 2003-2014 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware Services
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package org.ldaptive.control.util;

/**
 * Interface for the reading and writing of control related cookies.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public interface CookieManager
{


  /**
   * Read and return a cookie from storage.
   *
   * @return  cookie read from storage
   */
  byte[] readCookie();


  /**
   * Writes a cookie to storage.
   *
   * @param  cookie  to write
   */
  void writeCookie(byte[] cookie);
}
