webpackJsonp([2],{HEmQ:function(t,i,n){"use strict";Object.defineProperty(i,"__esModule",{value:!0});var e={props:["commodity"],data:function(){return{list:[],loading:!1,finished:!1}},methods:{onClickLeft:function(){this.$router.go(-1)},onLoad:function(){var t=this;setTimeout(function(){for(var i=0;i<10;i++)t.list.push(t.list.length+1);t.loading=!1,t.list.length>=40&&(t.finished=!0)},1e3)},back:function(){this.$router.go(-1)}}},o={render:function(){var t=this,i=t.$createElement,n=t._self._c||i;return n("div",[n("div",{staticClass:"header",staticStyle:{height:"50px"}},[n("van-icon",{staticStyle:{padding:"10px","z-index":"999"},attrs:{name:"arrow-left",size:"30px"},on:{click:t.back}}),t._v(" "),n("div",{staticStyle:{position:"absolute",top:"15px",width:"100%","text-align":"center"}},[t._v(t._s(t.commodity))])],1),t._v(" "),n("van-list",{attrs:{finished:t.finished,"finished-text":"没有更多了"},on:{load:t.onLoad},model:{value:t.loading,callback:function(i){t.loading=i},expression:"loading"}},[n("van-grid",{attrs:{"column-num":2}},t._l(t.list,function(t){return n("van-grid-item",{key:t,attrs:{icon:"photo-o",text:t,to:"/commodityDetails/"+t}})}),1)],1)],1)},staticRenderFns:[]};var a=n("VU/8")(e,o,!1,function(t){n("QpD6")},"data-v-3b1c315c",null);i.default=a.exports},QpD6:function(t,i){}});
//# sourceMappingURL=2.91eb484d06f486604a8f.js.map