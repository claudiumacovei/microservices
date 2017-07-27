package org.zuulproxy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zuulproxy.filters.RequestMonitoringFilter;

//@Configuration
public class ZuulFilterConfiguration {

	@Bean
	public RequestMonitoringFilter requestMonitoringFilter() {
		return new RequestMonitoringFilter();
	}
}
