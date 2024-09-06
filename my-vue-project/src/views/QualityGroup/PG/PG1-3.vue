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
      head: "查看质量小组活动情况",
      url: "#",
      formArray: [
        { label: "时间日期", value: "sdfvwgv", type: "text", isReadOnly: true },
        { label: "地点", value: "wegfwegf", type: "text", isReadOnly: true },
        { label: "活动内容", value: "wefgwse", type: "textarea", isReadOnly: true },
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