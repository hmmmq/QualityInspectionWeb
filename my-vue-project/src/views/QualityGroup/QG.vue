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
            head: "质量监督办公室界面",
            subhead1: "处理开工申请",
            subhead2: "质量监督管理情况查验",
            itemList1: [
                { title: "处理开工申请", href: "/QG1" }
            ],
            itemList2: [
                { title: "查看日常基础工作情况", href: "/QG2_1" },
                { title: "查看项目质量管理情况", href: "/QG2_2" },
                { title: "查看施工过程中质量监督检查信息", href: "/QG2_3" },
                { title: "查看验收考核情况及结果", href: "/QG2_4" },
                { title: "项目最终查验意见", href: "/QG2_5" }

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