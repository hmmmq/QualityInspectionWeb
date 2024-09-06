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
          head:'项目开工申请',
          itemList1: [
            { title: "申请开工", href: "/PG2_1" },
            { title: "查看通知状态", href: "/PG2_2" },
            { title: "查看工序负责人", href: "/PG2_3" }
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
    