<template>

  <PGC5 :head="head" :subhead1="subhead1" :subhead2="subhead2" :itemList1="itemList1" :itemList2="itemList2" />

</template>

<script>
import PGC5 from "@/components/ProjectGroup/PGC5.vue";
export default {
  name: "ProjectGroup",
  components: {
    PGC5,
  },
  data() {

    return {
      head: "项目组操作面板",
      subhead1: "功能操作",
      subhead2: "查看验收情况",
      itemList1: [
        { title: "日常质量管理和基础工作记录", href: "/PG1" },
        { title: "项目开工申请", href: "/PG2" },
        { title: "项目质量管理", href: "/PG3" },
        { title: "计划报送", href: "/PG4" },
      ],
      itemList2: [
        { title: "施工过程质量监督检查情况", href: "/PG5" },
        { title: "验收考核情况", href: "/PG6" },
        { title: "项目最终查验意见", href: "/PG7" },
      ],
    };
  },
};
</script>

<style scoped>
/* 引入的样式文件 */
@import "@/assets/css/bootstrap.min.css";
@import "@/assets/css/style.css";
</style>