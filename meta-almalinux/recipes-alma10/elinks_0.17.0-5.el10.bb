
inherit dnf-bridge

PN = "elinks"
PE = "0"
PV = "0.17.0"
PR = "5.el10"
PACKAGES = "elinks"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/elinks-0.17.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_elinks = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/elinks-0.17.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elinks}"
RDEPENDS:elinks = " \
 zlib-ng-compat \
 bzip2-libs \
 openssl-libs \
 krb5-libs \
 bash \
 expat \
 glibc \
 coreutils \
 libidn2 \
 alternatives \
"
