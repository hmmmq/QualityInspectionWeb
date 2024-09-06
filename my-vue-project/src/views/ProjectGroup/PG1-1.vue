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
      head: '记录质量教育会议信息',
      url: '#',
      formArray: [{ label: '编号', value: '', type: 'text' },
      { label: '会议名称', value: '', type: 'text' },
      { label: '到会人员', value: '', type: 'text' },
      { label: '时间日期', value: '', type: 'date' },
      { label: '会议主持人', value: '', type: 'text' },
      { label: '内容概要', value: '', type: 'textarea' }]
    };
  }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>