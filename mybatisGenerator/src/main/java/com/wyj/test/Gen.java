package com.wyj.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Gen {
	
	@Test
	public void run() throws Exception {	
	List<String> warnings = new ArrayList<String>();
    boolean overwrite = true;
    //指定 逆向工程配置文件,这里指定你的逆向生成配置文件路径
    //我的结合上图放在src下，所以路径为src/generatorConfig.xml
    File configFile = new File("./src/main/resource/generator.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    myBatisGenerator.generate(null);
	}

}
