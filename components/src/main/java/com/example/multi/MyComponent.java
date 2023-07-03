package com.example.multi;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@JsModule("./my-component.ts")
@Tag("my-component")
public class MyComponent extends LitTemplate {

}
