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
      head: "查看质量回访情况",
      url: "#",
      formArray: [
        { label: "回访形式", value: "fwefwe", type: "text", isReadOnly: true },
        { label: "回访情况记录", value: "", type: "file", isReadOnly: true },
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