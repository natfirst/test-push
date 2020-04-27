package com.company.uno.web.screens.datentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.uno.entity.DatEntity;

@UiController("uno_DatEntity.browse")
@UiDescriptor("dat-entity-browse.xml")
@LookupComponent("datEntitiesTable")
@LoadDataBeforeShow
public class DatEntityBrowse extends StandardLookup<DatEntity> {
}