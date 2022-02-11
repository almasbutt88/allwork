import Counter from '../components/Counter';
import React from 'react';
import Adapter from 'enzyme-adapter-react-16';
import {shallow, configure} from 'enzyme';

configure({adapter: new Adapter()});


describe("Counter", () => {
  let component; //itx now in scope of all the functions below

  beforeEach(() => {
    component = shallow( <Counter/>); //shallow meaning there is no child components inside this react component Counter
  });

  it('should start the counter at zero', () => {
    const counter = component.find('#counter'); //its the h1 from the counter.js file that has id counter, .find will find
    expect(counter.text()).toEqual('0'); //everything needs to be a string. .text() is a function
    
  });

  it("should increment counter on click", () => {
    component.find("#button-up").simulate("click");//find that button-up, simulate that click, 
    const counter = component.find("#counter");
    expect(counter.text()).toEqual("1")
    
  });

  it("should decrement counter on click", () => {
    component.find("#button-down").simulate("click");
    const counter = component.find("#counter");
    expect(counter.text()).toEqual("-1") //.text( ) will return the text inside the Counter tag on Counter.js
   
  });

})