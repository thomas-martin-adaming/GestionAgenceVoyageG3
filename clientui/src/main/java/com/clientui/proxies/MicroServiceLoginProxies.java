package com.clientui.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "zuul-server", url = "localhost:9004/")
public interface MicroServiceLoginProxies {
	
}
