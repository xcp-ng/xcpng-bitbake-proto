
inherit dnf-bridge

PN = "texlive"
PE = "13"
PV = "20240311"
PR = "6.el10"
PACKAGES = "texlive texlive-acronym texlive-adjustbox texlive-ae texlive-algorithms texlive-alphalph texlive-amscls texlive-amsfonts texlive-amsmath texlive-anyfontsize texlive-anysize texlive-appendix texlive-arphic texlive-atbegshi texlive-attachfile texlive-attachfile2 texlive-atveryend texlive-auxhook texlive-avantgar texlive-awesomebox texlive-babel texlive-babel-english texlive-babelbib texlive-base texlive-beamer texlive-bera texlive-beton texlive-bibtex texlive-bibtopic texlive-bidi texlive-bigfoot texlive-bigintcalc texlive-bitset texlive-bookman texlive-bookmark texlive-booktabs texlive-breakurl texlive-breqn texlive-capt-of texlive-caption texlive-carlisle texlive-catchfile texlive-changebar texlive-changepage texlive-charter texlive-chngcntr texlive-cite texlive-classpack texlive-cm texlive-cm-lgc texlive-cm-super texlive-cmap texlive-cmextra texlive-cns texlive-collectbox texlive-collection-basic texlive-collection-fontsrecommended texlive-collection-htmlxml texlive-collection-latex texlive-collection-latexrecommended texlive-collection-xetex texlive-colorprofiles texlive-colortbl texlive-context texlive-count1to texlive-courier texlive-crop texlive-csquotes texlive-ctable texlive-ctablestack texlive-currfile texlive-datetime texlive-dehyph texlive-dvipdfmx texlive-dvipng texlive-dvips texlive-dvisvgm texlive-ec texlive-eepic texlive-enctex texlive-enumitem texlive-environ texlive-epsf texlive-epstopdf texlive-epstopdf-pkg texlive-eqparbox texlive-eso-pic texlive-etex texlive-etex-pkg texlive-etexcmds texlive-etoc texlive-etoolbox texlive-euenc texlive-euler texlive-euro texlive-eurosym texlive-everysel texlive-everyshi texlive-extsizes texlive-fancybox texlive-fancyhdr texlive-fancyref texlive-fancyvrb texlive-filecontents texlive-filehook texlive-finstrut texlive-firstaid texlive-fix2col texlive-fixlatvian texlive-float texlive-fmtcount texlive-fncychap texlive-fontawesome texlive-fontbook texlive-fonts-tlwg texlive-fontspec texlive-fontware texlive-fontwrap texlive-footmisc texlive-footnotehyper texlive-fp texlive-fpl texlive-framed texlive-garuda-c90 texlive-geometry texlive-gettitlestring texlive-glyphlist texlive-graphics texlive-graphics-cfg texlive-graphics-def texlive-grfext texlive-grffile texlive-gsftopk texlive-hanging texlive-helvetic texlive-hobsub texlive-hologo texlive-hopatch texlive-hycolor texlive-hypcap texlive-hypdoc texlive-hyperref texlive-hyph-utf8 texlive-hyphen-base texlive-hyphenat texlive-hyphenex texlive-ifmtarg texlive-ifoddpage texlive-ifplatform texlive-iftex texlive-import texlive-index texlive-infwarerr texlive-intcalc texlive-jadetex texlive-jknapltx texlive-kastrup texlive-kerkis texlive-knuth-lib texlive-knuth-local texlive-koma-script texlive-kpathsea texlive-kvdefinekeys texlive-kvoptions texlive-kvsetkeys texlive-l3backend texlive-l3experimental texlive-l3kernel texlive-l3packages texlive-lastpage texlive-latex texlive-latex-fonts texlive-latex2man texlive-latexbug texlive-latexconfig texlive-letltxmacro texlive-lettrine texlive-lib texlive-linegoal texlive-lineno texlive-listings texlive-listofitems texlive-lm texlive-lm-math texlive-ltabptch texlive-ltxcmds texlive-ltxmisc texlive-lua-alt-getopt texlive-lua-uni-algos texlive-luahbtex texlive-lualatex-math texlive-lualibs texlive-luaotfload texlive-luatex texlive-luatex85 texlive-luatexbase texlive-lwarp texlive-makecmds texlive-makeindex texlive-manfnt-font texlive-marginnote texlive-marvosym texlive-mathpazo texlive-mathspec texlive-mathtools texlive-mdwtools texlive-memoir texlive-metafont texlive-metalogo texlive-metapost texlive-mflogo texlive-mflogo-font texlive-mfnfss texlive-mfware texlive-microtype texlive-minitoc texlive-mnsymbol texlive-modes texlive-mparhack texlive-mptopdf texlive-multido texlive-multirow texlive-multitoc texlive-natbib texlive-ncctools texlive-ncntrsbk texlive-needspace texlive-newfloat texlive-newunicodechar texlive-norasi-c90 texlive-notoccite texlive-ntgclass texlive-oberdiek texlive-overpic texlive-palatino texlive-paralist texlive-parallel texlive-parskip texlive-passivetex texlive-pdfcol texlive-pdfcolfoot texlive-pdfcolmk texlive-pdfescape texlive-pdflscape texlive-pdfmanagement-testphase texlive-pdfpages texlive-pdftex texlive-pdftexcmds texlive-pgf texlive-philokalia texlive-placeins texlive-plain texlive-polyglossia texlive-powerdot texlive-preprint texlive-psfrag texlive-pslatex texlive-psnfss texlive-pspicture texlive-pst-3d texlive-pst-arrow texlive-pst-blur texlive-pst-coil texlive-pst-eps texlive-pst-fill texlive-pst-grad texlive-pst-math texlive-pst-node texlive-pst-plot texlive-pst-slpe texlive-pst-text texlive-pst-tools texlive-pst-tree texlive-pstricks texlive-pstricks-add texlive-ptext texlive-pxfonts texlive-qstest texlive-ragged2e texlive-rcs texlive-realscripts texlive-refcount texlive-relsize texlive-rerunfilecheck texlive-rsfs texlive-sansmath texlive-sansmathaccent texlive-sauerj texlive-scheme-basic texlive-section texlive-sectsty texlive-seminar texlive-sepnum texlive-setspace texlive-sfmath texlive-showexpl texlive-soul texlive-stackengine texlive-stmaryrd texlive-stringenc texlive-subfig texlive-subfigure texlive-svn-prov texlive-symbol texlive-t2 texlive-tabu texlive-tabulary texlive-tex texlive-tex-gyre texlive-tex-gyre-math texlive-tex-ini-files texlive-tex4ht texlive-texlive-common-doc texlive-texlive-en texlive-texlive-msg-translations texlive-texlive-scripts texlive-texlive-scripts-extra texlive-texlive.infra texlive-textcase texlive-textpos texlive-threeparttable texlive-thumbpdf texlive-times texlive-tipa texlive-titlesec texlive-titling texlive-tocloft texlive-tools texlive-translator texlive-trimspaces texlive-txfonts texlive-type1cm texlive-typehtml texlive-ucharcat texlive-ucharclasses texlive-ucs texlive-uhc texlive-ulem texlive-underscore texlive-unicode-data texlive-unicode-math texlive-uniquecounter texlive-unisugar texlive-upquote texlive-url texlive-utopia texlive-varwidth texlive-wadalab texlive-was texlive-wasy texlive-wasy-type1 texlive-wasysym texlive-wrapfig texlive-xcolor texlive-xecolor texlive-xecyr texlive-xeindex texlive-xepersian texlive-xesearch texlive-xetex texlive-xetex-itrans texlive-xetex-pstricks texlive-xetexconfig texlive-xetexfontinfo texlive-xfrac texlive-xifthen texlive-xkeyval texlive-xltxtra texlive-xmltex texlive-xpatch texlive-xstring texlive-xtab texlive-xunicode texlive-zapfchan texlive-zapfding texlive-zref texlive-gnu-freefont texlive-lib-devel"


URI_texlive = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive = " \
 texlive-scheme-basic \
 texlive-collection-latexrecommended \
 texlive-kpathsea \
"

URI_texlive-acronym = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-acronym-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-acronym = " \
 texlive-relsize \
 texlive-bigfoot \
 texlive-kpathsea \
 texlive-xstring \
 texlive-base \
"

URI_texlive-adjustbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-adjustbox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-adjustbox = " \
 texlive-pgf \
 texlive-varwidth \
 texlive-graphics \
 texlive-kpathsea \
 texlive-tools \
 texlive-xkeyval \
 texlive-ifoddpage \
 texlive-collectbox \
 texlive-base \
"

URI_texlive-ae = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ae-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ae = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-algorithms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-algorithms-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-algorithms = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-latex \
 texlive-float \
 texlive-base \
"

URI_texlive-alphalph = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-alphalph-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-alphalph = " \
 texlive-kpathsea \
"

URI_texlive-amscls = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-amscls-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-amscls = " \
 texlive-url \
 texlive-kpathsea \
 texlive-amsfonts \
 texlive-amsmath \
 texlive-latex \
 texlive-base \
"

URI_texlive-amsfonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-amsfonts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-amsfonts = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-amsmath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-amsmath-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-amsmath = " \
 texlive-kpathsea \
 texlive-base \
 texlive-amsmath \
"

URI_texlive-anyfontsize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-anyfontsize-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-anyfontsize = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-anysize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-anysize-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-anysize = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-appendix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-appendix-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-appendix = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-arphic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-arphic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-arphic = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-atbegshi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-atbegshi-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-atbegshi = " \
 texlive-kpathsea \
"

URI_texlive-attachfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-attachfile-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-attachfile = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-tools \
 texlive-hyperref \
 texlive-iftex \
 texlive-base \
"

URI_texlive-attachfile2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-attachfile2-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-attachfile2 = " \
 perl-libs \
 texlive-kpathsea \
 perl-Digest-MD5 \
 perl-Getopt-Long \
 perl-POSIX \
 coreutils \
 texlive-base \
"

URI_texlive-atveryend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-atveryend-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-atveryend = " \
 texlive-kpathsea \
"

URI_texlive-auxhook = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-auxhook-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-auxhook = " \
 texlive-kpathsea \
"

URI_texlive-avantgar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-avantgar-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-avantgar = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-awesomebox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-awesomebox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-awesomebox = " \
 texlive-xltxtra \
 texlive-xcolor \
 texlive-tools \
 texlive-fontawesome \
 texlive-iftex \
 texlive-base \
"

URI_texlive-babel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-babel-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-babel = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-babel-english = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-babel-english-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-babel-english = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-babelbib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-babelbib-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-babelbib = " \
 texlive-kpathsea \
 texlive-babel \
 texlive-base \
"

URI_texlive-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-base-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-base = " \
 coreutils \
 bash \
"

URI_texlive-beamer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-beamer-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-beamer = " \
 texlive-etoolbox \
 texlive-xcolor \
 texlive-pgf \
 texlive-geometry \
 texlive-graphics \
 texlive-amscls \
 texlive-amsfonts \
 texlive-amsmath \
 texlive-hyperref \
 texlive-atbegshi \
 texlive-iftex \
 texlive-base \
 texlive-beamer \
 texlive-sansmathaccent \
 texlive-kpathsea \
 texlive-latex \
 texlive-tools \
 texlive-translator \
 texlive-ucs \
"

URI_texlive-bera = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bera-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bera = " \
 texlive-bera \
 texlive-graphics \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-beton = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-beton-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-beton = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-bibtex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bibtex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-bibtex = " \
 glibc \
 texlive-lib \
 texlive-base \
 texlive-kpathsea \
"

URI_texlive-bibtopic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bibtopic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bibtopic = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-bidi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bidi-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bidi = " \
 texlive-url \
 texlive-etoolbox \
 texlive-natbib \
 texlive-xcolor \
 texlive-fancyhdr \
 texlive-paralist \
 texlive-xifthen \
 texlive-zref \
 texlive-placeins \
 texlive-geometry \
 texlive-graphics \
 texlive-hopatch \
 texlive-hyperref \
 texlive-auxhook \
 texlive-iftex \
 texlive-ragged2e \
 texlive-base \
 texlive-bidi \
 texlive-sauerj \
 texlive-kpathsea \
 texlive-setspace \
 texlive-showexpl \
 texlive-latex \
 texlive-changepage \
 texlive-ltxcmds \
 texlive-titlesec \
 texlive-tools \
 texlive-marvosym \
"

URI_texlive-bigfoot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bigfoot-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bigfoot = " \
 texlive-bigfoot \
 texlive-ncctools \
 texlive-kpathsea \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-bigintcalc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bigintcalc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bigintcalc = " \
 texlive-kpathsea \
"

URI_texlive-bitset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bitset-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bitset = " \
 texlive-kpathsea \
 texlive-bigintcalc \
"

URI_texlive-bookman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bookman-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bookman = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-bookmark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-bookmark-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-bookmark = " \
 texlive-kpathsea \
"

URI_texlive-booktabs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-booktabs-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-booktabs = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-breakurl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-breakurl-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-breakurl = " \
 texlive-kpathsea \
 texlive-iftex \
 texlive-base \
 texlive-xkeyval \
"

URI_texlive-breqn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-breqn-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-breqn = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-l3kernel \
 texlive-tools \
 texlive-base \
"

URI_texlive-capt-of = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-capt-of-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-capt-of = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-caption = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-caption-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-caption = " \
 texlive-kpathsea \
 texlive-base \
 texlive-caption \
 texlive-graphics \
"

URI_texlive-carlisle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-carlisle-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-carlisle = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
 texlive-tools \
"

URI_texlive-catchfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-catchfile-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-catchfile = " \
 texlive-ltxcmds \
 texlive-etexcmds \
 texlive-kpathsea \
 texlive-infwarerr \
"

URI_texlive-changebar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-changebar-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-changebar = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-changepage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-changepage-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-changepage = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-charter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-charter-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-charter = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-chngcntr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-chngcntr-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-chngcntr = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cite-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cite = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-classpack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-classpack-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-classpack = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cm-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cm = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cm-lgc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cm-lgc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cm-lgc = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cm-super = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cm-super-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cm-super = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-cmap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cmap-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cmap = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cmextra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cmextra-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cmextra = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-cns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-cns-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-cns = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-collectbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collectbox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collectbox = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-collection-basic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-basic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-basic = " \
 texlive-modes \
 texlive-pdftex \
 texlive-plain \
 texlive-glyphlist \
 texlive-graphics-def \
 texlive-amsfonts \
 texlive-hyph-utf8 \
 texlive-hyphen-base \
 texlive-hyphenex \
 texlive-ifplatform \
 texlive-iftex \
 texlive-base \
 texlive-bibtex \
 texlive-knuth-lib \
 texlive-knuth-local \
 texlive-kpathsea \
 texlive-cm \
 texlive-tex \
 texlive-tex-ini-files \
 texlive-texlive-common-doc \
 texlive-texlive-en \
 texlive-lua-alt-getopt \
 texlive-texlive-msg-translations \
 texlive-colorprofiles \
 texlive-texlive.infra \
 texlive-luahbtex \
 texlive-texlive-scripts \
 texlive-luatex \
 texlive-makeindex \
 texlive-dvipdfmx \
 texlive-dvips \
 texlive-ec \
 texlive-enctex \
 texlive-metafont \
 texlive-mflogo \
 texlive-unicode-data \
 texlive-mfware \
 texlive-etex \
 texlive-etex-pkg \
"

URI_texlive-collection-fontsrecommended = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-fontsrecommended-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-fontsrecommended = " \
 texlive-utopia \
 texlive-euro \
 texlive-wasy-type1 \
 texlive-eurosym \
 texlive-wasy \
 texlive-ncntrsbk \
 texlive-wasysym \
 texlive-palatino \
 texlive-zapfchan \
 texlive-zapfding \
 texlive-fpl \
 texlive-helvetic \
 texlive-avantgar \
 texlive-pxfonts \
 texlive-base \
 texlive-rsfs \
 texlive-bookman \
 texlive-charter \
 texlive-symbol \
 texlive-cm-super \
 texlive-cmextra \
 texlive-tex-gyre \
 texlive-lm \
 texlive-lm-math \
 texlive-collection-basic \
 texlive-tex-gyre-math \
 texlive-courier \
 texlive-times \
 texlive-tipa \
 texlive-manfnt-font \
 texlive-marvosym \
 texlive-mathpazo \
 texlive-txfonts \
 texlive-ec \
 texlive-mflogo-font \
"

URI_texlive-collection-htmlxml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-htmlxml-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-htmlxml = " \
 texlive-collection-latex \
 texlive-jadetex \
 texlive-tex-ini-files \
 texlive-tex4ht \
 texlive-classpack \
 texlive-passivetex \
 texlive-xmltex \
 texlive-base \
 texlive-collection-basic \
 texlive-collection-fontsrecommended \
"

URI_texlive-collection-latex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-latex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-latex = " \
 texlive-etexcmds \
 texlive-url \
 texlive-mptopdf \
 texlive-natbib \
 texlive-fancyhdr \
 texlive-oberdiek \
 texlive-firstaid \
 texlive-fix2col \
 texlive-pdfescape \
 texlive-geometry \
 texlive-gettitlestring \
 texlive-graphics \
 texlive-graphics-cfg \
 texlive-pslatex \
 texlive-grfext \
 texlive-psnfss \
 texlive-ae \
 texlive-pspicture \
 texlive-amscls \
 texlive-amsmath \
 texlive-hycolor \
 texlive-hypcap \
 texlive-atbegshi \
 texlive-hyperref \
 texlive-atveryend \
 texlive-auxhook \
 texlive-babel \
 texlive-babel-english \
 texlive-babelbib \
 texlive-base \
 texlive-intcalc \
 texlive-refcount \
 texlive-rerunfilecheck \
 texlive-bitset \
 texlive-bookmark \
 texlive-kvoptions \
 texlive-kvdefinekeys \
 texlive-l3backend \
 texlive-kvsetkeys \
 texlive-l3kernel \
 texlive-carlisle \
 texlive-latex \
 texlive-latex-fonts \
 texlive-mfnfss \
 texlive-stringenc \
 texlive-latexconfig \
 texlive-letltxmacro \
 texlive-collection-basic \
 texlive-ltxcmds \
 texlive-ltxmisc \
 texlive-colortbl \
 texlive-tools \
 texlive-epstopdf-pkg \
 texlive-uniquecounter \
"

URI_texlive-collection-latexrecommended = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-latexrecommended-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-latexrecommended = " \
 texlive-etoolbox \
 texlive-euenc \
 texlive-euler \
 texlive-multitoc \
 texlive-everysel \
 texlive-everyshi \
 texlive-xcolor \
 texlive-extsizes \
 texlive-fancybox \
 texlive-fancyref \
 texlive-fancyvrb \
 texlive-newfloat \
 texlive-filehook \
 texlive-ntgclass \
 texlive-float \
 texlive-parskip \
 texlive-xfrac \
 texlive-xkeyval \
 texlive-pdfcolfoot \
 texlive-xltxtra \
 texlive-fontspec \
 texlive-pdflscape \
 texlive-pdfmanagement-testphase \
 texlive-pdfpages \
 texlive-footnotehyper \
 texlive-fp \
 texlive-xunicode \
 texlive-polyglossia \
 texlive-psfrag \
 texlive-grffile \
 texlive-hologo \
 texlive-anysize \
 texlive-attachfile2 \
 texlive-index \
 texlive-beamer \
 texlive-infwarerr \
 texlive-ragged2e \
 texlive-jknapltx \
 texlive-rcs \
 texlive-base \
 texlive-sansmath \
 texlive-koma-script \
 texlive-section \
 texlive-booktabs \
 texlive-seminar \
 texlive-breqn \
 texlive-l3experimental \
 texlive-caption \
 texlive-sepnum \
 texlive-setspace \
 texlive-latexbug \
 texlive-cite \
 texlive-subfig \
 texlive-cmap \
 texlive-lineno \
 texlive-listings \
 texlive-microtype \
 texlive-collection-fontsrecommended \
 texlive-collection-latex \
 texlive-textcase \
 texlive-count1to \
 texlive-crop \
 texlive-thumbpdf \
 texlive-ctable \
 texlive-lwarp \
 texlive-translator \
 texlive-mathspec \
 texlive-mathtools \
 texlive-mdwtools \
 texlive-memoir \
 texlive-typehtml \
 texlive-metalogo \
 texlive-ucharcat \
 texlive-underscore \
 texlive-unicode-math \
 texlive-eso-pic \
"

URI_texlive-collection-xetex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-collection-xetex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-collection-xetex = " \
 texlive-xecolor \
 texlive-xecyr \
 texlive-xeindex \
 texlive-xesearch \
 texlive-xetex \
 texlive-xetex-itrans \
 texlive-xetex-pstricks \
 texlive-xetexconfig \
 texlive-fixlatvian \
 texlive-xetexfontinfo \
 texlive-fontbook \
 texlive-fontwrap \
 texlive-philokalia \
 texlive-awesomebox \
 texlive-ptext \
 texlive-base \
 texlive-realscripts \
 texlive-collection-basic \
 texlive-ucharclasses \
 texlive-unisugar \
"

URI_texlive-colorprofiles = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-colorprofiles-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-colorprofiles = " \
 texlive-kpathsea \
"

URI_texlive-colortbl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-colortbl-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-colortbl = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
 texlive-tools \
"

URI_texlive-context = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-context-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-context = " \
 texlive-mptopdf \
 perl-libs \
 texlive-xetex \
 texlive-pdftex \
 texlive-amsfonts \
 texlive-pst-plot \
 texlive-pstricks \
 texlive-base \
 perl-Tk \
 texlive-kpathsea \
 texlive-stmaryrd \
 bash \
 texlive-lm \
 texlive-lm-math \
 perl-base \
 texlive-texlive-scripts \
 texlive-luatex \
 texlive-manfnt-font \
 texlive-metapost \
 coreutils \
 texlive-mflogo-font \
"

URI_texlive-count1to = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-count1to-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-count1to = " \
 texlive-everyshi \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-courier = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-courier-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-courier = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-crop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-crop-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-crop = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-csquotes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-csquotes-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-csquotes = " \
 texlive-kpathsea \
 texlive-etoolbox \
 texlive-base \
 texlive-graphics \
"

URI_texlive-ctable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ctable-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ctable = " \
 texlive-etoolbox \
 texlive-graphics \
 texlive-kpathsea \
 texlive-booktabs \
 texlive-tools \
 bash \
 texlive-xkeyval \
 texlive-base \
"

URI_texlive-ctablestack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ctablestack-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ctablestack = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-currfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-currfile-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-currfile = " \
 texlive-kpathsea \
 texlive-kvoptions \
 texlive-base \
 texlive-filehook \
"

URI_texlive-datetime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-datetime-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-datetime = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-fmtcount \
 texlive-base \
"

URI_texlive-dehyph = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-dehyph-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-dehyph = " \
 texlive-kpathsea \
"

URI_texlive-dvipdfmx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-dvipdfmx-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-dvipdfmx = " \
 texlive-glyphlist \
 texlive-graphics-def \
 texlive-kpathsea \
 texlive-xetex \
 bash \
 texlive-base \
"

URI_texlive-dvipng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-dvipng-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-dvipng = " \
 gd \
 freetype \
 texlive-lib \
 texlive-kpathsea \
 info \
 glibc \
 texlive-base \
"

URI_texlive-dvips = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-dvips-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-dvips = " \
 texlive-lib \
 texlive-kpathsea \
 texlive-latex-fonts \
 info \
 glibc \
 texlive-base \
"

URI_texlive-dvisvgm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-dvisvgm-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-dvisvgm = " \
 zlib-ng-compat \
 freetype \
 texlive-lib \
 texlive-kpathsea \
 libgcc \
 libstdc++ \
 libgs \
 glibc \
 potrace \
 texlive-base \
"

URI_texlive-ec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ec-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ec = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-eepic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-eepic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-eepic = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-enctex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-enctex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-enctex = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-enumitem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-enumitem-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-enumitem = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-environ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-environ-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-environ = " \
 texlive-kpathsea \
 texlive-trimspaces \
 texlive-base \
"

URI_texlive-epsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-epsf-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-epsf = " \
 texlive-kpathsea \
 bash \
 texlive-base \
"

URI_texlive-epstopdf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-epstopdf-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-epstopdf = " \
 perl-libs \
 texlive-kpathsea \
 perl-Getopt-Long \
 coreutils \
 texlive-base \
 perl-File-Temp \
"

URI_texlive-epstopdf-pkg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-epstopdf-pkg-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-epstopdf-pkg = " \
 texlive-kpathsea \
"

URI_texlive-eqparbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-eqparbox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-eqparbox = " \
 texlive-environ \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-eso-pic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-eso-pic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-eso-pic = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-xcolor \
 texlive-atbegshi \
 texlive-base \
"

URI_texlive-etex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-etex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-etex = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-etex-pkg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-etex-pkg-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-etex-pkg = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-etexcmds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-etexcmds-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-etexcmds = " \
 texlive-kpathsea \
"

URI_texlive-etoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-etoc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-etoc = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-etoolbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-etoolbox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-etoolbox = " \
 texlive-kpathsea \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-euenc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-euenc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-euenc = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-euler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-euler-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-euler = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-euro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-euro-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-euro = " \
 texlive-kpathsea \
 texlive-base \
 texlive-fp \
"

URI_texlive-eurosym = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-eurosym-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-eurosym = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-everysel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-everysel-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-everysel = " \
 texlive-kpathsea \
"

URI_texlive-everyshi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-everyshi-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-everyshi = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-extsizes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-extsizes-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-extsizes = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-fancybox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fancybox-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fancybox = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fancyhdr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fancyhdr-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fancyhdr = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fancyref = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fancyref-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fancyref = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-fancyvrb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fancyvrb-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fancyvrb = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-fancyvrb \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-filecontents = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-filecontents-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-filecontents = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-filehook = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-filehook-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-filehook = " \
 texlive-pgf \
 texlive-kpathsea \
 texlive-kvoptions \
 texlive-currfile \
 texlive-base \
"

URI_texlive-finstrut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-finstrut-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-finstrut = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-firstaid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-firstaid-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-firstaid = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fix2col = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fix2col-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fix2col = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fixlatvian = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fixlatvian-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fixlatvian = " \
 texlive-etoolbox \
 texlive-was \
 texlive-bigfoot \
 texlive-polyglossia \
 texlive-kpathsea \
 texlive-caption \
 texlive-tools \
 texlive-svn-prov \
 texlive-xstring \
 texlive-base \
"

URI_texlive-float = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-float-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-float = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fmtcount = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fmtcount-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fmtcount = " \
 texlive-etoolbox \
 texlive-graphics \
 texlive-kpathsea \
 texlive-amsmath \
 texlive-latex \
 texlive-base \
"

URI_texlive-fncychap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fncychap-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fncychap = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-fontawesome = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fontawesome-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fontawesome = " \
 texlive-kpathsea \
 texlive-texlive-scripts \
 texlive-iftex \
 texlive-base \
"

URI_texlive-fontbook = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fontbook-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fontbook = " \
 texlive-etoolbox \
 texlive-kpathsea \
 texlive-kvoptions \
 texlive-fontspec \
 texlive-xunicode \
 texlive-base \
"

URI_texlive-fonts-tlwg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fonts-tlwg-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fonts-tlwg = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fontspec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fontspec-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fontspec = " \
 texlive-kastrup \
 texlive-luaotfload \
 texlive-kpathsea \
 texlive-l3kernel \
 texlive-l3packages \
 texlive-latex \
 texlive-xunicode \
 texlive-lm \
 texlive-base \
"

URI_texlive-fontware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fontware-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-fontware = " \
 glibc \
 texlive-lib \
 texlive-base \
 texlive-kpathsea \
"

URI_texlive-fontwrap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fontwrap-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fontwrap = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-footmisc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-footmisc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-footmisc = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-footnotehyper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-footnotehyper-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-footnotehyper = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-fp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fp-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fp = " \
 texlive-kpathsea \
 texlive-base \
 texlive-fp \
"

URI_texlive-fpl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-fpl-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-fpl = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-framed = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-framed-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-framed = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-garuda-c90 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-garuda-c90-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-garuda-c90 = " \
 texlive-kpathsea \
 texlive-fonts-tlwg \
 texlive-base \
"

URI_texlive-geometry = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-geometry-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-geometry = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-atbegshi \
 texlive-iftex \
 texlive-base \
"

URI_texlive-gettitlestring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-gettitlestring-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-gettitlestring = " \
 texlive-kpathsea \
"

URI_texlive-glyphlist = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-glyphlist-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-glyphlist = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-graphics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-graphics-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-graphics = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics-cfg \
"

URI_texlive-graphics-cfg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-graphics-cfg-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-graphics-cfg = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-graphics-def = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-graphics-def-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-graphics-def = " \
 texlive-kpathsea \
 texlive-epstopdf-pkg \
 texlive-base \
"

URI_texlive-grfext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-grfext-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-grfext = " \
 texlive-kpathsea \
"

URI_texlive-grffile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-grffile-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-grffile = " \
 texlive-kpathsea \
"

URI_texlive-gsftopk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-gsftopk-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-gsftopk = " \
 glibc \
 texlive-lib \
 texlive-base \
 texlive-kpathsea \
"

URI_texlive-hanging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hanging-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hanging = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-helvetic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-helvetic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-helvetic = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-hobsub = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hobsub-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hobsub = " \
 texlive-kpathsea \
"

URI_texlive-hologo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hologo-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hologo = " \
 texlive-kpathsea \
"

URI_texlive-hopatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hopatch-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hopatch = " \
 texlive-ltxcmds \
 texlive-kpathsea \
"

URI_texlive-hycolor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hycolor-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hycolor = " \
 texlive-kpathsea \
"

URI_texlive-hypcap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hypcap-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hypcap = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-hypdoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hypdoc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hypdoc = " \
 texlive-kpathsea \
"

URI_texlive-hyperref = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hyperref-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hyperref = " \
 texlive-url \
 texlive-etexcmds \
 texlive-pdfescape \
 texlive-zapfding \
 texlive-pdftexcmds \
 texlive-gettitlestring \
 texlive-graphics \
 texlive-hobsub \
 texlive-hycolor \
 texlive-atbegshi \
 texlive-auxhook \
 texlive-iftex \
 texlive-base \
 texlive-infwarerr \
 texlive-intcalc \
 texlive-refcount \
 texlive-rerunfilecheck \
 texlive-bitset \
 texlive-kpathsea \
 texlive-kvdefinekeys \
 texlive-kvoptions \
 texlive-kvsetkeys \
 texlive-stringenc \
 texlive-letltxmacro \
 texlive-ltxcmds \
 texlive-memoir \
"

URI_texlive-hyph-utf8 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hyph-utf8-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hyph-utf8 = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-hyphen-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hyphen-base-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hyphen-base = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-hyphenat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hyphenat-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hyphenat = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-hyphenex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-hyphenex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-hyphenex = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ifmtarg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ifmtarg-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ifmtarg = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ifoddpage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ifoddpage-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ifoddpage = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ifplatform = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ifplatform-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ifplatform = " \
 texlive-kpathsea \
 texlive-catchfile \
 texlive-iftex \
 texlive-base \
 texlive-pdftexcmds \
"

URI_texlive-iftex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-iftex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-iftex = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-import = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-import-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-import = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-index = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-index-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-index = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-infwarerr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-infwarerr-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-infwarerr = " \
 texlive-kpathsea \
"

URI_texlive-intcalc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-intcalc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-intcalc = " \
 texlive-kpathsea \
"

URI_texlive-jadetex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-jadetex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-jadetex = " \
 texlive-texlive-scripts \
 texlive-kpathsea \
 texlive-latex \
 texlive-passivetex \
 coreutils \
 texlive-tex \
 texlive-base \
 texlive-pdftex \
"

URI_texlive-jknapltx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-jknapltx-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-jknapltx = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
 texlive-graphics \
"

URI_texlive-kastrup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kastrup-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-kastrup = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-kerkis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kerkis-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-kerkis = " \
 texlive-kpathsea \
 texlive-txfonts \
 texlive-base \
"

URI_texlive-knuth-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-knuth-lib-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-knuth-lib = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-knuth-local = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-knuth-local-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-knuth-local = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-koma-script = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-koma-script-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-koma-script = " \
 texlive-mparhack \
 texlive-etoolbox \
 texlive-geometry \
 texlive-graphics \
 texlive-koma-script \
 texlive-kpathsea \
 texlive-xcolor \
 texlive-booktabs \
 texlive-bookmark \
 texlive-amsmath \
 texlive-tools \
 texlive-latex \
 texlive-marginnote \
 texlive-hyperref \
 texlive-listings \
 texlive-babelbib \
 texlive-base \
"

URI_texlive-kpathsea = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kpathsea-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-kpathsea = " \
 texlive-texlive-scripts \
 texlive-lib \
 grep \
 bash \
 glibc \
 coreutils \
 texlive-base \
"

URI_texlive-kvdefinekeys = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kvdefinekeys-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-kvdefinekeys = " \
 texlive-kpathsea \
"

URI_texlive-kvoptions = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kvoptions-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-kvoptions = " \
 texlive-kpathsea \
"

URI_texlive-kvsetkeys = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-kvsetkeys-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-kvsetkeys = " \
 texlive-kpathsea \
"

URI_texlive-l3backend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-l3backend-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-l3backend = " \
 texlive-kpathsea \
"

URI_texlive-l3experimental = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-l3experimental-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-l3experimental = " \
 texlive-kpathsea \
 texlive-base \
 texlive-l3kernel \
 texlive-l3packages \
"

URI_texlive-l3kernel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-l3kernel-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-l3kernel = " \
 texlive-fancyvrb \
 texlive-graphics \
 texlive-psnfss \
 texlive-alphalph \
 texlive-amsfonts \
 texlive-amsmath \
 texlive-hologo \
 texlive-hypdoc \
 texlive-base \
 texlive-kpathsea \
 texlive-booktabs \
 texlive-l3backend \
 texlive-latex \
 texlive-lm \
 texlive-colortbl \
 texlive-csquotes \
 texlive-tools \
 texlive-enumitem \
 texlive-underscore \
"

URI_texlive-l3packages = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-l3packages-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-l3packages = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-l3kernel \
 texlive-amsmath \
 texlive-base \
"

URI_texlive-lastpage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lastpage-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lastpage = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-latex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-latex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-latex = " \
 texlive-url \
 texlive-cm-super \
 texlive-luatex \
 texlive-psnfss \
 texlive-kpathsea \
 texlive-l3kernel \
 texlive-tools \
 texlive-latex-fonts \
 texlive-hypdoc \
 texlive-hyperref \
 texlive-latexconfig \
 coreutils \
 texlive-base \
 texlive-pdftex \
"

URI_texlive-latex-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-latex-fonts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-latex-fonts = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-latex2man = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-latex2man-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-latex2man = " \
 perl-libs \
 texlive-kpathsea \
 texlive-fancyhdr \
 perl-File-Basename \
 perl-Getopt-Std \
 info \
 coreutils \
 texlive-base \
"

URI_texlive-latexbug = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-latexbug-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-latexbug = " \
 texlive-kpathsea \
"

URI_texlive-latexconfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-latexconfig-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-latexconfig = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-letltxmacro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-letltxmacro-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-letltxmacro = " \
 texlive-kpathsea \
"

URI_texlive-lettrine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lettrine-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lettrine = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lib-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-lib = " \
 glibc \
 zlib-ng-compat \
"

URI_texlive-linegoal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-linegoal-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-linegoal = " \
 texlive-kpathsea \
 texlive-zref \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-lineno = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lineno-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lineno = " \
 texlive-kpathsea \
 texlive-tools \
 texlive-finstrut \
 texlive-base \
 texlive-ltabptch \
"

URI_texlive-listings = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-listings-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-listings = " \
 texlive-url \
 texlive-graphics \
 texlive-kpathsea \
 texlive-algorithms \
 texlive-fancyvrb \
 texlive-latex \
 texlive-hyperref \
 texlive-base \
"

URI_texlive-listofitems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-listofitems-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-listofitems = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-lm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lm-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lm = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-lm-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lm-math-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lm-math = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ltabptch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ltabptch-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ltabptch = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-ltxcmds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ltxcmds-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ltxcmds = " \
 texlive-kpathsea \
"

URI_texlive-ltxmisc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ltxmisc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ltxmisc = " \
 texlive-beton \
 texlive-euler \
 texlive-graphics \
 texlive-natbib \
 texlive-kpathsea \
 texlive-psnfss \
 texlive-tools \
 texlive-latex \
 texlive-base \
 texlive-minitoc \
"

URI_texlive-lua-alt-getopt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lua-alt-getopt-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lua-alt-getopt = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-lua-uni-algos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lua-uni-algos-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lua-uni-algos = " \
 texlive-luatex \
 texlive-unicode-data \
 texlive-kpathsea \
"

URI_texlive-luahbtex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-luahbtex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-luahbtex = " \
 zlib-ng-compat \
 texlive-lib \
 libpng \
 texlive-plain \
 texlive-knuth-lib \
 texlive-luatex \
 texlive-kpathsea \
 harfbuzz \
 libgcc \
 zziplib \
 texlive-etex \
 texlive-hyph-utf8 \
 texlive-hyphen-base \
 texlive-cm \
 glibc \
 texlive-unicode-data \
 texlive-base \
 texlive-tex-ini-files \
"

URI_texlive-lualatex-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lualatex-math-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lualatex-math = " \
 texlive-etoolbox \
 texlive-kpathsea \
 texlive-luatexbase \
 texlive-l3kernel \
 texlive-filehook \
 texlive-base \
"

URI_texlive-lualibs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lualibs-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lualibs = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-luaotfload = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-luaotfload-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-luaotfload = " \
 texlive-lua-alt-getopt \
 texlive-lua-uni-algos \
 texlive-lualibs \
 texlive-kpathsea \
 texlive-luatexbase \
 coreutils \
 texlive-base \
"

URI_texlive-luatex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-luatex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-luatex = " \
 zlib-ng-compat \
 texlive-lib \
 libpng \
 texlive-texlive-scripts \
 texlive-plain \
 texlive-knuth-lib \
 texlive-graphics-def \
 texlive-kpathsea \
 zziplib \
 texlive-etex \
 texlive-hyph-utf8 \
 texlive-hyphen-base \
 texlive-cm \
 glibc \
 coreutils \
 texlive-unicode-data \
 texlive-base \
 texlive-tex-ini-files \
"

URI_texlive-luatex85 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-luatex85-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-luatex85 = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-luatexbase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-luatexbase-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-luatexbase = " \
 texlive-kpathsea \
 texlive-luatexbase \
 texlive-iftex \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-lwarp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-lwarp-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-lwarp = " \
 texlive-kpathsea \
 coreutils \
 texlive-base \
"

URI_texlive-makecmds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-makecmds-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-makecmds = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-makeindex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-makeindex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-makeindex = " \
 texlive-lib \
 texlive-kpathsea \
 bash \
 glibc \
 texlive-base \
"

URI_texlive-manfnt-font = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-manfnt-font-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-manfnt-font = " \
 texlive-kpathsea \
 texlive-texlive-scripts \
 texlive-base \
"

URI_texlive-marginnote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-marginnote-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-marginnote = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-marvosym = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-marvosym-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-marvosym = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-mathpazo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mathpazo-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mathpazo = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-mathspec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mathspec-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mathspec = " \
 texlive-etoolbox \
 texlive-kpathsea \
 texlive-amsmath \
 texlive-xkeyval \
 texlive-fontspec \
 texlive-iftex \
 texlive-base \
 texlive-mnsymbol \
"

URI_texlive-mathtools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mathtools-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mathtools = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-amsmath \
 texlive-tools \
 texlive-mathtools \
 texlive-base \
"

URI_texlive-mdwtools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mdwtools-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mdwtools = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-memoir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-memoir-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-memoir = " \
 texlive-kpathsea \
 texlive-iftex \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-metafont = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-metafont-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-metafont = " \
 texlive-lib \
 texlive-texlive-scripts \
 texlive-kpathsea \
 libX11 \
 glibc \
 coreutils \
 texlive-base \
"

URI_texlive-metalogo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-metalogo-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-metalogo = " \
 texlive-graphics \
 texlive-kpathsea \
 texlive-fontspec \
 texlive-iftex \
 texlive-base \
"

URI_texlive-metapost = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-metapost-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-metapost = " \
 gmp \
 zlib-ng-compat \
 texlive-lib \
 libpng \
 mpfr \
 texlive-texlive-scripts \
 texlive-kpathsea \
 cairo \
 glibc \
 texlive-base \
 pixman \
"

URI_texlive-mflogo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mflogo-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mflogo = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-mflogo-font = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mflogo-font-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mflogo-font = " \
 texlive-kpathsea \
 texlive-texlive-scripts \
 texlive-base \
"

URI_texlive-mfnfss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mfnfss-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mfnfss = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-mfware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mfware-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-mfware = " \
 texlive-lib \
 texlive-kpathsea \
 glibc \
 texlive-mfware \
 texlive-base \
"

URI_texlive-microtype = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-microtype-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-microtype = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-minitoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-minitoc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-minitoc = " \
 texlive-placeins \
 texlive-kpathsea \
 texlive-notoccite \
 texlive-latex \
 texlive-base \
 texlive-minitoc \
"

URI_texlive-mnsymbol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mnsymbol-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mnsymbol = " \
 texlive-kpathsea \
 texlive-amsfonts \
 texlive-amsmath \
 texlive-latex \
 texlive-base \
"

URI_texlive-modes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-modes-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-modes = " \
 texlive-kpathsea \
 bash \
"

URI_texlive-mparhack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mparhack-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mparhack = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-mptopdf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-mptopdf-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-mptopdf = " \
 texlive-texlive-scripts \
 perl-libs \
 texlive-kpathsea \
 perl-Getopt-Long \
 perl-File-Basename \
 coreutils \
 perl-interpreter \
 texlive-base \
"

URI_texlive-multido = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-multido-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-multido = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-multirow = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-multirow-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-multirow = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-multitoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-multitoc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-multitoc = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
 texlive-tools \
"

URI_texlive-natbib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-natbib-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-natbib = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ncctools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ncctools-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ncctools = " \
 texlive-bigfoot \
 texlive-graphics \
 texlive-kpathsea \
 texlive-amsmath \
 texlive-base \
"

URI_texlive-ncntrsbk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ncntrsbk-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ncntrsbk = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-needspace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-needspace-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-needspace = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-newfloat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-newfloat-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-newfloat = " \
 texlive-kpathsea \
"

URI_texlive-newunicodechar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-newunicodechar-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-newunicodechar = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-norasi-c90 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-norasi-c90-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-norasi-c90 = " \
 texlive-kpathsea \
 texlive-fonts-tlwg \
 texlive-base \
"

URI_texlive-notoccite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-notoccite-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-notoccite = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ntgclass = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ntgclass-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ntgclass = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-oberdiek = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-oberdiek-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-oberdiek = " \
 texlive-etexcmds \
 texlive-parallel \
 texlive-pdfcol \
 texlive-fontspec \
 texlive-pdfescape \
 texlive-fp \
 texlive-pdftexcmds \
 texlive-zref \
 texlive-graphics \
 texlive-grfext \
 texlive-grffile \
 texlive-amsmath \
 texlive-hologo \
 texlive-hypcap \
 texlive-hypdoc \
 texlive-hyperref \
 texlive-atveryend \
 texlive-auxhook \
 texlive-iftex \
 texlive-index \
 texlive-infwarerr \
 texlive-intcalc \
 texlive-base \
 texlive-bigintcalc \
 texlive-sauerj \
 texlive-kpathsea \
 texlive-kvoptions \
 texlive-kvsetkeys \
 texlive-carlisle \
 texlive-letltxmacro \
 texlive-ltxcmds \
 texlive-tools \
 texlive-unicode-math \
 texlive-uniquecounter \
"

URI_texlive-overpic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-overpic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-overpic = " \
 texlive-kpathsea \
 texlive-base \
 texlive-eepic \
 texlive-graphics \
"

URI_texlive-palatino = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-palatino-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-palatino = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-paralist = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-paralist-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-paralist = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-parallel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-parallel-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-parallel = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-parskip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-parskip-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-parskip = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-passivetex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-passivetex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-passivetex = " \
 texlive-url \
 texlive-graphics \
 texlive-kpathsea \
 texlive-psnfss \
 texlive-tipa \
 texlive-amsfonts \
 texlive-tools \
 texlive-amsmath \
 texlive-latex \
 texlive-marvosym \
 texlive-hyperref \
 texlive-passivetex \
 texlive-ulem \
 texlive-base \
"

URI_texlive-pdfcol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfcol-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfcol = " \
 texlive-kpathsea \
"

URI_texlive-pdfcolfoot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfcolfoot-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfcolfoot = " \
 texlive-kpathsea \
"

URI_texlive-pdfcolmk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfcolmk-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfcolmk = " \
 texlive-kpathsea \
"

URI_texlive-pdfescape = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfescape-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfescape = " \
 texlive-kpathsea \
"

URI_texlive-pdflscape = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdflscape-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdflscape = " \
 texlive-kpathsea \
"

URI_texlive-pdfmanagement-testphase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfmanagement-testphase-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfmanagement-testphase = " \
 texlive-kpathsea \
 texlive-graphics \
"

URI_texlive-pdfpages = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdfpages-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdfpages = " \
 texlive-graphics \
 texlive-count1to \
 texlive-kpathsea \
 texlive-tools \
 texlive-latex \
 texlive-pdflscape \
 texlive-eso-pic \
 texlive-base \
"

URI_texlive-pdftex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdftex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-pdftex = " \
 perl-libs \
 libpng \
 texlive-plain \
 texlive-graphics-def \
 libstdc++ \
 texlive-hyphen-base \
 texlive-base \
 zlib-ng-compat \
 texlive-knuth-lib \
 texlive-kpathsea \
 libgcc \
 bash \
 texlive-cm \
 texlive-lib \
 texlive-tex-ini-files \
 texlive-texlive-scripts \
 glibc \
 coreutils \
 texlive-etex \
"

URI_texlive-pdftexcmds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pdftexcmds-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pdftexcmds = " \
 texlive-kpathsea \
"

URI_texlive-pgf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pgf-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pgf = " \
 texlive-pgf \
 texlive-graphics \
 texlive-kpathsea \
 texlive-xcolor \
 texlive-xkeyval \
 texlive-base \
"

URI_texlive-philokalia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-philokalia-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-philokalia = " \
 texlive-xltxtra \
 texlive-kpathsea \
 texlive-lettrine \
 texlive-fontspec \
 texlive-xunicode \
 texlive-base \
"

URI_texlive-placeins = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-placeins-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-placeins = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-plain = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-plain-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-plain = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-polyglossia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-polyglossia-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-polyglossia = " \
 texlive-etoolbox \
 texlive-bidi \
 texlive-polyglossia \
 texlive-kpathsea \
 texlive-makecmds \
 texlive-tools \
 texlive-xkeyval \
 texlive-fontspec \
 texlive-base \
"

URI_texlive-powerdot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-powerdot-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-powerdot = " \
 texlive-geometry \
 texlive-graphics \
 texlive-kpathsea \
 texlive-xcolor \
 texlive-psnfss \
 texlive-pst-blur \
 texlive-amsfonts \
 texlive-tools \
 texlive-pst-grad \
 texlive-type1cm \
 texlive-hyperref \
 texlive-pst-slpe \
 texlive-xkeyval \
 texlive-enumitem \
 texlive-pst-text \
 texlive-pstricks \
 texlive-iftex \
 texlive-base \
"

URI_texlive-preprint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-preprint-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-preprint = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-psfrag = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-psfrag-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-psfrag = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-pslatex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pslatex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pslatex = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-psnfss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-psnfss-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-psnfss = " \
 texlive-graphics \
 texlive-zapfding \
 texlive-kpathsea \
 texlive-symbol \
 texlive-base \
"

URI_texlive-pspicture = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pspicture-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pspicture = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-pst-3d = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-3d-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-3d = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-arrow = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-arrow-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-arrow = " \
 texlive-kpathsea \
"

URI_texlive-pst-blur = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-blur-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-blur = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-coil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-coil-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-coil = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-eps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-eps-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-eps = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-fill = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-fill-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-fill = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-grad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-grad-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-grad = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-math-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-math = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-pst-node = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-node-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-node = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-plot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-plot-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-plot = " \
 texlive-multido \
 texlive-kpathsea \
 texlive-xkeyval \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-slpe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-slpe-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-slpe = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-text = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-text-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-text = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-tools-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-tools = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pst-tree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pst-tree-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pst-tree = " \
 texlive-kpathsea \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-pstricks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pstricks-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pstricks = " \
 texlive-multido \
 texlive-xcolor \
 texlive-fancyvrb \
 texlive-filecontents \
 texlive-paralist \
 texlive-xkeyval \
 texlive-footmisc \
 texlive-graphics \
 texlive-pst-3d \
 texlive-pst-arrow \
 texlive-amsfonts \
 texlive-amsmath \
 texlive-pst-coil \
 texlive-pst-grad \
 texlive-pst-eps \
 texlive-pst-node \
 texlive-hyperref \
 texlive-pst-plot \
 texlive-pst-fill \
 texlive-pst-tools \
 texlive-pst-text \
 texlive-pst-tree \
 texlive-pstricks-add \
 texlive-babel \
 texlive-iftex \
 texlive-ragged2e \
 texlive-base \
 texlive-bera \
 texlive-koma-script \
 texlive-kpathsea \
 texlive-booktabs \
 texlive-breakurl \
 texlive-setspace \
 texlive-caption \
 texlive-showexpl \
 texlive-latex \
 texlive-chngcntr \
 texlive-subfig \
 texlive-tools \
 texlive-eso-pic \
"

URI_texlive-pstricks-add = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pstricks-add-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pstricks-add = " \
 texlive-multido \
 texlive-kpathsea \
 texlive-pst-3d \
 texlive-pst-math \
 texlive-pst-node \
 texlive-pst-plot \
 texlive-pstricks \
 texlive-base \
"

URI_texlive-ptext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ptext-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ptext = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-pxfonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-pxfonts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-pxfonts = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-qstest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-qstest-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-qstest = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-ragged2e = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ragged2e-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ragged2e = " \
 texlive-kpathsea \
"

URI_texlive-rcs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-rcs-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-rcs = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-realscripts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-realscripts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-realscripts = " \
 texlive-kpathsea \
 texlive-fontspec \
 texlive-base \
"

URI_texlive-refcount = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-refcount-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-refcount = " \
 texlive-kpathsea \
"

URI_texlive-relsize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-relsize-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-relsize = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-rerunfilecheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-rerunfilecheck-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-rerunfilecheck = " \
 texlive-kpathsea \
 texlive-uniquecounter \
 texlive-atveryend \
"

URI_texlive-rsfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-rsfs-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-rsfs = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-sansmath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sansmath-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sansmath = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-sansmathaccent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sansmathaccent-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sansmathaccent = " \
 texlive-kpathsea \
 texlive-base \
 texlive-filehook \
"

URI_texlive-sauerj = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sauerj-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sauerj = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-scheme-basic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-scheme-basic-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-scheme-basic = " \
 coreutils \
 texlive-base \
 texlive-collection-latex \
 texlive-collection-basic \
"

URI_texlive-section = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-section-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-section = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-sectsty = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sectsty-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sectsty = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-seminar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-seminar-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-seminar = " \
 texlive-kpathsea \
 texlive-pstricks \
 bash \
 texlive-base \
"

URI_texlive-sepnum = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sepnum-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sepnum = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-setspace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-setspace-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-setspace = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-sfmath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-sfmath-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-sfmath = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-showexpl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-showexpl-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-showexpl = " \
 texlive-varwidth \
 texlive-graphics \
 texlive-kpathsea \
 texlive-tools \
 texlive-latex \
 texlive-attachfile \
 texlive-listings \
 texlive-base \
"

URI_texlive-soul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-soul-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-soul = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-stackengine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-stackengine-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-stackengine = " \
 texlive-kpathsea \
 texlive-etoolbox \
 texlive-listofitems \
 texlive-base \
"

URI_texlive-stmaryrd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-stmaryrd-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-stmaryrd = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-stringenc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-stringenc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-stringenc = " \
 texlive-kpathsea \
"

URI_texlive-subfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-subfig-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-subfig = " \
 texlive-kpathsea \
 texlive-base \
 texlive-caption \
 texlive-graphics \
"

URI_texlive-subfigure = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-subfigure-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-subfigure = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-svn-prov = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-svn-prov-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-svn-prov = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-symbol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-symbol-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-symbol = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-t2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-t2-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-t2 = " \
 texlive-kpathsea \
 texlive-base \
 texlive-amsfonts \
 texlive-tools \
"

URI_texlive-tabu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tabu-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tabu = " \
 texlive-varwidth \
 texlive-kpathsea \
 texlive-tools \
 texlive-linegoal \
 texlive-base \
"

URI_texlive-tabulary = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tabulary-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tabulary = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-tex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-tex = " \
 texlive-lib \
 texlive-texlive-scripts \
 texlive-plain \
 texlive-knuth-lib \
 texlive-kpathsea \
 texlive-hyphen-base \
 texlive-cm \
 glibc \
 coreutils \
 texlive-base \
"

URI_texlive-tex-gyre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tex-gyre-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tex-gyre = " \
 texlive-kpathsea \
 texlive-kvoptions \
 texlive-tex-gyre \
 texlive-base \
"

URI_texlive-tex-gyre-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tex-gyre-math-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tex-gyre-math = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-tex-ini-files = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tex-ini-files-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tex-ini-files = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-tex4ht = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tex4ht-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-tex4ht = " \
 texlive-lib \
 perl-libs \
 texlive-kpathsea \
 bash \
 glibc \
 coreutils \
 texlive-base \
"

URI_texlive-texlive-common-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive-common-doc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive-common-doc = ""

URI_texlive-texlive-en = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive-en-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive-en = " \
 texlive-kpathsea \
 info \
 texlive-base \
 bash \
"

URI_texlive-texlive-msg-translations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive-msg-translations-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive-msg-translations = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-texlive-scripts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive-scripts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive-scripts = " \
 perl-libs \
 texlive-texlive.infra \
 texlive-kpathsea \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-PathTools \
 bash \
 perl-File-Find \
 coreutils \
 texlive-base \
 perl-Pod-Usage \
"

URI_texlive-texlive-scripts-extra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive-scripts-extra-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive-scripts-extra = " \
 texlive-texlive.infra \
 texlive-kpathsea \
 bash \
 coreutils \
 texlive-base \
"

URI_texlive-texlive.infra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-texlive.infra-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-texlive.infra = " \
 perl-constant \
 perl-libs \
 perl-vars \
 perl-FileHandle \
 texlive-kpathsea \
 perl-Digest-MD5 \
 perl-Getopt-Long \
 perl-Text-Unidecode \
 perl-XML-Parser \
 bash \
 perl-PathTools \
 perl-XML-XPath \
 perl-File-Find \
 coreutils \
 perl-Exporter \
 texlive-base \
 perl-File-Temp \
 perl-Pod-Usage \
"

URI_texlive-textcase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-textcase-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-textcase = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-textpos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-textpos-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-textpos = " \
 texlive-everyshi \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-threeparttable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-threeparttable-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-threeparttable = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-thumbpdf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-thumbpdf-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-thumbpdf = " \
 perl-libs \
 texlive-kpathsea \
 perl-Getopt-Long \
 perl-interpreter \
 texlive-iftex \
 ghostscript \
 texlive-base \
"

URI_texlive-times = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-times-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-times = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-tipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tipa-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tipa = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-tipa \
 texlive-base \
"

URI_texlive-titlesec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-titlesec-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-titlesec = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-titling = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-titling-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-titling = " \
 texlive-kpathsea \
 coreutils \
 texlive-base \
"

URI_texlive-tocloft = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tocloft-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tocloft = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-tools-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-tools = " \
 texlive-kpathsea \
 texlive-base \
 texlive-graphics \
"

URI_texlive-translator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-translator-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-translator = " \
 texlive-kpathsea \
 texlive-graphics \
"

URI_texlive-trimspaces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-trimspaces-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-trimspaces = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-txfonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-txfonts-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-txfonts = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-type1cm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-type1cm-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-type1cm = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-typehtml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-typehtml-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-typehtml = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-ucharcat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ucharcat-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ucharcat = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ucharclasses = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ucharclasses-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ucharclasses = " \
 texlive-kpathsea \
 texlive-iftex \
 texlive-base \
"

URI_texlive-ucs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ucs-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ucs = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 texlive-graphics \
 texlive-kpathsea \
 perl-Getopt-Long \
 texlive-latex \
 texlive-hyperref \
 perl-interpreter \
 perl-Data-Dumper \
 texlive-base \
"

URI_texlive-uhc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-uhc-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-uhc = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-ulem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-ulem-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-ulem = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-underscore = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-underscore-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-underscore = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-unicode-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-unicode-data-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-unicode-data = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-unicode-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-unicode-math-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-unicode-math = " \
 texlive-lualatex-math \
 texlive-luaotfload \
 texlive-kpathsea \
 texlive-luatexbase \
 texlive-l3kernel \
 texlive-l3packages \
 texlive-filehook \
 texlive-catchfile \
 texlive-latex \
 texlive-fontspec \
 texlive-base \
"

URI_texlive-uniquecounter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-uniquecounter-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-uniquecounter = " \
 texlive-kpathsea \
"

URI_texlive-unisugar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-unisugar-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-unisugar = " \
 texlive-kpathsea \
 texlive-iftex \
 texlive-base \
"

URI_texlive-upquote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-upquote-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-upquote = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
"

URI_texlive-url = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-url-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-url = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-utopia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-utopia-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-utopia = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-varwidth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-varwidth-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-varwidth = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-wadalab = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-wadalab-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-wadalab = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-was = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-was-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-was = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-wasy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-wasy-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-wasy = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-wasy-type1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-wasy-type1-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-wasy-type1 = " \
 texlive-kpathsea \
 texlive-wasy \
"

URI_texlive-wasysym = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-wasysym-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-wasysym = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-wrapfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-wrapfig-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-wrapfig = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xcolor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xcolor-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xcolor = " \
 texlive-kpathsea \
 texlive-pdfcolmk \
 texlive-colortbl \
 texlive-base \
"

URI_texlive-xecolor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xecolor-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xecolor = " \
 texlive-kpathsea \
 texlive-fontspec \
 texlive-iftex \
 texlive-base \
"

URI_texlive-xecyr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xecyr-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xecyr = " \
 texlive-kpathsea \
 texlive-xltxtra \
 texlive-t2 \
 texlive-xunicode \
 texlive-base \
"

URI_texlive-xeindex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xeindex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xeindex = " \
 texlive-kpathsea \
 texlive-latex \
 texlive-base \
 texlive-xesearch \
"

URI_texlive-xepersian = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xepersian-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xepersian = " \
 texlive-multido \
 texlive-fancybox \
 texlive-fancyhdr \
 texlive-fontspec \
 texlive-geometry \
 texlive-preprint \
 texlive-psnfss \
 texlive-hyphenat \
 texlive-iftex \
 texlive-ragged2e \
 texlive-base \
 texlive-bidi \
 texlive-kpathsea \
 texlive-setspace \
 texlive-lastpage \
 texlive-latex \
 python-unversioned-command \
 texlive-textpos \
 texlive-datetime \
 texlive-tools \
"

URI_texlive-xesearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xesearch-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xesearch = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xetex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xetex-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-xetex = " \
 libpng \
 fontconfig \
 texlive-xetexconfig \
 texlive-plain \
 teckit \
 texlive-graphics-def \
 libpaper \
 libstdc++ \
 texlive-hyphen-base \
 texlive-babel \
 texlive-base \
 zlib-ng-compat \
 texlive-kpathsea \
 libgcc \
 graphite2 \
 texlive-l3kernel \
 texlive-latex \
 texlive-latex-fonts \
 texlive-cm \
 texlive-lib \
 libicu \
 texlive-lm \
 texlive-tex-ini-files \
 freetype \
 harfbuzz \
 texlive-dvipdfmx \
 glibc \
 coreutils \
 texlive-unicode-data \
 texlive-etex \
"

URI_texlive-xetex-itrans = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xetex-itrans-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xetex-itrans = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xetex-pstricks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xetex-pstricks-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xetex-pstricks = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xetexconfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xetexconfig-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xetexconfig = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xetexfontinfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xetexfontinfo-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xetexfontinfo = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xfrac = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xfrac-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xfrac = " \
 texlive-kpathsea \
"

URI_texlive-xifthen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xifthen-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xifthen = " \
 texlive-kpathsea \
 texlive-tools \
 texlive-latex \
 texlive-ifmtarg \
 texlive-base \
 texlive-etex-pkg \
"

URI_texlive-xkeyval = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xkeyval-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xkeyval = " \
 texlive-kpathsea \
 texlive-base \
 texlive-tools \
"

URI_texlive-xltxtra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xltxtra-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xltxtra = " \
 texlive-realscripts \
 texlive-kpathsea \
 texlive-metalogo \
 texlive-fontspec \
 texlive-iftex \
 texlive-base \
"

URI_texlive-xmltex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xmltex-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xmltex = " \
 texlive-pdftex \
 texlive-kpathsea \
 texlive-l3backend \
 texlive-babel \
 texlive-l3kernel \
 texlive-dehyph \
 texlive-l3packages \
 texlive-latex \
 texlive-latex-fonts \
 texlive-hyph-utf8 \
 texlive-hyphen-base \
 texlive-cm \
 texlive-latexconfig \
 texlive-tex \
 texlive-unicode-data \
 texlive-base \
 texlive-tex-ini-files \
"

URI_texlive-xpatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xpatch-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xpatch = " \
 texlive-etoolbox \
 texlive-kpathsea \
 texlive-l3kernel \
 texlive-l3packages \
 texlive-base \
"

URI_texlive-xstring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xstring-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xstring = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xtab = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xtab-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xtab = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-xunicode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-xunicode-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-xunicode = " \
 texlive-kpathsea \
 texlive-tipa \
 texlive-base \
 texlive-graphics \
"

URI_texlive-zapfchan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-zapfchan-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-zapfchan = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-zapfding = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-zapfding-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-zapfding = " \
 texlive-kpathsea \
 texlive-base \
"

URI_texlive-zref = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/texlive-zref-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-zref = " \
 texlive-kpathsea \
"

URI_texlive-gnu-freefont = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texlive-gnu-freefont-20240311-6.el10.noarch.rpm;unpack=0"
RDEPENDS:texlive-gnu-freefont = " \
 texlive-kpathsea \
 bash \
 python-unversioned-command \
 coreutils \
 perl-interpreter \
 texlive-base \
 fontforge \
"

URI_texlive-lib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texlive-lib-devel-20240311-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texlive-lib-devel = " \
 texlive-lib \
 zlib-ng-compat-devel \
 texlive-lib-devel \
 pkgconf-pkg-config \
"
