<template>
<PGC7 :itemList1="itemList1" :head="head" />
</template>
<script>
import PGC7 from '@/components/ProjectGroup/PGC7.vue';
export default {
  components: {
    PGC7
  },
  data() {
    return {
      head:'日常质量管理和基础工作记录',
      itemList1: [
        { title: "记录质量教育会议信息", href: "/PG1_1" },
        { title: "记录各次质量培训信息", href: "/PG1_2" },
        { title: "记录质量小组活动情况", href: "/PG1_3" },
        { title: "记录内业资料及档案管理情况", href: "#" },
      ]
    };
  },
};
</script>
  
<style scoped>
/* 引入的样式文件 */
@import "@/assets/css/bootstrap.min.css";
@import "@/assets/css/style.css";
</style>
