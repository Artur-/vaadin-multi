import { LitElement, html } from "lit";
import { customElement } from "lit/decorators.js";

@customElement("my-component")
export class MyComponent extends LitElement {
  render() {
    return html`<span>This is my component</span>`;
  }
}
