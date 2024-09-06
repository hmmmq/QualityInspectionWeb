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
      head: "查看发布质量管理例会信息",
      url: "#",
      formArray: [
        { label: "召开时间", value: "2024-09-10", type: "text", isReadOnly: true },
        { label: "会议要求", value: "qaefdqfq", type: "text", isReadOnly: true },
        { label: "会议名称", value: "qaefdqfq", type: "textarea", isReadOnly: true },
        { label: "项目工程进展", value: "qaefdqfq", type: "text", isReadOnly: true },
        { label: "项目质量管理整体情况", value: "qaefdqfq", type: "text", isReadOnly: true },
        { label: "本月质量管理存在问题及整改要求", value: "qaefdqfq", type: "text", isReadOnly: true },
        { label: "监理单位及上级机关质量管理工作要求", value: "qaefdqfq", type: "text", isReadOnly: true },
        { label: "质量管理奖罚情况", value: "qaefdqfq", type: "text", isReadOnly: true },
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