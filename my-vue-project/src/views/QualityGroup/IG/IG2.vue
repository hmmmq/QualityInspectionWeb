<template>
    <div v-for="(item, index) in processes" :key="index">
        <PGC9 :formArray="item" :head="'施工过程质量监督检查'" :isShowButton="false" :isReadOnly2="true" />
    </div>
</template>

<script>
import axios from 'axios';
import PGC9 from '@/components/ProjectGroup/PGC9.vue';
export default {
    components: {
        PGC9
    },
    data() {
        return {
            head: '施工过程质量监督检查',
            url: '/inspection',
            processes: [],
        };
    },
    mounted() {

        this.fetchProcesses();
    },
    methods: {

        async fetchProcesses() {
            try {
                const response = await axios.get(this.url);
                this.processes = this.transformData(response.data, 'process');
            } catch (error) {
                console.error("Error fetching processes:", error);
            }
        },
        transformData(data, type) {
            const labels = {

                process: {
                    inspectionId: "编号(自动生成)",
                    inspector: "质检员姓名",
                    projectId: "项目编号",
                    projectName: "项目名称",
                    projectDescription: "项目概述",
                    standard1Status: "一：施工测量放线正确，精度符合要求，并有复测记录",
                    standard1Reason: "不通过原因(如有)",
                    standard2Status: "二：按照设计文件、技术标准和现行施工规范要求组织施工、操作方法正确，工程质量符合设计、合同及验收要求",
                    standard2Reason: "不通过原因(如有)",
                    standard3Status: "三：变更设计已履行审批程序",
                    standard3Reason: "不通过原因(如有)",
                    standard4Status: "四：工程日志等原始质量文件记录填写及时、真实、准确、完整、规范、清除，签认完全，符合要求",
                    standard4Reason: "不通过原因(如有)",
                    standard5Status: "五：有关保证工程质量的措施已制定和落实",
                    standard5Reason: "不通过原因(如有)",
                    standard6Status: "六：施工中的质量通病及特殊工序制定有针对性的预防措施",
                    standard6Reason: "不通过原因(如有)",
                    standard7Status: "七：建筑材料、成品、半成品、设备等按规定检验，试验报告、出厂合格证齐全，并经相关责任人员签认",
                    standard7Reason: "不通过原因(如有)",
                    standard8Status: "八：严格执行班组“三检制”和成品保护制，发现问题及时处理，相关记录齐全",
                    standard8Reason: "不通过原因(如有)",
                    standard9Status: "九：混凝土、砂浆试件、填筑土方密实度等按规定要求进行试验和检测",
                    standard9Reason: "不通过原因(如有)"
                }
            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let value = item[key];
                    if (key === 'documentPath' && value) {
                        value = value.split('\\').pop(); // 处理文件路径，只保留文件名
                    }
                    if (key === 'status' || key === 'projectStatus') {
                        if (value == 0) {
                            value = '待定';
                        } else if (value == 1) {
                            value = '已通过';
                        } else if (value == 2) {
                            value = '未通过';
                        }
                    } else if (key === 'responsiblePerson') {
                        if (value == "text") {
                            value = '待定';
                        }
                    } else if (key === 'failReason' || key === 'finalSuggestion') {
                        if (value == "text") {
                            value = '暂无';
                        }
                    }

                    return {
                        label: labels[type][key] || key,
                        name: key,
                        value: value,
                        type: this.getFieldType(key)
                    };
                });
            });
        },
        getFieldType(key) {
            const typeMapping = {

                inspectionId: "number",
                inspector: "text",
                projectId: "number",
                projectName: "text",
                projectDescription: "text",
                standard1Status: "number",
                standard1Reason: "text",
                standard2Status: "number",
                standard2Reason: "text",
                standard3Status: "number",
                standard3Reason: "text",
                standard4Status: "number",
                standard4Reason: "text",
                standard5Status: "number",
                standard5Reason: "text",
                standard6Status: "number",
                standard6Reason: "text",
                standard7Status: "number",
                standard7Reason: "text",
                standard8Status: "number",
                standard8Reason: "text",
                standard9Status: "number",
                standard9Reason: "text"

            };
            return typeMapping[key] || "text";
        },
        getRequestUrl(process) {
            const inspectionId = process.find(field => field.name === 'inspectionId').value;
            return `/inspection/${inspectionId}`;
        }
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>