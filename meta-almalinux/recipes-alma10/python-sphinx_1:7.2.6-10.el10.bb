
inherit dnf-bridge

PN = "python-sphinx"
PE = "1"
PV = "7.2.6"
PR = "10.el10"
PACKAGES = "python-sphinx-doc python3-sphinx python3-sphinx-latex"


URI_python-sphinx-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-sphinx-doc-7.2.6-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python-sphinx-doc = ""

URI_python3-sphinx = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinx-7.2.6-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-sphinx = " \
 python3 \
 python3-sphinx-theme-alabaster \
 python3-requests \
 python3-babel \
 python3-pygments \
 python3-jinja2 \
 python3-packaging \
 python3-docutils \
 python3-imagesize \
"

URI_python3-sphinx-latex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinx-latex-7.2.6-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-sphinx-latex = " \
 texlive-wrapfig \
 texlive-needspace \
 texlive-fancyhdr \
 texlive-fancyvrb \
 texlive-parskip \
 texlive-fncychap \
 texlive-framed \
 python3-sphinx \
 texlive-geometry \
 texlive-polyglossia \
 texlive-graphics \
 texlive-gnu-freefont \
 texlive-amscls \
 texlive-amsmath \
 texlive-anyfontsize \
 texlive-hyperref \
 texlive-kvoptions \
 texlive-capt-of \
 texlive-latex \
 texlive-cmap \
 texlive-tabulary \
 texlive-collection-fontsrecommended \
 texlive-collection-latex \
 texlive-luatex85 \
 texlive-ctablestack \
 texlive-titlesec \
 texlive-dvipng \
 texlive-dvisvgm \
 texlive-ucs \
 texlive-upquote \
"
