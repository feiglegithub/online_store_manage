webpackJsonp([2],{A9dt:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l={data:function(){return{fileList:[],input:"",primaryValue:"",secondValue:"",primaryClassification:[],secondClassification:[],textarea:""}},methods:{handleRemove:function(e,t){console.log(e,t)},handlePreview:function(e){console.log(e)},handleSuccess:function(e,t,a){e.status?console.log(a):this.$notify.error({title:"错误",message:e.message,duration:0})},primarySelectChange:function(){var e=this,t=new URLSearchParams;t.append("primaryClassification",this.primaryValue),this.axios.post("/getSecondClassificationByPrimaryClassification",t).then(function(t){var a=t.data;a.status?e.secondClassification=a.list:e.$notify.error({title:"错误",message:a.message,duration:0})}).catch(function(t){e.$notify.error({title:"错误",message:t,duration:0})})},handleCommit:function(){},submitUpload:function(){this.$refs.upload.submit()}},created:function(){var e=this;this.axios.get("/primaryClassification/getAll").then(function(t){e.primaryClassification=t.data}).catch(function(t){e.$notify.error({title:"错误",message:t,duration:0})})}},i={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("el-upload",{ref:"upload",staticClass:"upload-demo",attrs:{action:"/online_store/upload","on-preview":e.handlePreview,"on-remove":e.handleRemove,"file-list":e.fileList,"auto-upload":!1,"on-success":e.handleSuccess,multiple:"",accept:"image/*","list-type":"picture"}},[a("el-button",{attrs:{slot:"trigger",size:"small",type:"primary"},slot:"trigger"},[e._v("选取文件")]),e._v(" "),a("el-button",{staticStyle:{"margin-left":"10px"},attrs:{size:"small",type:"success"},on:{click:e.submitUpload}},[e._v("上传到服务器")])],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("商品名称：")]),e._v(" "),a("el-col",{attrs:{span:21}},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.input,callback:function(t){e.input=t},expression:"input"}})],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("一级分类：")]),e._v(" "),a("el-col",{attrs:{span:5}},[a("el-select",{attrs:{placeholder:"请选择"},on:{change:e.primarySelectChange},model:{value:e.primaryValue,callback:function(t){e.primaryValue=t},expression:"primaryValue"}},e._l(e.primaryClassification,function(e){return a("el-option",{key:e.id,attrs:{label:e.name,value:e.name}})}),1)],1),e._v(" "),a("el-col",{attrs:{span:3}},[e._v("二级分类：")]),e._v(" "),a("el-col",{attrs:{span:5}},[a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.secondValue,callback:function(t){e.secondValue=t},expression:"secondValue"}},e._l(e.secondClassification,function(e){return a("el-option",{key:e.id,attrs:{label:e.name,value:e.name}})}),1)],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[e._v("商品描述：")]),e._v(" "),a("el-col",{attrs:{span:21}},[a("el-input",{attrs:{type:"textarea",autosize:"",placeholder:"请输入内容"},model:{value:e.textarea,callback:function(t){e.textarea=t},expression:"textarea"}})],1)],1),e._v(" "),a("el-button",{staticStyle:{width:"100%","margin-top":"5px"},attrs:{type:"primary"},on:{click:e.handleCommit}},[e._v("提交")])],1)},staticRenderFns:[]};var n=a("VU/8")(l,i,!1,function(e){a("CdDE")},null,null);t.default=n.exports},CdDE:function(e,t){}});
//# sourceMappingURL=2.3272545a0aee9d941109.js.map