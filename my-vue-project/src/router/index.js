import { createRouter, createWebHistory } from "vue-router";

// 引入PG组件
import HomePage from "@/views/HomePage.vue";
import PG from "@/views/ProjectGroup/PG.vue";
import PG1 from "@/views/ProjectGroup/PG1.vue";
import PG1_1 from "@/views/ProjectGroup/PG1-1.vue";
import PG1_2 from "@/views/ProjectGroup/PG1-2.vue";
import PG1_3 from "@/views/ProjectGroup/PG1-3.vue";
import PG2 from "@/views/ProjectGroup/PG2.vue";
import PG2_1 from "@/views/ProjectGroup/PG2-1.vue";
import PG2_2 from "@/views/ProjectGroup/PG2-2.vue";
import PG2_3 from "@/views/ProjectGroup/PG2-3.vue";
import PG3 from "@/views/ProjectGroup/PG3.vue";
import PG3_1 from "@/views/ProjectGroup/PG3-1.vue";
import PG3_2 from "@/views/ProjectGroup/PG3-2.vue";
import PG3_3 from "@/views/ProjectGroup/PG3-3.vue";
import PG3_4 from "@/views/ProjectGroup/PG3-4.vue";
import PG3_5 from "@/views/ProjectGroup/PG3-5.vue";
import PG3_6 from "@/views/ProjectGroup/PG3-6.vue";
import PG3_7 from "@/views/ProjectGroup/PG3-7.vue";
import PG3_8 from "@/views/ProjectGroup/PG3-8.vue";
import PG3_9 from "@/views/ProjectGroup/PG3-9.vue";
import PG4 from "@/views/ProjectGroup/PG4.vue";
import PG4_1 from "@/views/ProjectGroup/PG4-1.vue";
import PG4_2 from "@/views/ProjectGroup/PG4-2.vue";
import PG5 from "@/views/ProjectGroup/PG5.vue";
import PG6 from "@/views/ProjectGroup/PG6.vue";
import PG7 from "@/views/ProjectGroup/PG7.vue";
//引入IG组件
import IG from "@/views/InspectorGroup/IG.vue";
import IG1 from "@/views/InspectorGroup/IG1.vue";
import IG2 from "@/views/InspectorGroup/IG2.vue";
import IG3_1 from "@/views/InspectorGroup/IG3-1.vue";
import IG3_2 from "@/views/InspectorGroup/IG3-2.vue";
//引入QG组件
import QG from "@/views/QualityGroup/QG.vue";
import QG1 from "@/views/QualityGroup/QG1.vue";
import QG2_1 from "@/views/QualityGroup/QG2-1.vue";
import QG2_2 from "@/views/QualityGroup/QG2-2.vue";
import QG2_3 from "@/views/QualityGroup/QG2-3.vue";
import QG2_4 from "@/views/QualityGroup/QG2-4.vue";
import QG2_5 from "@/views/QualityGroup/QG2-5.vue";
import QG_IG2 from "@/views/QualityGroup/IG/IG2.vue";
import QG_IG3 from "@/views/QualityGroup/IG/IG3.vue";
import QG_IG3_1 from "@/views/QualityGroup/IG/IG3-1.vue";
import QG_IG3_2 from "@/views/QualityGroup/IG/IG3-2.vue";
import QG_PG1 from "@/views/QualityGroup/PG/PG1.vue";
import QG_PG1_1 from "@/views/QualityGroup/PG/PG1-1.vue";
import QG_PG1_2 from "@/views/QualityGroup/PG/PG1-2.vue";
import QG_PG1_3 from "@/views/QualityGroup/PG/PG1-3.vue";
import QG_PG3 from "@/views/QualityGroup/PG/PG3.vue";
import QG_PG3_1 from "@/views/QualityGroup/PG/PG3-1.vue";
import QG_PG3_2 from "@/views/QualityGroup/PG/PG3-2.vue";
import QG_PG3_3 from "@/views/QualityGroup/PG/PG3-3.vue";
import QG_PG3_4 from "@/views/QualityGroup/PG/PG3-4.vue";
import QG_PG3_5 from "@/views/QualityGroup/PG/PG3-5.vue";
import QG_PG3_6 from "@/views/QualityGroup/PG/PG3-6.vue";
import QG_PG3_7 from "@/views/QualityGroup/PG/PG3-7.vue";
import QG_PG3_8 from "@/views/QualityGroup/PG/PG3-8.vue";
import QG_PG3_9 from "@/views/QualityGroup/PG/PG3-9.vue";

// 路由配置
const routes = [
  {
    path: "/",
    name: "HomePage",
    component: HomePage,
  },
  {
    path: "/PG",
    name: "PG",
    component: PG,
  },
  {
    path: "/PG1",
    name: "PG1",
    component: PG1,
  },
  {
    path: "/PG1_1",
    name: "PG1_1",
    component: PG1_1,
  },
  {
    path: "/PG1_2",
    name: "PG1_2",
    component: PG1_2,
  },
  {
    path: "/PG1_3",
    name: "PG1_3",
    component: PG1_3,
  },
  {
    path: "/PG2",
    name: "PG2",
    component: PG2,
  },
  {
    path: "/PG2_1",
    name: "PG2_1",
    component: PG2_1,
  },
  {
    path: "/PG2_2",
    name: "PG2_2",
    component: PG2_2,
  },
  {
    path: "/PG2_3",
    name: "PG2_3",
    component: PG2_3,
  },
  {
    path: "/PG3",
    name: "PG3",
    component: PG3,
  },
  {
    path: "/PG3_1",
    name: "PG3_1",
    component: PG3_1,
  },
  {
    path: "/PG3_2",
    name: "PG3_2",
    component: PG3_2,
  },
  {
    path: "/PG3_3",
    name: "PG3_3",
    component: PG3_3,
  },
  {
    path: "/PG3_4",
    name: "PG3_4",
    component: PG3_4,
  },
  {
    path: "/PG3_5",
    name: "PG3_5",
    component: PG3_5,
  },
  {
    path: "/PG3_6",
    name: "PG3_6",
    component: PG3_6,
  },
  {
    path: "/PG3_7",
    name: "PG3_7",
    component: PG3_7,
  },
  {
    path: "/PG3_8",
    name: "PG3_8",
    component: PG3_8,
  },
  {
    path: "/PG3_9",
    name: "PG3_9",
    component: PG3_9,
  },
  {
    path: "/PG4",
    name: "PG4",
    component: PG4,
  },
  {
    path: "/PG4_1",
    name: "PG4_1",
    component: PG4_1,
  },
  {
    path: "/PG4_2",
    name: "PG4_2",
    component: PG4_2,
  },
  {
    path: "/PG5",
    name: "PG5",
    component: PG5,
  },
  {
    path: "/PG6",
    name: "PG6",
    component: PG6,
  },
  {
    path: "/PG7",
    name: "PG7",
    component: PG7,
  },
  {
    path: "/IG",
    name: "IG",
    component: IG,
  },
  {
    path: "/IG1",
    name: "IG1",
    component: IG1,
  },
  {
    path: "/IG2",
    name: "IG2",
    component: IG2,
  },
  {
    path: "/IG3_1",
    name: "IG3_1",
    component: IG3_1,
  },
  {
    path: "/IG3_2",
    name: "IG3_2",
    component: IG3_2,
  },
  {
    path: "/QG",
    name: "QG",
    component: QG,
  },
  {
    path: "/QG1",
    name: "QG1",
    component: QG1,
  },
  {
    path: "/QG2_1",
    name: "QG2_1",
    component: QG2_1,
  },
  {
    path: "/QG2_2",
    name: "QG2_2",
    component: QG2_2,
  },
  {
    path: "/QG2_3",
    name: "QG2_3",
    component: QG2_3,
  },
  {
    path: "/QG2_4",
    name: "QG2_4",
    component: QG2_4,
  },
  {
    path: "/QG2_5",
    name: "QG2_5",
    component: QG2_5,
  },
  {
    path: "/QG_IG2",
    name: "QG_IG2",
    component: QG_IG2,
  },
  {
    path: "/QG_IG3",
    name: "QG_IG3",
    component: QG_IG3,
  },
  {
    path: "/QG_IG3_1",
    name: "QG_IG3_1",
    component: QG_IG3_1,
  },
  {
    path: "/QG_IG3_2",
    name: "QG_IG3_2",
    component: QG_IG3_2,
  },
  {
    path: "/QG_PG1",
    name: "QG_PG1",
    component: QG_PG1,
  },
  {
    path: "/QG_PG1_1",
    name: "QG_PG1_1",
    component: QG_PG1_1,
  },
  {
    path: "/QG_PG1_2",
    name: "QG_PG1_2",
    component: QG_PG1_2,
  },
  {
    path: "/QG_PG1_3",
    name: "QG_PG1_3",
    component: QG_PG1_3,
  },
  {
    path: "/QG_PG3",
    name: "QG_PG3",
    component: QG_PG3,
  },
  {
    path: "/QG_PG3_1",
    name: "QG_PG3_1",
    component: QG_PG3_1,
  },
  {
    path: "/QG_PG3_2",
    name: "QG_PG3_2",
    component: QG_PG3_2,
  },
  {
    path: "/QG_PG3_3",
    name: "QG_PG3_3",
    component: QG_PG3_3,
  },
  {
    path: "/QG_PG3_4",
    name: "QG_PG3_4",
    component: QG_PG3_4,
  },
  {
    path: "/QG_PG3_5",
    name: "QG_PG3_5",
    component: QG_PG3_5,
  },
  {
    path: "/QG_PG3_6",
    name: "QG_PG3_6",
    component: QG_PG3_6,
  },
  {
    path: "/QG_PG3_7",
    name: "QG_PG3_7",
    component: QG_PG3_7,
  },
  {
    path: "/QG_PG3_8",
    name: "QG_PG3_8",
    component: QG_PG3_8,
  },
  {
    path: "/QG_PG3_9",
    name: "QG_PG3_9",
    component: QG_PG3_9,
  },
  { path: "/:pathMatch(.*)*", component: <div>404</div> },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
