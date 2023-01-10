import { createRouter, createWebHistory } from "vue-router";
import AboutChuck from "../views/AboutChuck.vue";
import AboutMe from "@/views/AboutMe";

const routes = [
  {
    path: "/",
    name: "AboutChuck",
    component: AboutChuck,
  },
  {
    path: "/about",
    name: "AboutMe",
    component: AboutMe,
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
