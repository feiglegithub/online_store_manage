webpackJsonp([1],{"6Jwm":function(e,t){},A9dt:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var i=a("BO1k"),n=a.n(i),s={data:function(){return{fileList:[],inputCommodity:"",inputDescribe:"",primaryValue:"",secondValue:"",primaryClassification:[],secondClassification:[],loading:!1}},methods:{handleRemove:function(e,t){var a=this,i=new URLSearchParams;i.append("name",e.name),this.axios.post("/file/Delete",i).then(function(e){var t=e.data;t.status||a.$notify.error({title:"错误",message:t.message,duration:0})}).catch(function(e){a.$notify.error({title:"错误",message:e,duration:0})})},handlePreview:function(e){console.log(e)},handleSuccess:function(e,t,a){e.status?(this.fileList=a,console.log(this.fileList)):this.$notify.error({title:"错误",message:e.message,duration:0})},primarySelectChange:function(){var e=this,t=new URLSearchParams;t.append("primaryClassification",this.primaryValue),this.axios.post("/getSecondClassificationByPrimaryClassification",t).then(function(t){var a=t.data;a.status?e.secondClassification=a.list:e.$notify.error({title:"错误",message:a.message,duration:0})}).catch(function(t){e.$notify.error({title:"错误",message:t,duration:0})})},handleCommit:function(){var e=this;this.loading=!0;var t=[],a=!0,i=!1,s=void 0;try{for(var o,l=n()(this.fileList);!(a=(o=l.next()).done);a=!0){var r=o.value;t.push(r.name)}}catch(e){i=!0,s=e}finally{try{!a&&l.return&&l.return()}finally{if(i)throw s}}var c=new URLSearchParams;c.append("fileNams",t),c.append("name",inputCommodity),c.append("primary",primaryValue),c.append("second",secondValue),c.append("describe",inputDescribe),this.axios.post("/commodity/Add",c).then(function(t){var a=t.data;a.status?(e.inputCommodity="",e.inputDescribe="",e.fileList=[],e.$message({message:a.message,type:"success"})):e.$notify.error({title:"错误",message:a.message,duration:0}),e.loading=!1}).catch(function(t){e.$notify.error({title:"错误",message:t,duration:0}),e.loading=!1})},submitUpload:function(){this.$refs.upload.submit()}},created:function(){var e=this;this.axios.get("/primaryClassification/getAll").then(function(t){e.primaryClassification=t.data}).catch(function(t){e.$notify.error({title:"错误",message:t,duration:0})})}},o={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}]},[a("el-upload",{ref:"upload",staticClass:"upload-demo",attrs:{action:"/online_store/upload","on-preview":e.handlePreview,"on-remove":e.handleRemove,"file-list":e.fileList,"auto-upload":!1,"on-success":e.handleSuccess,multiple:"",accept:"image/*","list-type":"picture"}},[a("el-button",{attrs:{slot:"trigger",size:"small",type:"primary"},slot:"trigger"},[e._v("选取文件")]),e._v(" "),a("el-button",{staticStyle:{"margin-left":"10px"},attrs:{size:"small",type:"success"},on:{click:e.submitUpload}},[e._v("上传到服务器")])],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("商品名称：")]),e._v(" "),a("el-col",{attrs:{span:21}},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.inputCommodity,callback:function(t){e.inputCommodity=t},expression:"inputCommodity"}})],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("一级分类：")]),e._v(" "),a("el-col",{attrs:{span:5}},[a("el-select",{attrs:{placeholder:"请选择"},on:{change:e.primarySelectChange},model:{value:e.primaryValue,callback:function(t){e.primaryValue=t},expression:"primaryValue"}},e._l(e.primaryClassification,function(e){return a("el-option",{key:e.id,attrs:{label:e.name,value:e.name}})}),1)],1),e._v(" "),a("el-col",{attrs:{span:3}},[e._v("二级分类：")]),e._v(" "),a("el-col",{attrs:{span:5}},[a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.secondValue,callback:function(t){e.secondValue=t},expression:"secondValue"}},e._l(e.secondClassification,function(e){return a("el-option",{key:e.id,attrs:{label:e.name,value:e.name}})}),1)],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("商品描述：")]),e._v(" "),a("el-col",{attrs:{span:21}},[a("el-input",{attrs:{type:"textarea",autosize:"",placeholder:"请输入内容"},model:{value:e.inputDescribe,callback:function(t){e.inputDescribe=t},expression:"inputDescribe"}})],1)],1),e._v(" "),a("el-button",{staticStyle:{width:"100%","margin-top":"5px"},attrs:{type:"primary"},on:{click:e.handleCommit}},[e._v("提交")])],1)},staticRenderFns:[]};var l=a("VU/8")(s,o,!1,function(e){a("6Jwm")},null,null);t.default=l.exports}});
//# sourceMappingURL=1.a448eda297b4a5366409.js.map