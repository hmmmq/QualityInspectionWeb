<template>
    <PGC6 :formArray="formArray" :url="url" :head="head" />
  </template>
  
  <script>
  import PGC6 from '@/components/ProjectGroup/PGC6.vue';
  export default {
    components: {
      PGC6
    },
    data() {
      return {
        head: "提交质量管理相关施工过程资料",
        url: "#",
        formArray: [
          { label: "施工过程段", value: "", type: "text" },
          { label: "资料概况", value: "", type: "text" },
          { label: "资料文件或图片", value: "", type: "file" },
          
        ]
      };
    }
  };
  </script>
  
  <style scoped>
  /* 引入的样式文件 */
  @import '@/assets/css/bootstrap.min.css';
  @import '@/assets/css/style.css';
  </style>