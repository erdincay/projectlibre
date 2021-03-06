/*
The contents of this file are subject to the Common Public Attribution License 
Version 1.0 (the "License"); you may not use this file except in compliance with 
the License. You may obtain a copy of the License at 
http://www.projity.com/license . The License is based on the Mozilla Public 
License Version 1.1 but Sections 14 and 15 have been added to cover use of 
software over a computer network and provide for limited attribution for the 
Original Developer. In addition, Exhibit A has been modified to be consistent 
with Exhibit B.

Software distributed under the License is distributed on an "AS IS" basis, 
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
specific language governing rights and limitations under the License. The 
Original Code is OpenProj. The Original Developer is the Initial Developer and 
is Projity, Inc. All portions of the code written by Projity are Copyright (c) 
2006, 2007. All Rights Reserved. Contributors Projity, Inc.

Alternatively, the contents of this file may be used under the terms of the 
Projity End-User License Agreeement (the Projity License), in which case the 
provisions of the Projity License are applicable instead of those above. If you 
wish to allow use of your version of this file only under the terms of the 
Projity License and not to allow others to use your version of this file under 
the CPAL, indicate your decision by deleting the provisions above and replace 
them with the notice and other provisions required by the Projity  License. If 
you do not delete the provisions above, a recipient may use your version of this 
file under either the CPAL or the Projity License.

[NOTE: The text of this license may differ slightly from the text of the notices 
in Exhibits A and B of the license at http://www.projity.com/license. You should 
use the latest text at http://www.projity.com/license for your modifications.
You may not remove this license text from the source files.]

Attribution Information: Attribution Copyright Notice: Copyright � 2006, 2007 
Projity, Inc. Attribution Phrase (not exceeding 10 words): Powered by OpenProj, 
an open source solution from Projity. Attribution URL: http://www.projity.com 
Graphic Image as provided in the Covered Code as file:  openproj_logo.png with 
alternatives listed on http://www.projity.com/logo

Display of Attribution Information is required in Larger Works which are defined 
in the CPAL as a work which combines Covered Code or portions thereof with code 
not governed by the terms of the CPAL. However, in addition to the other notice 
obligations, all copies of the Covered Code in Executable and Source Code form 
distributed must, as a form of attribution of the original author, include on 
each user interface screen the "OpenProj" logo visible to all users.  The 
OpenProj logo should be located horizontally aligned with the menu bar and left 
justified on the top left of the screen adjacent to the File menu.  The logo 
must be at least 100 x 25 pixels.  When users click on the "OpenProj" logo it 
must direct them back to http://www.projity.com.  
*/
package com.projity.grouping.core.transform.sorting;

import groovy.lang.GroovyClassLoader;

import com.projity.field.InvalidFormulaException;
import com.projity.grouping.core.transform.CommonTransform;
import com.projity.grouping.core.transform.CommonTransformFactory;

/**
 *
 */
public class NodeSorterFactory extends CommonTransformFactory{
//	static Log log = LogFactory.getLog(NodeSorterFactory.class);
	protected String type1 = null; 
	protected String type2 = null; 
	protected String groupNameFormula=null;
	
	private static int count=0;
	
	
	
	public CommonTransform getTransform() throws InvalidFormulaException{
	    CommonTransform t=getTransformFromDefinition();
	    if (t!=null) return t;
	    if (formulaText==null&&subTransforms==null) return null;
		StringBuffer classText=new StringBuffer();
	    classText.append("package com.projity.grouping.core.transform.sorting;\n");
	    classText.append("import com.projity.grouping.core.Node;\n");
	    classText.append("import com.projity.datatype.*;\n");
	    classText.append("public class SorterFormula").append(count++).append(" extends NodeSorter{\n");
	    
		if (formulaText!=null){
	    	//compare
		    classText.append("\tpublic int compare(Object _nodeObject1,Object _nodeObject2){\n\t\tObject ")
		    	.append(type1).append("=(_nodeObject1 instanceof Node)?((Node)_nodeObject1).getImpl():_nodeObject1;\n\t\tObject ")
		    	.append(type2).append("=(_nodeObject2 instanceof Node)?((Node)_nodeObject2).getImpl():_nodeObject2;\n")
		    	.append("\t\t").append(formulaText).append("\n\t}\n");
		    
		    //groupName
		    if (groupNameFormula!=null){
			    classText.append("\tpublic String getGroupName(Object _nodeObject1){\n\t\tObject ")
			    .append(type1).append("=(_nodeObject1 instanceof Node)?((Node)_nodeObject1).getImpl():_nodeObject1;\n\t\t")
			    .append(groupNameFormula).append("\n\t}\n");
		    }
		}
	    classText.append("}\n");
	    
//		GroovyClassLoader loader = new GroovyClassLoader(ClassLoaderUtils.getLocalClassLoader());
		GroovyClassLoader loader = new GroovyClassLoader(getClass().getClassLoader());
		try {
			Class groovyClass = loader.parseClass(classText.toString()); //TODO this his horribly slow (~500ms)  Can we parse all at once or can we do this lazily or initialize in another thread?
			t=(CommonTransform)groovyClass.newInstance();
			setProperties(t);
			return t;
		} catch (Exception e) {
			throw new InvalidFormulaException(e);
		}
	}
	
    public String getType1() {
        return type1;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public String getType2() {
        return type2;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
    
    public String getGroupNameFormula() {
        return groupNameFormula;
    }
    public void setGroupNameFormula(String groupNameFormula) {
        this.groupNameFormula = groupNameFormula;
    }
    
	protected void setProperties(CommonTransform t) throws InvalidFormulaException{
		super.setProperties(t);
		//((NodeSorter)t).setFieldsText(getFieldsText());
	}
}
