/*
  $Id: UuidTypeTest.java 3052 2014-09-05 17:56:42Z dfisher $

  Copyright (C) 2003-2014 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware Services
  Email:   middleware@vt.edu
  Version: $Revision: 3052 $
  Updated: $Date: 2014-09-05 13:56:42 -0400 (Fri, 05 Sep 2014) $
*/
package org.ldaptive.asn1;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit test for {@link UuidType}.
 *
 * @author  Middleware Services
 * @version  $Revision: 3052 $ $Date: 2014-09-05 13:56:42 -0400 (Fri, 05 Sep 2014) $
 */
public class UuidTypeTest
{


  /**
   * UUID test data.
   *
   * @return  test data
   */
  @DataProvider(name = "uuids")
  public Object[][] createData()
  {
    return
      new Object[][] {
        new Object[] {
          new byte[] {
            (byte) 0x12,
            (byte) 0xE8,
            (byte) 0xB3,
            (byte) 0xA0,
            (byte) 0x5E,
            (byte) 0x58,
            (byte) 0x10,
            (byte) 0x31,
            (byte) 0x82,
            (byte) 0xBD,
            (byte) 0x11,
            (byte) 0x6F,
            (byte) 0xF5,
            (byte) 0x6E,
            (byte) 0x4E,
            (byte) 0x59,
          },
          UUID.fromString("12e8b3a0-5e58-1031-82bd-116ff56e4e59"),
        },
      };
  }


  /**
   * @param  bytes  to decode.
   * @param  expected  uuid to compare.
   *
   * @throws  Exception  On test failure.
   */
  @Test(
    groups = {"asn1"},
    dataProvider = "uuids"
  )
  public void decode(final byte[] bytes, final UUID expected)
    throws Exception
  {
    Assert.assertEquals(UuidType.decode(ByteBuffer.wrap(bytes)), expected);
  }


  /**
   * @param  expected  bytes to compare.
   * @param  uuid  to encode.
   *
   * @throws  Exception  On test failure.
   */
  @Test(
    groups = {"asn1"},
    dataProvider = "uuids"
  )
  public void encode(final byte[] expected, final UUID uuid)
    throws Exception
  {
    Assert.assertEquals(UuidType.toBytes(uuid), expected);
  }
}
