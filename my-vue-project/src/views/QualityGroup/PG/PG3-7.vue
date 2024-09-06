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
      head: "查看定期上报工程质量情况表",
      url: "#",
      formArray: [
        { label: "上报日期", value: "sdewvfwed", type: "text", isReadOnly: true },
        { label: "传附件", value: "", type: "file", isReadOnly: true },
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