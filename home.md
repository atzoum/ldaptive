---
layout: default
title: Ldaptive
permalink: /
redirect_from: "/home/"
---

# LDAP library for Java.
Ldaptive is a simple, extensible Java API for interacting with LDAP servers. It was designed to provide easy LDAP integration for application developers.

## Rationale
Developers need LDAP integration for their products, but the JNDI API is cumbersome and takes a great deal of resources to learn and use. In addition, most applications only require a subset of LDAP functionality: search and authentication.

## Features
* Search result caching
* Connection pooling
* Authentication API with support for password policy
* JAAS modules for authentication and authorization
* SSL/startTLS support with easy configuration of trust and key material
* Input/output of LDIF and DSML version 1
* Command line scripts for operations
* Supported providers:
  * JNDI
  * UnboundID
  * Apache
  * JLdap
  * OpenDJ
* Supported controls (no external dependencies required):
  * ManageDsaIT (RFC 3296)
  * Paged results (RFC 2696)
  * Virtual List View (draft-ietf-ldapext-ldapv3-vlv-09)
  * Server side sorting (RFC 2891)
  * Proxy Authorization (RFC 4370)
  * Password policy (draft-behera-ldap-password-policy-10)

## Quick Start Guide

### Searching
{% highlight java %}
{% include source/home/1.java %}
{% endhighlight %}

### StartTLS
{% highlight java %}
{% include source/home/2.java %}
{% endhighlight %}

### Binding
{% highlight java %}
{% include source/home/3.java %}
{% endhighlight %}

These search examples all leverage the SearchExecutor class. For more details on searching and more control over the search operation in general, see the [search operation documentation](docs/guide/operations/search.html).

### Authentication
{% highlight java %}
{% include source/home/4.java %}
{% endhighlight %}

For more details on authentication, see the [authentication documentation](docs/guide/authentication.html).
