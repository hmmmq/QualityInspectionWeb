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
      url:"#",
      head: "记录各次质量培训信息",
      formArray: [
        { label: "培训对象", value: "", type: "text" },
        { label: "主持人", value: "", type: "text" },
        { label: "时间日期", value: "", type: "date" },
        { label: "培训内容", value: "", type: "textarea" },
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
