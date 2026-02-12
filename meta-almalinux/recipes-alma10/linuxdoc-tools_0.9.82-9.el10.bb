
inherit dnf-bridge

PN = "linuxdoc-tools"
PE = "0"
PV = "0.9.82"
PR = "9.el10"
PACKAGES = "linuxdoc-tools"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/linuxdoc-tools-0.9.82-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_linuxdoc-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/linuxdoc-tools-0.9.82-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_linuxdoc-tools}"
RDEPENDS:linuxdoc-tools = " \
 perl-libs \
 perl-FileHandle \
 perl-subs \
 perl-vars \
 perl-File-Temp \
 perl-DirHandle \
 openjade \
 linuxdoc-tools \
 bash \
 perl-Exporter \
 perl-base \
 texlive-collection-latexrecommended \
 groff \
 texlive-texlive-scripts-extra \
 gawk \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 glibc \
 perl-interpreter \
 perl-lib \
"
