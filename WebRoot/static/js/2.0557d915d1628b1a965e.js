webpackJsonp([2],{D9PZ:function(i,t){},"U8G/":function(i,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a={data:function(){return{primaryClassification:[],secondClassification:[],inputPrimaryVisible:!1,inputSecondVisible:!1,inputPrimaryClassification:"",inputSecondClassification:"",checkTab:""}},methods:{getAllPrimaryClassification:function(){var i=this;this.axios.get("/primaryClassification/getAll").then(function(t){i.primaryClassification=t.data}).catch(function(t){i.$notify.error({title:"错误",message:t,duration:0})})},getSecondClassifition:function(i){var t=this,n=new URLSearchParams;n.append("primaryClassification",i),this.axios.post("/getSecondClassificationByPrimaryClassification",n).then(function(i){var n=i.data;n.status?t.secondClassifition=n.list:t.$notify.error({title:"错误",message:n.message,duration:0})}).catch(function(i){t.$notify.error({title:"错误",message:i,duration:0})})},tabClick:function(){this.getSecondClassification(this.checkTab)},handlePrimaryClose:function(i){var t=this;this.$confirm("此操作将同时删除关联的二级分类, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){var n=new URLSearchParams;n.append("classification",i),t.axios.post("/primaryClassification/Delete",n).then(function(i){var n=i.data;n.status?t.getAllPrimaryClassification():t.$notify.error({title:"错误",message:n.message,duration:0})}).catch(function(i){t.$notify.error({title:"错误",message:i,duration:0})})}).catch(function(){t.$message({type:"info",message:"已取消删除"})})},handleSecondClose:function(i){var t=this;this.$confirm("确认删除此分类吗?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){var n=new URLSearchParams;n.append("id",i),t.axios.post("/secondClassification/Delete",n).then(function(i){var n=i.data;n.status?t.getSecondClassification(t.checkTab):t.$notify.error({title:"错误",message:n.message,duration:0})}).catch(function(i){t.$notify.error({title:"错误",message:i,duration:0})})}).catch(function(){t.$message({type:"info",message:"已取消删除"})})},showPrimaryInput:function(){var i=this;this.inputPrimaryVisible=!0,this.$nextTick(function(t){i.$refs.savePrimaryInput.$refs.input.focus()})},showSecondInput:function(){this.inputSecondVisible=!0},handleInputPrimaryConfirm:function(){var i=this,t=this.inputPrimaryClassification;if(t){var n=new URLSearchParams;n.append("name",t),this.axios.post("/primaryClassification/add",n).then(function(t){var n=t.data;console.log(n),n.status?i.getAllPrimaryClassification():i.$notify.error({title:"错误",message:n.message,duration:0})}).catch(function(t){i.$notify.error({title:"错误",message:t,duration:0})})}this.inputPrimaryVisible=!1,this.inputPrimaryClassification=""},handleInputSecondConfirm:function(){var i=this,t=this.inputSecondClassification,n=this.checkTab;if(t){var a=new URLSearchParams;a.append("primaryClassification",n),a.append("name",t),this.axios.post("/secondClassification/add",a).then(function(t){var a=t.data;console.log(a),a.status?i.getSecondClassification(n):i.$notify.error({title:"错误",message:a.message,duration:0})}).catch(function(t){i.$notify.error({title:"错误",message:t,duration:0})})}this.inputSecondVisible=!1,this.inputSecondClassification=""},handleInputBlur:function(i){"primary"==i?this.inputPrimaryVisible=!1:this.inputSecondVisible=!1},handleClick:function(i){alert(i)}},created:function(){this.getAllPrimaryClassification()}},e={render:function(){var i=this,t=i.$createElement,n=i._self._c||t;return n("div",[n("el-card",[n("div",{attrs:{slot:"header"},slot:"header"},[n("span",[i._v("一级分类")])]),i._v(" "),i._l(i.primaryClassification,function(t,a){return n("el-tag",{key:a,staticStyle:{cursor:"pointer"},attrs:{closable:"","disable-transitions":!1},on:{close:function(n){return i.handlePrimaryClose(t.name)}}},[i._v("\n      "+i._s(t.name)+"\n    ")])}),i._v(" "),i.inputPrimaryVisible?n("el-input",{ref:"savePrimaryInput",staticClass:"input-new-tag",attrs:{size:"small"},on:{blur:function(t){return i.handleInputBlur("primary")}},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&i._k(t.keyCode,"enter",13,t.key,"Enter")?null:i.handleInputPrimaryConfirm.apply(null,arguments)}},model:{value:i.inputPrimaryClassification,callback:function(t){i.inputPrimaryClassification=t},expression:"inputPrimaryClassification"}}):n("el-button",{staticClass:"button-new-tag",attrs:{size:"small"},on:{click:i.showPrimaryInput}},[i._v("+ New Tag")])],2),i._v(" "),n("el-card",[n("div",{attrs:{slot:"header"},slot:"header"},[n("span",[i._v("二级分类")])]),i._v(" "),n("el-tabs",{attrs:{"tab-position":"left"},on:{"tab-click":i.tabClick},model:{value:i.checkTab,callback:function(t){i.checkTab=t},expression:"checkTab"}},i._l(i.primaryClassification,function(t,a){return n("el-tab-pane",{key:a,attrs:{label:t.name,name:t.name}},[i._l(i.secondClassification,function(t,a){return n("el-tag",{key:a,staticStyle:{cursor:"pointer"},attrs:{closable:"","disable-transitions":!1},on:{close:function(n){return i.handleSecondClose(t.id)}}},[i._v("\n          "+i._s(t.name)+"\n        ")])}),i._v(" "),i.inputSecondVisible?n("el-input",{ref:"saveSecondInput",refInFor:!0,staticClass:"input-new-tag",attrs:{size:"small"},on:{blur:function(t){return i.handleInputBlur("second")}},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&i._k(t.keyCode,"enter",13,t.key,"Enter")?null:i.handleInputSecondConfirm.apply(null,arguments)}},model:{value:i.inputSecondClassification,callback:function(t){i.inputSecondClassification=t},expression:"inputSecondClassification"}}):n("el-button",{staticClass:"button-new-tag",attrs:{size:"small"},on:{click:i.showSecondInput}},[i._v("+ New Tag")])],2)}),1)],1)],1)},staticRenderFns:[]};var s=n("VU/8")(a,e,!1,function(i){n("D9PZ")},null,null);t.default=s.exports}});
//# sourceMappingURL=2.0557d915d1628b1a965e.js.map