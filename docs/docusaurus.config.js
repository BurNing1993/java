module.exports = {
  title: 'Java笔记',
  tagline: 'SpringBoot,SpringCloud实用干货!',
  url: 'https://burning1993.github.io',
  baseUrl: '/java/',
  favicon: 'img/favicon.ico',
  organizationName: 'burning1993', // Usually your GitHub org/user name.
  projectName: 'java', // Usually your repo name.
  themeConfig: {
    navbar: {
      title: 'Java笔记',
      logo: {
        alt: 'NoteLogo',
        src: 'img/logo.svg',
      },
      links: [
        { to: 'docs/spring-boot-base', label: 'Docs', position: 'right' },
        { to: 'blog', label: 'Blog', position: 'right' },
        {
          href: 'https://github.com/BurNing1993',
          label: 'GitHub',
          position: 'right',
        },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Docs',
          items: [

          ],
        },
        {
          title: 'Community',
          items: [

          ],
        },
        {
          title: 'Social',
          items: [
            {
              label: 'Blog',
              to: 'blog',
            },
            {
              label: 'GitHub',
              href: 'https://github.com/BurNing1993',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Joey`,
    },
  },
  presets: [
    [
      '@docusaurus/preset-classic',
      {
        docs: {
          sidebarPath: require.resolve('./sidebars.js'),
          editUrl:
            'https://github.com/BurNing1993/java/tree/master/docs',
        },
        theme: {
          customCss: require.resolve('./src/css/custom.css'),
        },
      },
    ],
  ],
};
