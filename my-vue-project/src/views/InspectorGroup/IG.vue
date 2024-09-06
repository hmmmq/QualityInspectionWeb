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
            head: "专职质检员界面",
            subhead1: "",
            subhead2: "验收考核",
            itemList1: [
                { title: "指派负责人", href: "/IG1" },
                { title: "施工过程质量监督检查", href: "/IG2" }

            ],
            itemList2: [
                { title: "填写预验收记录", href: "/IG3_1" },
                { title: "填写正式联合验收记录", href: "/IG3_2" }
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