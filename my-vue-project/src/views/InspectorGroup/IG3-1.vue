<template>
    <PGC9 :formArray="formArray" :head="'填写预验收记录'" :isShowButton="true" :requestUrl="url" :requestType="'post'"
        :buttonAction="'提交'" />
    <div v-for="(item, index) in processes" :key="index">
        <PGC9 :formArray="item" :head="'历史预验收记录'" :isShowButton="true" :requestUrl="getRequestUrl(item)"
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
            head: '填写预验收记录',
            url: '/preAcceptanceRecord',
            processes: [],
            formArray: [
                {
                    label: "编号(自动生成)", name: "recordId", value: "", type: "number"
                },
                {
                    label: "项目编号", name: "projectId", value: "", type: "number"
                },
                {
                    label: "项目名称", name: "projectName", value: "", type: "text"
                },
                {
                    label: "项目地点", name: "projectLocation", value: "", type: "text"
                },
                {
                    label: "建设单位", name: "constructingUnit", value: "", type: "text"
                },
                {
                    label: "施工单位", name: "constructionUnit", value: "", type: "text"
                },
                {
                    label: "监理单位", name: "supervisionUnit", value: "", type: "text"
                },
                {
                    label: "设计单位", name: "designUnit", value: "", type: "text"
                },
                {
                    label: "规模描述", name: "scaleDescription", value: "", type: "text"
                },
                {
                    label: "建筑面积", name: "buildingArea", value: "", type: "number"
                },
                {
                    label: "楼层数", name: "numberOfFloors", value: "", type: "number"
                },
                {
                    label: "开始日期", name: "startDate", value: "", type: "date"
                },
                {
                    label: "完成日期", name: "completionDate", value: "", type: "date"
                },
                {
                    label: "主体结构状态", name: "mainStructureStatus", value: "", type: "number"
                },
                {
                    label: "主体结构原因", name: "mainStructureReason", value: "", type: "text"
                },
                {
                    label: "装饰状态", name: "decorationStatus", value: "", type: "number"
                },
                {
                    label: "装饰原因", name: "decorationReason", value: "", type: "text"
                },
                {
                    label: "屋顶状态", name: "roofingStatus", value: "", type: "number"
                },
                {
                    label: "屋顶原因", name: "roofingReason", value: "", type: "text"
                },
                {
                    label: "管道安装状态", name: "plumbingInstallationStatus", value: "", type: "number"
                },
                {
                    label: "管道安装原因", name: "plumbingInstallationReason", value: "", type: "text"
                },
                {
                    label: "卫生设备状态", name: "sanitaryFixturesStatus", value: "", type: "number"
                },
                {
                    label: "卫生设备原因", name: "sanitaryFixturesReason", value: "", type: "text"
                },
                {
                    label: "电线状态", name: "electricalWiringStatus", value: "", type: "number"
                },
                {
                    label: "电线原因", name: "electricalWiringReason", value: "", type: "text"
                },
                {
                    label: "配电箱状态", name: "distributionBoxStatus", value: "", type: "number"
                },
                {
                    label: "配电箱原因", name: "distributionBoxReason", value: "", type: "text"
                },
                {
                    label: "通风管道状态", name: "ventilationDuctStatus", value: "", type: "number"
                },
                {
                    label: "通风管道原因", name: "ventilationDuctReason", value: "", type: "text"
                },
                {
                    label: "空调状态", name: "airConditioningStatus", value: "", type: "number"
                },
                {
                    label: "空调原因", name: "airConditioningReason", value: "", type: "text"
                },
                {
                    label: "整体质量状态", name: "overallQualityStatus", value: "", type: "number"
                },
                {
                    label: "整体质量原因", name: "overallQualityReason", value: "", type: "text"
                },
                {
                    label: "文件完整性状态", name: "documentationCompletenessStatus", value: "", type: "number"
                },
                {
                    label: "文件完整性原因", name: "documentationCompletenessReason", value: "", type: "text"
                },
                {
                    label: "预验收结论状态", name: "preAcceptanceConclusionStatus", value: "", type: "number"
                },
                {
                    label: "问题描述", name: "issuesDescription", value: "", type: "text"
                },
                {
                    label: "整改要求", name: "rectificationRequirements", value: "", type: "text"
                },
                {
                    label: "整改期限", name: "rectificationDeadline", value: "", type: "date"
                },
                {
                    label: "负责人", name: "responsiblePerson", value: "", type: "text"
                },
                {
                    label: "施工单位签字", name: "constructionUnitSignature", value: "", type: "text"
                },
                {
                    label: "监理单位签字", name: "supervisionUnitSignature", value: "", type: "text"
                },
                {
                    label: "建设单位签字", name: "constructingUnitSignature", value: "", type: "text"
                },
                {
                    label: "设计单位签字", name: "designUnitSignature", value: "", type: "text"
                },
                {
                    label: "验收日期", name: "acceptanceDate", value: "", type: "date"
                }

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
                    projectLocation: "项目地点",
                    constructingUnit: "建设单位",
                    constructionUnit: "施工单位",
                    supervisionUnit: "监理单位",
                    designUnit: "设计单位",
                    scaleDescription: "规模描述",
                    buildingArea: "建筑面积",
                    numberOfFloors: "楼层数",
                    startDate: "开始日期",
                    completionDate: "完成日期",
                    mainStructureStatus: "主体结构状态",
                    mainStructureReason: "主体结构原因",
                    decorationStatus: "装饰状态",
                    decorationReason: "装饰原因",
                    roofingStatus: "屋顶状态",
                    roofingReason: "屋顶原因",
                    plumbingInstallationStatus: "管道安装状态",
                    plumbingInstallationReason: "管道安装原因",
                    sanitaryFixturesStatus: "卫生设备状态",
                    sanitaryFixturesReason: "卫生设备原因",
                    electricalWiringStatus: "电线状态",
                    electricalWiringReason: "电线原因",
                    distributionBoxStatus: "配电箱状态",
                    distributionBoxReason: "配电箱原因",
                    ventilationDuctStatus: "通风管道状态",
                    ventilationDuctReason: "通风管道原因",
                    airConditioningStatus: "空调状态",
                    airConditioningReason: "空调原因",
                    overallQualityStatus: "整体质量状态",
                    overallQualityReason: "整体质量原因",
                    documentationCompletenessStatus: "文件完整性状态",
                    documentationCompletenessReason: "文件完整性原因",
                    preAcceptanceConclusionStatus: "预验收结论状态",
                    issuesDescription: "问题描述",
                    rectificationRequirements: "整改要求",
                    rectificationDeadline: "整改期限",
                    responsiblePerson: "负责人",
                    constructionUnitSignature: "施工单位签字",
                    supervisionUnitSignature: "监理单位签字",
                    constructingUnitSignature: "建设单位签字",
                    designUnitSignature: "设计单位签字",
                    acceptanceDate: "验收日期"
                }
            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let value = item[key];
                    let isreadonly = true;
                    if (!(key && key.includes('record') || key.includes('project'))) {
                        isreadonly = false;
                    }
                    return {
                        label: labels[type][key] || key,
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
                projectLocation: "text",
                constructingUnit: "text",
                constructionUnit: "text",
                supervisionUnit: "text",
                designUnit: "text",
                scaleDescription: "text",
                buildingArea: "number",
                numberOfFloors: "number",
                startDate: "date",
                completionDate: "date",
                mainStructureStatus: "number",
                mainStructureReason: "text",
                decorationStatus: "number",
                decorationReason: "text",
                roofingStatus: "number",
                roofingReason: "text",
                plumbingInstallationStatus: "number",
                plumbingInstallationReason: "text",
                sanitaryFixturesStatus: "number",
                sanitaryFixturesReason: "text",
                electricalWiringStatus: "number",
                electricalWiringReason: "text",
                distributionBoxStatus: "number",
                distributionBoxReason: "text",
                ventilationDuctStatus: "number",
                ventilationDuctReason: "text",
                airConditioningStatus: "number",
                airConditioningReason: "text",
                overallQualityStatus: "number",
                overallQualityReason: "text",
                documentationCompletenessStatus: "number",
                documentationCompletenessReason: "text",
                preAcceptanceConclusionStatus: "number",
                issuesDescription: "text",
                rectificationRequirements: "text",
                rectificationDeadline: "date",
                responsiblePerson: "text",
                constructionUnitSignature: "text",
                supervisionUnitSignature: "text",
                constructingUnitSignature: "text",
                designUnitSignature: "text",
                acceptanceDate: "date"

            };
            return typeMapping[key] || "text";
        },
        getRequestUrl(process) {
            const recordId = process.find(field => field.name === 'recordId').value;
            return `/preAcceptanceRecord/${recordId}`;
        }
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>