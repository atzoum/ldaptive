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
package org.ldaptive.async.handler;

import org.ldaptive.Connection;
import org.ldaptive.Request;
import org.ldaptive.handler.Handler;
import org.ldaptive.handler.HandlerResult;

/**
 * Provides post search handling of an exception thrown by an async operation.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public interface ExceptionHandler extends Handler<Request, Exception>
{


  /** {@inheritDoc} */
  @Override
  HandlerResult<Exception> handle(
    Connection conn,
    Request request,
    Exception exception);
}
