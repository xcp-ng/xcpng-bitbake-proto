
inherit dnf-bridge

PN = "docbook-utils"
PE = "0"
PV = "0.6.14"
PR = "62.el10"
PACKAGES = "docbook-utils docbook-utils-pdf"


URI_docbook-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/docbook-utils-0.6.14-62.el10.noarch.rpm;unpack=0"
RDEPENDS:docbook-utils = " \
 docbook-style-dsssl \
 perl-libs \
 perl-vars \
 gawk \
 grep \
 elinks \
 docbook-dtds \
 perl-Getopt-Long \
 bash \
 which \
 perl-SGMLSpm \
 perl-interpreter \
"

URI_docbook-utils-pdf = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/docbook-utils-pdf-0.6.14-62.el10.noarch.rpm;unpack=0"
RDEPENDS:docbook-utils-pdf = " \
 texlive-collection-htmlxml \
 docbook-utils \
 texlive-jadetex \
 texlive-dvips \
 bash \
 texlive-collection-fontsrecommended \
"
