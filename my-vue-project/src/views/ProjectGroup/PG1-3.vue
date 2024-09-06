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
      head: "记录质量小组活动情况",
      url: "#",
      formArray: [
        { label: "时间日期", value: "", type: "date" },
        { label: "地点", value: "", type: "text" },
        { label: "活动内容", value: "", type: "textarea" },
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