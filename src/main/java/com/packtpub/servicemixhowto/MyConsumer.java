package com.packtpub.servicemixhowto;

import org.apache.camel.Consume;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Copyright 2013 Jason Heithoff
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * User: jason
 * Date: 12/21/15
 * Time: 8:29 PM
 */
@Component
public class MyConsumer extends SpringRouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:myQueue?username=admin&password=admin")
                .to("log:done");
    }
}
