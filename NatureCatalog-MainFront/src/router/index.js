import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/exhibitions',
    name: 'exhibitions',
    component: () => import('../views/ExhibitionView.vue')
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('../views/LoginView.vue')
  },
  {
    path: '/forum',
    name: 'forum',
    component: () => import('../views/ForumView.vue')
  },
  {
    path: '/signup',
    name: 'signup',
    component: () => import('../views/SignUp.vue')
  },
  {
    path: '/find',
    name: 'find',
    component: () => import('../views/FindIDView.vue')
  },
  {
    path: '/Wujin',
    name: 'Wujin',
    component: () => import('../views/ExWujinView.vue')
  },
  {
    path: '/Dohyon',
    name: 'Dohyon',
    component: () => import('../views/ExDohyonView.vue')
  },
  {
    path: '/forum/:id',
    name: 'forumDetail',
    component: () => import('../views/ForumViewDetail.vue')
  },
  {
    path: '/comment/:id',
    name: 'comment',
    component: () => import('../views/CommentView.vue')
  },
  {
    path: '/forum/write',
    name: 'forumWrite',
    component: () => import('../views/newForum.vue')
  },
  {
    path: '/forum/update:id',
    name: 'forumUpdate',
    component: () => import('../views/updateForm.vue')
  },
  {
    path: '/forum/delete:id',
    name: 'forumDelete',
    component: () => import('../views/deleteForum.vue')
  },
  
  
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
