
inherit dnf-bridge

PN = "texi2html"
PE = "0"
PV = "5.0"
PR = "24.el10"
PACKAGES = "texi2html"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/texi2html-5.0-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_texi2html = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texi2html-5.0-24.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_texi2html}"
RDEPENDS:texi2html = " \
 perl-libs \
 perl-vars \
 perl-interpreter \
 latex2html \
 perl-Unicode-EastAsianWidth \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-POSIX \
 perl-Text-Unidecode \
 perl-PathTools \
 perl-Exporter \
 perl-Data-Dumper \
 perl-libintl-perl \
"
