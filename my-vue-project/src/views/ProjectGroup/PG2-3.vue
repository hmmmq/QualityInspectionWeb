<template>
    <div v-for="(process, index) in processes2" :key="index">
        <PGC9 :formArray="process" :head="head2" :isShowButton="false" :isReadonly="true" />
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

            head2: "工序",

            url2: "/process",

            processes2: []
        };
    },
    mounted() {

        this.fetchProcesses2();
    },
    methods: {

        async fetchProcesses2() {
            try {
                const response = await axios.get(this.url2);
                this.processes2 = this.transformData(response.data, 'process2');
            } catch (error) {
                console.error("Error fetching processes2:", error);
            }
        },
        transformData(data, type) {
            const labels = {

                process2: {
                    processId: "工序编号",
                    processName: "工序名称",
                    responsiblePerson: "负责人",
                    processDescription: "工序概述",
                    projectId: "所属项目编号",
                    projectName: "所属项目名称",
                    projectDescription: "所属项目概述",
                }
            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let vari = labels[type][key];
                    if (vari === undefined) {
                        console.log(vari);
                        return null;
                    }
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
                        if (value == null) {
                            value = '待定';
                        }
                    } else if (key === 'failReason' || key === 'finalSuggestion') {
                        if (value == null) {
                            value = '暂无';
                        }
                    }

                    return {
                        label: labels[type][key],
                        name: key,
                        value: value,
                        type: this.getFieldType(key),
                        isReadOnly: true
                    };
                }).filter(item => item !== null);
            });
        },
        getFieldType(key) {
            const typeMapping = {
                projectId: "number",
                projectStatus: "text",
                processId: "number",
                status: "text",
                startDate: "date",
                estimatedCompletionDate: "date",
                documentPath: "text",
                projectName: "text",
                projectDescription: "textarea",
                coverageArea: "textarea",
                processName: "text",
                processDescription: "textarea",
                responsiblePerson: "text",
                failReason: "text",
                finalSuggestion: "text"
            };
            return typeMapping[key] || "text";
        }
    }
};
</script>
<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>