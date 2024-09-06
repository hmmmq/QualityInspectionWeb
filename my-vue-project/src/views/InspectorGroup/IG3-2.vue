<template>
    <PGC9 :formArray="formArray" :head="'填写正式联合验收记录'" :isShowButton="true" :requestUrl="url" :requestType="'post'"
        :buttonAction="'提交'" />
    <div v-for="(item, index) in processes" :key="index">
        <PGC9 :formArray="item" :head="'历史正式联合验收记录'" :isShowButton="true" :requestUrl="getRequestUrl(item)"
            :requestType="'put'" :buttonAction="'修改'" />
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
            head: '填写正式联合验收记录',
            url: '/completionAcceptanceRecord',
            processes: [],
            formArray: [
                { label: "编号(自动生成)", name: "recordId", value: "", type: "number" },
                { label: "项目编号", name: "projectId", value: "", type: "number" },
                { label: "项目名称", name: "projectName", value: "", type: "text" },
                { label: "结构类型", name: "structureType", value: "", type: "text" },
                { label: "楼层数和面积", name: "numberOfFloorsArea", value: "", type: "text" },
                { label: "施工单位", name: "constructionUnit", value: "", type: "text" },
                { label: "技术负责人", name: "technicalDirector", value: "", type: "text" },
                { label: "开始日期", name: "startDate", value: "", type: "date" },
                { label: "项目经理", name: "projectManager", value: "", type: "text" },
                { label: "项目技术负责人", name: "projectTechnicalDirector", value: "", type: "text" },
                { label: "完成日期", name: "completionDate", value: "", type: "date" },
                { label: "分部验收", name: "subdivisionAcceptance", value: "", type: "text" },
                { label: "质量控制资料", name: "qualityControlData", value: "", type: "text" },
                { label: "安全功能检查", name: "safetyFunctionCheck", value: "", type: "text" },
                { label: "外观质量", name: "appearanceQuality", value: "", type: "text" },
                { label: "分部验收状态", name: "subdivisionAcceptanceStatus", value: "", type: "number" },
                { label: "质量控制资料状态", name: "qualityControlDataStatus", value: "", type: "number" },
                { label: "安全功能检查状态", name: "safetyFunctionCheckStatus", value: "", type: "number" },
                { label: "外观质量状态", name: "appearanceQualityStatus", value: "", type: "number" },
                { label: "建设单位", name: "constructingUnit", value: "", type: "text" },
                { label: "监理单位", name: "supervisionUnit", value: "", type: "text" },
                { label: "施工单位2", name: "constructionUnit2", value: "", type: "text" },
                { label: "设计单位", name: "designUnit", value: "", type: "text" },
                { label: "勘察单位", name: "surveyUnit", value: "", type: "text" },
                { label: "施工单位签字", name: "constructionUnitSignature", value: "", type: "text" },
                { label: "施工单位签字日期", name: "constructionUnitSignatureDate", value: "", type: "date" },
                { label: "监理单位签字", name: "supervisionUnitSignature", value: "", type: "text" },
                { label: "监理单位签字日期", name: "supervisionUnitSignatureDate", value: "", type: "date" },
                { label: "结论", name: "conclusion", value: "", type: "text" }

            ],
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

                    recordId: "编号(自动生成)",
                    projectId: "项目编号",
                    projectName: "项目名称",
                    structureType: "结构类型",
                    numberOfFloorsArea: "楼层数和面积",
                    constructionUnit: "施工单位",
                    technicalDirector: "技术负责人",
                    startDate: "开始日期",
                    projectManager: "项目经理",
                    projectTechnicalDirector: "项目技术负责人",
                    completionDate: "完成日期",
                    subdivisionAcceptance: "分部验收",
                    qualityControlData: "质量控制资料",
                    safetyFunctionCheck: "安全功能检查",
                    appearanceQuality: "外观质量",
                    subdivisionAcceptanceStatus: "分部验收状态",
                    qualityControlDataStatus: "质量控制资料状态",
                    safetyFunctionCheckStatus: "安全功能检查状态",
                    appearanceQualityStatus: "外观质量状态",
                    constructingUnit: "建设单位",
                    supervisionUnit: "监理单位",
                    constructionUnit2: "施工单位",
                    designUnit: "设计单位",
                    surveyUnit: "勘察单位",
                    constructionUnitSignature: "施工单位签字",
                    constructionUnitSignatureDate: "施工单位签字日期",
                    supervisionUnitSignature: "监理单位签字",
                    supervisionUnitSignatureDate: "监理单位签字日期",
                    conclusion: "结论"

                }
            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let value = item[key];
                    let isreadonly = false;
                    if (key.includes('project') || key.includes('record')) {
                        isreadonly = true;
                    }
                    return {
                        label: labels[type][key],
                        name: key,
                        value: value,
                        type: this.getFieldType(key),
                        isReadOnly: isreadonly
                    };
                });
            });
        },
        getFieldType(key) {
            const typeMapping = {


                recordId: "number",
                projectId: "number",
                projectName: "text",
                structureType: "text",
                numberOfFloorsArea: "text",
                constructionUnit: "text",
                technicalDirector: "text",
                startDate: "date",
                projectManager: "text",
                projectTechnicalDirector: "text",
                completionDate: "date",
                subdivisionAcceptance: "text",
                qualityControlData: "text",
                safetyFunctionCheck: "text",
                appearanceQuality: "text",
                subdivisionAcceptanceStatus: "number",
                qualityControlDataStatus: "number",
                safetyFunctionCheckStatus: "number",
                appearanceQualityStatus: "number",
                constructingUnit: "text",
                supervisionUnit: "text",
                constructionUnit2: "text",
                designUnit: "text",
                surveyUnit: "text",
                constructionUnitSignature: "text",
                constructionUnitSignatureDate: "date",
                supervisionUnitSignature: "text",
                supervisionUnitSignatureDate: "date",
                conclusion: "text"
            };

            return typeMapping[key] || "text";
        },
        getRequestUrl(process) {
            const recordId = process.find(field => field.name === 'recordId').value;
            return `/completionAcceptanceRecord/${recordId}`;
        }
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>