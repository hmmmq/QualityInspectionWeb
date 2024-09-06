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
      head: '查看质量教育会议信息',
      url: '#',
      formArray: [{ label: '编号', value: 'edsfwf', type: 'text', isReadOnly: true },
      { label: '会议名称', value: 'qewfdweqa', type: 'text', isReadOnly: true },
      { label: '到会人员', value: 'wefwef', type: 'text', isReadOnly: true },
      { label: '时间日期', value: '2024-08-09', type: 'text', isReadOnly: true },
      { label: '会议主持人', value: 'wefwef', type: 'text', isReadOnly: true },
      { label: '内容概要', value: 'wefwef', type: 'textarea', isReadOnly: true }]
    };
  }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>