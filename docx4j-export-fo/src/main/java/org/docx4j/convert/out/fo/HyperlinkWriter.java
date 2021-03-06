/*
   Licensed to Plutext Pty Ltd under one or more contributor license agreements.  
   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.docx4j.convert.out.fo;

import javax.xml.transform.TransformerException;

import org.docx4j.convert.out.common.AbstractWmlConversionContext;
import org.docx4j.convert.out.common.writer.AbstractHyperlinkWriter;
import org.docx4j.convert.out.common.writer.AbstractHyperlinkWriterModel;
import org.docx4j.convert.out.common.writer.HyperlinkUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class HyperlinkWriter extends AbstractHyperlinkWriter {

	@Override
	protected Node toNode(AbstractWmlConversionContext context,
			AbstractHyperlinkWriterModel model, Document doc) throws TransformerException {
		return HyperlinkUtil.toNode(HyperlinkUtil.FO_OUTPUT, context, model, model.getContent(), doc);
	}

}
