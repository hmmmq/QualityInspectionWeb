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
        head: "动态更新工程质量责任追溯档案",
        url: "#",
        formArray: [
          { label: "建档时间", value: "", type: "date" },
          { label: "责任人姓名", value: "", type: "text" },
          { label: "职务", value: "", type: "text" },
          { label: "专业", value: "", type: "text" },
          { label: "联系方式", value: "", type: "text" },
          { label: "身份证号码", value: "", type: "text" },
          { label: "责任时间-上岗时间", value: "", type: "date" },
          { label: "责任时间-离岗时间", value: "", type: "date" },
          { label: "主要负责内容", value: "", type: "text" },
          { label: "任职期间工作评价", value: "", type: "text" },
          { label: "第几年", value: "", type: "number" },
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