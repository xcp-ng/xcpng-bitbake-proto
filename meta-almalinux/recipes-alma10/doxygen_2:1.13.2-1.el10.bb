
inherit dnf-bridge

PN = "doxygen"
PE = "2"
PV = "1.13.2"
PR = "1.el10"
PACKAGES = "doxygen doxygen-latex"


URI_doxygen = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/doxygen-1.13.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:doxygen = " \
 libgcc \
 libstdc++ \
 glibc \
 graphviz \
 perl-interpreter \
"

URI_doxygen-latex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/doxygen-latex-1.13.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:doxygen-latex = " \
 texlive-etoc \
 texlive-varwidth \
 texlive-multirow \
 texlive-wasy \
 texlive-natbib \
 texlive-wasysym \
 texlive-xcolor \
 texlive-fancyhdr \
 texlive-newunicodechar \
 texlive-fancyvrb \
 doxygen \
 texlive-float \
 texlive-xtab \
 texlive-geometry \
 texlive-graphics \
 texlive-adjustbox \
 texlive-psnfss \
 texlive-pspicture \
 texlive-hanging \
 texlive-amsfonts \
 texlive-appendix \
 texlive-hyperref \
 texlive-iftex \
 texlive-import \
 texlive-bibtex \
 texlive-sectsty \
 texlive-caption \
 texlive-latex \
 texlive-stackengine \
 texlive-tabu \
 texlive-listings \
 texlive-collection-latexrecommended \
 texlive-makeindex \
 texlive-tocloft \
 texlive-tools \
 texlive-dvips \
 texlive-ulem \
 texlive-epstopdf \
"
