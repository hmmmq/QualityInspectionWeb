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
        head: "定期上报工程质量情况表",
        url: "#",
        formArray: [
          { label: "上报日期", value: "", type: "date" },
          { label: "传附件", value: "", type: "file" },
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