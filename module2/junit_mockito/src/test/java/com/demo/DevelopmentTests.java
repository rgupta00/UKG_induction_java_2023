package com.demo;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.demo")
@IncludeTags("prod")
public class DevelopmentTests
{
}