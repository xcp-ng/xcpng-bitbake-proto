
inherit dnf-bridge

PN = "docbook-style-dsssl"
PE = "0"
PV = "1.79"
PR = "43.el10_0"
PACKAGES = "docbook-style-dsssl"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/docbook-style-dsssl-1.79-43.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_docbook-style-dsssl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/docbook-style-dsssl-1.79-43.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_docbook-style-dsssl}"
RDEPENDS:docbook-style-dsssl = " \
 sgml-common \
 perl-File-Basename \
 openjade \
 perl-Getopt-Std \
 docbook-dtds \
 bash \
 perl-interpreter \
"
