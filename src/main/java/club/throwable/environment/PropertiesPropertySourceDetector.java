package club.throwable.environment;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/10/14 21:03
 */
public class PropertiesPropertySourceDetector extends AbstractPropertySourceDetector {

	@Override
	public String[] getFileExtensions() {
		return new String[]{"properties", "conf"};
	}

	@SuppressWarnings("unchecked")
	@Override
	public void load(ConfigurableEnvironment environment, String name, Resource resource) throws IOException {
		Map map = PropertiesLoaderUtils.loadProperties(resource);
		addPropertySource(environment, new MapPropertySource(name, map));
	}
}
