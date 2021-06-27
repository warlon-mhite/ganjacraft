const cssnano = require('cssnano');

module.exports = {
  purge: {
    mode: 'layers',
    content:['./public/**/*.html/']
  },
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {},
  },
  variants: { 
    extend: {},
  },
  plugins: [
    require('tailwindcss'),
    cssnano({
      preset: 'default',
    }),
    require('autoprefixer'),
  ],
};

