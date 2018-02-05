package com.ani.commons.octopus.interfaces;

import com.ani.commons.octopus.object.dto.objmodel.AniObjModelMetaDto;
import com.ani.commons.octopus.object.dto.objmodel.AniObjModelStubsDto;

public interface AniObjectModelInterface {

    public void createObjectModel(AniObjModelMetaDto modelMetaDto);

    public void setObjectModelStubs(AniObjModelStubsDto stubsDto, Boolean isFull);

    public void setObjectModelSMs();

}
