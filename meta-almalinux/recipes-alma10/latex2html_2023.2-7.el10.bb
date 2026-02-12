
inherit dnf-bridge

PN = "latex2html"
PE = "0"
PV = "2023.2"
PR = "7.el10"
PACKAGES = "latex2html"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/latex2html-2023.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_latex2html = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/latex2html-2023.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_latex2html}"
RDEPENDS:latex2html = " \
 texlive-url \
 perl-libs \
 perl-Getopt-Long \
 poppler-utils \
 perl-Sys-Hostname \
 perl-Carp \
 perl-vars \
 tex-preview \
 netpbm-progs \
 perl-Encode \
 bash \
 perl-Exporter \
 texlive-collection-latexrecommended \
 perl-Fcntl \
 perl-POSIX \
 texlive-dvips \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
"
