module.exports = {
  title: 'Java笔记',
  description: 'Java,笔记',
  base: '/java/',
  head: [
    ['link', { rel: 'icon', href: '/logo.png' }],
  ],
  themeConfig: {
    sidebar: 'auto',
    lastUpdated: '上次更新', // string | boolean
    nav: [
      { text: 'Home', link: '/' },
      { text: 'SpringBoot', link: '/spring_boot/' },
      { text: 'Github', link: 'https://github.com/BurNing1993/Java' },
    ]
  },
  plugins: [
    '@vuepress/active-header-links',
    '@vuepress/back-to-top',
    '@vuepress/nprogress',
  ]
}