
inherit dnf-bridge

PN = "dblatex"
PE = "0"
PV = "0.3.12"
PR = "22.el10"
PACKAGES = "dblatex"


URI_dblatex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dblatex-0.3.12-22.el10.noarch.rpm;unpack=0"
RDEPENDS:dblatex = " \
 python3 \
 texlive-multirow \
 texlive-wasysym \
 texlive-fancybox \
 docbook-dtds \
 texlive-overpic \
 texlive-passivetex \
 texlive-xmltex \
 texlive-pdfpages \
 texlive-anysize \
 texlive-appendix \
 texlive-base \
 texlive-jknapltx \
 texlive-bibtopic \
 texlive-kpathsea \
 texlive-changebar \
 texlive-stmaryrd \
 texlive-subfigure \
 texlive-collection-fontsrecommended \
 texlive-collection-latex \
 texlive-collection-xetex \
 libxslt \
 texlive-ec \
"
