package an.xacml.adapter.file.policy;

import org.w3c.dom.Element;

import an.xacml.XACMLElement;
import an.xacml.policy.EnvironmentMatch;

public class FileAdapterEnvironmentMatch extends FileAdapterTargetElementMatch {
    public static final String ELEMENT_NAME = "EnvironmentMatch";
    public FileAdapterEnvironmentMatch(Element elem) throws Exception {
        initializeTargetElement(elem, EnvironmentMatch.class);
    }

    public FileAdapterEnvironmentMatch(XACMLElement engineElem) throws Exception {
        if (engineElem.getElementName() == null) {
            engineElem.setElementName(ELEMENT_NAME);
        }
        initializeTargetElement(engineElem);
    }
}