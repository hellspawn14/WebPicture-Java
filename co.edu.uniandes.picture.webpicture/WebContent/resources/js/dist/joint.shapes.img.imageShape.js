/*! JointJS v0.9.2 - JavaScript diagramming library  2014-09-16


This Source Code Form is subject to the terms of the Mozilla Public
License, v. 2.0. If a copy of the MPL was not distributed with this
file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
if (typeof exports === 'object') {

    var joint = {
        util: require('../src/core').util,
        shapes: {},
        dia: {
            Element: require('../src/joint.dia.element').Element,
            Link: require('../src/joint.dia.link').Link
        }
    };
}

joint.shapes.img = {};

joint.shapes.img.ImageShape = joint.dia.Element.extend({
    markup: '<g class="rotatable"><g class="scalable"><circle class="contenedor"/></g><image/><text class="name"/></g>',
    defaults: joint.util.deepSupplement({

        type: 'img.ImageShape',
        //img.ImageShape
        size: { width: 180, height: 180 },
        attrs: {
          circle: { width: 170, height: 170, },
          '.contenedor': {
            fill: '#FFFFFF',
            stroke: 'black',
            r: 30,
            //transform: 'translate(30, 30)',
            'pointer-events': 'visiblePainted'
            },
            image: {
              width: 10, height: 10,
              ref: '.contenedor',
              'ref-x': 0.5, 'ref-y': 0.5,
              //'ref-x': 0, 'ref-y': 0
            },

            '.name': {
              //'font-weight': 'bold',
              ref: '.contenedor',
              'ref-x': 0.5, 'ref-y': 0.5,
              'font-family': 'Arial, helvetica, sans-serif',
              'font-size': 14,
              //'font-family': 'Courier New', 'font-size': 14,
              'text-anchor': 'middle'
            }
        }
    }, joint.dia.Element.prototype.defaults)
});

joint.shapes.org.Arrow = joint.dia.Link.extend({

    defaults: {
        type: 'org.Arrow',
        source: { selector: '.contenedor' }, target: { selector: '.contenedor' },
        attrs: { '.connection': { stroke: '#585858', 'stroke-width': 3 }},
        z: -1
    }
});


if (typeof exports === 'object') {

    module.exports = joint.shapes.img.ImageShape;
}
