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
package org.ldaptive;

import org.ldaptive.control.RequestControl;
import org.ldaptive.handler.IntermediateResponseHandler;

/**
 * Contains the data common to all request objects.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public abstract class AbstractRequest implements Request
{

  /** Request controls. */
  private RequestControl[] controls;

  /** Whether to follow referrals. */
  private boolean followReferrals;

  /** Intermediate response handlers. */
  private IntermediateResponseHandler[] intermediateResponseHandlers;


  /** {@inheritDoc} */
  @Override
  public RequestControl[] getControls()
  {
    return controls;
  }


  /**
   * Sets the controls for this request.
   *
   * @param  c  controls to set
   */
  public void setControls(final RequestControl... c)
  {
    controls = c;
  }


  /** {@inheritDoc} */
  @Override
  public boolean getFollowReferrals()
  {
    return followReferrals;
  }


  /**
   * Sets whether to follow referrals.
   *
   * @param  b  whether to follow referrals
   */
  public void setFollowReferrals(final boolean b)
  {
    followReferrals = b;
  }


  /** {@inheritDoc} */
  @Override
  public IntermediateResponseHandler[] getIntermediateResponseHandlers()
  {
    return intermediateResponseHandlers;
  }


  /**
   * Sets the intermediate response handlers.
   *
   * @param  handlers  intermediate response handlers
   */
  public void setIntermediateResponseHandlers(
    final IntermediateResponseHandler... handlers)
  {
    intermediateResponseHandlers = handlers;
  }
}
