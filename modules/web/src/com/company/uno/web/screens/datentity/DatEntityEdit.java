package com.company.uno.web.screens.datentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.uno.entity.DatEntity;

@UiController("uno_DatEntity.edit")
@UiDescriptor("dat-entity-edit.xml")
@EditedEntityContainer("datEntityDc")
@LoadDataBeforeShow
public class DatEntityEdit extends StandardEditor<DatEntity> {
}