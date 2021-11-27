/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.views.jte;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.views.ViewsConfigurationProperties;

/**
 * ConfigurationProperties for JTE.
 *
 * @author edward3h
 * @since 2021-11-24
 */
@ConfigurationProperties(JteViewsRendererConfigurationProperties.PREFIX)
public class JteViewsRendererConfigurationProperties implements JteViewsRendererConfiguration {
    public static final String PREFIX = ViewsConfigurationProperties.PREFIX + ".jte";

    private boolean dynamic;

    /**
     * Whether to enable dynamic reloading of templates.
     * @param dynamic true to enable dynamic reloading
     */
    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    @Override
    public boolean isDynamic() {
        return dynamic;
    }
}
