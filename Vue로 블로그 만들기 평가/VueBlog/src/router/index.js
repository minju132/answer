import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import DetailsView from '@/views/DetailsView.vue'
import BlogPost from '@/views/BlogPost.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      
        path: '/blogs/:id',
        name: 'blogs',
        component: DetailsView
      
    },
    {
      path: "/post",
      name: "post",
      component:BlogPost
    }
  ]
})

export default router
