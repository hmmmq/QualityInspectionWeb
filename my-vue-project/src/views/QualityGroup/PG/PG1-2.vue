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
      url: "#",
      head: "查看各次质量培训信息",
      formArray: [
        { label: "培训对象", value: "weffewf", type: "text", isReadOnly: true },
        { label: "主持人", value: "ewfewf", type: "text", isReadOnly: true },
        { label: "时间日期", value: "wefew", type: "text", isReadOnly: true },
        { label: "培训内容", value: "wefefwe", type: "textarea", isReadOnly: true },
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
