/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package asset.pipeline

import asset.pipeline.fs.AssetResolver

/**
* Provides an interface for referencing files resolved by the Asset-Pipeline AssetResolvers
 *
* @author David Estes
*/
interface AssetFile {
    static List<String> contentType
    static List<String> extensions
    static String compiledExtension
    static List<Class<Processor>> processors

    /**
     * @return The base file
     */
    AssetFile getBaseFile()

    /**
     * @return The encoding to use
     */
    String getEncoding()

    /**
     * Sets the encoding to use
     */
    void setEncoding(String encoding)
    /**
     * Sets the base file
     */
    void setBaseFile(AssetFile baseFile)

    InputStream getInputStream()
    String getParentPath()
    String getPath()
    String getName()
    AssetResolver getSourceResolver()


    String processedStream(AssetCompiler precompiler)

    String directiveForLine(String line)

}
