/* See LICENSE for licensing and NOTICE for copyright. */
package org.ldaptive.transport.netty;

import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.DefaultThreadFactory;
import io.netty.util.concurrent.ThreadPerTaskExecutor;

/**
 * Creates netty connections using an {@link NioEventLoopGroup}. The event loop group is shutdown when the connection
 * factory is closed.
 *
 * @author  Middleware Services
 */
public class NioConnectionFactoryTransport extends NettyConnectionFactoryTransport
{


  /**
   * Creates a new nio connection factory transport.
   */
  public NioConnectionFactoryTransport()
  {
    this(0);
  }


  /**
   * Creates a new nio connection factory transport.
   *
   * @param  ioThreads  number of threads used for I/O in the event loop group
   */
  public NioConnectionFactoryTransport(final int ioThreads)
  {
    this(NioConnectionFactoryTransport.class.getSimpleName(), ioThreads);
  }


  /**
   * Creates a new nio connection factory transport.
   *
   * @param  name  to assign the thread pool
   * @param  ioThreads  number of threads used for I/O in the event loop group
   */
  public NioConnectionFactoryTransport(final String name, final int ioThreads)
  {
    super(
      NioSocketChannel.class,
      new NioEventLoopGroup(
        ioThreads,
        new ThreadPerTaskExecutor(new DefaultThreadFactory(name, true, Thread.NORM_PRIORITY))),
      null);
  }


  /**
   * Creates a new nio connection factory transport.
   *
   * @param  ioThreads  number of threads used for I/O in the event loop group
   * @param  messageThreads  number of threads for LDAP message handling in the event loop group
   */
  public NioConnectionFactoryTransport(final int ioThreads, final int messageThreads)
  {
    this(NioConnectionFactoryTransport.class.getSimpleName(), ioThreads, messageThreads);
  }


  /**
   * Creates a new nio connection factory transport.
   *
   * @param  name  to assign the thread pool
   * @param  ioThreads  number of threads used for I/O in the event loop group
   * @param  messageThreads  number of threads for LDAP message handling in the event loop group
   */
  public NioConnectionFactoryTransport(final String name, final int ioThreads, final int messageThreads)
  {
    super(
      NioSocketChannel.class,
      new NioEventLoopGroup(
        ioThreads,
        new ThreadPerTaskExecutor(new DefaultThreadFactory(name + "-io", true, Thread.NORM_PRIORITY))),
      new NioEventLoopGroup(
        messageThreads,
        new ThreadPerTaskExecutor(new DefaultThreadFactory(name + "-messages", true, Thread.NORM_PRIORITY))));
  }
}
