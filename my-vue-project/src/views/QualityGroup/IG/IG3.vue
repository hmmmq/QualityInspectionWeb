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
            head: '验收考核情况及结果',
            itemList1: [
                { title: "查看预验收记录", href: "/QG_IG3_1" },
                { title: "查看正式联合验收记录", href: "/QG_IG3_2" }
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