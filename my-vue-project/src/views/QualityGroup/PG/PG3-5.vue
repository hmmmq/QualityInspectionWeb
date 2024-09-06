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
      head: "查看质量管理相关施工过程资料",
      url: "#",
      formArray: [
        { label: "施工过程段", value: "sdcvfwedfveqwfwe", type: "text", isReadOnly: true },
        { label: "资料概况", value: "sdcvfwedfveqwfwe", type: "text", isReadOnly: true },
        { label: "资料文件或图片", value: "", type: "file", isReadOnly: true },

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