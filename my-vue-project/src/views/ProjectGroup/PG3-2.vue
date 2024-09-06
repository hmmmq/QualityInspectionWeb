<template>
    <PGC6 :formArray="formArray" :url="url" :head="head" :isShowButton="false" />
  </template>
  
  <script>
  import PGC6 from '@/components/ProjectGroup/PGC6.vue';
  export default {
    components: {
      PGC6
    },
    data() {
      return {
        head: '记录质量“三检制”情况',
        url: '#',
        formArray: [{ label: '班组长自检', value: '合格', type: 'text', isReadOnly: true },
        { label: '现场技术人员检查', value: '不合格', type: 'text' , isReadOnly: true},
        { label: '专职质检员检查', value: '待定', type: 'text', isReadOnly: true }
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