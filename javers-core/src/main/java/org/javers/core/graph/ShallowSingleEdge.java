package org.javers.core.graph;

import org.javers.common.validation.Validate;
import org.javers.core.metamodel.object.GlobalId;
import org.javers.core.metamodel.type.JaversProperty;

import java.util.Collections;
import java.util.List;

/**
 * @author bartosz.walacik
 */
class ShallowSingleEdge extends AbstractSingleEdge {
    private final Cdo reference;

    ShallowSingleEdge(JaversProperty property, Cdo referencedObject) {
        super(property);
        Validate.argumentIsNotNull(referencedObject);
        this.reference = referencedObject;
    }

    @Override
    GlobalId getReference() {
        return reference.getGlobalId();
    }

    @Override
    List<LiveNode> getReferences() {
        return Collections.emptyList();
    }
}
